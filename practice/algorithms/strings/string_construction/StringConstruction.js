'use strict';

const processData = input => {
    const lines = input.split('\n');
    for(let i = 1; i < lines.length; i++) {
        console.log(cost(lines[i]));
    }
};

const cost = (s) =>  {
    const charMap = new Map();
    for(let i = 0; i < s.length; i++) {
        charMap.set(s[i], true);
    }
    return charMap.size;
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));