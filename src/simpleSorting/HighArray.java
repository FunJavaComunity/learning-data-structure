package simpleSorting;

public class HighArray {
    private int[] datas;
    private int nIndex = 0;

    public HighArray(int size) {
        this.datas = new int[size];
//        fixed
    }

    public void insert(int value){
        datas[nIndex++] = value;
    }

    public void show(){
        for (int i = 0; i < nIndex; i++) {
            System.out.print(datas[i] + ", ");
        }
    }

    public boolean find(int value){
        for (int data : datas) if (data == value) return true;
        return false;
    }

    //    1, 3, 4
    public boolean delete(int value){
        int i;
        for (i = 0; i < nIndex; i++) if (datas[i] == value) break;

        if (i == nIndex){
            return false;
        } else {
            for (int j = i; j < nIndex; j++) {
                datas[j] = datas[j+1];
            }
            nIndex--;
            return true;
        }
    }
    public void swap(int one, int two){
        int temp = datas[one];
        datas[one] = datas[two];
        datas[two] = temp;
    }

    public void bubbleSort(){
        int limit, i;

//        3, 5, 7, 6

        for (limit = nIndex-1; limit > 0; limit--) {
            for (i = 0; i < limit; i++) {
                if (datas[i] > datas[i + 1]) swap(i, i+1);
            }
        }
    }

    public void selectionSort(){
        int first, i, min;

        for (first = 0; first < nIndex; first++) {
            min = first;

            for (i = first + 1; i < nIndex; i++) {
                if (datas[i] < datas[min]){
                    min = i;
                }
            }

            swap(first, min);
        }
    }

    public void insertionSort(){
        int i, curIn;

        for (curIn = 1; curIn < nIndex; curIn++) {
            int temp = datas[curIn];

            i = curIn;
            while (i > 0 && datas[i-1] >= temp){
                datas[i] = datas[i-1];
                i--;
            }

            datas[i] = temp;
        }
    }

}
