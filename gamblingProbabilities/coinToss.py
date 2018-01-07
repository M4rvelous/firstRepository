#running some random simulations of a coin toss


import random

heads = 0 
tails = 0
tosses = 1000000

for i in range(0,tosses):
    coin = random.randint(0 , 1)
    if (coin == 0):
        heads = heads + 1
        #print (coin)
    else:
        tails = tails + 1
        #print(coin)

print ("Heads came ", heads , "times, which represents the ", heads/tosses * 100 , "% of all tosses")
print ("Tails came ", tails , "times, which represents the ", tails/tosses * 100 , "% of all tosses")
