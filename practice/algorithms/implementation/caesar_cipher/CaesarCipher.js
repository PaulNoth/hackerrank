'use strict';

const processData = input => {
    let lines = input.split('\n');
    let text = lines[1];
    let shift = parseInt(lines[2]);
    let encrypted = '';
    for(let i = 0; i < text.length; i++) {
        if(text.charCodeAt(i) >= 'a'.charCodeAt(0) && text.charCodeAt(i) <= 'z'.charCodeAt(0)) {
            encrypted += String.fromCharCode((text.charCodeAt(i) - 'a'.charCodeAt(0) + shift) % 26 + 'a'.charCodeAt(0))
        } else if(text.charCodeAt(i) >= 'A'.charCodeAt(0) && text.charCodeAt(i) <= 'Z'.charCodeAt(0)) {
            encrypted += String.fromCharCode((text.charCodeAt(i) - 'A'.charCodeAt(0) + shift) % 26 + 'A'.charCodeAt(0))
        } else {
            encrypted += text.charAt(i);
        }
    }
    console.log(encrypted);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));