'use strict';

const processData = input => {
    const [n, p] = input.split('\n').map(i => parseInt(i));

    const fromFront = p;
    let fromBack = n;
    if(n % 2 == 0) {
        fromBack = n + 1;
    }
    const result = parseInt(Math.min(fromFront / 2, (fromBack - p) / 2));
    console.log(result);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));