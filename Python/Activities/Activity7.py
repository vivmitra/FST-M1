num = list(input("Enyer a list of numbers comma-separated: ").split(","))
sum = 0

for i in num:
    sum += int(i)

print(f"Sum of the list of numbers: {sum}")