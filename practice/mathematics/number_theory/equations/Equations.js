'use strict';

var eratosthenes = num => {
    let result = [];
    let primes = Array(num + 1).fill(true);
    for(let i = 2; i < primes.length; i++) {
        if(primes[i]) {
            let j = i;
            while(j * i <= primes.length) {
                primes[j * i] = false;
                j++;
            }
        }
    }
    for(let i = 2; i < primes.length; i++) {
        if (primes[i]) {
            result.push(i);
        }
    }
    return result;
};

const processData = input => {
    let n = parseInt(input);
    let result = 1;
    if(n === 1)
        result = 1;
    else {
        let primes = eratosthenes(n);
        for(let i = 0; i < primes.length; i++) {
            let prime = primes[i];
            let num = n;
            let exp = 0;
            while(num > 0) {
                let div = parseInt(num / prime);
                num = (parseInt(num / prime));
                exp += div;
            }
            result *= (2 * exp + 1);
            result %= 1000007;
        }
    }
    console.log(result);
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

var _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));