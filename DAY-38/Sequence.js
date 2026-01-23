
let randomNumber = Math.floor(Math.random()*10);
console.log("Random Number : ",randomNumber);

let diceNumber = Math.round(Math.random()*6);
console.log("Dice Number : ",diceNumber);

let dice1 = Math.round(Math.random()*6);
let dice2 = Math.round(Math.random()*6);

let sumOfDice = dice1 + dice2 ;
console.log("sumOfDice : ",sumOfDice);

let twoDigitValues = [22,33,44,55,66];

let one = twoDigitValues[Math.ceil(Math.random()*5)];

let two = twoDigitValues[Math.ceil(Math.random()*5)];

let three = twoDigitValues[Math.ceil(Math.random()*5)];

let four = twoDigitValues[Math.ceil(Math.random()*5)];

let five = twoDigitValues[Math.ceil(Math.random()*5)];

let sum = (one + two + three + four + five) ;
let average = sum / 5 ;
console.log('sum of five twodigits :'+ sum);
console.log('average to twodigit five number : '+ average);