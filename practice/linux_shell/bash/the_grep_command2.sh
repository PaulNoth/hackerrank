#!/bin/bash

# Given a text file, which will be piped to your command through STDIN, use grep to display all those lines which contain the word the in them. The search should NOT be sensitive to case. Display only those lines of an input file, which contain the word "the".

grep -i "\bthe\b"
