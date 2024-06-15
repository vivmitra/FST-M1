import pandas

dataframe = pandas.read_csv("vehicles.csv")
print(dataframe)

print("Values in Usernames column:")
print(dataframe ["Usernames"])

print ("Username and password of second row:")
print ("Username: ", dataframe["Usernames"] [1], " || Password: ", dataframe["Passwords"] [1])

	
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))

print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))

