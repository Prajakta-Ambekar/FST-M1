numbers=list(input("Enter the number separated by comma: ").split(","))
First_Num=numbers[0]
print(First_Num)

Last_Num=numbers[-1]
print(Last_Num)

if First_Num==Last_Num:
    print(True)

else:
    print(False)