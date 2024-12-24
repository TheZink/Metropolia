'use strict';

function even(arr) {
    const evenNumbers = [];
    for (let numero of arr) {
        if (numero % 2 === 0) {
            evenNumbers.push(numero);
        }
    }
    return evenNumbers;
}

const numero = [1, 2, 5, 7, 5, 7, 8, 7, 5, 3, 265, 45, 74657, 56, 679]
const parillisetNumerot = even(numero)

console.log(numero)
console.log(parillisetNumerot)