'use strict';

const processData = input => {
    let lines = input.split('\n');
    let definition = lines[0].split(' ').map(i => parseInt(i));
    let difference = definition[1];
    let array = lines[1].split(' ').map(i => parseInt(i));
    let sortedArray = array.sort((a, b) => a - b);
    let pairs = 0;
    for(let i = 0; i < sortedArray.length - 1; i++) {
        for(let j = i + 1; j < sortedArray.length; j++) {
            if(sortedArray[j] - sortedArray[i] == difference) {
                pairs++;
            }
        }
    }
    console.log(pairs);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));