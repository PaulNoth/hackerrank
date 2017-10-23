'use strict';

const processData = input => {
    const lines = input.split('\n');
    const records = lines[1].split(' ').map(i => parseInt(i));

    let mostPoints = records[0];
    let leastPoints = records[0];
    let mostPointsBreak = 0;
    let leastPointsBreak = 0;
    for(let i = 1; i < records.length; i++) {
        let points = records[i];
        if(points > mostPoints) {
            mostPoints = points;
            mostPointsBreak += 1;
        }
        if(points < leastPoints) {
            leastPoints = points;
            leastPointsBreak += 1;
        }
    }

    console.log(mostPointsBreak + ' ' + leastPointsBreak);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));