'use strict';

const reverse = (s) => s.split("").reverse().join("");

const processData = input => {
    const [start, end, d] = input.split(' ').map(i => parseInt(i));
    let count = 0;
    for(let i = start; i <= end; i++) {
        const s = i.toString();
        const reversed = reverse(s);
        const diff = Math.abs(parseInt(s) - parseInt(reversed));
        if(diff % d == 0) {
            count++;
        }
    }
    console.log(count);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));