#running simulations of dice rolls

dc1 = 0 
dc2 = 0 
dc3 = 0 
dc4 = 0 
dc5 = 0
dc6 = 0
rolls = 1000000

for i in range(0, rolls):
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
        
print ("One came out", dc1 , "times, which is" , dc1 / rolls * 100 , "% of all throws")        
print ("Two came out", dc2 , "times, which is" , dc2 / rolls * 100 , "% of all throws")        
print ("Three came out", dc3 , "times, which is" , dc3 / rolls * 100 , "% of all throws")        
print ("Four came out", dc4 , "times, which is" , dc4 / rolls * 100 , "% of all throws")        
print ("Five came out", dc5 , "times, which is" , dc5 / rolls * 100 , "% of all throws")        
print ("Six came out", dc6 , "times, which is" , dc6 / rolls * 100 , "% of all throws")   
