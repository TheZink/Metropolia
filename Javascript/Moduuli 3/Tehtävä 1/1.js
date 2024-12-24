'use strict';

let list = ['First', 'Second', 'Third']

for (let i = 0; i < list.length; i++) {
    document.querySelector('#target').innerHTML += `<li>${list[i]} item</li>`
}