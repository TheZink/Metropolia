'use strict';

const answer = confirm("Haluatko, että lasken pinta-alan?")

if (answer) {
    let numbers_1 = prompt("Anna pituus: ");
    let numbers_2 = prompt("Anna leveys: ")
    if (numbers_1 >= 0 && numbers_2 >= 0) {
        let calc = numbers_1 * numbers_2
        document.querySelector('#pinta').innerHTML = `Syöttämäsi lukujen pinta-ala on: ${calc}`;
    } else {
        document.querySelector('#pinta').innerHTML = `Syötit negatiivisen luvun :(`;
    }
} else {
    document.querySelector('#pinta').innerHTML = `Peruutit toiminnon. Pinta-alaa ei laskettu`;
}