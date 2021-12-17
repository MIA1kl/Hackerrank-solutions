#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'breakingRecords' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY scores as parameter.
#

def breakingRecords(scores):
    lowest = int(0)
    highest = int(0)
    min = int(scores[0])
    max = int(scores[0])
    for i in range(0, len(scores)):
        if(min>scores[i]):
            min = scores[i]
            lowest+=1
        if(max<scores[i]):
            max = scores[i]
            highest+=1
    
    return highest , lowest

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    scores = list(map(int, input().rstrip().split()))

    result = breakingRecords(scores)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
