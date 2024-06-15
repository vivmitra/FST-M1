import pandas
dataframe = pandas.read_excel("employees.xlsx", sheet_name="Sheet1")
print(dataframe)


print("Number of rows and columns: ", dataframe.shape)


print("Data in email columns: ")
print(dataframe["Email"])

print("Data sorted based on FirstName in ascending order: ")
print(dataframe.sort_values('FirstName'))