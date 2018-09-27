function hides1(){
    document.getElementById("h1s11").firstChild.addEventListener("click", function(){
            document.getElementById("h1s11").childNodes.forEach(function(__node){
                __node.hidden != __node.hidden;
            });
        });        

}


document.onreadystatechange = function () {
    if (document.readyState === "complete") {
        hides1();
    }
}


