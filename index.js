//data type---------------------

// let mname = 'myname' //string
// let age ='99'
// let word = mname + age
// console.log(word)

// let score = 100     // number
// console.log(score)

// let isFake = false  //true false  boolean
// console.log(isFake)

// let bag = undefined
// console.log(bag)

// let bag2 = null
// console.log(bag2)





// + - * / % operation--------------------



//let const



//array and object-------------------------------

let classA = ['xm','xh','xh','xu']
console.log('before:', classA)
console.log(classA.length)

let igPho = [
    'http://xx.img.com/a1.png',
    'http://xx.img.com/a1.png',
    'http://xx.img.com/a1.png'
]

const card1 = {
    name: 'nnn',
    Address: 'nnnn',
    age: 999,
}
const card2 = {
    name: 'nnn',
    Address: 'nnnn',
    age: 999,
}
console.log(card1.Address)

const wall= [
    card1,
    card2
]

console.log(wall)


//if else--------------

if(100 > 50){
    console.log('yes')
}else{
    console.log('no')
}

//for-while------------------

for(let i = 0; i < 10; i++){
    console.log(i)
}

// let i = 0
// while(true){
//     if(i === 10){
//         condition = false
//     }
//     console.log(i)
//     i++
// }



//function-------------------

function hello(){
    console.log('hello1')
}



//class

// class Card{
//     constructo r(initName){
//         this.name = initName
//     }

//     hello = () => {  // => 绑定
//         console.log('hello1')
//     }
// }

// const c1 = new Card('xm')
// console.log(c1)
// c1.hello()


//window.alert("")
//document

window.addEventListener('load',function(params){
    const p1 = document.getElementById('title')
    console.log(p1)
    p1.innerText = "subscribe fron"

    const b1 = document.getElementById('btn')
    b1.addEventListener('click',function (){
        console.log('press')
    })
})