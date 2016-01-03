'use strict';

const LATITUDE_LONGITUDE_PATTERN =
    "^\\([+-]?((90(\\.0+)?)|([1-8][0-9](\\.[0-9]+)?)|([0-9](\\.[0-9]+)?)),\\s*[+-]?(((([1-9][0-9])|([0-9]))(\\.[0-9]+)?)|(1((80(\\.0+)?)|([0-7][0-9](\\.[0-9]+)?))))\\)$";

const processData = input => {
    let validate = pair => {
        if(pair.match(LATITUDE_LONGITUDE_PATTERN)) {
            return "Valid";
        } else {
            return "Invalid";
        }
    };
    let pairs = input.split('\n').slice(1);
    let validations = pairs.map(validate);
    console.log(validations.join('\n'));
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));