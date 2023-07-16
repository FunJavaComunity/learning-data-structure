package array;

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
}
