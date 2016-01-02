'use strict';

const processData = input => {
    let inputLines = input.split('\n');
    let linesLength = parseInt(inputLines[0]);
    let substrings = inputLines.slice(linesLength + 2);
    for(let j = 0; j < substrings.length; j++) {
        let count = 0;
        let pattern = "\\w+" + substrings[j] + "\\w+";
        for(let i = 1; i <= linesLength; i++) {
            let line = inputLines[i];
            let match = line.match(new RegExp(pattern, "g"));
            count += match ? match.length : 0;
        }
        console.log(count);
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));