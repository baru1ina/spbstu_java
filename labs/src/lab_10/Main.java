package lab_10;
public class Main {
    public static void main(String[] args) {
        Triple<Integer> triple = new Triple<>(1, 2, 3);
        triple.print();
        triple.setFirst(1);
        triple.setSecond(2);
        triple.setThird(3);
        triple.print();

        triple.setSecond(11);
        triple.print();

        Triple<String> badTriple = new Triple<>("a", "b", "c");
        badTriple.print();
    }
}
