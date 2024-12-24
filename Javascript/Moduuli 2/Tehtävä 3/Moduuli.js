'use strict';

const koirat = [];

for (let i = 0; i < 6; i++) {
    koirat.push(prompt(`Kirjoita koiran ${i} nimi`));

}

koirat.sort();
koirat.reverse();
console.log(koirat)

for (let koira of koirat) {
    const koodi = `<li>${koira}</li>`;
    document.querySelector('#target').innerHTML += koodi;
}