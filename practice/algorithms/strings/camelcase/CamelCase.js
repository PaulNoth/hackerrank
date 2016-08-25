'use strict';

const processData = input => {
    const line = input;
    const words = line.split(/[A-Z]/g);
    console.log(words.length);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));