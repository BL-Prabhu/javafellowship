
let diceMap = new Map();


for (let i = 1; i <= 6; i++) 
{
    diceMap.set(i, 0);
}

let maxReached = false;

while (!maxReached) 
{

    let roll = Math.floor(Math.random() * 6) + 1;

    diceMap.set(roll, diceMap.get(roll) + 1);

    if (diceMap.get(roll) === 10) 
    {
        maxReached = true;
    }
}

console.log("Dice Roll Results:");
for (let [key, value] of diceMap) 
{
    console.log("Number", key, "=>", value, "times");
}

let maxCount = -Infinity;
let minCount = Infinity;

let maxNumber;
let minNumber;

for (let [key, value] of diceMap) 
{
    if (value > maxCount) 
    {
        maxCount = value;
        maxNumber = key;
    }
    if (value < minCount) 
    {
        minCount = value;
        minNumber = key;
    }
}
console.log("NUMBER REACHED MAXIMUM TIMES : ", maxNumber,"=>",maxCount);
console.log("NUMBER REACHED MINIMUM TIMES : ", minNumber, "=>",minCount);
