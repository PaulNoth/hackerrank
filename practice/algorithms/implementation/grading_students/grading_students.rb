def professor_grade_rule(grade)
  multiply5 = grade / 5
  roundBy5 = (grade % 5 == 0) ? (multiply5 * 5) : ((multiply5 + 1) * 5)
  return roundBy5 if(roundBy5 - grade < 3 && grade >= 38)
  return grade
end

n = gets.to_i
n.times do
  grade = gets.to_i
  final_grade = professor_grade_rule(grade)
  puts final_grade
end