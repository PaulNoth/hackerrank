function processData(input) {
    const tagPattern = /<\s*[a-z0-9]+/g
    var lines = input.split("\n");
    var tagSet = {};
    for(var i = 1; i < lines.length; i++) {
        var tags = lines[i].match(tagPattern);
        if(tags) {
        tags = tags.map(function(item) {return item.replace(/</, '')});
            for(var j = 0; j < tags.length; j++) {
                tagSet[tags[j]] = true;
            }
        }
    }
    var tags = [];
    for(prop in tagSet) {
        if(tagSet.hasOwnProperty(prop)) {
            tags.push(prop);
        }
    }
    console.log(tags.sort(function (s1, s2) {return s1.localeCompare(s2)}).join(";"));
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