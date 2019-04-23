package Generics;

public class Pair<T1, T2> {

    protected T1 elementFirst;
    protected T2 elementSecond;

    public Pair(T1 elementFirst, T2 elementSecond) {
        this.elementFirst = elementFirst;
        this.elementSecond = elementSecond;
    }

    public T1 getElementFirst() {
        return elementFirst;
    }

    public T2 getElementSecond() {
        return elementSecond;
    }

    public T2 getFirstElement() {
        return null;
    }

    public T2 getSecondElement() {
        return null;
    }
}
