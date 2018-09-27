var js = document.createElement("script");

js.type = "text/javascript";
js.src = "https://code.jquery.com/jquery-3.3.1.min.js";
document.head.appendChild(js);


document.onreadystatechange = function () {
    if (document.readyState === "complete") {
        init();
    }
}


var dot = false;
var sign = "";

function operator( __o ){
    switch(__o){
        case '.':
            if (dot==false && document.getElementById("screen").innerText!=""){
                document.getElementById("screen").innerText+=".";
                dot=true;
            }
            break;
        case 'c':
            document.getElementById("screen").innerText=""
            dot=false;
            break;
    }
}