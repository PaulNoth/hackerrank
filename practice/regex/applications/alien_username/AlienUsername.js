function processData(input) {
    var lines = input.split("\n");
    for(var i = 1; i < lines.length; i++) {
        if(lines[i].match(/^[_\.]\d+[a-z]*_?$/ig)) {
            console.log("VALID");
        } else {
            console.log("INVALID");
        }
    }
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