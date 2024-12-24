'use strict';

let list = ['First', 'Second', 'Third']

for (let i = 0; i < list.length; i++) {
    let node = document.createElement('li');
    const text = document.createTextNode(`${list[i]} item`);
    node.appendChild(text);
    document.querySelector('#target').appendChild(node)
}
