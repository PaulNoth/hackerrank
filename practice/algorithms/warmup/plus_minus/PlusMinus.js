function processData(input) {
    var lines = input.split(" ");

    var n = parseInt(lines[0]);
    var arr = lines[1].split(" ").map(function(s) {return parseInt(s);});

    var positives = 0;
    var negatives = 0;
    var zeroes = 0;
    for(var i = 0; i < arr.length; i++)
    {
        if(arr[i] > 0)
        {
            positives++;
        }
        else if(arr[i] < 0)
        {
            negatives++;
        }
        else
        {
            zeroes++;
        }
    }
    console.log(positives / n);
    console.log(negatives / n);
    console.log(zeroes / n);
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