public class Test1{
    private String name = "pipixia";
    public static void main(String[] args){
        Test1 someone = new Test1();
        System.out.println("before_name:"+someone.name);
        someone.setName("Java");
        System.out.println("before_name:"+someone.name);
        System.out.println("someone_name:"+someone.getName());

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
