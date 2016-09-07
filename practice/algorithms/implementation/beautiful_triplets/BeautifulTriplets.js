'use strict';

const processData = input => {
    const lines = input.split('\n');
    const [n, d] = lines[0].split(' ').map(i => parseInt(i));
    const array = lines[1].split(' ').map(i => parseInt(i));

    let triplets = 0;
    for(let i = 0; i < n - 2; i++) {
        for(let j = i + 1; j < n - 1; j++) {
            if(array[j] - array[i] > d) break;
            for(let k = j + 1; k < n; k++) {
                if(array[k] - array[j] > d) break;
                if((array[k] - array[j] == d) && (array[j] - array[i] == d)) {
                    triplets++;
                }
            }
        }
    }
    console.log(triplets);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));