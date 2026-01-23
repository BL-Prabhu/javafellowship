const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let low = 1;
let high = 100;

console.log("Think of a number between 1 and 100.");

function guessNumber() {
    if (low > high) {
        console.log("Number not found!");
        rl.close();
        return;
    }

    let mid = Math.floor((low + high) / 2);

    rl.question(
        `Is your number ${mid}?\n` +
        "1 -> My number is Less than this\n" +
        "2 -> My number is Greater than this\n" +
        "3 -> Yes, this is my number\n" +
        "Your choice: ",
        (choice) => {
            choice = parseInt(choice);

            if (choice === 1) {
                high = mid - 1;
            } else if (choice === 2) {
                low = mid + 1;
            } else if (choice === 3) {
                console.log(`Magic number found: ${mid}`);
                rl.close();
                return;
            } else {
                console.log("Invalid input. Try again.");
            }

            guessNumber(); // repeat loop
        }
    );
}

guessNumber();
