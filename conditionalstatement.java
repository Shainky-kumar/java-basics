import java.util.Scanner;

public class conditionalstatement {
    public static void main(String[] args) {
        // conditional statement 
        //Q1. if else statement 
        // int a = 90;
        // int b= 89;
        // if(a>b) {
        //     System.out.println("right");
        // } else {
        //     System.out.println("wrong");
        // }

        // codition 


        // int a = 2;
        // int b = 6;
        // int c = 7;

        // if(a>b) {
        //     System.out.println("right");
        // } else {
        //     if (a>c) {
        //         System.out.println("second right");
        //     }
        //     else if(b>c) {
        //         System.out.println("full wrong");
        //     }
        //     else {
        //         System.out.println("all wrong");
        //     }
        // }


//         // switch cas statement 
//  Scanner sc = new Scanner(System.in);
//  int Day = sc.nextInt();
//          switch(7) {
//             case 1:
//                 if(Day == 1)
//                 System.out.println("sunday");
//                 break;
//                 case 2:
//                 if(Day == 2)
//                 System.out.println("monday");
//                 break;
//                 case 3:
//                 if(Day == 3)
//                 System.out.println("tuesday");
//                 break;
//                 case 4:
//                 if(Day == 4)
//                 System.out.println("wednesday");
//                 break;
//                 case 5:
//                 if(Day == 5)
//                 System.out.println("thrusday");
//                 break;
//                 case 6:
//                 if(Day == 6)
//                 System.out.println("friday");
//                 break;
//                 case 7:
//                 if(Day == 7)
//                 System.out.println("saturday");
//                 break;
                
//             default:
//                 break;
 //        }


 // loop while loop

 //Q1.
// int i = 89;
//  while (i<=90) {
// i++;
// System.out.println(i);
//  }

 //Q2. print even number 2 to 10
//  int i = 2;
//  while (i<=10) {
//     System.out.println(i);
//     i = i+2;
//  }

 //Q3. print hello 3 times
// int i = 1;
// while (i <= 3) {
//     System.out.println("hello");
//     i = i+1;
// }

//Q4.calculate the sum from 1 to 10 numbers
// int i = 1 ;
// int sum = 0;
// while (i<=10) {
//     sum = sum+i;
//     i++;
// }
// System.out.println(sum);

//Q5. factorial of number 
// int n = 5;
// int fact = 1;
// while (n>0) {
//     fact = fact *n;
//     n--;
// }
// System.out.println("factorial = " + fact);
//     }
// }


// we should need to learn th do while and for each lopp in details
// else if ladder(covered)



// //switch statement 
//  make a week schedul using switch case break 
/*
int day = 7;
String dayString;
switch(day) {
    case 1:
    dayString = " monday";
    break;
    case 2:
    dayString = " tuesday";
    break;
    case 3:
    dayString = "wednesday";
    break;
    case 4:
    dayString = "thursday";
    break;
    case 5:
    dayString = " friday";
    break;
    case 6:
    dayString = "saturaday";
    break;
    case 7:
    dayString = "sunday";
    break;
    default:
   dayString = " invalid";
}
System.out.println(dayString);
 */

/* 
int marks = 1+(int)(Math.random()*100);
System.out.println(marks);
marks = marks/10;//95->9 83->8 46->4
switch (marks) {
    case 0:
    case 1:
    case 2:
    case 3: System.out.println("fail");
    break;
    case 4:System.out.println("D grade");
    break;
    case 5:System.out.println("C grade");
    break;
    case 6:System.out.println("B grade");
    break;
    case 7:
    case 8:System.err.println("A grade");
    break;
    case 9:
    case 10:System.out.println("A+ grade ");
    break;
    default:System.err.println("invalid marks");
}
    */



    // looping statement 

// first 10 numbers
//using wjhile
    // int i = 1;
    // while (i<=10) {
    //     System.out.println(i);
    //     i++;
    // }

    // using do while
    /* 
int i = 1;
    do {
        System.out.println(i);
        i++;
    } while(i<=10);
     */
/* 
     int i = 10;
    do {
        System.out.println(i);
        i--;
    } while(i>=1);
*/

/* 
int number = 2 + (int) (Math.random()*100);//2-100
System.out.println(number);
// prime - just have two factor 1 and itself
int i = 1;
int count = 0;
while (i<=number) {
    if (number % i == 0) {//true - its a factor
        count++;//keeping the count
    }
    i++;
}
if(count == 2)
System.out.println(number + " is a prime numbers");
else 
System.out.println("is not a prime number");
*/



//  for and for each loop 

//for(int i = 0; i<=50; i++) {
// for(int i=0; i<=50; i= i+2) {
//     System.out.println(i);
// }

//  print even num

// for(int i=0; i<=50; i++) {
//     if(i%2==0) {
//         System.out.println(i);
//     }
// }


// odd number

// for(int i=1; i<=50; i++) {
//     if(i%2==1)
//     System.err.println(i);
// }
// int number = 11 + (int) (Math.random()*90);//11 to 100
// System.err.println(number);

// for(int i=1; i<=10; i++) {
//     System.out.println(number + " * " + i +"=" + (number*i));
// } 


// int[] arr = {1,4,7,9,45,67,23,89,123,456,7,12};
// System.out.println("size = " + arr.length);
// for(int i :arr)//completely scan
// System.out.println(i);

// jump statement 

/* 
for(int i=5;i<=100;i=i+5) {
    System.out.println(i+ " ");

    // if(i==50)// are used to break in the middle or a given aecific condition 
    // break;// jump from this loop
}
System.out.println();
*/
/* 

// int number = 2 + (int)(Math.random()*99);//2 - 100
// System.out.println(number);
// //prime have a just two factor 1 and itself
// int i = 1;
// int count = 0;
// while (i<=number/2) {
//     if(number % i ==0) {
//         count++;
//     }
//     i++;
// }
// // if(count == 2) {// not a prime numbers
// if(count == 1) {// for prime number
//     System.out.println(number + " is a prime a number ");
// }  else {
//     System.out.println(number + " not is a prime number ");
// }

// for(int i=0; i<=100;i = i + 5) {
// System.out.println(i);
 
// if(i >= 50) {
// break;
// }
// }

*/
// to skip some number
/*
for(int i=0; i<=50; i++) {
if(i>25 && i<=40)
continue;//skip body

System.out.println(i+ " ");
}
System.out.println();
*/

// Q. 
/* 
for(int i=65; i<=122; i++) {
    if(i>90 && i<97)
    continue;
    System.out.println((char)i + " ");// print al cher on this number 
}
System.out.println();
*/

// largest  of three numbers
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// int max = a;
// if(b>max) {
//     max =b;
// }
// if(c>max) {
//     max =c;
// System.out.println(max);
// }


// int max = 0;
// if(a>b) {
//     max=a;
// }
//     else {
//         max = b;
//     }
//     if(c>max) {
//         max = c;
//     }
//     else {
//         System.out.println("invalid");
//     }
//     System.out.println(max);
//   }
// }



//use the math class
// int max =  Math.max(c,Math.max(a,b));// print the max number using this
// System.out.println(max);




//Q.
// Scanner sc = new Scanner(System.in);
// char ch =sc.next().trim().charAt(6);
// System.out.println(ch);




//Q.
// fibonic number
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int a = 9;
int b = 6;
int count = 2;

while (count <= n) {
    int temp = b;
    b = b + a;
    a = temp;
    count++;
}
System.out.println(b);
    }
}

    
