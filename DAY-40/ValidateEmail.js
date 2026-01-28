function validateEmail(email) 
{
    try 
    {
        const emailRegex =
            /^(?!.*\.\.)[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\.[a-zA-Z]{2,})(\.[a-zA-Z]{2})?$/;

        if (!emailRegex.test(email)) 
        {
            throw new Error("Invalid Email");
        }

        console.log(`VALID : ${email}`);
    } 
    catch 
    {
        console.log(`INVALID : ${email}`);
    }
}

const testEmails = [
    "abc@yahoo.com",
    "abc-100@yahoo.com",
    "abc.100@yahoo.com",
    "abc111@abc.com",
    "abc-100@abc.net",
    "abc.100@abc.com.au",
    "abc@1.com",
    "abc@gmail.com.com",
    "abc+100@gmail.com",

    "abc",
    "abc@.com.my",
    "abc123@gmail.a",
    "abc123@.com",
    ".abc@abc.com",
    "abc()*@gmail.com",
    "abc@%*.com",
    "abc..2002@gmail.com",
    "abc.@gmail.com",
    "abc@abc@gmail.com",
    "abc@gmail.com.1a",
    "abc@gmail.com.aa.au"
];

testEmails.forEach(validateEmail);

console.log("-----------------------------------------------------------");

function validateEmails(email) 
{
    try 
    {
        const emailRegex = 
            /^abc([._+-][a-zA-Z]+)?@bridgelabz\.co(\.[a-zA-Z]{2})?$/;

        if (!emailRegex.test(email)) 
            {
            throw new Error("Invalid Email");
        }

        console.log(`Email "${email}" is VALID`);
    }
     catch (error) 
    {
        console.log(`Email "${email}" is INVALID`);
    }
}


validateEmails("abc@bridgelabz.co");        
validateEmails("abc.xyz@bridgelabz.co");     
validateEmails("abc@bridgelabz.co.in");      
validateEmails("abc.xyz@bridgelabz.co.in");   

validateEmails("abc@bridgelabz.com");         
validateEmails("abc#xyz@bridgelabz.co.in");   
validateEmails("ab@bridgelabz.co");            
validateEmails("abc@bridgelabz.co.ind");       
