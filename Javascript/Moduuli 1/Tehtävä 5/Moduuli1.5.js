'use strict';

const year = prompt('Anna vuosi: ');

if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
    document.querySelector('#karkaus').innerHTML = `${year} on karkausvuosi`;
} else {
    document.querySelector('#karkaus').innerHTML = `${year} ei ole karkausvuosi`;
}