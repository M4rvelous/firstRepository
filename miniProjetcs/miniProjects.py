#Mini Python projects 
#1)Dice rolling game
#2)Guess the number game
#3)Random insult generator
#4)Standard deviation calculation(a bit more serious..)
#5)A user generated namebook
#6)A rock paper scissors game(player vs computer)
#7)Max of three w/ function 

#
#dice rolling game
#

import random
import math

dice1=  random.randint(0 ,5) + 1
dice2 =  random.randint(0, 5) + 1

print (dice1 , dice2)

#
# guess the number BITCH
#

number = random.randint(0 , 9) + 1
guess = int (input("Try and guess the number"))
 
if (guess == number):
    
    print("Congratulations! You have won!!")

    
else:
    while (guess != number):
        guess = int (input("Wrong.Guess again"))
        
        if (guess == 1991):
            break
  

print ("Congratulations!You have won!")

#        
#Random insult generator
#

listA = ["super", "complete", "absolute"]
listB = ["cunt", "faggot", "cocksucker"]
listC = ["eater", "tosser", "retard"]

x = random.randint(0,2)
y = random.randint(0,2)
z = random.randint(0,2)

print (listA[x])
print (listB[y])
print (listC[z])
        
        
#        
# calculating the standard deviation of a list of integers 
#

myList = [ 25 , 69 , 78 , 55 , 89 ,64 , 45 ,3 , 89 , 45 ]
i = 0
y = 0 
while i <len(myList):
    x = x + myList[i]
    y =y + 1
    i = i + 1

avg = x/y
print(avg)
x = 0
i = 0

while i <len(myList):
    x = x + math.pow(myList[i]-avg,2)
    i = i +1

if (i > 30):
    standev = math.sqrt(x/i-1)
else:
    standev = math.sqrt(x/i)
    print (standev)

#
#A user generated namebook
#

namebook = []
x = input ("Do you wish to add a name?Y/N")

while (x == "Y" ) or (x == "y"):
    namebook.append(input("Enter name"))
    print (namebook)
    
    x = input ("Do you wish to add a name?Y/N")
    
print (namebook)     
    
    
#
#A rock paper scissorrs game
#

check = y
rock = 0
paper = 1
scissors = 2

check = "y"

while (check == "y") or (check =="Y"):
    playerOne = int (input("Enter anumber from 0 to 2. 0:Rock , 1:Paper , 3:Scissors"))
    playerTwo = random.randint(0,2)
    
    if (playerOne == 0):
        print ("Player One:Rock")
    elif (playerOne ==1):
        print("Player One:Paper")
    else:
        print("Player One:Scissors")
        
    if (playerTwo == 0):
        print ("Player Two:Rock")
    elif (playerOne ==1):
        print("Player Two:Paper")
    else:
        print("Player Two:Scissors")    
        
    
    if (playerOne ==0 ) and (playerTwo == 2):
        print("Player One wns")
    
    elif(playerOne == 1 ) and (playerTwo == 0):
        print("Player One wins")
    
    elif(playerOne == 2) and (playerTwo == 1):
        print ("Player One wins")
    
    elif(playerOne == playerTwo):
        print("Draw")
    
    else:
        print ("Player Two wins")
    check = input("Want to play again?Y/N")    

    #
#Max of three
#

max = 0   
def maxNum(x,y,z):
    
    if (x > y):
        if(x > z):
            max = x 
        else:
            max = z
    elif(y > z):
        max = y
    else:
        max = z

    return max

print (maxNum(10,15,20)) 


            
            
