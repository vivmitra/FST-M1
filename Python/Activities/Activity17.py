import pandas

data = {
    "Usernames" : ["admin", "Charles", "Deku"],
    "Passwords" : ["password", "Charl13", "AllMight"]
}


dataframe = pandas.DataFrame(data)
print (dataframe)

dataframe.to_csv("vehicles.csv", index=False)

