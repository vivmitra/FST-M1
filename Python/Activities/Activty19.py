import pandas
from pandas import ExcelFile
from pandas import ExcelWriter

# Initiating the data
data = {
    "FirstName" :  ["Satvik", "Avinash", "Lahri"],
    "LastName" : ["Shah", "Kati", "Rath"],
    "Email" : ["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"],
    "PhoneNumber" : ["4537829158", "5892184058", "4528727830"]
}

# Printing the data in dataframe
print("Full Data:")
dataframe = pandas.DataFrame(data)
print(dataframe)

# Writing the data in excel
writer =  ExcelWriter("employees.xlsx")
dataframe.to_excel(writer, 'Sheet1', index=False)
writer.close()