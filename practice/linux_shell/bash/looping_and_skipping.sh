#!/bin/bash

# For loops in Bash can be used in several ways: 
# - iterating between two integers a and b 
# - iterating between two integer a and b and incrementing by c each time 
# - iterating through the elements of an array, etc.
#
# Your task is to use for loops to display only odd natural numbers 1 to 99.

for i in {1..99..2}
do
  echo $i
done
