function processData(input) {
    var arr = input.split("\n")[1].split(" ").map(function(item) {return parseInt(item)});
    var hash = {};
    for(var i = 0; i < arr.length; i++) {
        if(hash[arr[i]]) {
            hash[arr[i]] += 1;
        } else {
            hash[arr[i]] = 1;
        }
    }
    for(prop in hash) {
        if(hash.hasOwnProperty(prop) && hash[prop] == 1) {
            console.log(prop);
            return;
        }
    }
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {_input += input;});

process.stdin.on("end", function () {processData(_input);});