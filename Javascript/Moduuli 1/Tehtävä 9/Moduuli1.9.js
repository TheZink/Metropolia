'use strict';

const luku = prompt("Anna luku: ")
let tila = false
let kerta = 0

for (let i = 1; i <= luku; i++) {
    if (luku % i == 0) {
        kerta += 1
        tila = true
    } else {
        tila = false
    }
}


if (tila && kerta <= 2) {
    document.querySelector("#alkuluku").innerHTML = `Luku ${luku} on alkuluku.`;
} else {
    document.querySelector("#alkuluku").innerHTML = `Luku ${luku} ei ole alkuluku`;
}