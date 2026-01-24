const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter starting number: ", (start) => {
    rl.question("Enter ending number: ", (end) => {

        let from = parseInt(start);
        let to = parseInt(end);

        if (isNaN(from) || isNaN(to) || from > to) {
            console.log("Invalid range");
        } else {
            console.log("Prime numbers in the given range:");

            for (let num = from; num <= to; num++) {

                if (num <= 1) continue;

                let isPrime = true;

                for (let i = 2; i <= num / 2; i++) {
                    if (num % i === 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    console.log(num);
                }
            }
        }

        rl.close();
    });
});
