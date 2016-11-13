'use strict';

const processData = input => {
    const lines = input.split('\n');

    const s = lines[0];
    const n = parseInt(lines[1]);
    const as = s.split("").filter(c => c === "a").length;
    const times = parseInt(n / s.length);
    const rest = n % s.length;

    const totalAs = times * as
            + s.slice(0, rest).split("").filter(c => c === "a").length;
    console.log(totalAs);

};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));