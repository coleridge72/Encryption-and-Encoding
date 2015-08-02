# RSA for encrypting text messages

# note that in order to make the message resistant to frequency analysis, it
# is best to use a lot of spaces, numbers and special characters!
# Large numbers will take a long time to calculate!

# function to encrypt an ascii value - we must carry out
# the exponentiation manually or else the values will
# lose precision! 
def encrypt(m):
    E = m
    count = 1
    while (count<e):
        E = (m*e)%(n)
        count = count + 1
    return E

# enter the public key:
# enter the modulus
n = input('Please enter the modulus')

# enter the number e
e = input('Please enter the other component of the public key - the number e')

# enter the message
M = raw_input('Please enter the text you wish to encrypt')
E = ""

# read in the message character by charater, converting to ascii values and
# then encrypting
for i in range(len(M)):
    ascii = ord(M[i:i+1])
    print(ord(M[i:i+1]))
    E = E + str(encrypt(ascii)) + " "

# print encrypted text 
print('Your message is:')
print(E)
