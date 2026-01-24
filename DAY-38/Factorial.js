const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter a number: ", (n) => {
    let num = parseInt(n);

    if (isNaN(num) || num < 0) {
        console.log("Please enter a valid non-negative number");
    } else {
        let factorial = 1;

        for (let i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        console.log(num + "! = " + factorial);
    }

    rl.close();
});
