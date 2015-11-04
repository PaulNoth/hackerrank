function processData(input) {
    var lines = input.split('\n');
    for(var i = 1; i < lines.length; i++) {
        var amounts = lines[i].split(' ').map(function(item) { return parseInt(item); });
        console.log(chocolates(amounts[0], amounts[1], amounts[2]));
    }
}

function chocolates(amount, price, discount) {
    var result = 0;
    var bought = parseInt(amount / price);
    result += bought;

    var wrappers = bought;
    while(wrappers >= discount) {
        var freeChoco = parseInt(wrappers / discount);
        result += freeChoco;
        wrappers = wrappers - freeChoco * discount + freeChoco;
    }
    return result;
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