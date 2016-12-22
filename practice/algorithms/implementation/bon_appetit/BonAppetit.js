'use strict';

const _ = require('lodash');

const processData = input => {
    const lines = input.split('\n');
    const [n, k] = lines[0].split(' ');
    const items = lines[1].split(' ').map(i => parseInt(i));
    const actual = parseInt(lines[2]);
    const charged = parseInt((_.sum(items) - items[k]) / 2);
    if(charged === actual) {
        console.log('Bon Appetit');
    } else {
        console.log(Math.abs(charged - actual));
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));