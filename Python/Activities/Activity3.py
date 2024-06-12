print("""Lets play Rock-Paper-Scissors
Remember the rules:
    Rock beats scissors
    Scissors beats paper
    Paper beats rock""")

name1 = input("Enter player 1's name: ")
name2 = input("Enter player 2's name: ")

choice1 = input(name1 + ", make your choice- rock/paper/scissors: ").lower()
choice2 = input(name2 + ", make your choice- rock/paper/scissors: ").lower()

if (choice1 == choice2):
    print("Its a tie!")
elif (choice1 == "rock"):
    if (choice2 == "scissors"):
        print("Rock wins! " + name1 + " is the winner!")
    else:
        print("Paper wins! " + name2 + " is the winner!")
elif (choice1 == "scissors"):
    if (choice2 == "paper"):
        print("Scissors wins! " + name1 + " is the winner!")
    else:
        print("Rock wins! " + name2 + " is the winner!")
elif (choice1 == "paper"):
    if (choice2 == "rock"):
        print("Paper wins! " + name1 + " is the winner!")
    else:
        print("Scissors wins! " + name2 + " is the winner!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")