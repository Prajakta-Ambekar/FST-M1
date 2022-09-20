List1={10,20,25, 30, 35}
List2={20,21,31,34,38}
print("First List: ",List1)
print("second List: ",List2)
thirdList=[]

for num in List1:
   if (num%2!=0):
    thirdList.append(num)

for num in List2:
    if(num%2==0):
     thirdList.append(num)    

#print("Result List is: ")
#print(thirdList)
print("Result List is: ",thirdList)    