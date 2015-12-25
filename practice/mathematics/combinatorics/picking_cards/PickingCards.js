'use strict';

const processData = input => {
    let lines = input.split("\n");
    let tests = parseInt(lines[0]);
    let index = 1;
    for (let i = 0; i < tests; i++) {
        let length = parseInt(lines[index++]);
        let arr = lines[index++].split(" ").map(i => parseInt(i)).sort((a, b) => a - b);
        let result = 1;
        for (let j = arr.length - 1; j >= 0; j--) {
            let diff = length - arr[j];
            if (diff < 0) diff = 0;
            result *= diff;
            result %= 1000000007;
            length -= 1;
        }
        console.log(result);
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));