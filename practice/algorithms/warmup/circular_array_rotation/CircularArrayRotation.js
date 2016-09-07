'use strict';

const processData = input => {
    const lines = input.split('\n');
    const [n, k, q] = lines[0].split(' ').map(i => parseInt(i));
    const elements = lines[1].split(' ').map(i => parseInt(i));
    const queries = lines.slice(2).map(i => parseInt(i));
    const rotationPos = k % n;
    const part1 = elements.slice(0, n - rotationPos);
    const part2 = elements.slice(n - rotationPos);
    const finalArray = part2.concat(part1);
    for(let i = 0; i < q; i++) {
        console.log(finalArray[queries[i]]);
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));