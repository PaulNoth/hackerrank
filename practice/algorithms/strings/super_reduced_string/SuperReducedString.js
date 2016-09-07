'use strict';

const processData = input => {
    const line = input.split('\n')[0];
    let acc = "";
    for(let i = 0; i < line.length; i++) {
        const c = line[i];
        if(acc.length > 0 && acc[acc.length - 1] === c) {
            acc = acc.slice(0, acc.length - 1);
        } else {
            acc += c;
        }
    }
    console.log(acc.length === 0 ? "Empty String" : acc);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));