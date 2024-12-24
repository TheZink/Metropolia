'use strict';

const first = document.querySelector('input[name=firstname]');
const last = document.querySelector('input[name=lastname]');
const form = document.querySelector('form')

form.addEventListener('submit', function (evt) {
    evt.preventDefault();
    document.querySelector('#target').innerHTML = `Sinun nimesi on ${first.value} ${last.value}`;
});
