public class SelectionSort {

// Function to print the array
public static void PrintArray(int array[]){

for(int i=0;i<array.length;i++){
    System.out.print(array[i]+" ");
}


}

    public static void main(String[] args) {
        // Selection sort
        

        //Declearing an array
        int array[]={ 5,7,1,8,3,2};



        // outerloop 
        for(int i=0;i<array.length-1;i++){

            
            // declearing an varable to store smallest value
        int smallest= i;

        // inner loop
        for(int j=i+1;j<array.length;j++){


            if(array[i]>array[j]){
                smallest=j;
                
            int temp=array[i];
            array[i]=array[smallest];
            array[j]=temp;

                
            }




        }




        }
       
        // calling function to print the sorted array
        PrintArray(array);
    }
    
}
