/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util.test;

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import static se1432.MathUtility.*;

/**
 *
 * @author truon
 */
public class MathUtilityTest {

    //class này xài bộ thư viện JUnit dùng để test
    //theo dangj xanh - đỏ , thay vì mắt như bên main () sout()
    //2 files .jar đã được add vào project này, và ta thoải mái xìa
    //các hàm của nó
    //trong các hàm của thư viện này có n hàm đặc biệt đều có 
    //tên xuất phát là assertX(expected và actual đưa vào)
    //nếu nó thấy expected không có bằng actual, nó thảy mày ĐỎ
    //                           có bằng       , nó thảy màu đỏ
    //quy tắc xanh đỉ : NẾU TẤT CẢ XANH->kết luận xanh
    // NẾU ÍT  nhất 1 đỏ là đỏ
    @Test //biến hàm ngay sau đây thành public static void main()
    //muốn chạy thì nhất shift-f6
    //quy tắc đặt tên của nghề lập trình
    public void getFactorial_RunsWell_IfValidARgument() {
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(1, getFactorial(0));
    }
    
    @Test(expected = SQLException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        //ngoại lệ không phải là value để assert()
        //chỉ có thẻ chụp lại nó
        getFactorial(-5);
    }

}
