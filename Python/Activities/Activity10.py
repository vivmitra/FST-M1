num = tuple(input("Enter a tuple of numbers comma-separated: ").split(","))

print("Tuple: " , num)

print("Numbers divisible by 5: ")
for i in num:
    if (int(i)%5 == 0):
        print(i)