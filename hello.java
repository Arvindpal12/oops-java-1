
// public class hello{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in );
//         String name=sc.next();
//         System.out.println(name);

//     }
// }

// two sum in int data type value enter with user input 
// public class hello{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int diff=(a-b);
//         System.out.println(diff);

//     }
// }

// Data type in java
// two type in fisrt is a primitive and secound is non primitive
// primitive is contain a 8 data type 
// int,float, long,char,booln,double
// 4byte,4,    8,   2,    1,    8 byte 

// and  non primitive 
// string,class object, interface,Array 

// Conditoinal statement in java
// if statement
// if else statement
// if else if  ladder statement
// nasted if statement 
// swich statment

// if statement
// public class hello
// {
//     public static void main(String[] args) {
//         Scanner  scanner = new Scanner(System.in);
//         int age=scanner.nextInt();
//         if(age>18){
//             System.out.println("adult");

//         }else{
//             System.out.println("not adult");
//         }
//     }
// }

//   


// if else if statement
// public class hello{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         if(a>b){
//             System.out.println("hii");
//         }else if(a<b){
//             System.out.println("hello");
//         }else{
//             System.out.println("good bye");
//         }
//     }
// }

// nasted if conditoin 
// public class hello{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the value");
//         int a=sc.nextInt();
//         if(a<18){
//             System.out.println("not love");
//         }if(a>18){
//             System.out.println("love");
//         }

//     }
// }

// swich statement

// public class hello {

//     public static void main(String[] args) {
//         // Create a Scanner object to read input from the user
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter two numbers
//         System.out.print("Enter the first number: ");
//         double num1 = scanner.nextDouble();

//         System.out.print("Enter the second number: ");
//         double num2 = scanner.nextDouble();

//         // Display a menu for the user to choose an operation
//         System.out.println("Choose an operation:");
//         System.out.println("1. Addition");
//         System.out.println("2. Subtraction");
//         System.out.println("3. Multiplication");
//         System.out.println("4. Division");
//         System.out.print("Enter your choice (1-4): ");
//         int choice = scanner.nextInt();

//         // Perform the operation based on the user's choice
//         switch (choice) {
//             case 1:
//                 System.out.println("Result: " + (num1 + num2));
//                 break;
//             case 2:
//                 System.out.println("Result: " + (num1 - num2));
//                 break;
//             case 3:
//                 System.out.println("Result: " + (num1 * num2));
//                 break;
//             case 4:
//                 if (num2 != 0) {
//                     System.out.println("Result: " + (num1 / num2));
//                 } else {
//                     System.out.println("Error: Division by zero is not allowed.");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid choice. Please enter a number between 1 and 4.");
//         }

//         // Close the scanner
//         scanner.close();
//     }
// }

// loops in java
// loops is a control structure allow to repit a block of code in multiple times to perform a task a repetli 
//loops are type first is a for loop, secound is while loop , third is while loops
// for loops used in when number of itratoin is known as beforehand
// it consist a insilizatoin ,conditoin , ince. / decre.
// eg.
// public class hello{
//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("value i:"+i);
            
//         }
        
//     }
// }


// while loop
// while loop its first a check the conditoin and then excute the program 
// public class hello{
//     public static void main(String[] args) {
//         int i=0;
//         while(i<10){
//             System.out.println("value i:"+i);
//             i++;
//         }
//     }
// }

// do while in java
// it is atlist one chance excute  the program then the check the conditoin 
// public class hello{
//     public static void main(String[] args) {
//         int i=0;
//         do { 
//             System.out.println("value i:"+i);
//             i++;
            
//         } while (i<7);
        
//     }
// }


// find the factorial no.
// public class hello{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no of calculate the factorial");
//         int no=sc.nextInt();
         
//         long factorial=1;
//         for(int i=1; i<=no; i++){
//             factorial*=i;

//         }
//         System.out.println("the facorial no:"+no+"is:"+factorial);

//     }
// }


// public class hello{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the no of calculate the factorial ");
//         int number=sc.nextInt();

//         long factorial=1;
//         for(int i=1; i<=number; i++){
//             factorial*=i;
//         }
//         System.out.println("the factorial number:"+number+"is:" +factorial);

//     }

// }
 
// Methods is also called a functoin 
// method is a group / blocks of code  which take a  input from the user prossed it & give output method 
// runs only when it called 
// Method is two types first is a pre defind secound is user defined 
// pre defind eg . print(), sort(), squrt(),nextInt()
// user defind eg.add(), sub(), mul()

// why use a method 
// decrese line of code
// readibility 
// repitoin 

// class A{

//     public static void Add(){
//         int a=10,b=90;
//         System.out.println("sum = " + (a+b));
//     }
   
//     void disp(){
//         System.out.println("Arvind pal");
//     }
//     public static void main(String[] args) {
//         A r=new A();
//         r.disp(); 
//              A.Add(); 
        
        
//      }
// }

// today topic discused a Array in java 
// Array is object in  java which is contain a similar type of data in continous memory locatoin 
// syn. data-type []var-name;
// datatype var-name[];
// three type of declar in array
// a[]=new int[5];
// int arr[]=new int [5];
// int a[]={1,2,3,4,5,6}

