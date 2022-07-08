package GenericsProblems.ArrayProblem;

public class PrintArrayGenerics<T> {
    private T[] inputArray;

    public PrintArrayGenerics(T[] inputArray) {
        this.inputArray = inputArray;
    }
    public void toPrint() {
        PrintArrayGenerics.toPrint(this.inputArray);
    }
    public static <E> void toPrint(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O', 'G'};

        new PrintArrayGenerics(intArray).toPrint();
        PrintArrayGenerics.toPrint(doubleArray);
        PrintArrayGenerics.toPrint(charArray);
    }

}


