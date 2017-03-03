'use strict';

const professorGradeRule = (grade) => {
    const multiply5 = parseInt(grade / 5);
    const roundBy5 = (grade % 5 == 0) ? (multiply5 * 5) : ((multiply5 + 1) * 5);
    if(roundBy5 - grade < 3 && grade >= 38) {
        return roundBy5;
    }
    return grade;
}

const processData = input => {
    const grades = input.split('\n').map(i => parseInt(i));
    for(let i = 1; i < grades.length; i++) {
        const grade = grades[i];
        const finalGrade = professorGradeRule(grade);
        console.log(finalGrade);
    }
};

process.stdin.resume();
process.stdin.setEncoding("ascii");

let _input = "";
process.stdin.on("data", input => _input += input);
process.stdin.on("end", () => processData(_input));