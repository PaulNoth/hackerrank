function processData(input) {
    var lines = input.split('\n');
    var n = parseInt(lines[0]);
    var result = lines[1] + "\n";
    for(var i = 2; i < lines.length - 1; i++) {
        result += lines[i][0];
        for(var j = 1; j < lines[i].length - 1; j++) {
            if(isCavity(lines, i, j)) {
                result += 'X'
            } else {
                result += lines[i][j];
            }
        }
        result += lines[i][n - 1];
        result += "\n";
    }
    if(n > 1) {
        result += lines[lines.length - 1];
    }
    console.log(result);
}

function isCavity(map, i, j) {
    var depth = parseInt(map[i][j], 10);
    if (depth <= parseInt(map[i - 1][j], 10)) {
        return false;
    }
    if (depth <= parseInt(map[i][j - 1], 10)) {
        return false;
    }
    if (depth <= parseInt(map[i + 1][j], 10)) {
        return false;
    }
    if (depth <= parseInt(map[i][j + 1], 10)) {
        return false;
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