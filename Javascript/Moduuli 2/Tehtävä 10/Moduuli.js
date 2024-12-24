'use strict';

let candidates = [];
const times = prompt("Kuinka monta osallistujaa?");
let time = 0

for (let i = 0; i < times; i++) {
    const candidate = prompt(`Anna ${i + 1} henkilön nimi`);
    candidates.push({ 'name': candidate, 'votes': 0 });
}

const voters = prompt("Kuinka monta äänestäjää?");

while (time < voters) {
    const vote = prompt("Kenelle annat äänesi?");
    for (let item in candidates) {
        if (candidates[item].name === vote) {
            candidates[item].votes += 1;
        }
    }
    time += 1;
}