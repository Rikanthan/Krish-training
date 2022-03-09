const inquirer = require('inquirer')

function bubbleSort(arr){
	
    for(var i = 0; i < arr.length; i++){

    for(var j = 0; j < ( arr.length - i -1 ); j++){
        if(arr[j] > arr[j+1]){
        var temp = arr[j]
        arr[j] = arr[j + 1]
        arr[j+1] = temp
        }
    }
    }
    console.log(`Third maximum is :${arr[arr.length-3]}`);
    }
    var arr = [234, 43, 55, 63,  5, 6, 235, 547];
   
    const readline = require("readline-sync");
  
// Enter the number
let a = Number(readline.question());
let number = [];
for (let i = 0; i < a; ++i) {
  number.push(Number(readline.question()));
}
bubbleSort(number)


