public class Bubblesort {


    // function  to print the array
    public static void array(int array[]){

          for(int i=0;i<=array.length-1;i++){
            System.out.print(array[i]+" ");
          }
    }

    public static void main(String[] args) {
        


        // Bubble sort 
        // declearing an array with random elements
        int array[] = {5,9,3,8,7,1};

        // outer loop or loop for number of iteration
        for(int i=0; i<array.length-1;i++){
          
            // inner loop to compare each adjacent elements with each other
            for(int j=0;j<array.length-i-1;j++){

                // two swap the value if the first elements is greater other element
                if(array[j]>array[j+1]){

                    // swapping the two values
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }

            // calling function to print the array
           
    

        } 

        array(array);


    }
    
}
