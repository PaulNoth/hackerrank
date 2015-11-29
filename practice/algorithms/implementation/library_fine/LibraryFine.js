function processData(input) {
    var lines = input.split("\n");
    var actualDate = lines[0].split(" ");
    var expectedDate = lines[1].split(" ");

    var yearDiff = parseInt(actualDate[2]) - parseInt(expectedDate[2]);
    var monthDiff = parseInt(actualDate[1]) - parseInt(expectedDate[1]);
    var dayDiff = parseInt(actualDate[0]) - parseInt(expectedDate[0]);

    console.log(fee(yearDiff, monthDiff, dayDiff));
}

function fee(year, month, day)
{
    if(year > 0) return 10000;
    if(year == 0 && month > 0) return month * 500;
    if(year == 0 && month == 0 && day > 0) return day * 15;
    return 0;
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
