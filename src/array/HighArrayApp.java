package array;

public class HighArrayApp {
    public static void main(String[] args) {
        HighArray app = new HighArray(10);
        app.insert(2);
        app.insert(6);
        app.insert(3);

        app.show();

        System.out.println("");
        System.out.println(app.find(4));
        System.out.println("");

        app.delete(2);
        app.show();
    }
}
