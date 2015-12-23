'use strict';

const processData = input => {
    console.log(input.split('\n').slice(1).map(i => parseInt(i) + 1).join('\n'));
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));