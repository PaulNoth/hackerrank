#!/bin/bash

read letter

if [[ ("$letter" == "y") || ( "$letter" == "Y" ) ]]; then
    echo "YES"
elif [[ ("$letter" == "n") || ( "$letter" == "N" ) ]]; then
    echo "NO"
fi

