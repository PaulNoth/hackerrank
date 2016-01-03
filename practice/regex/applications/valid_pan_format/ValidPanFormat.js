'use strict';

const PAN = /[A-Z]{5}\d{4}[A-Z]/;

const processData = input => {
    let lines = input.split('\n').slice(1);
    let isPan = s => {
        if(s.match(PAN)) {
            return "YES";
        } else {
            return "NO";
        }
    };
    console.log(lines.map(isPan).join('\n'));
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));