function processData(input) {
    var lines = input.split("\n");
    //var points = parseInt(lines[0]);
    for(var i = 1; i < lines.length; i++) {
        var coordinates = lines[i].split(" ").map(i => parseInt(i));
        var x = coordinates[0];
        var y = coordinates[1];
        var mx = coordinates[2];
        var my = coordinates[3];
        var sx = 2 * mx - x;
        var sy = 2 * my - y;
        console.log(sx + " " + sy);
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