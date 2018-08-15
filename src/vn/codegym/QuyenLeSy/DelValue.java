package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class DelValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {3,4,5,7,6,8,2,0,0,0,0};
        int value, index = 0;
        boolean checked = false;

        System.out.println("Nhập vào phần tử cần xóa: ");
        value = scanner.nextInt();

        for (int i = 0; i < array.length; i++)
        {
            if(array[i] == value){
                index = i;
                checked = true;
                break;
            }
        }

        if (checked){
            System.out.println("Danh sách mảng trước khi xóa phẩn tử: ");
            for (int i = 0; i < array.length; i++)
            {
                System.out.printf("%3d",array[i]);
            }

            for (int i = index; i < array.length-1; i++)
            {
                array[i] = array[i+1];
            }

            System.out.println("\nDanh sách mảng sau khi xóa phẩn tử có giá trị " + value+":");
            for (int i = 0; i < array.length; i++)
            {
                System.out.printf("%3d",array[i]);
            }
        }
        else
        {
            System.out.println("Không tìm thấy phẩn tử có trong mảng!");
        }
    }
}
