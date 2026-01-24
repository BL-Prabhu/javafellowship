const readline = require("readline");

const rl=readline.createInterface(
    {
        input:process.stdin,
        output:process.stdout
    });

    rl.question("ENTER VALUE OF n", (n)=>
    {
        let num = Number(n);
        let power = 1;

        for(let i=0;i<=num;i++)
        {
            console.log(power);
            power=power*2;
        }
        rl.close();
    });