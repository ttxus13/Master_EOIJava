public class Wrapper {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(123456);
        Integer e = 123456;
        String a="kjb fsd";
        System.out.println(e==i);
        System.out.println(a.getClass());
        System.out.println(i.getClass().getSimpleName());
    }
}
