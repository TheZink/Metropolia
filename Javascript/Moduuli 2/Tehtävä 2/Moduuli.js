'use strict';

let times = prompt('Kuinka monta pelaajaa?: ');
const names = [];

for (let i = 1; i <= times; i++) {
    names.push(prompt(`Anna ${i} nimi:`));
}

names.sort();

for (let player in names) {
    const name = `<ol>${names[player]}</ol>`
    document.querySelector('#name').innerHTML += name;
}