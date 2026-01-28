
function validatePinCode(pin) 
{
    try 
    {
        const pinRegex = /^[1-9][0-9]{2}\s?[0-9]{3}$/;

        if (!pinRegex.test(pin)) 
        {
            throw new Error("Invalid PIN Code");
        }

        console.log(`PIN Code "${pin}" is VALID`);
    } 
    catch (error) 
    {
        console.log(`PIN Code "${pin}" is INVALID`);
    }
}

validatePinCode("400088");    
validatePinCode("400 088");  
validatePinCode("400088B");   
validatePinCode("A400088");   
validatePinCode("4000 88");   
validatePinCode("40 0088");   
