package NewSet.DSA.Trash;

public class Constructor {
        int id;
        String Name;
        Constructor
    (int id,String Name){
        this.id=id;
        this.Name=Name;
    }
    public static void main(String[] args) {
            Constructor c=new Constructor(1,"Shiad");

        System.out.println(c.Name);


    }
}
