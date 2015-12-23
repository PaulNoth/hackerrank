'use strict';

let isFibo = n => {
    let fib0 = 0;
    let fib1 = 1;
    while(fib0 <= n) {
        if (fib0 == n) return "IsFibo";
        let temp = fib0;
        fib0 = fib1;
        fib1 += temp;
    }
    return "IsNotFibo"
};
const processData = input => {
    console.log(input.split("\n").slice(1).map(i => parseInt(i)).map(isFibo).join("\n"));
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));