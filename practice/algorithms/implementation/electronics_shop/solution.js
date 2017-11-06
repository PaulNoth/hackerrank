'use strict';

const processData = input => {
    const lines = input.split('\n');
    const [amount, keyboardCount, usbCount] = lines[0].split(' ').map(i => parseInt(i));
    const keyboards = lines[1].split(' ').map(i => parseInt(i));
    const usbs = lines[2].split(' ').map(i => parseInt(i));

    let spentAmount = -1;
    for(let i = 0; i < keyboardCount; i++) {
        for(let j = 0; j < usbCount; j++) {
            let sum = keyboards[i] + usbs[j];
            if(sum <= amount && sum > spentAmount) {
                spentAmount = sum;
            }
        }
    }
    console.log(spentAmount);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));