// Array to store multiple student objects
const students = [
    {
        id: 1,
        name: "Aatif Raza",
        age: 20,
        grade: "B.Tech 3rd Year",
        subjects: ["Computer Science", "Maths", "English"]
    },
    {
        id: 2,
        name: "Sara Khan",
        age: 21,
        grade: "B.Tech 4th Year",
        subjects: ["Physics", "Maths", "Electronics"]
    }
];
// Function to add a new student
function addStudent(id, name, age, grade, subjects) {
    const newStudent = {
        id: id,
        name: name,
        age: age,
        grade: grade,
        subjects: subjects
    };
    students.push(newStudent);
    console.log(`Student ${name} added successfully.`);
}

// Function to update a student's data by ID
function updateStudent(id, newData) {
    const student = students.find(student => student.id === id);
    if (student) {
        Object.assign(student, newData);
        console.log(`Student ${student.name} updated successfully.`);
    } else {
        console.log(`Student with ID ${id} not found.`);
    }
}

// Function to remove a student by ID
function removeStudent(id) {
    const index = students.findIndex(student => student.id === id);
    if (index !== -1) {
        const removedStudent = students.splice(index, 1);
        console.log(`Student ${removedStudent[0].name} removed successfully.`);
    } else {
        console.log(`Student with ID ${id} not found.`);
    }
}

// Function to display all students
function displayStudents() {
    console.log("Student Data:");
    students.forEach(student => {
        console.log(`ID: ${student.id}`);
        console.log(`Name: ${student.name}`);
        console.log(`Age: ${student.age}`);
        console.log(`Grade: ${student.grade}`);
        console.log(`Subjects: ${student.subjects.join(", ")}`);
        console.log("-----");
    });
}

// Function to find a student by ID
function findStudent(id) {
    const student = students.find(student => student.id === id);
    if (student) {
        console.log("Student Found:");
        console.log(`ID: ${student.id}`);
        console.log(`Name: ${student.name}`);
        console.log(`Age: ${student.age}`);
        console.log(`Grade: ${student.grade}`);
        console.log(`Subjects: ${student.subjects.join(", ")}`);
    } else {
        console.log(`Student with ID ${id} not found.`);
    }
}

// Example Usage
addStudent(3, "John Doe", 22, "M.Tech 1st Year", ["Algorithms", "Data Science", "Machine Learning"]);
updateStudent(1, { age: 21, grade: "B.Tech Final Year" });
removeStudent(2);
displayStudents();
findStudent(3);