// types of array 
// two types in array first is single dimentoinal array 
// secound is multi dimenstoinal array

// eg.
// class demo{
//     public static void main(String[] args) {
//         int a[]={10,11,12,13,14};
//         System.out.println(a[4]);
//     }
// }

// static array eg.
// class demo{
//     public static void main(String[] args) {
//         int a[]=new int[5];
//         a[0]=10;
//         a[1]=20;
//         a[2]=30;
//         a[3]=40;
//         a[4]=50;
//         for(int i=0; i<5; i++){
//            System.out.println(a[i]);
//         }
//     }
// }

// dynamic array eg.
// class demo{
//     public static void main(String[] args) {
//         int size,i;
//         Scanner r=new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         size=r.nextInt();
//         int a[]=new int[size];
//         for(i=0; i<size; i++){
//             a[i]=r.nextInt();
//         }
//         System.out.println("Printed a array of element");
//         for(i=0; i<size; i++){
//             System.out.println(a[i]);
//         }      

//     }
// }

// class and objects in java 
// class : class is a logical type entity and it is a blue print a object and it is not take a spce 
// in memory locatoin 
// class is two types 
// first is user defined and secound is pre defined 
// first is pre defined class is that is already defined and provides by the java API
// eg. secnner , string, int , floot , double
// secound is user defined 
// A class which is created by java programmer is called user defined class
// eg. man, han, arvind, 
// syn.. of class
// class  class-name{
// ___ ____ _____ //data
// ___ ____ _____ //methord
// }


// object in java
// Object is real world entity and Object instance of class that excute the class- onces the object 
// is creted it take up space other variable in memory 
// syn. class-name  obj-name=new class name()
       //   ||       ||      ||      ||  
   // class name   object    DMA    constructor
            //    refrence 
 
// eg
// class demo{
//     int a=18; String b ="ARVIND";
//     void show(){
//         System.out.println(a+" "+b);
//     }
// }
//  class text{
//     public static void main(String[] args) {
//         demo r=new demo();
//         r.show();
//     }

//  }   

// 

// today topic discussed in what is a constructor and its types
// first constructor
// constructor is a special type of methord whose name is same as class name 
// note:
// the main purpose is constructor inistilize the object 
// every java class is a constructotr 
// a constructor is aotomatically called at a time of object creatoin
// A constructor never contain a any return type including void
// eg.
// class A {
//     int a; String b;
//     A(){
//          a=10; b="Arvind";
//     }
//     void show(){
//         System.out.println(a+" "+b);
//     }
// }
// class B{
//     public static void main(String[] args) {
//         A r=new A();
//         r.show();
//     }
// }  

// Types of contructor 
// defoult constructor 
// prameterise costructor 
// copy constructor 
// privet constructor 

// defult constructor 
// A  constructor which dose not have a any parameter is called defult constructor 
// eg
// class A{
//     int a; boolean b;
//     A(){
//         a=10; b=true;

//     }
//     void show(){
//         System.out.println(a+" "+b);
//     }
// }
// class B{
//     public static void main(String[] args) {
        
    
//     A r=new A();
//     r.show();
// }
// }

// paremeterize constructor 
// prametterize constructor through which we can have a one or more pass a paremeteris is called 
// parameterize constructor 
// eg

// class A{
//     int x,y;
//     A(int a, int b){
//         x=a; y=b;
//     }
//     void show(){
//         System.out.println(x+" "+y);
//     }
// }
// class B{
//         public static void main(String[] args) {
//             A r=new A(100,200);
//             r.show();
        
            
//         }
//     }

// copy costructor
// it constructor is a when we pass object reference to the constuctor then it is called a copy constructor
// eg
// class A{
//     int a; String b;
//     A(){
//         a=18; b="arvind";
//         System.out.println(a+" "+b);

//     }
//     A(A ref){
//         a=ref.a;
//         b=ref.b;
//         System.out.println(a+" "+b);
//     }
// }
// class B{
//     public static void main(String[] args) {
//         A r=new A();
//         A r2=new A(r);
//     }
// }

// privet constructor 
//  it contuctor in java it is possible to write a constructor as a privet but accoding to the rule cant 
// acces privet member outside of class
// eg
// class A{
//     int a; double b; boolean c;
//     private A(){
//         a=10; b=20.78; c=true;
//         System.out.println(a+" "+b+" "+c);

//     }

//     public static void main(String[] args) {
//         A r=new A();
//     }

// }

// instance block in java 
// intance block is similar to mathord in java which has no name it can be written inside the class
// but not a inside the methord 
// note:
// it always excuted before the constructor 
// we can use the variable only for a instance not a methord 
// we write time consuming code inside the instance block like java database connectivity 
// eg
// class A{
//     int a,b;
//      static void show(){
//         System.out.println("arvind");
//     }
//     A(){
//         a=10; b=20;
//         System.out.println(a+" "+b);
//     }
//     {
//         a=30; b=40;
//         System.out.println(a+" "+b);
//     }
// }
// class B{
//     public static void main(String[] args) {
//         // A.show(); print first
//         A r=new A();
//         r.show();
        

