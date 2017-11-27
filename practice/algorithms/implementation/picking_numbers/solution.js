'use strict';

const processData = input => {
    const lines = input.split('\n');
    const elements = lines[1].split(' ').map(i => parseInt(i)).sort((a, b) => a - b);

    let maxDiffCount = 0;
    for(let i = 0; i < elements.length - 1; i++) {
        for (let j = i + 1; j < elements.length; j++) {
            let diff = Math.abs(elements[i] - elements[j]);
            if (diff > 1) {
                break;
            }
            let diffCount = j - i;
            if(diffCount > maxDiffCount) {
                maxDiffCount = diffCount;
            }
        }
    }
    console.log(maxDiffCount + 1);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));