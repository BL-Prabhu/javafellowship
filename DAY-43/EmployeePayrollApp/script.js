let employees = [];

function addEmployee() {
  const name = document.getElementById("empName").value.trim();
  const salary = document.getElementById("empSalary").value;
  const department = document.getElementById("empDepartment").value;
  const state = document.getElementById("empState").value;
  const startDate = document.getElementById("empStartDate").value;
  const error = document.getElementById("errorMsg");

  const genderRadio = document.querySelector('input[name="gender"]:checked');
  const gender = genderRadio ? genderRadio.value : "";

  if (name.length < 3) {
    error.textContent = "Name must be at least 3 characters";
    return;
  }

  if (salary <= 0) {
    error.textContent = "Salary must be greater than 0";
    return;
  }

  if (!gender) {
    error.textContent = "Please select gender";
    return;
  }

  if (!department || !state || !startDate) {
    error.textContent = "All fields are required";
    return;
  }

  error.textContent = "";

  employees.push({
    name,
    salary,
    gender,
    department,
    state,
    startDate
  });

  renderTable();
  clearForm();
}

function renderTable() {
  const table = document.getElementById("employeeTable");
  table.innerHTML = "";

  employees.forEach(emp => {
    table.innerHTML += `
      <tr>
        <td>${emp.name}</td>
        <td>${emp.salary}</td>
        <td>${emp.gender}</td>
        <td>${emp.department}</td>
        <td>${emp.state}</td>
        <td>${emp.startDate}</td>
      </tr>
    `;
  });
}

function clearForm() {
  document.getElementById("empName").value = "";
  document.getElementById("empSalary").value = "";
  document.getElementById("empDepartment").value = "";
  document.getElementById("empState").value = "";
  document.getElementById("empStartDate").value = "";

  document
    .querySelectorAll('input[name="gender"]')
    .forEach(r => r.checked = false);
}
