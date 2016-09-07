'use strict';

const processData = input => {
    const lines = input.split('\n');
    const [n, k] = lines[0].split(' ').map(i => parseInt(i));
    const clouds = lines[1].split(' ').map(i => parseInt(i));

    let energy = 100;
    let pos = k % n;
    energy -= ((clouds[pos] == 1) ? 3 : 1);
    while(pos != 0) {
        pos = (pos + k) % n;
        energy -= ((clouds[pos] == 1) ? 3 : 1);
    }
    console.log(energy);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));