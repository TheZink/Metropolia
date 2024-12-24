'use strict';

const year_1 = prompt("Anna ensimmäinen vuosiluku: ");
const year_2 = prompt("Anna toinen vuosiluku: ")

for (let i = year_1; i < year_2; i++) {
    if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
        const karkaus = `<li>${i}</li>`;
        document.querySelector('#karkaus').innerHTML += karkaus;
    }
}