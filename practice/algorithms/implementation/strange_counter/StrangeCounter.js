'use strict';

const processData = input => {
    const t = parseInt(input);
    const cycleEndTime = cycleEnd(t, 0, 3);
    const timeDiff = cycleEndTime - t;
    const finalValue = timeDiff + 1;
    console.log(finalValue);
};

const cycleEnd = (time, start, step) => {
    if(start > time) {
        return start;
    }
    return cycleEnd(time, start + step, step * 2);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));