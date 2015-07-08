#!/bin/bash

# Task 
# Display the third character from each line of text.
# 
# Input Format 
# A text file with lines of ASCII text only.
# 
# Input Constraints 
# 1 <= N <= 100 (N is the number of lines of text in the input file) 
# Note: These values don't really impact your command.
#
# Output Format 
# The output should contain N lines. Each line should contain just the third character of the corresponding input line. Do not code defensively for situations where the third character may not be present in a line of text (i.e., it is not even 3 characters long).

cut -c3
