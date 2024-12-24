'use strict';

function dice() {
    let status = true;
    let times = 1;

    while (status) {
        let number = Math.floor(Math.random() * 6) + 1;
        if (number === 6) {
            status = false;
        } else {
            document.querySelector('#number').innerHTML += `<ul>${times} heitto: ${number}</ul>`;
            times += 1;
        }
    }
}

dice();