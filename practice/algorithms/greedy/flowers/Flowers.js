'use strict';

const processData = input => {
    let lines = input.split('\n');
    let definition = lines[0].split(' ').map(i => parseInt(i));
    let n = definition[0];
    let k = definition[1];
    let prices = lines[1].split(" ").map(i => parseInt(i));
    let descendingPrices = prices.sort((i, j) => j - i);
    let totalPrice = 0;
    for(let i = 0; i < n; i++) {
        let factor = parseInt(i / k);
        totalPrice += (factor + 1) * descendingPrices[i];
    }
    console.log(totalPrice);

};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));