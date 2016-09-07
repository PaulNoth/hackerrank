'use strict';

const processData = input => {
    const lines = input.split('\n');
    const s = lines[1];
    const beautiful = s.replace(/010/g, "b");
    const changes = beautiful.replace(/[01]/g, "").length;
    console.log(changes);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));