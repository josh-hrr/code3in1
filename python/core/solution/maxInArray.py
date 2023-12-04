
# Example array
array = [1, 100, 3, 50, 15]

# Find the first minimum number
first_min = max(array)
index_to_remove = array.index(first_min)
array.pop(index_to_remove)

# Print the modified array
print(array)

# Find the second minimum number
second_min = max(array)

# Print the results
print("firstMin:", first_min)
print("secondMin:", second_min)
