package JavaSyntax.array;

public class RectangleArrayAssignment {
    public static void main(String[] args) {

        //방법1 배열의 원소값 대입

        int[][] array1 = new int[2][3];
        array1[0][0] = 1;//힙메모리에 0이 이미 있고 이렇게 지정하면 화
        array1[0][1] = 2;
        array1[0][2] = 3;
        array1[1][0] = 4;
        array1[1][1] = 5;
        array1[1][2] = 6;

        System.out.println(array1[0][0]+" "+ array1[0][1]+ " " + array1[0][2]);
        System.out.println(array1[1][0]+" "+ array1[1][1]+ " " + array1[1][2]);

        int[][] array2;
        array2 = new int[2][3];//분리작성
        array2[0][0] = 1;//힙메모리에 0이 이미 있고 이렇게 지정하면 화
        array2[0][1] = 2;
        array2[0][2] = 3;
        array2[1][0] = 4;
        array2[1][1] = 5;
        array2[1][2] = 6;

        System.out.println(array2[0][0]+" "+ array2[0][1]+ " " + array2[0][2]);
        System.out.println(array2[1][0]+" "+ array2[1][1]+ " " + array2[1][2]);
        System.out.println();


        //방법2 : 이미 원소들을 아는 경우
        int[][] array3 = new int[][] {{1,2,3},{4,5,6}};
        System.out.println(array3[0][0]+" "+ array3[0][1]+ " " + array3[0][2]);
        System.out.println(array3[1][0]+" "+ array3[1][1]+ " " + array3[1][2]);

        int[][] array4;
        array4 = new int[][] {{1,2,3},{4,5,6}};//분리 작성 가능
        System.out.println(array4[0][0]+" "+ array4[0][1]+ " " + array4[0][2]);
        System.out.println(array4[1][0]+" "+ array4[1][1]+ " " + array4[1][2]);
        System.out.println();

        //방법3 : new 생략(단 분리작성 불가능!)
        int[][] array5 = {{1,2,3},{4,5,6}};
        System.out.println(array5[0][0]+" "+ array5[0][1]+ " " + array5[0][2]);
        System.out.println(array5[1][0]+" "+ array5[1][1]+ " " + array5[1][2]);

    }

}
