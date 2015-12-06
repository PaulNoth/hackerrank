function processData(input) {
    var lines = input.split('\n');
    for(var i = 1; i < lines.length; i++) {
        var diff = 0;
        for(var j = 0; j < lines[i].length / 2; j++) {
            diff += Math.abs(lines[i].charCodeAt(j) - lines[i].charCodeAt(lines[i].length - j - 1));
        }
        console.log(diff);
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
