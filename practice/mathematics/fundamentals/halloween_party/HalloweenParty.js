'use strict';

const processData = input => {
    let lines = input.split("\n");
    let slices = lines.map(i => parseInt(i));
    const pieces = k => {
        let horizontal = parseInt(k / 2);
        let vertical = k - horizontal;
        return vertical * horizontal;
    };
    for(let i = 1; i < slices.length; i++) {
        console.log(pieces(slices[i]));
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));