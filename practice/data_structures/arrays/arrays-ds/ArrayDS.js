'use strict';

const processData = input => {
    let lines = input.split('\n');
    let l = parseInt(lines[0]);
    let array = lines[1].split(' ').map(item => parseInt(item));
    let reversed = [];
    for(let i = l - 1; i >= 0; i--) {
        reversed.push(array[i]);
    }
    console.log(reversed.join(" "));
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));
