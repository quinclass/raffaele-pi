let v = [];
let i = 0;

while (i < 10) {
    v[i++] = Math.floor(Math.random() * 100);
}

v.forEach(function (x) {

    console.log(x);
});
console.log("massimo" + Math.max(...v));