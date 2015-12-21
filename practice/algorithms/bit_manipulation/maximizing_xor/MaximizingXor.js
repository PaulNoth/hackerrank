function processData(input) {
    var l = parseInt(input.split("\n")[0]);
    var r = parseInt(input.split("\n")[1]);
    var max = 0;
    for(var i = l; i <= r; i++) {
        for(var j = l; j <= r; j++) {
            var xor = i ^ j;
            if(xor > max) {
                max = xor;
            }
        }
    }
    console.log(max);
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