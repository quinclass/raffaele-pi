require("./index.scss");

class Greeter{
    constructor(target){ this._target = target; }
    greet(){ console.log("HELLO "+this._target); }
}


let greeter = new Greeter("FAINA");
greeter.greet();