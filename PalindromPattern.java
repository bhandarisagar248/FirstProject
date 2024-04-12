public class PalindromPattern {

    public static void main(String[] args) {
        
int i,j;

// number of rows
int n=5;

// outer loop or loop for rows

for(i=1;i<=n;i++){


    // for printing space 
    int space=n-i;
    for(j=1;j<=space;j++){
        System.out.print(" ");


    }


    // loop to print the half pyramid upto 1
    for(j=i;j>=1;j--){
         System.out.print(j);
    }


// loop to print half remaining pyramid
    for(j=2;j<=i;j++){
        System.out.print(j);
   }

System.out.println();
}


    }
    
}
