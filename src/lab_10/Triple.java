package lab_10;

public class Triple<T> {
    private T first;
    private T second;
    private T third;
    public Triple(T _first, T _second, T _third) {
        first = _first;
        second = _second;
        third = _third;
    }

    public T min() {
        if (first instanceof Comparable) {
            T min = first;
            if (((Comparable)second).compareTo(min) < 0)
                min = second;
            if (((Comparable) third).compareTo(min) < 0)
                min = third;
            return min;
        }
        else
            throw new RuntimeException("min miscalc");

    }

    public T max() {
        if (first instanceof Comparable) {
            T max = first;
            if (((Comparable)second).compareTo(max) > 0)
                max = second;
            if (((Comparable)third).compareTo(max) > 0)
                max = third;
            return max;
        }
        else
            throw new RuntimeException("max miscalc");

    }

    public double mean() {
        if (first instanceof Number) {
            return (((Number) first).doubleValue() + ((Number)second).doubleValue() + ((Number)(third)).doubleValue())/3;
        }
        else
            throw new RuntimeException("mean miscalc");

    }

    public T getFirst() { return this.first; }
    public T getSecond(){ return this.second; }
    public T getThird() { return this.third; }

    public void setFirst(T _first){ this.first = _first; }
    public void setSecond(T _second) { this.second = _second; }
    public void setThird(T _third) { this.third = _third; }

    public void print(){
        System.out.println("\nTriple: [ " + String.join(", ", "" + first, "" + second, "" + third) + " ]\n");
        System.out.println("min: " + this.min());
        System.out.println("max: " + this.max());
        System.out.println("mean: " + this.mean());
    }

}