'use strict';

const isContinous = (rest, next) => {
    let nextS = next.toString();
    let i = nextS.length;
    while(i <= rest.length) {
        if(!rest.startsWith(nextS)) {
            return false;
        } else {
            next = next + 1;
            rest = rest.substring(i);
            nextS = next.toString();
            i = nextS.length;
        }
    }
    if(rest.length !== 0) {
        return false;
    }
    return true;
}

const processData = input => {
    const lines = input.split('\n');

    t: for(let i = 1; i < lines.length; i++) {
        const s = lines[i];
        for(let j = 1; j <= parseInt(s.length / 2); j++) {
            const head = s.substring(0, j);
            const headVal = parseInt(head);
            const next = headVal + 1;
            const rest = s.substring(j);
            if(isContinous(rest, next)) {
                console.log("YES " + head);
                continue t;
            }
        }
        console.log("NO");
    }

};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));