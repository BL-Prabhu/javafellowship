const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter a number: ", (n) => {
    let N = parseInt(n);

    if (isNaN(N) || N <= 1) {
        console.log("Please enter a number greater than 1");
    } else {
        console.log("Prime factors are:");

    
        while (N % 2 === 0) {
            console.log(2);
            N = N / 2;
        }

        
        for (let i = 3; i * i <= N; i += 2) {
            while (N % i === 0) {
                console.log(i);
                N = N / i;
            }
        }

        
        if (N > 2) {
            console.log(N);
        }
    }

    rl.close();
});
