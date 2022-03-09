const inquirer = require('inquirer')

var questions = [
  {
    type: 'input',
    name: 'name',
    message: "Enter the first word"
  },
  {
   type: 'input',
   name: 'name1',
   message: "Enter the second word"
 }

]

inquirer.prompt(questions).then(answers => {
  checkAnagram(answers['name'],answers['name1'])
})
function checkAnagram(a, b) {
    let len1 = a.length;
    let len2 = b.length;
    if(len1 !== len2){
       console.log('False');
       return
    }
    let str1 = a.split('').sort().join('');
    let str2 = b.split('').sort().join('');
    if(str1 === str2){
       console.log("True");
    } else { 
       console.log("False");
    }
 }
//  function bubbleSort(arr){
	
//    for(var i = 0; i < arr.length; i++){

//    for(var j = 0; j < ( arr.length - i -1 ); j++){
//        if(arr[j] > arr[j+1]){
//        var temp = arr[j]
//        arr[j] = arr[j + 1]
//        arr[j+1] = temp
//        }
//    }
//    }
// }