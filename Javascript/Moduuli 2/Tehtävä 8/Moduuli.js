'use strict';

function contact(name) {
    for (let i = 0; i < name.length; i++) {
        document.querySelector('#names').innerHTML += name[i];
    }
}

contact(['Jukka', 'Lasse', 'Ilkka', 'Juuso', 'Haloo']);