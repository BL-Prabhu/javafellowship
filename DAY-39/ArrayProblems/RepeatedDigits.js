let repeatedDigits=[];

for(let i=0;i<=100;i++)
{
    let numStr=i.toString();

    if(numStr.length === 2 && numStr[0] === numStr[1])
    {
        repeatedDigits.push(i);
    }
}

console.log("REPEATED DIGITS BETWEEN 1 TO 100 : ");
console.log(repeatedDigits.join(","));