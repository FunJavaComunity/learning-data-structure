package simpleSorting;

public class SortingApp {
    public static void main(String[] args) {
        HighArray app = new HighArray(10);
        app.insert(7);
        app.insert(6);
        app.insert(3);
        app.insert(1);
        app.insert(2);
        app.insert(10);
        app.insert(9);
        app.insert(5);
        app.insert(4);
        app.insert(8);

        app.show();
        System.out.println("");

//        app.bubbleSort();
//        app.insertionSort();
//        app.selectionSort();

        app.show();
    }
}
