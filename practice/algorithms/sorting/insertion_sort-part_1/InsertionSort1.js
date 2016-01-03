'use strict';

let insertIntoSorted = arr => {
    let num = arr[arr.length - 1];
    let placed = false;
    for(let j = arr.length - 2; j >= 0; j--) {
        if(arr[j] > num) {
            arr[j + 1] = arr[j];
            printArray(arr);
        } else {
            arr[j + 1] = num;
            printArray(arr);
            placed = true;
            break;
        }
    }
    if(!placed) {
        arr[0] = num;
        printArray(arr);
    }
};

let printArray = arr => console.log(arr.join(" "));

const processData = input => {
    let lines = input.split('\n');
    let arr = lines[1].split(' ').map(i => parseInt(i));
    insertIntoSorted(arr)
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));