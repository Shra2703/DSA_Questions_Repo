package course_by_CN.OOPS.Generics;
public class Pair<T> {
    private T first;
    private T second;

    Pair(T first, T second){
        this.first =  first;
        this.second =  second;
    }

    void setFirst(T first) {
        this.first = first;
    }

    void setSecond(T second) {
        this.second = second;
    }

    T getFirst() {
        return first;
    }

    T getSecond() {
        return second;
    }
}