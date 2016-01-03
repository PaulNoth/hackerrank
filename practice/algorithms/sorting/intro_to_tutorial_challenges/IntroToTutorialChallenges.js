'use strict';

const processData = input => {
    let getPosition = (arr, val) => {
        for(let i = 0; i < arr.length; i++) {
            if(arr[i] == val) {
                return i;
            }
        }
    };
    let lines = input.split('\n');
    let searchedValue = parseInt(lines[0]);
    let array = lines[2].split(' ').map(i => parseInt(i));
    let position = getPosition(array, searchedValue);
    console.log(position);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));