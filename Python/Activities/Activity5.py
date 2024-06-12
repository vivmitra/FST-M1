n = int(input("Enter a number: "))

print(f"Multiplication table of {n}: ")

for i in range(1,11):
    prod = n * i
    print(f"{n} X {i} = {prod}")