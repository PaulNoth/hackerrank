'use strict';

const processData = input => {
    const lines = input.split('\n');
    const arr = lines[0].split(/\s+/).map(i => parseInt(i));
    const n = arr[0];
    const k = arr[1];
    const problemsPerChapter = lines[1].split(/\s+/).map(i => parseInt(i));
    let specialProblems = 0;
    let page = 1;
    for(let i = 0; i < n; i++) {
        const problems = problemsPerChapter[i];
        for(let p = 1; p <= problems; p++) {
            if(p === page) {
                specialProblems++;
            }
            if(p !== problems && p % k === 0) {
                page++;
            }
        }
        page++;
    }
    console.log(specialProblems);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));