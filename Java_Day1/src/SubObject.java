public class SubObject extends SuperObject {
    public SubObject(){
        super();
        name = "자식초기값";
    }

    @Override
    public void draw(){
        System.out.println("Sub Object: " + name);
    }

    public void prtTest(){
        System.out.println("Test");
    }
}
