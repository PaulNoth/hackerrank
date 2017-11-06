'use strict';

const processData = input => {
    const lines = input.split('\n');
    const steps = lines[1];
    let valleys = 0;
    let seaLevel = 0;

    for(let i = 0; i < steps.length; i++) {
        let c = steps.charAt(i);
        if(c == 'D') {
            seaLevel -= 1;
        } else {
            seaLevel += 1;
        }
        if(seaLevel == 0 && c == 'U') {
            valleys += 1;
        }
    }
    console.log(valleys);

};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));