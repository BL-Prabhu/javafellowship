

const WAGE_PER_HOUR = 20;
const MAX_WORKING_DAYS = 20;
const MAX_WORKING_HOURS = 160;

let totalWorkingDays = 0;
let totalWorkingHours = 0;
let totalWage = 0;

while (
    totalWorkingDays < MAX_WORKING_DAYS &&
    totalWorkingHours < MAX_WORKING_HOURS
) {
    totalWorkingDays++;

    
    let attendance = Math.floor(Math.random() * 3);

    let workingHours = 0;

    if (attendance === 1) {
        workingHours = 4; 
    } else if (attendance === 2) {
        workingHours = 8; 
    } 

    
    if (totalWorkingHours + workingHours > MAX_WORKING_HOURS) {
        workingHours = MAX_WORKING_HOURS - totalWorkingHours;
    }

    let dailyWage = workingHours * WAGE_PER_HOUR;

    totalWorkingHours += workingHours;
    totalWage += dailyWage;

    console.log(
        `Day ${totalWorkingDays} | ` +
        `Attendance: ${attendance === 0 ? "Absent" : attendance === 1 ? "Part Time" : "Full Time"} | ` +
        `Hours: ${workingHours} | Wage: ₹${dailyWage}`
    );
}

console.log("------------------------------------------------");
console.log(`Total Working Days  : ${totalWorkingDays}`);
console.log(`Total Working Hours : ${totalWorkingHours}`);
console.log(`Total Monthly Wage  : ₹${totalWage}`);
