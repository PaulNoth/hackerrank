function processData(input) {
    var lines = input.split("\n");

    console.log(lines.slice(1).map(deletions).join('\n'));
}

function deletions(s) {
    if(s.length % 2 != 0) {
        return -1;
    }
    var h1 = s.substring(0, s.length / 2);
    var h2 = s.substring(s.length / 2);

    for(var i = 0; i < h1.length; i++) {
        if(h2.indexOf[h1[i]] !== -1) {
            h2 = h2.replace(h1[i], '');
        }
    }
    return h2.length;
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
