class EMPLOYEE1{
    private int id;
    private String name;
    private int salary;

    public void setid(int id){
        this.id=id;
    }
    public int getid(){
        return id;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setsalary(int salary){
        this.salary=salary;
    }
    public int getsalary(){
        return salary;
    }
}
class employee{
    public static void main(String[] args){
        EMPLOYEE1 obj = new EMPLOYEE1();
        obj.setid(1234);
        obj.setname("manu");
        obj.setsalary(8000);
        System.out.println(obj.getid());
        System.out.println(obj.getname());
        System.out.println(obj.getsalary());


    }
}