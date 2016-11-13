'use strict';

const processData = input => {
    const lines = input.split('\n');
    const array = lines[1].split(' ');
    const numCounts = {};
    for(let i = 0; i < array.length; i++) {
        let count = numCounts[array[i]] || 0;
        numCounts[array[i]] = count + 1;
    }
    let maxCount = 0;
    for(let p in numCounts) {
        if(numCounts.hasOwnProperty(p) && numCounts[p] > maxCount) {
            maxCount = numCounts[p];
        }
    }
    console.log(array.length - maxCount);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));