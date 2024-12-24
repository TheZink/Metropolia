'use strict';

const kysy = prompt("Valitse kirjain:")
switch (kysy) {
    case 'A':
        console.log('Valitsit A:n')
        break
    case 'B':
        console.log('Valitsit B:n')
        break
    default:
        console.log('Et valinnut A:ta etkä B:tä')
}