# A small program that simulates an x amount of rolls in a european style 
#roulette(which has only one 0) and then provides statistics on each individual number,
#colour, and 12s

import random

counter = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
rolls = 1000000

for i in range(0 , rolls):
    ball = random.randint(0 , 36 )
    counter[ball] += 1

print (counter[0:36])
redcounter = 0
blackcounter = 0 
counter18 = 0 
counter36 = 0 
counter12 = 0
counter24 = 0
acounter36 = 0 

for i in range (0, 36):
    print (i , "came out " , counter[i] , " times, which is ", counter[i]/rolls * 100 , "%" )
    
    if (counter[i] % 2  == 0):
        redcounter += counter[i]
        
    if (counter[i] % 2 != 0):
        blackcounter += counter[i]

    if (i > 1) and (i <= 18):
        counter18 += counter[i]
    
    if(i > 18) and (i <= 36):
        counter36 += counter[i]
    
    if (i > 1) and (i <= 12):
        counter12 += counter[i]    
        
    if (i > 12) and (i <= 18):
        counter24 += counter[i] 
        
    if (i > 24) and (i <= 36):
        acounter36 += counter[i]    

print("Red came out " , redcounter , " times , which is ", redcounter/rolls * 100 , "%" )
print("Black came out " , blackcounter, " times , which is ", blackcounter/rolls * 100 , "%" )
print ("Green came out ", counter[0] , " times, which is", counter[0]/rolls *100 , "%" )
print("Between 1 and 18 came out ", counter18 , " times, which is " , counter18/rolls * 100 , "%" )
print("Between 18 and 36 came out ", counter36 , " times, which is " , counter36/rolls * 100 , "%" )
print("1st 12 came out ", counter12 , "times, which is " , counter12/rolls * 100, "%")
print("2nd 12 came out ", counter24 , "times, which is " , counter24/rolls * 100, "%")
print("3rd 12 came out ", acounter36 , "times, which is " , acounter36/rolls *  100, "%")



        


    
