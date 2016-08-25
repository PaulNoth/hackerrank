'use strict';

const processData = input => {
    const lines = input.split('\n');
    const line1 = lines[0];
    const divisor = parseInt(line1.split(' ')[1]);
    const array = lines[1].split(' ').map(item => parseInt(item));
    let count = 0;
    for(let i = 0; i < array.length - 1; i++) {
        for(let j = i + 1; j < array.length; j++) {
            if((array[i] + array[j]) % divisor === 0) {
                count++;
            }
        }
    }
    console.log(count);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));