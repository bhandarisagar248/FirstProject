public class ReverseString {

    public static void main(String[] args){

// creating two string Builder type
StringBuilder name=new StringBuilder("Sagar Bhandari");

// creating an stringBuilder to reverse a string
StringBuilder reverse=new StringBuilder();



// loop to reverse a string 

for(int i=name.length()-1;i>=0;i--){

   reverse.append(name.charAt(i));

}

// print the reverse string
System.out.println("The String is : "+name);
System.out.println("The Reverse of the string is: "+reverse);
   


    int a=10,b=0;


    b=a++;
    System.out.println(b);
    System.out.println(a);


    a=10;
    b=0;

    b=++a;

    System.out.println(b);
    System.out.println(a);
    

}
    
}
