'use strict';

const button = document.querySelector('button');

function popup(evt) {
    alert(`Elementti oli painettu`)
}

button.onclick = popup;