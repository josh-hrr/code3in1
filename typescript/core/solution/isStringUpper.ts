export function isUpperCase(str: string) { 
  let counter:number = 0;
  let result:boolean = false;
  str.split('').forEach(value => 
  { 
    if(value === value.toUpperCase()){  
    }else{
      counter = counter + 1; 
    }
  }); 

  if(counter === 0){
    result = true;
  }else{
    result = false;
  }
  return result;
}
