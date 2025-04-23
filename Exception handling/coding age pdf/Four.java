public class Four {

    public void hello()throws Exception{
      System.out.println("Exception in hello");
      throw new Exception("one");
    }
    public void hii()throws Exception{
        System.out.println("Exception in hii");
        hello();
    }
    public static void main(String[] args) {
        Four obj = new Four();
        try {
            obj.hii();
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }
}
