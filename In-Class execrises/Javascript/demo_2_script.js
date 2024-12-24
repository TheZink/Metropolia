'use strict';

function greet(text, times) {
    for (let i = 1; i <= times; i++) {
        console.log(`${text} ${i} kerran`)
    }
}

function quadraticSum(first, second) {
    const result = first * first + second * second;
    return result;
}

greet('Tulostettu', 5);
console.log(quadraticSum(2, 3))