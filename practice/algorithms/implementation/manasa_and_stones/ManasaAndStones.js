function processData(input) {
    var numbers = input.split("\n").map(function(i) {return parseInt(i); });
    var index = 0;
    var tests = numbers[index++];

    for(var i = 0; i < tests; i++) {
        var n = numbers[index++];
        var a = numbers[index++];
        var b = numbers[index++];
        var hashMap = {};
        hashMap[0] = 1;
        for(var j = 0; j < n - 1; j++) {
            var newHashMap = {};
            for(prop in hashMap) {
                if(hashMap.hasOwnProperty(prop)) {
                    var depth = hashMap[prop];
                    var newA = parseInt(prop) + a;
                    var newB = parseInt(prop) + b;
                    var newDepth = depth + 1;
                    newHashMap[newA] = newDepth;
                    newHashMap[newB] = newDepth;
                }
            }
            hashMap = newHashMap;
        }

        var res = [];
        for(p in hashMap) {
            if(hashMap.hasOwnProperty(p)) {
                res.push(parseInt(p));
            }
        }

        console.log(res.join(" "));
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