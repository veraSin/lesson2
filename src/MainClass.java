public class MainClass {

    public static void main(String[] args) {

        // Задача 1

        int[] intNum = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < intNum.length; i++) {
            if (intNum[i] == 0) {
                intNum[i] = 1;
            } else {
                intNum[i] = 0;
            }
        System.out.print(intNum[i]);
        }
        System.out.println();


        // или с помощью тернарного оператора
        int[] intNumTern = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < intNumTern.length; i++){
            intNumTern[i] = intNumTern[i] == 0 ? 1 : 0;
            System.out.print(intNumTern[i]);
        }
        System.out.println();

        // или с помощью математических действий: чтобы получить 0 вычитаем 1, чтобы получить 1 - прибавляем 1
        int[] intNumMath = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < intNumMath.length; i++) {
            if (intNumMath[i] == 0) {
                intNumMath[i]++;
            } else {
                intNumMath[i]--;
            }
            System.out.print(intNumMath[i]);
        }
        System.out.println();

        // или с помощью тернарного оператора и математических действий: чтобы получить 0 вычитаем 1, чтобы получить 1 - прибавляем 1
        int[] intNumTernM = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < intNumTernM.length; i++){
            intNumTernM[i] = intNumTernM[i] == 0 ? ++intNumTernM[i] : --intNumTernM[i];
            System.out.print(intNumTernM[i]);
        }
        System.out.println();


        // Задача 2

        // Заполнение массива
        int[] myArray = new int[8];
        for (int i = 1, c = 3; i < myArray.length; i++, c += 3) {
            myArray[i] = c;
        }

        // Вывод на печать
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();



        // Задача 3

        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 6){
                numbers[i] *= 2;
            }
        }

        // Вывод на печать
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();


        // Задача 4

        // Заполнение диагоналей
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }

        // Вывод с заполненными диагоналями
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        // Задача 5**

        float[] num = {1.6f, -5, 3, -2.735f, 121, 423, 50, -862, 4.032f, 842, -79, 1037};

        float minNum = num[0];
        float maxNum = num[0];
        for (int i = 1; i < num.length; i++){
            if (num[i] < minNum){
                minNum = num[i];
            }

            if (num[i] > maxNum){
                maxNum = num[i];
            }
        }
        System.out.print(minNum + "   ");
        System.out.println(maxNum);


        // Задача 6**

        int[] array = {2, 2, 2, 1, 2, 2, 10, 1};
        //int[] array = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(array));

        // Задача 7****
        float[] arrN = {1, -2.52f, 3, 4, 5.1f, 6, 7.5f, 8, 9, 0};
        int n = -1;
        scrollArray(arrN, n);


    }


    static boolean checkBalance(int[] arr){

        int i = 0;
        int sumLeft = 0;


        while(i < arr.length) {
            sumLeft += arr[i];

            int sumRight = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sumRight += arr[j];
            }

            if (sumLeft == sumRight){
                return true;
            }

            i++;
        }
        return false;
    }

    static void scrollArray(float[] arr, int n){
        float k, m , h;
        int len = arr.length - 1;


        for (int j = 0; j <= Math.abs(n); j++){
            if (n > 0) {
                m = arr[0];
                k =  arr[len];


                for (int i = 1; i < arr.length; i++){
                    h = arr[i];
                    arr[i] = m;
                    m = h;
                }
                arr[0] = k;
            }
            else{
                m = arr[0];
                k =  arr[1];
                for (int i = arr.length-1; i >= 1; i--){
                    h = arr[i];
                    arr[i] = m;
                    m = h;
                }
                arr[0] = k;
            }

        }
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}

