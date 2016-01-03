'use strict';

const processData = input => {
    let numbers = input.split('\n').slice(1);
    for(let i = 0; i < numbers.length; i++) {
        let splits = numbers[i].split(/ |\-/);
        console.log("CountryCode=" + splits[0]
            + ",LocalAreaCode=" + splits[1] + ",Number=" + splits[2]);
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));