function processData(input) {
    var lines = input.split('\n');
    var n = parseInt(lines[0]);
    var index = 2;
    for(var i = 0; i < n; i++) {
        var arr = lines[index].split(" ").map(i => parseInt(i));
        var routes = 1;
        for(var j = 0; j < arr.length; j++) {
            routes *= arr[j];
            routes %= 1234567;
        }
        console.log(routes);
        index += 2;
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