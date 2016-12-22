'use strict';

const processData = input => {
    const lines = input.split('\n');
    const [cities, stationCount] = lines[0].split(' ').map(i => parseInt(i));
    const stations = lines[1].split(' ').map(i => parseInt(i));
    stations.sort((a, b) => a - b);
    let max = 0;
    for(let i = 0; i < stations.length - 1; i++) {
        const citiesInside = stations[i + 1] - stations[i] - 1;
        const d = parseInt(Math.ceil(citiesInside / 2.0));
        if(d > max) {
            max = d;
        }
    }
    if(stations[0] - 0 > max) {
        max = stations[0] - 0;
    }
    if(cities - 1 - stations[stationCount - 1] > max) {
        max = cities - 1 - stations[stationCount - 1];
    }
    console.log(max);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));