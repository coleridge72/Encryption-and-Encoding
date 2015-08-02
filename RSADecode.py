# RSA for decrypting text messages

# note that in order to make the message resistant to frequency analysis, it
# is best to use a lot of spaces, numbers and special characters!
# Large numbers will take a long time to calculate!

# function to decrypt an ascii value - we must carry out
# the exponentiation manually or else the values will
# lose precision! 
def decrypt(m):
    E = m
    count = 1
    while (count<d):
        E = (m*d)%(n)
        count = count + 1
    return E

# enter the public key:
# enter the modulus
n = input('Please enter the modulus')

# enter the private key 
d = input('Please enter the private key')

# enter the message
M = (raw_input('Please enter the text you wish to decrypt')).strip() + " "
E = ""

# read in the message character by charater (in this case, seperated by spaces),
# converting to ascii values and then decrypting
count1 = 0
count2 = M.find(" ", 0)
while (count2!=(-1)):
    E = E + chr(int(decrypt(float(M[count1:count2]))))
    count1 = count2
    count2 = M.find(" ", count1+1)

# print unencrypted text 
print('Your message is:')
print(E)
