let array: number[] = [1, 100, 3, 50, 15];

// Find and remove the first max
const firstMax = Math.max(...array);
const indexToRemove = array.indexOf(firstMax);
array.splice(indexToRemove, 1);

console.log(array);

// Find the second max without modifying the original array
const secondMax = Math.max(...array);

console.log('firstMax:', firstMax);
console.log('secondMax:', secondMax);
