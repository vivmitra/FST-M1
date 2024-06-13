dict_fruits = {
    "apple" : 10,
    "banana" : 30,
    "mango" : 100,
    "guava" : 25
}

fruit = input("Enter your choice of fruit: ").lower()

print ("Dictionary: ", dict_fruits)

if (fruit in dict_fruits):
    print (fruit, "is available.")
else:
    print (fruit, "is NOT available.")

