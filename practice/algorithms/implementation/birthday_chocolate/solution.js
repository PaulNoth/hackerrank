'use strict';

const processData = input => {
    const lines = input.split('\n');
    const bars = lines[1].split(' ').map(i => parseInt(i));
    const [d, m] = lines[2].split(' ').map(i => parseInt(i));

    let result = 0;
    for(let i = 0; i < bars.length - m + 1; i++) {
        let sum = 0;
        for(let j = i; j < i + m; j++) {
            sum += bars[j];
        }
        if(sum == d) {
            result++;
        }
    }
    console.log(result);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));