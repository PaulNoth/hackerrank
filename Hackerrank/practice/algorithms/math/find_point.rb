# Find Point
#
# Problem statement
# 
# Given two points P and Q, output the symmetric point of point P about Q.
# 
# Input format: 
# First line contains an integer T representing the number of testcases (T <= 15) 
# Each test case contains Px Py Qx Qy representing the (x,y) coordinates of P and Q, all of them being integers
# 
# Constraints 
# 1 <= T <= 15 
# -100 <= x, y <= 100
# 
# Output format 
# For each test case output x and y coordinates of the symmetric point
# 
# Sample input
# 1  
# 0 0 1 1
# Sample output
# 2 2

class Point
  attr_reader :x, :y
  
  def initialize(x, y)
    @x = x
    @y = y
  end
  
  # http://en.wikipedia.org/wiki/Point_reflection
  def self.symetric_point(point, midpoint)
    x = 2 * midpoint.x - point.x
    y = 2 * midpoint.y - point.y
    return Point.new(x, y)
  end
end


tests = gets.chomp.to_i
tests.times do
  coordinates = gets.chomp.split.map { |e| e.to_i }
  half1 = coordinates.slice(0..1)
  half2 = coordinates.slice(2..3)
  point = Point.new(half1[0], half1[1])
  midpoint = Point.new(half2[0], half2[1])
  
  symetric_point = Point.symetric_point(point, midpoint)
  puts "#{symetric_point.x} #{symetric_point.y}"
end