'use strict';

const processData = input => {
    let lines = input.split('\n');
    let array1 = lines[1].split(' ').map(i => parseInt(i));
    let array2 = lines[3].split(' ').map(i => parseInt(i));
    let numHash1 = new Map();
    let numHash2 = new Map();
    for(let i = 0; i < array1.length; i++) {
        let count = numHash1.get(array1[i]);
        if(!count) {
            numHash1.set(array1[i], 1);
        } else {
            numHash1.set(array1[i], count + 1);
        }
    }
    for(let i = 0; i < array2.length; i++) {
        let count = numHash2.get(array2[i]);
        if(!count) {
            numHash2.set(array2[i], 1);
        } else {
            numHash2.set(array2[i], count + 1);
        }
    }
    let missingNumbers = [];
    for(let key of numHash2.keys()) {
        let countB = numHash2.get(key);
        if(!numHash1.get(key) || countB > numHash1.get(key)) {
            missingNumbers.push(key);
        }
    }

    console.log(missingNumbers.sort((a, b) => a - b).join(" "));
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));