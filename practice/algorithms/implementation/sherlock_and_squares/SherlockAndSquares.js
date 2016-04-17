'use strict';

const processData = input => {
    const lines = input.split('\n').slice(1);
    for(let i = 0; i < lines.length; i++) {
        const parts = lines[i].split(' ');
        const lower = parts[0];
        const upper = parts[1];
        let squareNumbers = 0;
        if(lower === upper) {
            if (Math.sqrt(lower) === Math.ceil(Math.sqrt(lower))) {
                squareNumbers = 1;
            }
            else {
                squareNumbers = 0;
            }
        }
        else {
            squareNumbers = parseInt(Math.floor(Math.sqrt(upper)) - (Math.ceil(Math.sqrt(lower))) + 1)
        }
        console.log(squareNumbers);
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));