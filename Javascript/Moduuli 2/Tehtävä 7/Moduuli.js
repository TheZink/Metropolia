'use strict';

function dice(sides) {
    let status = true;
    let times = 1;

    while (status) {
        let number = Math.floor(Math.random() * sides) + 1;
        if (number === sides) {
            status = false;
            console.log(`Viimeinen heitto oli: ${number}`)
        } else {
            document.querySelector('#number').innerHTML += `<ul>${times} heitto: ${number}</ul>`;
            times += 1;
        }
    }
}

dice(21);