'use strict';

const processData = input => {
    let lines = input.split('\n');
    let array = lines[1].split(' ').map(i => parseInt(i)).sort((a, b) => a - b);
    let minDiff = 1000000000000000000;
    for(let i = 0; i < array.length - 1; i++) {
        let diff = array[i + 1] - array[i];
        if(diff < minDiff) {
            minDiff = diff;
        }
    }
    let elements = [];
    for(let i = 0; i < array.length - 1; i++) {
        let diff = array[i + 1] - array[i];
        if(diff == minDiff) {
            elements.push(array[i]);
            elements.push(array[i + 1]);
        }
    }
    elements = elements.sort((a, b) => a - b);
    console.log(elements.join(" "));
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));