'use strict';

const processData = input => {
    const msg = input;
    let result = 0;
    for(let i = 0; i < msg.length; i += 3) {
        if(msg.charAt(i) != 'S') {
            result++;
        }
        if(msg.charAt(i + 1) != 'O') {
            result++;
        }
        if(msg.charAt(i + 2) != 'S') {
            result++;
        }
    }
    console.log(result);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));