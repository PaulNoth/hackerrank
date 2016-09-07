'use strict';

const processData = input => {
    const lines = input.split('\n');
    const array = lines[1].split(' ').map(i => parseInt(i));

    let min = 999999999;
    for(let i = 0; i < array.length - 1; i++) {
        for(let j = i + 1; j < array.length; j++) {
            if(array[i] == array[j]) {
                min = Math.min(min, Math.abs(j - i));
            }
        }
    }
    const result = (min === 999999999 ? -1 : min);
    console.log(result);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));