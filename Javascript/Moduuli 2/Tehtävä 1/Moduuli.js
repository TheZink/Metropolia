'use strict';

let numbers = []

for (let i = 1; i <= 5; i++) {
    let number = prompt(`Anna ${i}. luku: `)
    numbers.unshift(number);
}

console.log(numbers)

