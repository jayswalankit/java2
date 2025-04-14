import java.util.*;

public class four {
    StringBuilder name;
    String classname;
    StringBuffer title;
    four(StringBuilder name,String classname,StringBuffer title){
        this.name=name;
        this.classname=classname;
        this.title=title;
    }
    // public String toString(){
    //    return "name: "+name+" classname: "+classname+" title: "+title;
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder a= new StringBuilder(sc.nextLine());
        // String b=sc.nextLine();
        String b=new String(sc.nextLine());
        StringBuffer c=new StringBuffer(sc.nextLine());
        StringBuffer cBuffer = new StringBuffer(c);
        four obj=new four(a,b,c);
        //   System.out.println(obj);
        System.out.println(obj.name);
        System.out.println(obj.classname);
        System.out.println(obj.title);
      
    }
}
