package ArrayMaven;


public class Homework5Array {




    public static void obedinenieMassiva() {


        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 10, 12, 14};
        int[] result = new int[array1.length + array2.length];


        int i = 0, j = 0;
        int res = 0;
        while (i < array1.length && j < array2.length) {

            if (array1[i] < array2[j]) {
                result[res] = array1[i];
                System.out.print(result[res] + " ");
                i++;
            } else {
                result[res] = array2[j];
                System.out.print(result[res] + " ");
                j++;
            }

            res++;
        }
        while (i < array1.length) {
            result[res] = array1[i];
            System.out.print(result[res] + " ");
            res++;
            i++;
        }
        while (j < array2.length) {
            result[res] = array2[j];
            System.out.print(result[res] + " ");
            res++;
            j++;
        }
        System.out.println(" ");
    }

    public static void summa2ElementovMassiva(int sum) {



        int[] array = {1,2, 3, 5, 7, 9, 11, 12, 13};
        for (int j = 0; j < array.length/2; j++) {
            for (int i = 0; i < array.length; i++) {
                if(j!=i){
                    if(array[j] + array[i] == sum) {

                        System.out.println("Summa " + array[j] + " " + array[i] + " ravna " + sum);
                    }
                }
            }
        }

    }
}