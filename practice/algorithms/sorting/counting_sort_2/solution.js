'use strict';

const counting = (arr) => {
    const counts = []
    for(let i = 0; i < 100; i++) {
        counts[i] = 0;
    }
    for(let i = 0; i < arr.length; i++) {
        counts[arr[i]]++;
    }

    let result = "";
    for (let i = 0; i < counts.length; i++) {
        for(let j = 0; j < counts[i]; j++) {
            result += (i + " ");
        }
    }
    console.log(result);
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