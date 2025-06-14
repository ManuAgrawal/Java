class ATM1{
    private int a;
    public void setrupees(int a){
        this.a=a;
    }
    public int getrupees(){
        return a;
    }
}
class atm{
    public static void main(String[] args){
        ATM1 obj=new ATM1();
        obj.setrupees(5001);
        System.out.println(obj.getrupees());
    }
}