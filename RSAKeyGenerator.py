from fractions import gcd
# Program to generate public-private key sets for RSA
# good test values are:
# p = 11
# q = 17
# e = 3
# lower bound = 0
# upper bound = 3e+3

# note that for massive numbers the program will lose precision!
# the larger the public key, the harder to break the cipher will be! 

# check if a number is prime - 1 indicates prime, 0 indicates non-prime 
def is_prime(x):
    result = 1
    count = 2
    while ((count<x) and (result==1)):
        if (x%count==0):
            result = 0
        count = count + 1
    return result

# enter prime numbers p, q - check that they are prime!
valid = 0
while(valid==0):
    p = input('Please enter a prime number - it should be as large as possible')
    if (is_prime(p)==1):
        valid = 1
valid = 0
print('Number accepted')
while(valid==0):
    q = input('Please enter another prime number - it should be as large as possible')
    if (is_prime(q)==1):
        valid = 1
print('Number accepted')

# declare the modulus n
n = (p-1)*(q-1)

# enter the other part of the private key, e - check that it is valid!
valid = 0
while(valid==0):
    e = input('Please enter a number between 1 and ' + str(n) + ' - it should be as large as possible')
    if ((e>0) and (e<n) and gcd(e,n)==1):
        valid = 1
print('Number accepted')

print('Your public key consists of 2 numbers:')
print('modulus = ' + str(n))
print('e = ' + str(e))

# enter the bounds for the private key - note that a large bound is often needed to find suitable values - but too large
# a bound will take a long time to calculate! 
l = input('Please enter the lower bound for the private key')
valid = 0
while(valid==0):
    h = input('Please enter the upper bound for the private key')
    if (h>l):
        valid = 1

print('Please choose a private key from this list!')

# generate the possible values of the private key, d
d = l
while (d<h):
    if ((d*e)%(n)==1):
        print(d)
    d = d + 1
