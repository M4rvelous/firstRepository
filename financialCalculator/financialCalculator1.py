#A calculator of the most commonly used financial models like WACC, CAPM, 
#IRR, NPV , Beta coefficient, Alpha , SML.
#More things can be always be added like: accumulating interest,
# return rate of an asset/security, depreciation. 

import sys
import math

checkVariable = "Y"

while (checkVariable == "Y"):
    print ("For WACC calculation press W")
    print("For CAPM press C")
    print ("For IRR press I")
    print ("Fcor NPV press N")  
    a =  input()
    
    if (a == "W"): #WACC calculation
        s = int (input("Enter number of sources of capital"))
        r = int (input("Enter required rate of return"))
        mv = int (input("Enter Market Value of outstanding securities"))
        print("The WACC is",(s*r*mv/s*mv))
    
        
    elif (a == "C"): #CAP<M Calculation
        em = int (input("Enter expexted return of market portfolio"))
        b = int(input("Enter Beta"))
        rm = int(input("Enter market rate of return"))
        rf = int(input("Enter Risk Free Rate"))
        print ("The CAPM is ", rf + (b*(rm-rf)) )
         
    elif (a == "I"): #IRR calculation
        p = input("Enter number of periods of capital inflows")
        
        
    elif (a == "B"): #Beta coeffiecient calculation
    #beta needs historical prices for both the asset and the benchmark in order to be calculated
        print
        
    elif (a == "A"): #Alpha calculation
        ra = int (input("Enter Asset Retutrn"))
        rf = (inut("Enter the risk free rate"))
        b = inout("Enter beta")
        br = input("Enter Benchmark Rate")
        print ("The Alpha coefficcient is", ra -(rf +(br-rf)*b))
        
    elif(a == "N"): #NPV calculcation
        ii = input("Enter initial investment")
        ii = -ii
        p = input("Enter number of periods of capital inflows")
        x = 1
        while(x<p):
            ci = input("Enter Cash inflow for the period")
            
            x=x+1

    elif (a == "S"): #Sharpe ratio calculation
    stdev = input("Enter assets variance")
    expret = input("Enter assets expected return")
    rf = input ("Enter risk free rate")
        print ("Sharpe ratio is", (expret)/var)
        
    elif (a == "T"): #Test
        print("Test")
        
    else :
      
        print("Invalid Entry")
               
    checkVariable = input("Would you like to continue?")

