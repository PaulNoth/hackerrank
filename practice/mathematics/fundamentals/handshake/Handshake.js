'use strict';

const processData = input => {
    let directors = input.split('\n').map(i => parseInt(i))
    for(let i = 1; i < directors.length; i++) {
        let handshakes = 0;
        for(let j = 0; j < directors[i]; j++) {
            handshakes += j;
        }
        console.log(handshakes);
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));