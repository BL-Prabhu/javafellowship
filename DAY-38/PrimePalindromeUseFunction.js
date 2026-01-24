const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function isPrime(num) {
    if (num <= 1) return false;

    for (let i = 2; i <= num / 2; i++) {
        if (num % i === 0) {
            return false;
        }
    }
    return true;
}


function isPalindrome(num) {
    let original = num;
    let reverse = 0;

    while (num > 0) {
        reverse = reverse * 10 + (num % 10);
        num = Math.floor(num / 10);
    }

    return original === reverse;
}


rl.question("Enter a number: ", (n) => {
    let num = parseInt(n);

    let prime = isPrime(num);
    let palindrome = isPalindrome(num);

    if (prime && palindrome) {
        console.log("The number is BOTH Prime and Palindrome");
    } else if (prime && !palindrome) {
        console.log("The number is Prime but NOT Palindrome");
    } else if (!prime && palindrome) {
        console.log("The number is Palindrome but NOT Prime");
    } else {
        console.log("The number is NEITHER Prime nor Palindrome");
    }

    rl.close();
});
