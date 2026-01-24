const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("ENTER A NUMBER: ", (n) => {
    let num = parseInt(n);

    if (num <= 1) {
        console.log("NOT A PRIME NUMBER");
    } else {
        let isPrime = true;

        for (let i = 2; i <= num / 2; i++) {
            if (num % i === 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            console.log("PRIME NUMBER");
        } else {
            console.log("THIS IS NOT A PRIME NUMBER");
        }
    }

    rl.close();  
});
