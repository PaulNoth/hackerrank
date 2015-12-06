function processData(input) {
    var lines = input.split('\n');
    for(var i = 1; i < lines.length; i++) {
        if(isFunny(lines[i])) {
            console.log("Funny");
        } else {
            console.log("Not Funny");
        }
    }
}

function isFunny(s) {
    for(var j = 0; j < s.length - 1; j++) {
        if(Math.abs(s.charCodeAt(j + 1) - s.charCodeAt(j)) !==
            Math.abs(s.charCodeAt(s.length - j - 2) - s.charCodeAt(s.length - j - 1))) {
            return false;
        }
    }
    return true;
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
    processData(_input);
});
