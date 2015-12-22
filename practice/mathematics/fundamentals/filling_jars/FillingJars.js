function processData(input) {
    var lines = input.split("\n");
    var head = lines[0].split(" ").map(i => parseInt(i));
    var jars = head[0];
    var operations = head[1];
    var sum = 0;
    for(var i = 1; i < lines.length; i++) {
        var nums = lines[i].split(" ").map(i => parseInt(i));
        var a = nums[0];
        var b = nums[1];
        var candies = nums[2];
        sum += (b - a + 1) * candies;
    }
    var avg = sum / jars;
    console.log(parseInt(Math.floor(avg)));
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