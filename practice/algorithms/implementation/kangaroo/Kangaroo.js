'use strict';

const processData = input => {
    const lines = input.split('\n');
    const [x1, v1, x2, v2] = lines[0].split(' ').map(i => parseInt(i));
    console.log(sameLocation(x1, v1, x2, v2));
};

const sameLocation = (x1, v1, x2, v2) => {
    if(v1 < v2) return "NO";
    if(x1 < x2 && v1 > v2) {
        const xDiff = Math.abs(x1 - x2);
        const vDiff = Math.abs(v1 - v2);
        if(xDiff % vDiff == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
    return "NO";
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));