function processData(input) {
    var numbers = input.split("\n").map(function(i) {return parseInt(i); });
    var index = 0;
    var tests = numbers[index++];

    for(var i = 0; i < tests; i++) {
        var cycles = numbers[index++];
        console.log(tree(0, cycles, 1));
    }
}

function tree(actual, cycles, height) {
    if(actual == cycles) {
        return height
    }
    if(actual % 2 == 0)
        return tree(actual + 1, cycles, height * 2)
    return tree(actual + 1, cycles, height + 1)
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