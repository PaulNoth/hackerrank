function processData(input) {
    var lines = input.split('\n');
    var lanes = lines[1].split(' ').map(function(item) {return parseInt(item)});
    for(var i = 2; i < lines.length; i++) {
        var arr = lines[i].split(' ').map(function(item) {return parseInt(item)});
        console.log(findMin(lanes, arr[0], arr[1]));
    }
}

function findMin(arr, i, j) {
    var min = 10000000;
    for(var k = i; k <= j; k++) {
        if(arr[k] < min) {
            min = arr[k];
        }
    }
    return min;
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
