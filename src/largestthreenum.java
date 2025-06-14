//Find the largest of three numbers
class largestthreenum{
    public static void main(String args[]){
        int a = 19;
        int b = 24;
        int c = 25;
        if(a > b && a > c)
            System.out.println("Largest number is: " + a);
        else if(b > c)
            System.out.println("Largest number is: " + b);
        else
            System.out.println("Largest number is: " + c);
    }
}
