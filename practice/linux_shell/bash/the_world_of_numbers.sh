#!/bin/bash

# Given two integers X and Y, find their sum, difference, product and quotient.
#
# Input Format 
# Two lines containing one integer each (X and Y)
#
# Input Constraints
# −100<=X,Y<=100 
# Y!=0
# Output Format 
# Four lines containing the sum, difference, product and quotient respectively. 
# X+Y 
# X-Y 
# X*Y 
# X/Y 
# (While computing the quotient, print only the integer part of X/Y)

read x
read y

echo $[$x + $y]
echo $[$x - $y]
echo $[$x * $y]
echo $[$x / $y]
