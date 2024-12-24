'use strict';

const numbers = [10, 45, 2, 6, 3, 1, 15]

numbers[0] = 12;


for (let i=0; i < numbers.length;i++){
    console.log(numbers[i]);
}

numbers.sort((a,b) => a-b);

console.log('sortattu:')

for (let number of numbers){
    console.log(number);
}

numbers.sort((a,b) => b-a);
const Firstnumber = numbers.shift();

console.log('Sortattu:');

for (let number of numbers){
    console.log(number);
}

console.log('Ensimmäinen numero:');
console.log(Firstnumber);

const student = {
    firstName: 'Greg',
    lastName: 'Focker',
    studentId: '234359',
    phone: '040 5902123',
  }

console.log(student.firstName);
console.log(student['lastName']);

student.addres = 'Karaportti 2';

console.log(student)
