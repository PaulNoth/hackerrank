'use strict';

const processData = input => {
    let pairs = input.split('\n');
    // code goes here
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));