function processData(input) {
    var hours = parseInt(input.substring(0, input.indexOf(':')));
    var minutes = parseInt(input.substring(input.indexOf(':') + 1, input.lastIndexOf(':')));
    var seconds = parseInt(input.substring(input.lastIndexOf(':') + 1, input.lastIndexOf(':') + 3));
    var newHours;
    if(hours === 12) {
        newHours = 0;
    } else {
        newHours = hours;
    }
    var shift;
    if(input.toLowerCase().indexOf('pm') > -1) {
        shift = 12;
    } else {
        shift = 0;
    }

    var formatedHours = format((newHours + shift).toString());
    var formatedMinutes = format(minutes.toString());
    var formatedSeconds = format(seconds.toString());

    console.log(formatedHours + ":" + formatedMinutes + ":" + formatedSeconds);

    function format(numString) {
        if(numString.length === 1) {
            return "0" + numString;
        }
        return numString;
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