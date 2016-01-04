'use strict';

const processData = input => {
    let lines = input.split('\n').map(i => parseInt(i));
    let k = lines[1];
    let sortedLines = lines.slice(2).sort((l,j) => l - j);
    let unfairness = sortedLines[sortedLines.length - 1];
    for(let i = 0; i <= sortedLines.length - k; i++) {
        let temp = sortedLines[i + k - 1] - sortedLines[i];
        if(unfairness > temp) {
            unfairness = temp
        }
    }
    console.log(unfairness);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));