public class Butterflypattern{


public static void main(String[] args){

int i,j;
int n=4;

// Program code for Upper Matrix Dimension

// outer loop or loop for rows
for(i=1;i<=n;i++){


// loop to print half front pyramid
for(j=1;j<=i;j++){

  System.out.print("*");
}
// loop to print the space
// total there are 2*(n-1)
int space=2*(n-i);
for(j=1;j<=space;j++){

  System.out.print(" ");
}

// loop to print half back pyramid
for(j=1;j<=i;j++){
  System.out.print("*");
}
System.out.println();

}


// Program code for lower matrix dimension
 // that is reverse of upper dimension  code


// outer loop or loop for number of rows
for(i=4;i>=1;i--){


  // loop to print first half pyramid
  for(j=1;j<=i;j++)
    System.out.print("*");


    // loop to print the space
    int space=2*(n-i);
    for(j=1;j<=space;j++){
      System.out.print(" ");
    }

    // loop to print half back side pyramid
    for(j=1;j<=i;j++){
      System.out.print("*");
    }




    System.out.println();

}


}
}
