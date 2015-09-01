var sum = 0;
function processData(input) {
    var lines = input.split("\n");
    var n = parseInt(lines[0]);
    var arr = lines[1].split(" ");
    for (var i = 0; i < n; i++) {
        sum += parseInt(arr[i]);
    }
    console.log(sum);
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