#!/bin/bash

# In a given fragment of text, replace all paranthesis () with box brackets [].
# 
# Input Format 
# A block of ASCII text.
# 
# Output Format 
# Replace all paranthesis () with box brackets [].

tr "(" "\[" | tr ")" "]"
