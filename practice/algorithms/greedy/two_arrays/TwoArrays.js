'use strict';

let isCorrect = (arr1, arr2, sum) => {
    for(let i = 0; i < arr1.length; i++) {
        if(arr1[i] + arr2[i] < sum) {
            return "NO";
        }
    }
    return "YES";
};

const processData = input => {
    let lines = input.split('\n');
    let tests = parseInt(lines[0]);
    let index = 1;
    for(let i = 0; i < tests; i++) {
        let def = lines[index++].split(' ').map(i => parseInt(i));
        let n = def[0];
        let sum = def[1];
        let arr1 = lines[index++].split(' ').map(i => parseInt(i)).sort((i, j) => i - j);
        let arr2 = lines[index++].split(' ').map(i => parseInt(i)).sort((i, j) => j - i);
        console.log(isCorrect(arr1, arr2, sum));
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));