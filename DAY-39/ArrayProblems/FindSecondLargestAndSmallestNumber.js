let numbers=[];

for(let i=0;i<10;i++)
{
    let randomNumber=Math.floor(Math.random()*900)+100;
    numbers.push(randomNumber);
}

console.log("GENERATED NUMBERS : ");
console.log(numbers.join(","));

for(let i=0;i<numbers.length;i++)
{
    for(let j=i+1;j<numbers.length;j++)
    {
        if(numbers[i]>numbers[j])
        {
            let temp=numbers[i];
            numbers[i]=numbers[j];
            numbers[j]=temp;
        }
    }
}

console.log("SORTED ARRAY")
console.log(numbers.join(","));

let smallest=numbers[0];
let secondSmallest=numbers[1];
let largest=numbers[0];
let secondLargest=numbers[1];

for(let i=1;i<numbers.length;i++)
{
    let num=numbers[i];

    if(num<smallest)
    {
        secondSmallest=smallest;
        smallest=num;
    }
    else if(num<secondSmallest && num !== smallest)
    {
        secondSmallest=num;
    }

    if(num>largest)
    {
        secondLargest=largest;
        largest=num;
    }
    else if(num>secondLargest && num !== largest)
    {
        secondLargest=num;
    }
}

console.log("SMALLEST NUMBER :",smallest);
console.log("SECOND SMALLEST NUMBER :",secondSmallest);
console.log("LARGEST NUMBER :",largest);
console.log("SECOND LARGEST NUMBER :",secondLargest);