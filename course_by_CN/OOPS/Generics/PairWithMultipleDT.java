package course_by_CN.OOPS.Generics;
public class PairWithMultipleDT<T,S> {
    private T first;
    private S second;

    PairWithMultipleDT(){}


    PairWithMultipleDT(T first, S second){
        this.first =  first;
        this.second =  second;
    }

    void setFirst(T first) {
        this.first = first;
    }

    void setSecond(S second) {
        this.second = second;
    }

    T getFirst() {
        return first;
    }

    S getSecond() {
        return second;
    }
}
