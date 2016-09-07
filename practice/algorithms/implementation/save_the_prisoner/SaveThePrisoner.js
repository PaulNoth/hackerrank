'use strict';

const processData = input => {
    const lines = input.split('\n');
    for(let i = 1; i < lines.length; i++) {
        console.log(savedPrisoner(lines[i]));
    }
};

const savedPrisoner = (line) => {
    const numbers = line.split(" ").map(i => parseInt(i));
    const prisoners = numbers[0];
    const sweets = numbers[1];
    const startId = numbers[2];

    const saved = (((sweets % prisoners) + startId) % prisoners) - 1;
    if (saved == 0) {
        return prisoners;
    } else {
        return saved;
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));