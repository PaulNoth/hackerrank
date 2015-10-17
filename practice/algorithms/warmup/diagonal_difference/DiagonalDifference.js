function processData(input) {
    var lines = input.split('\n');
    var n = parseInt(lines[0]);
    var sumLeftRight = 0;
    var sumRightLeft = 0;
    for(var i = 0; i < n; i++)
    {
        var elements = lines[i + 1].split(" ").map(function(s) {return parseInt(s)});
        sumLeftRight += elements[i];
        sumRightLeft += elements[n - i - 1];
    }
    console.log(Math.abs(sumLeftRight - sumRightLeft));
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