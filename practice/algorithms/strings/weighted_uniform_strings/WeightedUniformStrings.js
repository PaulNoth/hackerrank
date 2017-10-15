'use strict';

Array.prototype.flatMap = function(lambda) {
    return Array.prototype.concat.apply([], this.map(lambda));
};

const processData = input => {
    const lines = input.split('\n');
    const line = lines[0];
    const queries = lines.slice(2).map(s => parseInt(s));

    const subs = uniformSubstrings(line, []);
    const substringWeights = subs.flatMap(s => {
        const c = s.charCodeAt(0) - 'a'.charCodeAt(0) + 1;
        const lengts = [];
        for(let i = 1; i <= s.length; i++) {
            lengts.push(i * c);
        }
        return lengts;
    });

    for(let q = 0; q < queries.length; q++) {
        const query = queries[q];
        if(substringWeights.indexOf(query) != -1) {
            console.log("Yes");
        } else {
            console.log("No");
        }
    }
};

const uniformSubstrings = (s, strings) => {
    if(s.length > 0) {
        const c = s.charAt(0);
        const substringIndex = takeWhile(s, c);
        const substring = s.slice(0, substringIndex);
        const substring2 = s.substring(substringIndex);
        strings.push(substring);
        return uniformSubstrings(substring2, strings);
    }
    return strings;
}

const takeWhile = (s, c) => {
    for(let i = 0; i < s.length; i++) {
        if(s.charAt(i) !== c) {
            return i;
        }
    }
    return s.length;
}

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));