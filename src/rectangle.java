class RECTANGLE1{
    private int length;
    private int width;
    public void setlength(int length){
        this.length=length;
    }
    public int getlength(){
        return length;
    }
    public void setwidth(int width){
        this.width=width;
    }
    public int getwidth(){
        return width;
    }
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}
class rectangle{
    public static void main(String[] args){
        RECTANGLE1 obj=new RECTANGLE1();
        obj.setlength(10);
        obj.setwidth(5);
        System.out.println("Length: " + obj.getlength());
        System.out.println("Width: " + obj.getwidth());
        System.out.println("Area: " + obj.area());
        System.out.println("Perimeter: " + obj.perimeter());
    }
}