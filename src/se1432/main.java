/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1432;

/**
 *
 * @author truon
 */
public class main {

    public static void main(String[] args) {
        //kĩ thuật test căn bản:  nhìn bằng mắt các test cáes để kết luận hàm
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        //kì vọng 120, mày chạy thức tế ra cái gì tao lưu ở actual
        //so sách = mắt
        System.out.println("5! ? expected: " + expected + "; actual: " + actual);
        System.out.println("6! ? expected: 720; actual: " + MathUtility.getFactorial(6));
        System.out.println("0! ? expected: 1; actual: " + MathUtility.getFactorial(0));
        // TAO KÌ VỌNG MÀY NÉM VỀ NGOẠI LỆ NẾU TAO ĐƯA ÂM GIAI THỪA
        MathUtility.getFactorial(-5);
        //không có sout() vì chết ngay khi gọi hàm
        //chống mắt xem có dùng đúng ngoại lệ không mình cần như thiết kết để chửi thẳng
        // xài hàm không có đúng cách
    }

}
//nhược điểm của kĩ thuật này 
// cần phải dúng mắt để so sánh từng trường hợp xài hàm: so expected và actual
// nếu test nhiều tình huống, mắt đủ mệt moit vè phải dò từng output
//máy so giùm tao luôn expected and actual
//sau đó
//NẾU TẤT CẢ CÁC CASES MÀ ĐỀU ĐÚNG, THẨY RA 1 MÀU XANH - ĐÈN XANH - CODE ỔN
//EXPECTED KHÁC ACTUAL, THẢY RA 1 MÀU ĐỎ, HÀM YS , HÀM SAI RỒI,
//                          HÀM ĐÚNG GẦN HẾT, MÀ SAI 1 VÀI, KHÔNG TIN CẬY XÀI HÀM
//ĐỎ: CHỈ CÓ ÍT NHẤT 1 CẶP EXPECTED ACTUAL, KHÔNG BẰNG NHAU, KẾT LUẬN NGAY HÀM SAI
//THAY VÌ NHÌN TỪNG CASE, TA SẼ NHÌN CHỈ MÀY XANH HOẶC ĐỎ LÀ ĐỦ RỒI
//TA CẦN THÊM BỘ THƯ VIỆN ĐỀ GIÚP TA VIỆC NÀY
//BỘ THƯ VIỆN NÓ LÀM 2 VIỆC: SO SÁCH GIÙM ACTUAL VS. EXPECTED
//                  TÙY KHỚP -> THẢY RA MÀU XANH
//                  KHÔNG KHỚP -> THẢY RA MÀY ĐỎ
//NÓ TỰ QUÉT HẾT CÁC CASE MÀ MÌNH ĐÃ THIẾT KẾ ĐỂ NÓ KẾT LUẬN, MẶT NHÌN DUY
//NHẤT MÀU LÀ ĐỦ
//BỘ THƯ VIẸN NÀY CHÍNH LÀ NHỮNG FILE .JAR .DLL ĐƯỢC ADD THÊM VÔ PROJECT
//Bộ thự viện này mang cái tên chugn cho mọi ngôn ngữ lập trình = unit test
//riếng cho java: Junit , testNG
// c#:NUnit
// php: PHPUnit
//.....
//đưa code lên server
