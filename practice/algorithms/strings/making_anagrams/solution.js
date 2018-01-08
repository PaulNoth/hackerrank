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

function makingAnagrams(s1, s2){
    var letters = Array.apply(null, new Array(26)).map(Number.prototype.valueOf,0);
    assignWeight(letters,s1,1);
    assignWeight(letters,s2,-1);

    var solution = letters.reduce(function(prev, curr){
        return Math.abs(prev) + Math.abs(curr);
    });

    return solution;
}


function assignWeight(letters, word, weigth) {
    var charCode;
    for (var i = 0;i < word.length; i++){
        charCode =  word.charCodeAt(i) - 97;
        letters[charCode] += weigth;
    }
}

function main() {
    var s1 = readLine();
    var s2 = readLine();
    var result = makingAnagrams(s1, s2);
    process.stdout.write("" + result + "\n");

}
