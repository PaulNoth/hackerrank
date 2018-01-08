'use strict';

const counting = (arr) => {
    const counts = []
    for(let i = 0; i < 100; i++) {
        counts[i] = 0;
    }
    for(let i = 0; i < arr.length; i++) {
        counts[arr[i]]++;
    }

    console.log(counts.join(' '));
}

const processData = input => {
    const lines = input.split('\n');
    const arr  = lines[1].split(' ').map(i => parseInt(i));
    counting(arr);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));