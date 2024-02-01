// // Day 9(1-02-2024)
// generics with multiple data types, generics methods

package course_by_CN.OOPS.Generics;
public class PairWithMultipleDTUSe {
    public static void main(String[] args) {

        // Pair having multiple data types
        PairWithMultipleDT<Integer, String> p = new PairWithMultipleDT<Integer, String>(1, "aa");
        System.out.println(p.getFirst() + " " + p.getSecond());

        // Pair having pair
        PairWithMultipleDT<PairWithMultipleDT, String> p1 = new PairWithMultipleDT<>();
        p1.setFirst(p);
        System.out.println(p1.getFirst());
        System.out.println(p1.getFirst().getFirst() + " " + p1.getFirst().getSecond());

    }
}
