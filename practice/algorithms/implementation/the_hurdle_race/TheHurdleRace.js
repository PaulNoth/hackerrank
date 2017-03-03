'use strict';

const processData = input => {
    const lines = input.split('\n');
    const [n, k] = lines[0].split(' ').map(i => parseInt(i));
    const heights = lines[1].split(' ').map(i => parseInt(i));
    let maxHeight = 0;
    heights.forEach(h => {
        maxHeight = (h > maxHeight) ? h : maxHeight;
    });

    const beverages = maxHeight > k ? (maxHeight - k) : 0;
    console.log(beverages);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));