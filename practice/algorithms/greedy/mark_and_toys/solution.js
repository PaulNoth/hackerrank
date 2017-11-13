'use strict';

const processData = input => {
    const lines = input.split('\n');
    const [n, k] = lines[0].split(' ').map(i => parseInt(i));
    const prices = lines[1].split(' ').map(i => parseInt(i)).sort((a, b) => a-b);

    let sum = 0;
    let toys = 0;
    for(let i = 0; i < n; i++) {
        const p = prices[i];
        sum += p;
        if(sum > k) {
            break;
        }
        toys++;
    }
    console.log(toys);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));