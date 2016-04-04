# Repeating-Decimals
The aim of the program is to find and represent recuring decimals using JAVA.

I found this online

Input
Each line of the input file consists of an integer numerator, which is nonnegative, followed by an integer denominator, which is positive. None of the input integers exceeds 3000. End-of-file indicates the end of input. 

Output
For each line of input, print the fraction, its decimal expansion through the first occurrence of the cycle to the right of the decimal or 50 decimal places (whichever comes first), and the length of the entire repeating cycle. 
In writing the decimal expansion, enclose the repeating cycle in parentheses when possible. If the entire repeating cycle does not occur within the first 50 places, place a left parenthesis where the cycle begins - it will begin within the first 50 places - and place ``...)" after the 50th digit. 
Print a blank line after every test case. 

Sample Input
76 25
5 43
1 397

Sample Output
76/25 = 3.04(0)
   1 = number of digits in repeating cycle

5/43 = 0.(116279069767441860465)
   21 = number of digits in repeating cycle

1/397 = 0.(00251889168765743073047858942065491183879093198992...)
   99 = number of digits in repeating cycle
