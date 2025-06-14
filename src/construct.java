public class construct{
    void sum(){
        System.out.println(this);
    }
    public static void main(String[] args){
        construct obj = new construct();
        System.out.println(obj);
        obj.sum();
    }
}