//     }
// }    

// static block 
// static block such kind of block in java which gets excuted at the time of loading the class file 
// into jvm memory 
// eg.
// class A{
//     public static void main(String[] args) {
//         A r=new A();
//     }
//     A(){
//         System.out.println("Arvind");
//     }
//     {
//         System.out.println("Arvind pal");
//     }
//     static{
//         System.out.println("Arvind is devloper");
//     }
// }

// 
  
//   inheritance in java
// when we constrct a new class from exiting class in such a way that new class acese all the propertise of exsiting 
// class is called inheitance 
// note:
// in java extend keyword is used to perform inheritence
// it provides code reuseabliti
// we cant accese privet member of class through inheritace 
// A sub class contaoin all the feature of super class so, we should create the object of the sub class 
// Method overrinding only possible throught inheritace 
//syntex
// class A{

// }
// class B extend A{

// }

// types of inheritance 
// simple inhertince 
// multi-level inheritance 
// multiple inheritance 
// hierarical inheritance 

// simple inheritance is nothing but contain only for super class and one sub class 
// eg.
// class A{
//     int age; 
//     String name;
//     void input(){
//         System.out.println("Enter the age and name ");
//     }
// }
// class B extends  A{
//     void disp(){
//       age=18; name="ankush";
//       System.out.println(age+" "+name);
//     }
//     public static void main(String[] args) {
//         B r=new  B();
//         // A r2=new A();
//         r.input(); r.disp();
        
        
//     }

// }

//Multi level inheritance 
// we have a only one super class and multipale sub class is called mutilevel inheritance 
// eg.
// class A{
//     int a,b,c;
//     void add(){
//        a=10; b=20;
//        c=a+b;
//        System.out.println("Add two number "+c);
//     }
//     void div(){
//         a=100; b=20;
//        c=a/b;
//        System.out.println("div two number "+c);
//     }
// }
// class B extends A{
//     void sub(){
//         a=100; b=20; 
//         c=a-b;
//         System.out.println("sub two number"+c);

//     }
//     void mul(){
//         a=20; b=30;
//         c=a*b;
//         System.out.println("mul two number"+c);

//     }
// }
// class C extends B{
//     void rem(){
//         a=20; b=3;
//         c=a%b;
//         System.out.println("remwnder two number"+c);

//     }
// }
// class res{
//     public static void main(String[] args) {
//         C r=new C();
//         r.add();r.div(); r.mul(); r.rem(); r.sub();
//     }
// }

// multiple inheritance 
// multiple inheritace dose not suport in java
// whenever a sub class wants to inherit the properly of two or more super class that have same method 
// java compiler cant deside which does methord it should inherite 
// then thier meight be a chance of memory dublicatoin is a resoin java dosent support  multiple inhertance 
// through class 


// Hierarical inheritance
// which contain only for one super class and multiple sub class and all sub class directly  
// extends super class is called hirechical inheritance 
// eg.
// class A{
//     void input(){
//         System.out.println("Enter your name ");
//     }
// }
// class B extends A{
//     void show(){
//         System.out.println("My name is arvind");
//     }
// }
// class C extends A{
//     void disp(){
//         System.out.println("My name is kamlesh ");
//     }
// }
// class demo{
//     public static void main(String[] args) {
//         B r=new B();
//         C r2=new C();
//         r.input(); r.show();
//         r2.input(); r2.disp();
//     }
// }

// topic are super keyword 
// super keyword refers to the object of super class it is used when  we went to all the super class varible 
// method and constructor through sub class object
// note:
// whenever the super class and sub class varible and method name both are same then it be used only 
// avoid the  confustoin between super class and sub class varibale and method that have same name we should 
// use super keyword
// super # varible , method, constructor .
// eg
// class A{
//     int a=10;
// }
// class B extends A{
//     int a=100;
//     void show(){
//         System.out.println(a);
//         System.out.println(super.a);
//     }

// }
// class text{
//     public static void main(String[] args) {
//         B r=new B();
//         r.show();
//     }
// }

// this keyword 
// this keyword refers to the currrent obbject inside the method and constructor 
// eg
// class A{
//     void show(){
//         System.out.println(this);
        
//     }
//     public static void main(String[] args) {
//         A r=new A();
//         System.out.println(r);
//         r.show();
//     }
// }

// whenever the name of insteace and local varible both are some then own runtime envirmrnt jvm
//gets confused that which are is local varible and which one instance varible to avoid this problem
// we should use this keyword 
// class S{
//     int a;
//     S (int a){
//         this.a=a;
//     }
//     void show(){
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         S r=new S(100);
//         r.show();
//     }
// }

// vvi
// it is also used when we went to call the differnt constructor of its own class
// class A{
//     A(){
//         System.out.println("Arvind ");
//     }
//     A(int a){
//         this();
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//        A r=new A(100);
    
//     }
// }

// it also called a pramittrised constructor of its owm class
// class A{
//     A(){
//         this(100);
//     }
//         A(int a){
//             System.out.println(a);
//         }
//         public static void main(String[] args) {
//             A r=new A();
            
//         }
//     }

