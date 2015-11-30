function processData(input) {
    var lines = input.split("\n");
    console.log(lines.slice(1, lines.length).map(deletions).join("\n"));
}

function deletions(s) {
    var last = s.charAt(0);
    var dels = 0;
    for(var i = 1; i < s.length; i++) {
        if(last === s.charAt(i)) {
            dels++;
        } else {
            last = s.charAt(i);
        }
    }
    return dels;
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
