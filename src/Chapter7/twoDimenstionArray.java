package Chapter7;

public class twoDimenstionArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];//{{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr.length);  //이중다차원 배열의 행의 길이(개수)
        System.out.println(arr[0].length); //첫번째 행의 길이(개수)
        System.out.println(arr[1].length);
        System.out.println("");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]); //i번째 행의 j번째 열까지의 입력값 출력
            }
//        }

            char[][] alphabets = new char[13][2];
            char ch = 'A';

            for (int z = 0; z < alphabets.length; z++) {
                for (int j = 0; j < alphabets[i].length; j++) {
                    alphabets[z][j] = ch;
                    System.out.println(alphabets[z][j]);
                    ch++;
                }
                System.out.println("");

            }
        }
    }
}
