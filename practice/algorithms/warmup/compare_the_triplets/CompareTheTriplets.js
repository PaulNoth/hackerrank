'use strict';

const processData = input => {
    const lines = input.split('\n');
    const alicesRating = lines[0].split(' ').map(i => parseInt(i));
    const bobRating = lines[1].split(' ').map(i => parseInt(i));

    let aliceScore = 0;
    let bobScore = 0;
    for(let i = 0; i < alicesRating.length; i++) {
        if (alicesRating[i] > bobRating[i]) {
            aliceScore++;
        } else if (alicesRating[i] < bobRating[i]) {
            bobScore++;
        }
    }
    console.log(aliceScore + ' ' + bobScore);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));