import numpy as np

# Example array
array = np.array([1, 100, 3, 50, 15])

# Find the two smallest numbers
sorted_array = np.sort(array)
first_min, second_min = sorted_array[:2]

# Print the results
print("firstMin:", first_min)
print("secondMin:", second_min)
