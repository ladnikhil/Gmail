console.log("=====================question 1=========================")

// create 5 objects using new keyword



var person = new Object();
person.Name = 'Nikhil';
person.age = 21;
person.height =5.8;

console.log('my name is '+person.Name);
console.log("age = "+person.age); 
console.log("height = "+person.height);



var person = new Object();
person.Name = 'prasad';
person.age = 22;
person.height =5.8;

console.log('my name is '+person.Name);
console.log("age = "+person.age); 
console.log("height = "+person.height);


var person = new Object();
person.Name = 'onkar';
person.age = 21;
person.height =5.8;

console.log('my name is '+person.Name);
console.log("age = "+person.age); 
console.log("height = "+person.height);


var person = new Object();
person.Name = 'akshay';
person.age = 23;
person.height =5.8;

console.log('my name is '+person.Name);
console.log("age = "+person.age); 
console.log("height = "+person.height);


var person = new Object();
person.Name = 'sid';
person.age = 26;
person.height =5.8;

console.log('my name is '+person.Name);
console.log("age = "+person.age); 
console.log("height = "+person.height);

// without using new keyword
console.log("=====================question 2=========================")

var person;
        person = {
            Name: 'Nikhil',
            age: 21,
            height:5.8,
            getName : function(){
                return this.Name;
                        }
                 };

                 console.log("name = "+person.Name);
                 console.log("age = "+person.age); 
                 console.log("height = "+person.height);
                 
                 var Name = person.getName();
                 console.log("Name = "+Name);


var person;
        person = {
            Name: 'sanket',
            age: 22,
            height:5.8,
            getName : function(){
                return this.Name;
                        }
                 };

                 console.log("name = "+person.Name);
                 console.log("age = "+person.age); 
                 console.log("height = "+person.height);
                 
                 var Name = person.getName();
                 console.log("Name = "+Name);

var person;
        person = {
            Name: 'omkar',
            age: 27,
            height:5.7,
            getName : function(){
                return this.Name;
                        }
                 };

                 console.log("name = "+person.Name);
                 console.log("age = "+person.age); 
                 console.log("height = "+person.height);
                 
                 var Name = person.getName();
                 console.log("Name = "+Name);


var person;
        person = {
            Name: 'nikhil',
            age: 27,
            height:5.9,
            getName : function(){
                return this.Name;
                        }
                 };

                 console.log("name = "+person.Name);
                 console.log("age = "+person.age); 
                 console.log("height = "+person.height);
                 
                 var Name = person.getName();
                 console.log("Name = "+Name);

var person;
        person = {
            Name: 'raju',
            age: 27,
            height:5.8,
            getName : function(){
                return this.Name;
                        }
                 };

                 console.log("name = "+person.Name);
                 console.log("age = "+person.age); 
                 console.log("height = "+person.height);
                 
                 var Name = person.getName();
                 console.log("Name = "+Name);


/// 5 arrays without using new keywords
console.log("=====================question 3=========================")

var fruits = ['apple','orange','banana','mango'];
console.log(fruits);

var hobbies = ['singing','dancing','cricket'];
console.log(hobbies);

var vegetables = ['onion','tomato'];
console.log(vegetables);

var animals = ['lion','tiger'];
console.log(animals);

var birds = ['sparrow','crow']
console.log(birds);

/// 5 arrays  using new keywords
console.log("=====================question 4=========================")


var fruits = new Object();
fruits[0] = 'apple';
fruits[1] = 'mango';
fruits[2] = 'banana';
fruits[3] = 'orange';
fruits[4] = 'grapes';
console.log(fruits)

var hobbies = new Object();
hobbies[0] = 'singing';
hobbies[1] = 'dancing';
hobbies[2] = 'cricket';
console.log(hobbies);

var vegetables = new Object();
vegetables[0] = 'onion';
vegetables[1] = 'tomato';
console.log(vegetables);

var birds = new Object();
birds[0] = 'sparrow';
birds[1] = 'crow';
console.log(birds);

var animals = new Object();
animals[0] = 'lion';
animals[1] = 'tiger';
console.log(animals);

console.log("=====================question 5=========================")



var fruits = ['apple','orange','banana','mango'];
console.log(fruits);

for(let i=0;i<fruits.length;i++)
{
    console.log(fruits[i]);
}