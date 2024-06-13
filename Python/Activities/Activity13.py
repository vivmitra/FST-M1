num = list(input("Enter a list of numbers comma-separated: ").split(","))

print ("List of numbers: ", num)

def calculateSum(num1):
    sum = 0
    for i in num1:
        sum += int(i)
    return sum

print ("Sum of all numbers: ", calculateSum(num))