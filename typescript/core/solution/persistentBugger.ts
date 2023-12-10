export function persistence(num: number): number {
  
  let count = 0;
  while(num >= 10){
    const digits = num.toString().split("").map(value => Number(value));
    num = digits.reduce((prev, current) => prev * current);
    count++;
  }
  
  return count;
  
}
