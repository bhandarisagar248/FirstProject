public class InsertionSort {


    // function to print the array
    public static void PrintArray(int array[]){

        for(int i=0;i<array.length;i++){

            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        // Insertion Sorting

        // declearing an array
        int array[]= {4,1,4,3,1,2};
                       // 1,4,8,3,9,2

        //outerloop or for n-1 iteration
        for(int i=0;i<array.length-1;i++){



            // innerloop to perform comparison and swapping
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
               
                    // swapping two values
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;

                }

            }

        }



        // calling function to print the array
        PrintArray(array);

    }
    
}
