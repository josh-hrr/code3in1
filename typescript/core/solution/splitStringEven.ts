function solution(str){ 
  const arr = str.split("");
  const result = [];

   for(let i = 0; i<arr.length;i+=2){  
    const pair = arr.slice(i, i+2); 
    result.push(pair.length === 2 ? pair.join("") : pair + "_"); 
   }

   return result;
}
