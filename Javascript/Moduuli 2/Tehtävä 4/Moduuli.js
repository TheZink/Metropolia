'use strict';

let status = true;
const numbers = []

while (status) {
    let input = prompt("Anna luku: ")
    if (input > 0) {
        numbers.push(input)
    } else {
        status = false;
    }
}

numbers.sort(function (a, b) { return b - a });
console.log(numbers);




