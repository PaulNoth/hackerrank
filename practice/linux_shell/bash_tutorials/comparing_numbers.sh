#!/bin/bash

# Given two integers X and Y, identify whether "X is less than Y" or "X is greater than Y" or "X is equal to Y".
# 
# Comparisons in a shell script, may either be accomplished using regular operators (such as < or >) or using (-lt, -gt, -eq i.e. less than, greater than, equal to) for POSIX shells. This discussion on stack overflow contains useful information on this topic.
# 
# Input Format 
# Two lines containing one integer each (X and Y)
# 
# Output Format 
# Exactly one of the following lines "X is less than Y" or "X is greater than Y" or "X is equal to Y".

read x
read y

if ((x < y)); then
  echo "X is less than Y"
elif ((x > y)); then
  echo "X is greater than Y"
else
  echo "X is equal to Y"
fi
