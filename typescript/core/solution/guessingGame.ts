 
const testData: number = 5; 
const testDataString: string = "10";

function guessingGame<T>(inputGuess: T):string {
    let numberToGuess: number = +inputGuess
    let result: string = "";
    let randomNumber: number = Math.floor(Math.random() * 10);
    if(numberToGuess === randomNumber){
        result = "Congrats, you win";
    }else {
        result = "Try again!";
    }
    return result;
} 

const myGameResultNumberInput = guessingGame<number>(testData);
const myGameResultStringInput = guessingGame<string>(testDataString)

console.log(myGameResultNumberInput);
console.log(myGameResultStringInput);
