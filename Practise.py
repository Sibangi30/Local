import numpy as np


arr = np.array([10, 20, 30, 40, 50])
matrix = np.array([[1, 2, 3], [4, 5, 6]])


print(arr.ndim)     
print(matrix.shape) 
print(arr.dtype)    

print(arr[0])       
print(matrix[1, 2])  


print(arr[1:4])      
print(matrix[:, 1])  
