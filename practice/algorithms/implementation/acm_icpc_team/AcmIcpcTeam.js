'use strict';

const processData = input => {
    const lines = input.split('\n');
    const players = parseInt(lines[0].split(' ')[0]);
    const topics = parseInt(lines[0].split(' ')[1]);
    const teamTopics = lines.slice(1);
    let teams = 0;
    let maxKnownTopics = 0;
    for (let i = 0; i < players; i++)
    {
        for (let j = i + 1; j < players; j++)
        {
            const knownTopics = knownTopicsFunc(teamTopics[i], teamTopics[j], topics);
            if(knownTopics > maxKnownTopics)
            {
                teams = 1;
                maxKnownTopics = knownTopics;
            }
            else if(maxKnownTopics == knownTopics)
            {
                teams++;
            }
        }
    }
    console.log(maxKnownTopics);
    console.log(teams);
}


const knownTopicsFunc = (binary, binary2, topics) => {
    let result = 0;
    for (let i = 0; i < topics; i++)
    {
        if(binary[i] === '1' ||  binary2[i] === '1')
        {
            result++;
        }
    }
    return result;
}

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));