num1 = list(input("Enter first list of numbers comma-separated: ").split(","))
num2 = list(input("Enter second list of numbers comma-separated: ").split(","))

print("First List: " , num1)
print("Second List: " , num2)

num3 = []

for i in num1:
    if (int(i)%2 == 1):
        num3.append(i)
for i in num2:
    if (int(i)%2 == 0):
        num3.append(i)

print("Combined List: " , num3)