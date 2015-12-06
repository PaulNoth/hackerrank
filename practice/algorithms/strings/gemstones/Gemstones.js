function processData(input) {
    var lines = input.split('\n');
    var first = lines[1].split('');
    for(var i = 2; i < lines.length; i++) {
        first = intersect(first, lines[i].split(''));
    }
    console.log(first.length)
}

function intersect(arr1, arr2) {
    var unique1 = arr1.distinct();
    var unique2 = arr2.distinct();
    return unique1.distinct().filter(function(s) {
        return unique2.distinct().indexOf(s) !== -1
    });
}

Array.prototype.distinct = function() {
    var hash = {};
    var a = [];
    for(var i = 0; i < this.length; i++) {
        if(hash.hasOwnProperty(this[i])) {
            continue;
        }
        hash[this[i]] = true;
        a.push(this[i]);
    }
    return a;
};

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
    processData(_input);
});
