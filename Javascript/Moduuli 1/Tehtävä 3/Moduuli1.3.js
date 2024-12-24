'use strict';

let luku = 0;

for (let i = 0; i < 3; i++) {
    let syote = prompt('Anna luku: ');
    luku += Number(syote);
}

document.querySelector('#lasku').innerHTML = `Syöttämäsi lukujen summa on: ${luku}`;

