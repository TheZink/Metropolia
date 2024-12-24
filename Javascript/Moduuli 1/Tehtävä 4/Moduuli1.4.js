'use strict';

const classes = ['Gryffindor', 'Slytherin', 'Hufflepuff', 'Ravenclaw'];
const randomNumber = Math.floor(Math.random() * classes.length);

const name = prompt("Kerro nimesi: ");

document.querySelector('#classes').innerHTML = `${name}, pääsit ${classes[randomNumber]} luokkaan!`;


