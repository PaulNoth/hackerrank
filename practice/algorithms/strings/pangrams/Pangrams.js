function processData(input) {
    var hash = {};
    input = input.toLowerCase().replace(/\s+/g, '');
    for(var i = 0; i < input.length; i++) {
        hash[input[i]] = true;
    }

    if(isPangram(hash)) {
        console.log("pangram");
    } else {
        console.log("not pangram");
    }
}

function isPangram(hash) {
    var chars = 0;
    for(prop in hash) {
        if(hash.hasOwnProperty(prop)) {
            chars++;
        }
    }
    return chars === 26;
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
