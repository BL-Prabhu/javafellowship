const form = document.getElementById("employeeForm");

// Inputs
const fullName = document.getElementById("fullName");
const password = document.getElementById("password");
const email = document.getElementById("email");
const phone = document.getElementById("phone");
const dob = document.getElementById("dob");

// Errors
const nameError = document.getElementById("nameError");
const passwordError = document.getElementById("passwordError");
const emailError = document.getElementById("emailError");
const phoneError = document.getElementById("phoneError");
const dobError = document.getElementById("dobError");
const degree = document.getElementById("degree");
const domain = document.getElementById("domain");
const salary = document.getElementById("salary");
const portfolio = document.getElementById("portfolio");
const address = document.getElementById("address");

const degreeError = document.getElementById("degreeError");
const domainError = document.getElementById("domainError");
const salaryError = document.getElementById("salaryError");
const urlError = document.getElementById("urlError");
const addressError = document.getElementById("addressError");


// Regex
const nameRegex = /^[A-Za-z ]+$/;
const passwordRegex =
  /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&]).{8,}$/;
const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
const phoneRegex = /^[0-9]{10}$/;
const urlRegex = /^(https?:\/\/)?([\w-]+\.)+[\w-]{2,}(\/\S*)?$/;

const genderError = document.getElementById("genderError");

function validateGender() {
  const selected = document.querySelector('input[name="gender"]:checked');
  if (!selected) {
    showError(genderError, "Please select gender");
    return false;
  }
  return true;
}


form.addEventListener("submit", function (e) {
  clearAllErrors();

  if (!validateName()) {
    e.preventDefault();
    fullName.focus();
    return;
  }

  if (!validateGender()) {
  e.preventDefault();
  return;
}


  if (!validatePassword()) {
    e.preventDefault();
    password.focus();
    return;
  }

  if (!validateEmail()) {
    e.preventDefault();
    email.focus();
    return;
  }

  if (!validatePhone()) {
    e.preventDefault();
    phone.focus();
    return;
  }

  if (!validateDOB()) {
    e.preventDefault();
    dob.focus();
    return;
  }

  if (!validateDegree()) {
    e.preventDefault();
    degree.focus();
    return;
  }

  if (!validateDomain()) {
    e.preventDefault();
    domain.focus();
    return;
  }

  if (!validateSalary()) {
    e.preventDefault();
    salary.focus();
    return;
  }

  if (!validateURL()) {
    e.preventDefault();
    portfolio.focus();
    return;
  }

  if (!validateAddress()) {
    e.preventDefault();
    address.focus();
    return;
  }

  // ✅ All validations passed
  alert("Form submitted successfully!");
});

// ================= VALIDATIONS =================

function validateName() {
  const value = fullName.value.trim();

  if (value === "") {
    showError(nameError, "Full name cannot be empty");
    return false;
  }
  if (!nameRegex.test(value)) {
    showError(nameError, "Name must contain only letters");
    return false;
  }
  return true;
}

function validatePassword() {
  const value = password.value.trim();

  if (value === "") {
    showError(passwordError, "Password cannot be empty");
    return false;
  }
  if (!passwordRegex.test(value)) {
    showError(
      passwordError,
      "Min 8 chars, 1 uppercase, 1 lowercase, 1 number & 1 special character"
    );
    return false;
  }
  return true;
}

function validateEmail() {
  const value = email.value.trim();

  if (value === "") {
    showError(emailError, "Email cannot be empty");
    return false;
  }
  if (!emailRegex.test(value)) {
    showError(emailError, "Enter a valid email address");
    return false;
  }
  return true;
}

function validatePhone() {
  const value = phone.value.trim();

  if (value === "") {
    showError(phoneError, "Phone number cannot be empty");
    return false;
  }
  if (!phoneRegex.test(value)) {
    showError(phoneError, "Phone number must be exactly 10 digits");
    return false;
  }
  return true;
}

function validateDegree() {
  if (degree.value === "") {
    showError(degreeError, "Degree cannot be empty");
    return false;
  }
  return true;
}

function validateDomain() {
  if (domain.value === "") {
    showError(domainError, "Domain cannot be empty");
    return false;
  }
  return true;
}

function validateSalary() {
  if (salary.value === "") {
    showError(salaryError, "Salary cannot be empty");
    return false;
  }
  if (salary.value <= 0) {
    showError(salaryError, "Salary must be greater than zero");
    return false;
  }
  return true;
}

function validateURL() {
  if (portfolio.value === "") {
    showError(urlError, "Portfolio URL cannot be empty");
    return false;
  }
  if (!urlRegex.test(portfolio.value)) {
    showError(urlError, "Enter a valid URL");
    return false;
  }
  return true;
}

function validateAddress() {
  if (address.value.trim() === "") {
    showError(addressError, "Address cannot be empty");
    return false;
  }
  if (address.value.length < 10) {
    showError(addressError, "Address must be at least 10 characters");
    return false;
  }
  return true;
}


function validateDOB() {
  if (dob.value === "") {
    showError(dobError, "Date of birth cannot be empty");
    return false;
  }

  const selectedDate = new Date(dob.value);
  const today = new Date();

  if (selectedDate >= today) {
    showError(dobError, "Date of birth must be a past date");
    return false;
  }
  return true;
}

// ================= HELPERS =================

function showError(element, message) {
  element.textContent = message;
  element.style.display = "block";
}

function clearAllErrors() {
  document.querySelectorAll(".error").forEach(err => {
    err.textContent = "";
    err.style.display = "none";
  });
}
