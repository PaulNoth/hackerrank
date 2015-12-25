'use strict';

var _ = require('lodash');

const processData = input => {
    let arr = input.split('\n').slice(1).map(i => parseInt(i))
    let sum = _.sum(arr);
    console.log((sum / 2) + (sum % 2 == 0 ? '.0' : ''));
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));