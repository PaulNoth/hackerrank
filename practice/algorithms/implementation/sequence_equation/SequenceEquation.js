'use strict';

const processData = input => {
    const lines = input.split('\n');
    const n = parseInt(lines[0]);
    const elements = lines[1].split(' ').map(i => parseInt(i));
    const result = [];
    for(let i = 1; i <= n; i++) {
        const index = elements.indexOf(i);
        const value1 = index + 1;
        const index2 = elements.indexOf(value1);
        result[i - 1] = index2 + 1;
    }

    console.log(result.join('\n'));
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));