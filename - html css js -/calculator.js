var js = document.createElement("script");

js.type = "text/javascript";
js.src = "https://code.jquery.com/jquery-3.3.1.min.js";
document.head.appendChild(js);


document.onreadystatechange = function () {
    if (document.readyState === "complete") {
        init();
    }
}

function init() { }

var dot = false;
var _operator = "";
var _memory = "";

function operator_dot() {
    if (dot == false && document.getElementById("screen").innerText != "") {
        document.getElementById("screen").innerText += ".";
        dot = true;
    }
}
function operator_clean() {
    document.getElementById("screen").innerText = ""
    dot = false;
    _operator = "";
    _memory = "";
}

function operator_plus() {
    if (document.getElementById("screen").innerText === "") {
        operator_clean();
        return;
    }
    _memory = document.getElementById("screen").innerText;
    _operator = "+";
    document.getElementById("screen").innerText = "";
}

function operator_minus() {
    if (document.getElementById("screen").innerText === "") {
        operator_clean();
        return;
    }
    _memory = document.getElementById("screen").innerText;
    _operator = "-";
    document.getElementById("screen").innerText = "";
}

function operator_mul() {
    if (document.getElementById("screen").innerText === "") {
        operator_clean();
        return;
    }
    _memory = document.getElementById("screen").innerText;
    _operator = "x";
    document.getElementById("screen").innerText = "";
}

function operator_divide() {
    if (document.getElementById("screen").innerText === "") {
        operator_clean();
        return;
    }
    _memory = document.getElementById("screen").innerText;
    _operator = ":";
    document.getElementById("screen").innerText = "";
}

function operator_equal() {
    if (document.getElementById("screen").innerText === "") {
        operator_clean();
        return;
    }

    let _temp = document.getElementById("screen").innerText;
    if (_operator == "+") {
        document.getElementById("screen").innerText = "" +
            (parseFloat(document.getElementById("screen").innerText) + parseFloat(_memory));
    }
    if (_operator == "-") {
        document.getElementById("screen").innerText = "" +
            (parseFloat(document.getElementById("screen").innerText) - parseFloat(_memory));
    }
    if (_operator == "x") {
        document.getElementById("screen").innerText = "" +
            (parseFloat(document.getElementById("screen").innerText) * parseFloat(_memory));
    }
    if (_operator == ":") {
        document.getElementById("screen").innerText = "" +
            (parseFloat(document.getElementById("screen").innerText) / parseFloat(_memory));
    }

    pushtodb(_memory, _temp, _operator, document.getElementById("screen").innerText);
    history();
}

function pushtodb(st, nd, op, res) {
    const _data = {
        first: st,
        second: nd,
        operator: op,
        result: res
    };
    const _header = new Headers();
    _header.append("Content-Type", "application/json");

    const _options = {
        method: "POST",
        body: JSON.stringify(_data),
        headers: _header
    };

    const _request = new Request("http://localhost:3000/results", _options);
    fetch(_request)
        .then(function () { alert("data pushed to db"); })
        .catch(function () { alert("server unreachable"); });
}


function history() {
    fetch(new Request("http://localhost:3000/results"))
        .then(function (response) { if (response.ok) return response.json(); })
        .then(function (results) {
            document.getElementById("history").innerHTML = "";
            for (element in JSON.stringify(results, null, 2)) {
                let p = document.createElement("p");
                p.innerText = element['first'] + " " + element['operator'] + " " + element['second'] + " = " + element['result'];
                document.getElementById("history").appendChild(p);
            }
        });
}