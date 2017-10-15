'use strict';

process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function birthdayCakeCandles(n, ar) {
    let max = 0;
    for(let i = 0; i < ar.length; i++) {
        if(ar[i] > max) {
            max = ar[i];
        }
    }
    let count = 0;
    for(let i = 0; i < ar.length; i++) {
        if(ar[i] === max) {
            count++;
        }
    }
    return count;
}

function main() {
    var n = parseInt(readLine());

    const ar = readLine().split(' ').map(i => parseInt(i));
    var result = birthdayCakeCandles(n, ar);
    process.stdout.write("" + result + "\n");

}
