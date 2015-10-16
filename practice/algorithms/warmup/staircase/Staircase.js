function processData(input) {
    var n = parseInt(input);

    for(var i = 0; i < n; i++)
    {
        var s = "";
        for(var j = 0; j < n; j++)
        {
            if(n - i - 2 < j)
            {
                s += "#";
            }
            else
            {
                s += " ";
            }
        }
        console.log(s);
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