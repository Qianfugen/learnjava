public class Book{
    private int id;
    private String name;
    private String category;
    public String getName(){
        int id = 0;            
        setName("Java");       
        return id+this.name;    
    }

    private void setName(String name){
        this.name = name;
    }

    public Book getBook(){
        return this;
    }

}
