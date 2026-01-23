

function findFreezingPoint(c, f){
    let degF = (c * 9/5) + 32 ;
    console.log(degF);
    let degC = (f -32) * 5/9 ;
    console.log(degC);
   if(degC < 0 && degF < 32){
    console.log("Freezing point")
   }else if(degC > 100 && degF < 212){
    console.log("Boiling point");
   }
   else {
    console.log("Normal point");
   }

   
}

let c = 9 ;
let f = 189 ;

findFreezingPoint(c, f);

// check palindrome or not 

function checkPalindrome(num){


    let reverse = 0 ;
    let number = num ;
    while(num != 0){
        let n = num % 10 ;
        reverse = (reverse * 10) + n;
        num = Math.floor(num / 10) ;
    }
  
    if(reverse == number){
        console.log("Palindrome");
    }else {
        console.log("Not palindrome");
    }
}

let num1 = 1221 ;
checkPalindrome(num1);
let num2 = 3456 ;
checkPalindrome(num2);


// check prime and palindrome 

function checkPalindromePrimeNumber(n){

    let primeNumber = 0 ;
    if(n <= 1){
        console.log(n , " is not a prime number ");
    }else {
        let isPrime = true ;

        for(let i = 2; i <= Math.sqrt(n); i++){
            if(n % i === 0){
                isPrime = false ;
                break ;
            }
        }

      
        if(isPrime){
            console.log(n , " is a prime number");
            primeNumber = n ;
        }else {
            console.log(n ," is not a prime number");
            primeNumber = n ;
        }

    }

    console.log(primeNumber);

    let rev = 0 ;
    let pn = primeNumber ;
    while(primeNumber != 0){
        let digit = primeNumber % 10 ;

        rev = (rev * 10) + digit ;

        primeNumber = primeNumber / 10 ;
    }
    
    if(rev == pn){
        console.log("Palindrome");
    }else {
        console.log("not palindrome");
    }
}

let number = 1234 ;
checkPalindromePrimeNumber(number);