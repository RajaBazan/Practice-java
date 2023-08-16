package hello.com;
interface x1{
    void name11();
    void name12();
    void name13();
}
interface y extends x1{

    void name14();
    void name15();
    void name16();
}
class xy implements y{
    @Override
    public void name11() {
        System.out.println("Name 11: Ali");
    }

    @Override
    public void name12() {
        System.out.println("Name12: Bazan");
    }

    @Override
    public void name13() {
        System.out.println("Name13: Ahmed");
    }

    @Override
    public void name14() {
        System.out.println("Name14: Haseeb");
    }

    @Override
    public void name15() {
        System.out.println("Name15: Attique");
    }

    @Override
    public void name16() {
        System.out.println("Name16: Waleed");
    }
}
public class Practice {
    public static void main(String[] args) {
        xy obj = new xy();
        obj.name11();
        obj.name12();
        obj.name13();
        obj.name14();
        obj.name15();
        obj.name16();

    }
}
