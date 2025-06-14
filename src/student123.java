class STUDENT{
    private String name;
    private int marks;

    public void setmarks( int marks){
        this.marks=marks;
    }
    public int getmarks(){
        return marks;
    }
    public void setname( String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
}

public class student123{
    public static void main(String[] args){
        STUDENT obj = new STUDENT();
        obj.setmarks(600);
        obj.setname("Harshitt");
        System.out.println(obj.getmarks());
        System.out.println(obj.getname());
    }
}