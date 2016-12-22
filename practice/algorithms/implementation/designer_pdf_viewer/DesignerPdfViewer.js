'use strict';

const processData = input => {
    const lines = input.split('\n');
    const heights = lines[0].split(' ').map(i => parseInt(i));
    const word = lines[1];
    let maxHeight = 0;
    for(let i = 0; i < word.length; i++) {
        const charIndex = word[i].codePointAt() - 97;
        const height = heights[charIndex];
        if(height > maxHeight) {
            maxHeight = height;
        }
    }

    const square = word.length * maxHeight;
    console.log(square);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));