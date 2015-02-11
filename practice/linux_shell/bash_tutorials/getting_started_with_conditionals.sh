#!/bin/bash

# 'If' Statements in Bash are often used in four important ways:
# 
# 1. if...then...fi statements
# 2. if...then...else...fi statements  
# 3. if..elif..else..fi  
# 4. if..then..else..if..then..fi..fi.. (Nested Conditionals)
# The 'Recommended Resources' may give you a clearer idea of conditionals in bash.
#
# Your task:
# Read in one character from the user (this may be 'Y', 'y', 'N', 'n'). If the character is 'Y' or 'y' display "YES". If the character is 'N' or 'n' display "NO". No other character will be provided as input.
#
# Input Format 
# One character (this may be 'Y', 'y', 'N', 'n').
# 
# Output Format 
# One word: either "YES" or "NO" (quotation marks excluded)

read letter

if [[ ("$letter" == "y") || ( "$letter" == "Y" ) ]]; then
    echo "YES"
elif [[ ("$letter" == "n") || ( "$letter" == "N" ) ]]; then
    echo "NO"
fi

