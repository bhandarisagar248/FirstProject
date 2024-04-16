public class Bitmanipulation {

    public static void main(String[] args) {
        // program to get the bit at the specific postion

        int n=8;//1000
        int position=2;

        // to calculate bit mask
        int bitmask= 1<<position;

        if((bitmask & n)==0){
            System.out.println("The bit is Zero");
        }
        else{

            System.out.println("The bit is One");
        }
    }







}
