function processData(input) {
    var height = parseInt(Math.ceil(Math.sqrt(input.length)), 10);
    var width = parseInt(Math.floor(Math.sqrt(input.length)), 10);
    var result = '';
    for(var i = 0; i < height; i++) {
        var j = i;
        while(j < input.length) {
            result += input[j];
            j += height;
        }
        result += ' ';
    }
    console.log(result);
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