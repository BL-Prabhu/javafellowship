
let fiveRandom = [235, 354, 554, 678, 987];
let max = fiveRandom[0];
let min = fiveRandom[0];
for(let num in fiveRandom){
    if(max < fiveRandom[num]){
        max = fiveRandom[num];
    }else if(min > fiveRandom[num]){
        min = fiveRandom[num] ;
    }

}

console.log(max);
console.log(min);

let day = 2 ;
let month = "march";
let month1 = "june"

if((day >= 20 && month == "march") && (day <=20 && month1 == "june")){
    console.log("True");
}else {
    console.log("False");
}

let year = 1984 ;

if((year % 4 == 0) && (year % 100 != 0)){
    console.log("Given year is leap year " ,year);
}else if(year % 400 == 0){
    console.log("Given year is leap year " ,year);
}else {
    console.log("Given year is not leap year " ,year);
}

let diceNumber = Math.round(Math.random()*1);
if(diceNumber == 1){
    console.log("Heads");
}else {
    console.log("Tails");
}