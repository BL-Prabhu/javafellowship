const FULL_TIME_WAGE = 160;
const PART_TIME_WAGE = 80;
const WORKING_DAYS = 30;

class EmployeeWage 
{
    constructor(empId, salary, gender, joinDate) 
    {
        this.validateEmployee(empId, salary, gender, joinDate);

        this.empId = empId;
        this.salary = salary;
        this.gender = gender;
        this.joinDate = joinDate;

        this.wageMap = new Map(); 
    }

    generateDailyWages = () => {
        for (let day = 1; day <= WORKING_DAYS; day++) 
            {
            let empCheck = Math.floor(Math.random() * 3);
            let wage = 0;

            if (empCheck === 1) wage = PART_TIME_WAGE;
            else if (empCheck === 2) wage = FULL_TIME_WAGE;

            this.wageMap.set(day, wage);
        }
    };

    
    validateEmployee = (empId, salary, gender, joinDate) => {
        validator.checkEmpId(empId);
        validator.checkSalary(salary);
        validator.checkGender(gender);
        validator.checkDate(joinDate);
    };
}


const validator = {

    checkEmpId: (empId) => {
        const idRegex = /^[1-9][0-9]*$/;
        if (!idRegex.test(empId)) {
            throw new Error("Employee ID must be a positive non-zero number");
        }
    },

    checkSalary: (salary) => {
        const salaryRegex = /^[1-9][0-9]*$/;
        if (!salaryRegex.test(salary)) {
            throw new Error("Salary must be a positive non-zero number");
        }
    },

    
    checkGender: (gender) => {
        const genderRegex = /^[MF]$/;
        if (!genderRegex.test(gender)) {
            throw new Error("Gender must be M or F");
        }
    },

    
    checkDate: (date) => {
        const inputDate = new Date(date);
        const today = new Date();

        if (inputDate > today) {
            throw new Error("Date cannot be a future date");
        }
    }
};


const wageUtility = {

    totalWage: (wageMap) => {
        let total = 0;
        wageMap.forEach(wage => total += wage);
        return total;
    },

    showDayWithWage: (wageMap) => {
        wageMap.forEach((wage, day) =>
            console.log(`DAY ${day} = ${wage}`)
        );
    },

    fullTimeDays: (wageMap) => {
        wageMap.forEach((wage, day) => {
            if (wage === FULL_TIME_WAGE) {
                console.log(`DAY ${day}`);
            }
        });
    },

    firstFullTimeDay: (wageMap) => {
        for (let [day, wage] of wageMap.entries()) {
            if (wage === FULL_TIME_WAGE) return day;
        }
        return "No Full Time Day";
    },

    isEveryDayFullTime: (wageMap) => {
        for (let wage of wageMap.values()) {
            if (wage !== FULL_TIME_WAGE) return false;
        }
        return true;
    },

    isAnyPartTime: (wageMap) => {
        for (let wage of wageMap.values()) {
            if (wage === PART_TIME_WAGE) return true;
        }
        return false;
    },

    numberOfWorkingDays: (wageMap) => {
        let count = 0;
        wageMap.forEach(wage => {
            if (wage > 0) count++;
        });
        return count;
    }
};


try {
    
    const emp = new EmployeeWage("101", "50000", "M", "2024-06-15");

    emp.generateDailyWages();

    console.log("DAY WISE WAGES:");
    wageUtility.showDayWithWage(emp.wageMap);

    console.log("\nTOTAL WAGE:", wageUtility.totalWage(emp.wageMap));
    console.log("\nFULL TIME DAYS:");
    wageUtility.fullTimeDays(emp.wageMap);

    console.log("\nFIRST FULL TIME DAY:", wageUtility.firstFullTimeDay(emp.wageMap));
    console.log("EVERY DAY FULL TIME:", wageUtility.isEveryDayFullTime(emp.wageMap));
    console.log("ANY PART TIME:", wageUtility.isAnyPartTime(emp.wageMap));
    console.log("NUMBER OF WORKING DAYS:", wageUtility.numberOfWorkingDays(emp.wageMap));

} 
catch (error) 
{
    console.error("ERROR:", error.message);
}
