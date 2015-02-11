#!/bin/bash

# Given a text file, which will be piped to your command through STDIN, use grep to display all those lines which contain the word the in them. The search should be sensitive to case. Display only those lines of an input file, which contain the word "the".
# 
# Input Format
# A text file will be piped to your command through STDIN.
# 
# Output Format
# 
# Output only those lines which contain the word 'the'. The search should be case sensitive. The relative ordering of lines in the output should be same as it was in the input.

grep "\bthe\b"
