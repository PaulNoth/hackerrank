function processData(input) {
    var numbers = input.split("\n").map(function(item) {return parseInt(item);});
    for(var i = 1; i < numbers.length; i++ ) {
        console.log((~numbers[i]) >>> 0);
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