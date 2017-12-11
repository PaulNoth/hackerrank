process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function isAlternating(s) {
    for(let i = 0; i < s.length - 1; i++) {
        if(s.charAt(i) == s.charAt(i + 1)) {
            return false;
        }
    }
    return true;
}

function maxLen(n, s){
    var distinct = {};
    for (var i = 0; i < n; i++) {
        distinct[s[i]] = 1;
    }

    distinct = Object.keys(distinct);

    var max = 0;
    for(var i = 0; i < distinct.length - 1; i++) {
        for(var j = i + 1; j < distinct.length ; j++) {
            var c1 = distinct[i];
            var c2 = distinct[j];
            var subset = s.replace(new RegExp('[^' + c1 + '' + c2 + ']', "gi"), '');

            if(isAlternating(subset)) {
                var l = subset.length;
                max = l > max ? l : max;
            }
        }
    }

    return max;
}

function main() {
    var n = parseInt(readLine());
    var s = readLine();
    var result = maxLen(n, s);
    process.stdout.write(""+result+"\n");

}
