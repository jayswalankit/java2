import java.util.*;

public class One {
    int rollno;
    StringBuffer name;
    StringBuilder title;
    String className;

    One(int rollno, StringBuffer name, StringBuilder title, String className) {
        this.rollno = rollno;
        this.name = name;
        this.title = title;
        this.className = className;
    }

    public void setrollno(int rollno) {
        this.rollno = rollno;
    }

    public int getrollno() {
        return rollno;
    }

    public void setname(StringBuffer name) {
        this.name = name;
    }

    public StringBuffer getname() {
        return name;
    }

    public void settitle(StringBuilder title) {
        this.title = title;
    }

    public StringBuilder gettitle() {
        return title;
    }

    public void setclassName(String className) {
        this.className = className;
    }

    public String getclassName() {
        return className;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        One obj = new One(0, null, null, null);
        obj.setrollno(sc.nextInt());
        sc.nextLine();
        obj.setname(new StringBuffer(sc.nextLine()));
        obj.settitle(new StringBuilder(sc.nextLine()));
        // obj.setclassName(sc.nextLine());
        obj.setclassName(new String(sc.nextLine()));
        // obj.setrollno(String.valueOf(sc.nextInt()));
        obj.setclassName(String.valueOf(Float.parseFloat("1234")));
        obj.setname(new StringBuffer().append(Integer.parseInt("456")));

        System.out.println("result ---->");
        System.out.println(obj.getrollno());
        System.out.println(obj.getname());
        System.out.println(obj.gettitle());
        System.out.println(obj.getclassName());
    }
}
