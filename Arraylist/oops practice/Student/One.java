

import java.util.*;

public class One {
private   ArrayList<String> name;
private  ArrayList<Integer> id;

  One(ArrayList<String> name, ArrayList<Integer> id) {
    this.name = new ArrayList<>();
    this.id = new ArrayList<>();
  }

  public void setStudentDetail() {
    Scanner sc = new Scanner(System.in);
    System.out.println("no of student you want to add");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("enter name");
      sc.nextLine();
      this.name.add(sc.nextLine());
      System.out.println("enter id");
      this.id.add(sc.nextInt());

    }

  }

  public void setremoveStudentDetail() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your name you want to remove");
    String studentname = sc.nextLine();
    if (name.contains(studentname)) {
      int index=name.indexOf(studentname);
      name.remove(index);
      id.remove(index);
      
    }
  }

  public void setFindStudentDetail() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your name you want to find ");
    String studentname = sc.nextLine();
    if (name.contains(studentname)) {
      System.out.println("found");
    } else {
      System.out.println("not found");
    }
  }

  public String getName() {
    for (int i = 0; i < name.size(); i++) {
      System.out.println(name.get(i) + " " + id.get(i));
    }
    return null;
  }

  public static void main(String[] args) {
    One obj = new One(null, null);
    obj.setStudentDetail();
    obj.getName();
    obj.setremoveStudentDetail();
    obj.getName();
    obj.setFindStudentDetail();
  }

}
