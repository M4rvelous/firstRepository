#running some random simulations of
#various scenarios such as:
#1)a coin toss
#2)a dice toss
#then getting the results and 
#percentages 


import random

heads = 0 
tails = 0

for i in range(0,1000000):
    coin = random.randint(0 , 1)
    if (coin == 0):
        heads = heads + 1
        #print (coin)
    else:
        tails = tails + 1
        #print(coin)

print ("Heads came ", heads , "times, which represents the ", heads/1000000 * 100 , "% of all tosses")
print ("Tails came ", tails , "times, which represents the ", tails/1000000 * 100 , "% of all tosses")


dc1 = 0 
dc2 = 0 
dc3 = 0 
dc4 = 0 
dc5 = 0
dc6 = 0

for i in range(0, 1000000):
    x = random.randint(0,5) + 1
    if (x == 1):
        dc1 = dc1 + 1
       # print (x) 
    elif (x == 2):
        dc2 = dc2 + 1
        #print (x) 
    elif (x == 3):
        dc3 = dc3 + 1
       # print (x)
    elif (x == 4):
        dc4 = dc4 + 1
        #print(x)
    elif(x == 5):
        dc5 = dc5 + 1
        #print (x)
    else:
        dc6 = dc6 + 1
        #print (x)
        
print ("One came out", dc1 , "times, which is" , dc1 / 1000000 * 100 , "% of all throws")        
print ("Two came out", dc2 , "times, which is" , dc2 / 1000000 * 100 , "% of all throws")        
print ("Three came out", dc3 , "times, which is" , dc3 / 1000000 * 100 , "% of all throws")        
print ("Four came out", dc4 , "times, which is" , dc4 / 1000000 * 100 , "% of all throws")        
print ("Five came out", dc5 , "times, which is" , dc5 / 1000000 * 100 , "% of all throws")        
print ("Six came out", dc6 , "times, which is" , dc6 / 1000000 * 100 , "% of all throws")   
#running some random simulations of
#various scenarios such as:
#1)a coin toss
#2)a dice toss
#3)CAPM with a random beta( I know its stupid)


import random

heads = 0 
tails = 0

for i in range(0,1000000):
    coin = random.randint(0 , 1)
    if (coin == 0):
        heads = heads + 1
        #print (coin)
    else:
        tails = tails + 1
        #print(coin)

print ("Heads came ", heads , "times, which represents the ", heads/1000000 * 100 , "% of all tosses")
print ("Tails came ", tails , "times, which represents the ", tails/1000000 * 100 , "% of all tosses")


dc1 = 0 
dc2 = 0 
dc3 = 0 
dc4 = 0 
dc5 = 0
dc6 = 0

for i in range(0, 1000000):
    x = random.randint(0,5) + 1
    if (x == 1):
        dc1 = dc1 + 1
       # print (x) 
    elif (x == 2):
        dc2 = dc2 + 1
        #print (x) 
    elif (x == 3):
        dc3 = dc3 + 1
       # print (x)
    elif (x == 4):
        dc4 = dc4 + 1
        #print(x)
    elif(x == 5):
        dc5 = dc5 + 1
        #print (x)
    else:
        dc6 = dc6 + 1
        #print (x)
        
print ("One came out", dc1 , "times, which is" , dc1 / 1000000 * 100 , "% of all throws")        
print ("Two came out", dc2 , "times, which is" , dc2 / 1000000 * 100 , "% of all throws")        
print ("Three came out", dc3 , "times, which is" , dc3 / 1000000 * 100 , "% of all throws")        
print ("Four came out", dc4 , "times, which is" , dc4 / 1000000 * 100 , "% of all throws")        
print ("Five came out", dc5 , "times, which is" , dc5 / 1000000 * 100 , "% of all throws")        
print ("Six came out", dc6 , "times, which is" , dc6 / 1000000 * 100 , "% of all throws")   
