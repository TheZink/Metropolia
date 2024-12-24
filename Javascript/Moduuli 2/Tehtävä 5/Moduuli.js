'use strict';

let status = true;
const numbers = [];

while (status) {
    const input = prompt("Anna luku: ")
    if (numbers.includes(input)) {
        status = false;
    } else {
        numbers.push(input);
    }
}

numbers.sort(function (a, b) { return a - b });
console.log(numbers);