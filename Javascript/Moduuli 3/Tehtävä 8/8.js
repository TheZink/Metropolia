'use strict';

const operation = document.getElementById('operation');
const button = document.querySelector('button');
const input_1 = document.querySelector('input[id=num1]');
const input_2 = document.querySelector('input[id=num2]');

function calculate(event) {
    event.preventDefault();

    const num1 = parseInt(input_1.value)
    const num2 = parseInt(input_2.value)
    const select = operation.value

    if (select === 'add') {
        document.getElementById('result').innerHTML = num1 + num2;
    }

    else if (select === 'sub') {
        document.getElementById('result').innerHTML = num1 - num2;
    }

    else if (select === 'multi') {
        document.getElementById('result').innerHTML = num1 * num2;
    }

    else if (select === 'div') {
        document.getElementById('result').innerHTML = num1 / num2
    }

}

button.onclick = calculate;