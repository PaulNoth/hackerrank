'use strict';

const processData = input => {
    const n = parseInt(input)

    let totalLiked = 0;
    let dayStartPeople = 5;
    for(let i = 0; i < n; i++) {
        const dayLiked = parseInt(dayStartPeople / 2);
        const received = dayLiked * 3;
        totalLiked += dayLiked;
        dayStartPeople = received;
    }
    console.log(totalLiked);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));