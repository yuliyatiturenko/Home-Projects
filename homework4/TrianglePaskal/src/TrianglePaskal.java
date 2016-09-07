
public class TrianglePaskal {
    public static void main(String[] args) {

        massivPaskal(7);
    }

    public static void  massivPaskal(int n) {
       //создаем массив
        int[][] array = new int[n][];
        for (int i = 0; i < n; i++) {
            array[i] = new int[i + 1];
        }
        //заполняем массив

        for (int j = 0; j < n; j++) {
            for (int k = 0; k <= j; k++) {
                if (k == 0 || k == j) {
                    array[j][k] = 1;
                } else array[j][k] = array[j - 1][k - 1] + array[j - 1][k];
                System.out.print(array[j][k] + " ");
            }
            System.out.println("");
        }
    }

}
