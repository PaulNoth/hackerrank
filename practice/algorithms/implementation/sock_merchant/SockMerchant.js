'use strict';

const processData = input => {
    const lines = input.split('\n');
    const socks = lines[1].split(' ').map(i => parseInt(i));
    const sockGroupsCount = new Map();
    for(let i = 0; i < socks.length; i++) {
        const color = socks[i];
        if(sockGroupsCount.get(color)) {
            const count = sockGroupsCount.get(color);
            sockGroupsCount.set(color, count + 1);
        } else {
            sockGroupsCount.set(color, 1);
        }
    }
    let pairs = 0;
    const groups = Array.from(sockGroupsCount.values());
    for(let i = 0; i < groups.length; i++) {
        const count = groups[i];
        pairs += Math.floor(count / 2);
    }

    console.log(pairs);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));