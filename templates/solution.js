const processData = input => {
    // code goes here
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

_input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));