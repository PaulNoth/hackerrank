'use strict';

const processData = input => {
    const lines = input.split('\n');
    const tests = parseInt(lines[0]);
    let actualLine = 1;
    for(let i = 0; i < tests; i++) {
        const studentsAndCancelation = lines[actualLine++].split(' ').map(i => parseInt(i));
        const cancelation = studentsAndCancelation[1];
        const arrivals = lines[actualLine++].split(' ').map(i => parseInt(i));
        const beforeClass = studentsBeforeClass(arrivals);
        const canceled = cancelation > beforeClass ? "YES" : "NO";
        console.log(canceled);
    }
};

const studentsBeforeClass = (arrivals) => {
    let result = 0;
    for(let i = 0; i < arrivals.length; i++) {
        if(arrivals[i] <= 0) {
            result++;
        }
    }
    return result;
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));