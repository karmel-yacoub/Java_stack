public class ProjectTest{
    public static void main (String[] args){
        Project m=new Project("mahmoud");
        Project k=new Project("karmel" , "hello");
        String n=m.getName();
        
        System.out.println(n);

        
        m.setName("karmel");

        System.out.println(m.getName());
        System.out.println(k.elevatorPitch());
    }
}