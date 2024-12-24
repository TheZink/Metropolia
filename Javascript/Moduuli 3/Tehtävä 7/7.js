'use strict';

const text = document.getElementById('trigger');
const photo = document.getElementById('target');

text.addEventListener('mouseover', () => { photo.src = 'img/picB.jpg'; });
text.addEventListener('mouseout', () => { photo.src = 'img/picA.jpg'; });
