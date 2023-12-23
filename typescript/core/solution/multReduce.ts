export function grow(arr: number[]): number {
    const outcome = arr.reduce((prev, current) => { 
    return prev * current;
  });
    return outcome;
}
