// Sum Numbers
function sum (numbers) {
    
    let sum = 0;
  
    numbers.forEach(value => {
      sum = sum + value;
    })
  
  if(numbers.length === 0){
    return 0;
  }else{
    return sum;
  } 
};
