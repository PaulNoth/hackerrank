function processData(input) {
    var numbers = input.split('\n').map(function(item) parseInt(item));
    for(var i = 1; i < numbers.length; i++) {
        var fives = fiveCount(numbers[i]);
        if(fives === -1) {
            console.log('-1');
        } else {
            console.log(new Array(fives).join('5') + new Array(numbers[i] - fives).join('3'));
        }
    }
}

function fiveCount(num) {
    var fives = num;
    while (fives >= 0 && (num - fives) <= num) {
        if(fives % 3 == 0 && (num - fives) % 5 == 0) {
            return fives;
        }
        fives -= 5;
    }
    return -1;
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
