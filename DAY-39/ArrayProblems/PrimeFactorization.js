const readline=require("readline");

const rl=readline.createInterface(
    {
        input : process.stdin,
        output : process.stdout
    }
);

rl.question("ENTER THE NUMBER : ",function(input)
{
    let n = parseInt(input);

    if(isNaN(n) || n<=1)
    {
        console.log("PLEASE ENTER A VALID NUMBER GREATER THAN 1");
        rl.close();
        return;
    }

    let number=n;
    let primeFactors=[];
    let divisor=2;

    while(number>1)
    {
        if(number%divisor === 0)
        {
            primeFactors.push(divisor);
            number=number/divisor;
        }
        else
        {
            divisor++;
        }
    }

    console.log("NUMBER :",n);
    console.log("PRIME FACTORS : ",primeFactors.join(","));
    rl.close;
});