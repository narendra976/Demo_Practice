#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    # Write your code here
    lengthOfArray = len(arr)
    print("%0.6f" % (len([x for x in arr if x > 0])/lengthOfArray))
    print("%0.6f" % (len([x for x in arr if x < 0])/lengthOfArray))
    print("%0.6f" % (len([x for x in arr if x == 0])/lengthOfArray))
    
    
    
    #print(format(len([x for x in arr if x < 0])/length,"6f"))
    #print(format(len([x for x in arr if x == 0])/length,"6f"))

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
