'use strict';

const processData = input => {
    let lines = input.split('\n');
    let counts = lines[0].split(" ").map(i => parseInt(i));
    let vertices = counts[0];
    let edges = counts[1];
    let edgesDesc = lines.slice(1);

    let tree = new Array(vertices + 1, 0);
    let map = {};

    for(let i = 0; i < edges; i++) {
        let splits = edgesDesc[i].split(' ').map(i => parseInt(i));
        let connected = splits[0];
        let parent = splits[1];
        tree[connected] = parent;

        if(!map[parent]){
            map[parent] = 1;
        }
        if(!map[connected]) {
            map[connected] = 1;
        }

        let count = map[parent];
        map[parent] = ++count;
    }

    let result = 0;
    for(let nodeIndex = tree.length - 1; nodeIndex > 1; nodeIndex--) {
        if(map[nodeIndex] % 2 === 0) {
            let hasEven = false;
            for(let i = tree.length - 1; i > 1; i--) {
                if(tree[i] == nodeIndex) {
                    let node = i;
                    if(map[node] % 2 == 0) {
                        hasEven = true;
                    }
                }
            }
            if(!hasEven) {
                result++;
                let parent = tree[nodeIndex];
                tree[nodeIndex] = 0;
                let count = map[parent];
                map[parent] = --count;
            }
        }
    }
    console.log(result);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));