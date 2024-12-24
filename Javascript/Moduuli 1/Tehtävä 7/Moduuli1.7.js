'use strict';

const answer = parseInt(prompt("Kuinka monta kertaa heitetään?"))
const dice = [1, 2, 3, 4, 5, 6]
let sum = 0

for (let i = 0; i < answer; i++) {
    let randomNumber = Math.floor(Math.random() * dice.length);
    sum += dice[randomNumber]
}

document.querySelector('#noppa').innerHTML = `Noppia heitettiin ${answer} kerran. Noppien summa on ${sum}`;

