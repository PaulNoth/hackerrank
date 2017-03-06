'use strict';

const range = (start, end) => {
    const ret = [];
    for(let i = start; i <= end; i++) {
        ret.push(i);
    }
    return ret;
}

const processData = input => {
    const lines = input.split('\n');
    const a = lines[1].split(' ').map(i => parseInt(i));
    const b = lines[2].split(' ').map(i => parseInt(i));
    const aMax = Math.max(...a);
    const bMin = Math.min(...b);
    const result = range(aMax, bMin).filter(num => a.every(i => num % i === 0) && b.every(j => j % num === 0));
    console.log(result.length);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));