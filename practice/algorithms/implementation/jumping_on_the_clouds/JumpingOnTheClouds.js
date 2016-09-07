'use strict';

const processData = input => {
    const lines = input.split('\n');
    const clouds = lines[1].split(' ').map(i => parseInt(i));
    let steps = 0;
    let  index = 0;
    while (index < clouds.length - 1) {
        if((index + 2 < clouds.length) && clouds[index + 2] != 1) {
            index = index + 2;
        } else {
            index = index + 1;
        }
        steps += 1;
    }
    console.log(steps);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));