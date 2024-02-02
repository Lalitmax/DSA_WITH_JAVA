 
import pandas as pd

# creating a dataframe
df = pd.DataFrame({'Nme': {0: 'Alek', 1: 'Akim', 2: 'Cynthia'},
                   'Age': {0: 20, 1: 30, 2: 50},
                   'Sex': {0: "Male", 1: "Male", 2: "Female"}})

# printing the dataframe
print(df)    

# obtaining the shape of the DataFrame
shape = df.shape
print(shape)