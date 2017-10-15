'use strict';

const processData = input => {
    const lines = input.split('\n');
    const n = parseInt(lines[0]);
    const weights = lines[1].split(" ").map(i => parseInt(i)).sort((a, b) => a - b);

    let price = 1;
    let lastWeight = weights[0];
    for (let i = 1; i < weights.length; i++)
    {
        if(lastWeight + 4 >= weights[i])
        {
            // lastWeight = toys[i];
        }
        else
        {
            price++;
            lastWeight = weights[i];
        }
    }
    console.log(price);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));