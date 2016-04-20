'use strict';

const processData = input => {
    const lines = input.split('\n');
    let sticks = lines[1].split(' ').map(i => parseInt(i));
    while(sticks.length > 0) {
        console.log(sticks.length);
        sticks.sort((a, b) => a - b);
        const min = sticks[0];
        sticks = sticks.filter(i => i > min);
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));