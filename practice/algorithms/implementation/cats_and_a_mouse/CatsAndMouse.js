'use strict';

const processData = input => {
    const lines = input.split('\n');
    const abms = lines.slice(1).map(line => line.split(' ').map(i => parseInt(i)));

    abms.forEach(abm => {
        const [a, b, m] = abm;

        const catACatchMouseSteps = Math.abs(a - m);
        const catBCatchMouseSteps = Math.abs(b - m);
        if(catACatchMouseSteps == catBCatchMouseSteps) {
            console.log("Mouse C");
        } else if(catACatchMouseSteps < catBCatchMouseSteps) {
            console.log("Cat A");
        } else {
            console.log("Cat B");
        }
    });
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));