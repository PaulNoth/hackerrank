'use strict';

var combine = (result, input, start, actual) => {
    for(let i = start; i < input.length; i++) {
        let out = actual;
        actual += input.charAt(i);
        result.push(actual);
        if(i < input.length) {
            combine(result, input, i + 1, out);
        }
    }
};

const processData = input => {
    let lines = input.split('\n');
    let index = 1;
    for(let i = 0; i < parseInt(lines[0]); i++) {
        let length = parseInt(lines[index++]);
        let input = lines[index++];
        let result = [];
        combine(result, input, 0, '');
        result.sort((a, b) => a.localeCompare(b));
        console.log(result.join('\n'));
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));