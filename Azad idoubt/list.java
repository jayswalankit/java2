import java.util.*;
 class studentl{
String name;
int id;
int [] marks ;

studentl(String name,int id,int[]marks){
    this.id=id;
    this.name=name;
    this.marks = marks;
   
}
void display(){
    System.out.println(name+id);
    for (int mark : marks) {
        System.out.print(mark + " ");
    }

}

int totalMarks() {
    int sum = 0;
    for (int mark : marks) {
        sum += mark;
    }
    return sum;
}
}



public class list{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<studentl>list =new ArrayList<>();
        System.out.println("enter the size :");
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter the id");
            int id = sc.nextInt();
            System.out.println("ener the name");
            String name = sc.next();
            int[] marks = new int[3];
            for(int j=0;j<3;j++){
                marks[j] = sc.nextInt();
            }
            list.add(new studentl(name, id, marks));
          
        } 
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
               if(list.get(i).totalMarks()<list.get(j).totalMarks()){
              studentl tem=list.get(i);
            list.set(i, list.get(j));
            list.set(j, tem);
               }
            }
            
        }
        
        for(studentl all : list){
            all.display();
}

       
}
}













