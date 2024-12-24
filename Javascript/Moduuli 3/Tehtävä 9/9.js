'use strict';

const input = document.querySelector('input[id=calculation]');
const button = document.querySelector('button');

function calculate(event) {

    const numbers = input.value;
    console.log(numbers);

    if (numbers.includes('+')) {

        const add = numbers.split('+');
        document.getElementById('result').innerHTML = parseInt(add[0]) + parseInt(add[1]);

    } else if (numbers.includes('-')) {

        const add = numbers.split('-');
        document.getElementById('result').innerHTML = parseInt(add[0]) - parseInt(add[1]);

    } else if (numbers.includes('*')) {

        const add = numbers.split('*');
        document.getElementById('result').innerHTML = parseInt(add[0]) * parseInt(add[1]);

    } else if (numbers.includes('/')) {

        const add = numbers.split('/');
        document.getElementById('result').innerHTML = parseInt(add[0]) / parseInt(add[1]);

    }

}

button.onclick = calculate;