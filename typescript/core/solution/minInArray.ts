export function findSmallestInt(args: number[]): number {  
  
  let firstMin = Math.min(...args); 
  
  /* in case you would like the second smallest number, uncomment this line of code
  let newArray = args.splice(args.indexOf(firstMin), 1);
  let secondMin = Math.min(...args); 
  */

  return firstMin;
}
