'use strict';

const processData = input => {
    let lines = input.split('\n').slice(1);
    let matches = lines.filter(line => line.toLowerCase().match(/.*hackerrank.*/));
    console.log(matches.length);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));