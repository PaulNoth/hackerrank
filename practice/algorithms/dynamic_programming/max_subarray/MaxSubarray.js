'use strict';

const _ = require('lodash');

const processData = input => {
    const lines = input.split('\n');
    let index = 0;
    const tests = parseInt(lines[index++]);
    for(let i = 0; i < tests; i++) {
        const elementCount = lines[index++];
        const arr = lines[index++].split(' ').map(el => parseInt(el));
        const contiguousSum = kadane(arr);
        const positiveNumbers = arr.filter(el => el > 0);
        let nonContiguousSum;
        if(positiveNumbers.length === 0) {
            nonContiguousSum = _.max(arr);
        } else {
            nonContiguousSum = _.sum(positiveNumbers);
        }
        console.log(contiguousSum + ' ' + nonContiguousSum);
    }
};

const kadane = arr => {
    let maxSoFar = arr[0];
    let maxEndings = arr[0];
    arr.slice(1, arr.length).forEach(el => {
        maxEndings = Math.max(el, maxEndings + el);
        maxSoFar = Math.max(maxSoFar, maxEndings);
    });
    return maxSoFar;
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));