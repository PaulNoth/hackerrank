function processData(input) {
    var lines = input.split("\n");
    var n = parseInt(lines[0]);
    var words = [];
    for(var i = 1; i <= n; i++) {
        var arr = lines.split(" ");
        for(var j = 0; j < arr.length; j++) {
            words.push(arr[j]);
        }
    }
    var tests = parseInt(lines[n + 1]);
    for(var t = n + 1; t <= n + tests; t++) {
        var count = 0;
        var american = lines[t];
        var british = lines[t].replace(/ze/g, "se");
        for(var w = 0; w < words.length; w++) {
            if(w.match(american) || w.match(british)) {
                count++;
            }
        }
        console.log(count);
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
