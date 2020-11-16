package se1432;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truon
 */
public class MathUtility {

    //fake class Math gio
    public static final double PI = 3.1415;

    //21! trong long rồi , âm giai thừa không tính được vô nghĩa
    //0! =1!=1;
    //bài này mình chỉ tính gt trong khoảng 0..20
    //nếu đưa n cà chớn
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //CPU chạy lệnh ở chỗ này, tức là n = 2..20, không xài else, xài else trừ điểm 
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    //tự tin hàm chạy đúng như thiết kế
    //éo tin, phải test đã 
    //có nhiều cách để test
    //kiểu gì cugnx được phải là: mình tính trước kết quả hàm cần trả về EXPECTED VALUE
    //                            mình gọi hàm coi nó chạy được mấy, ACTUAL VALUE
    //so sánh coi EXPECTED VALUE == ACTUAL VALUE hay không 
    //                            CÓ BẰNG, HÀM CHẠY ĐÚNG CHO TÍNH HUỐNG X
    //                            KHÔNG BẰNG, HÀM CHẠY SAI CHO TÍNH HUỐNG X
    //Ví dụ:
    //tao nghĩ rằng 5! phải là 120 (expected)
    //giờ tao gọi hàm getFactorial(5 đưa vào), coi kết quả mấy (Actual)
    //nếu actual giả sử là 120 luôn, may quá hàm đúng cho 5! vì khớp kì vọng
    //case (tính huống) n = 5 hàm đúng
    //case (tính huống) n = 6 hàm trả về 720 thì hàm đúng
    //case (tính huống) n = 0 hàm trả về 1 thì là hàm đúng
    //...
    //làm các case mà mình nghĩ là người dùng sẽ xài hàm như thế
    //tao gọi là các test cases
    //một hàm 

}
