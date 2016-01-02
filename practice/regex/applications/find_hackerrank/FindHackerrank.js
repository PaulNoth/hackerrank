'use strict';

let findHackerrank = line => {
    if(line.match(/^hackerrank$/) || line.match(/^hackerrank.*hackerrank$/))
        return "0";
    else if(line.match(/^hackerrank.*/))
        return "1";
    else if(line.match(/.*hackerrank$/))
        return "2";
    else
        return "-1";
};

const processData = input => {
    let lines = input.split('\n').slice(1);
    console.log(lines.filter(line => line.match(/[a-z]+/)).map(findHackerrank).join('\n'))
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));