'use strict';

const processData = input => {
    const num = parseInt(input);
    const binary = num.toString(2);
    let zeroes = 0;
    for(let i = 0; i < binary.length; i++) {
        if(binary[i] === '0') {
            zeroes++;
        }
    }
    if(num === 0) {
        zeroes = 0;
    }
    const result = Math.pow(2, zeroes);
    console.log(result);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));