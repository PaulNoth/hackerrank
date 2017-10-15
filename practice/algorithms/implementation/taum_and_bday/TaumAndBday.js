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

function main() {
    const t = parseInt(readLine());
    for(let a0 = 0; a0 < t; a0++){
        const b_temp = readLine().split(' ');
        const black = parseInt(b_temp[0]);
        const white = parseInt(b_temp[1]);
        const x_temp = readLine().split(' ');
        const x = parseInt(x_temp[0]);
        const y = parseInt(x_temp[1]);
        const z = parseInt(x_temp[2]);

        const ansWithoutConvert = black * x + white * y;
        const blackConvertCost = black * z;
        const ansWhite = (white + black) * y + blackConvertCost;

        const whiteConvertCost = white * z;
        const ansBlack = (black + white) * x + whiteConvertCost;

        let min = ansWithoutConvert;
        if(ansBlack < min)
        {
            min = ansBlack;
        }
        if(ansWhite < min)
        {
            min = ansWhite;
        }
        console.log(min);
    }
}
