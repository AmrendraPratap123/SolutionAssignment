//2. A
function reverseWords(str) {
    let reverseWordArr = str.split(" ").map(word => word.split("").reverse().join(""));
    return reverseWordArr.join(" ");
  }
  x=reverseWords('aabdjrg');
print(x);


const arr1 = [24.6,23.7,18.9,76.5]; 
const arr2 = [54,23,12,97,100]; 

  
//2.B
function arrSort(arr) { 

    arr.sort((a,b)=>a-b); 

    arr.reverse(); 

    return arr; 
} 
