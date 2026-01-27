const WAGE_PER_HOUR = 20;
const FULL_TIME_WAGE = 160;
const PART_TIME_WAGE = 80;
const WORKING_DAYS = 30;

let dayWageMap = new Map();

function generateDailyWages() 
{
    for (let day = 1; day <= WORKING_DAYS; day++) 
    {

        let empCheck = Math.floor(Math.random() * 3);
        let dailyWage = 0;

        if (empCheck === 1) 
        {
            dailyWage = PART_TIME_WAGE;
        } 
        else if (empCheck === 2) 
        {
            dailyWage = FULL_TIME_WAGE;
        }
        dayWageMap.set(day, dailyWage);
    }
}


function calculateTotalWage() 
{
    let totalWage = 0;

    for (let wage of dayWageMap.values()) 
    {
        totalWage += wage;
    }

    return totalWage;
}

function showDayWiseWage() 
{
    for (let [day, wage] of dayWageMap) 
    {
        console.log(`DAY ${day} = ${wage}`);
    }
}


generateDailyWages();

console.log("DAY WISE DAILY WAGES :");
showDayWiseWage();

console.log("TOTAL WAGE :", calculateTotalWage());
