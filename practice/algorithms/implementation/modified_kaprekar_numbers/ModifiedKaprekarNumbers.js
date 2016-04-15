'use strict';

const processData = input => {
    const lines = input.split('\n').map(i => parseInt(i));
    const lower = lines[0];
    const upper = lines[1];
    const kaprekarNums = [];
    for(let i = lower; i <= upper; i++) {
        if(isKaprekar(i)) {
            kaprekarNums.push(i);
        }
    }
    if(kaprekarNums.length > 0) {
        console.log(kaprekarNums.join(" "));
    } else {
        console.log("INVALID RANGE");
    }
};

const isKaprekar = (num) => {
    const square = parseInt(Math.pow(num, 2)).toString();
    if(square.length > 1) {
        const l = parseInt(square.substring(0, square.length / 2));
        const r = parseInt(square.substring(square.length / 2));
        return (l + r) === num;
    } else {
        return parseInt(square) === num;
    }
}

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));