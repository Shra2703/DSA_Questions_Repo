package course_by_CN.OOPS.Generics;
//  Day 8(31-01-2024)
// Generics

public class PairUse {
    public static void main(String[] args) {

        // these angular brackets needs the wrapper class which is the sub class of object class
        Pair<Integer> p = new Pair<Integer>(1, 2);
        System.out.println(p.getFirst() + " " + p.getSecond());


        Pair<String> ps = new Pair<String>("Aa", "bb");
        System.out.println(ps.getFirst() + " " + ps.getSecond());

        // this is not giving error because it is by default is the object class and it is dangerous
        // Pair pi =new Pair(10, 20);
        // pi.setFirst("rt");
        // pi.setFirst(78.99);

        // this kind of problem can come
        // String a = pi.getFirst();
    }
}
