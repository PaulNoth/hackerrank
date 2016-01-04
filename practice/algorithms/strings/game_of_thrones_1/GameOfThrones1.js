'use strict';

let isPalindrome = (length, charMap) => {
    let isPalindrome = true;
    if(length % 2 == 0) {
        for(let prop in charMap) {
            if(charMap.hasOwnProperty(prop) && charMap[prop] % 2 !== 0) {
                isPalindrome = false;
                break;
            }
        }
    }
    if(length % 2 != 0) {
        let oddCount = 0;
        for(let prop in charMap) {
            if(charMap[prop] % 2 !== 0) {
                oddCount++;
            }
        }
        isPalindrome = oddCount === 1;
    }
    if(isPalindrome) {
        return "YES";
    } else {
        return "NO";
    }
};

const processData = input => {
    let charMap = {};
    for(let i = 0; i < input.length; i++) {
        let count = charMap[input[i]];
        if(count) {
            charMap[input[i]] = count + 1;
        } else {
            charMap[input[i]] = 1;
        }
    }
    console.log(isPalindrome(input.length, charMap));
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));