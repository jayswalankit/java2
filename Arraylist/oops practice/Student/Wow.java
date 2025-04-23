import java.util.*; 

class One {
    private String name;
    private int id;
    
    One(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

public  class Wow {
    ArrayList<One> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void addStudent() {
        System.out.println("Enter the number of students you want to add:");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        for(int i = 0; i < n; i++) {
            System.out.println("Enter student name:");
            String name = sc.nextLine();
            
            System.out.println("Enter student id:");
            int id = sc.nextInt();
            sc.nextLine(); 
            
            students.add(new One(name, id));
        }
    }
    
    public void display() {
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
    
    public static void main(String[] args) {
        Wow obj = new Wow();
        obj.addStudent();
        obj.display();
    }
}
