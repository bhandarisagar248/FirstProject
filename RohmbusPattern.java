public class RohmbusPattern {

    public static void main(String[] args) {
        
    int i,j;
    int n=5;

    // outer loop or number of rows
  for(i=1;i<=n;i++){


// for printing the space
int space=n-i;

for(j=1;j<=space;j++){

    System.out.print(" ");
}

// loop for printing the pattern
for(j=1;j<=n;j++){
    System.out.print("*");


}


System.out.println();
}


    }
    

    
}
