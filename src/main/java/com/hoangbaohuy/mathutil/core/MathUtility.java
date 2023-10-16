/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoangbaohuy.mathutil.core;

/**
 *
 * @author Acer
 */
//class này sẽ chứa các hàm static dùng để làm thư viện cho các
// nơi khác/ class khác xài
public class MathUtility {
    public static final double PI = 3.14;
    // public const double Pi = 3.14 // C ko cần static mà vẫn giống
                                     // vì có chữ const ~ final
    // hàm tính n! = 1.2.3...n
    // 0! = 1! = 1 - quy ước
    // ko tính dc giai thừa số âm
    // n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 con số 0
    // vậy 21! ko chứa trong long dc, tràn kiểu dữ liệu
    // quy ước < 0 ! và > 20! ném ngoại lệ, ko tính dc
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        
//        if (n == 0 || n == 1)
//            return 1; // kết thúc sớm hàm, nếu có thể
//        
//        long result = 1; // biến tích lũy, gom dồn việc nhân, biến con heo đất
//                         // acc accumlation
//        
//        // sống sót đến for, sure n = 2..20                 
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//               
//        return result;
//    }
    //5! = 1.2.3.4.5
    //5! = 4! * 5 = 5 * 4!
    //4! = 1.2.3  .4
    //3! * 4 = 4 * 3! đuổi nhau
    //3! = 3 * 2!
    //2! = 2 * 1! dừng nhen. Đệ quy luôn phải dừng
    //N! = N * (N - 1)! đệ quy là gọi lại chính mình với quy mô nhỏ hơn
    //                  búp bê nga
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        
        if (n == 0 || n == 1)
            return 1; // kết thúc sớm hàm, nếu có thể
        // dùng đệ quy  
        return n * getFactorial(n - 1);
    }
    // kỹ thuật kiểm thử gọi là: regression testing
    //                           kiểm thử hồi quy: test lai những thứ
    //                           đã từng test
    // trong thực tế làm dự án, code của ta sẽ liên tục dc chỉnh sửa
    // vì:
    // fix bug thì phải sửa code, sửa hàm
    // thêm hàm, thêm tính năng
    // tối ưu hàm cũ, làm hàm cũ gọn hơn, dễ đọc hơn, chạy nhanh hơn
    // hàm đang ngon - màu xanh, nếu ta sửa hàm vì lí do gi đó
    // liệu rằng hàm còn xanh hay ko, thì phải test lại
    // nếu test = tay, bằng log, thì cực kì tốn thời gian, mất sức
    // nếu code của ta có sẵn script - code kiểm thử
    // ta chỉ việc run lại cái test script này
    // nếu hàm sửa ngon, nó phải ra màu xanh
    // nếu hàm sửa ko nogn, bị màu đỏ!!!
    // nhờ test script ta verify lại 1 hàm rất nhanh -> kiểm thử lại
    // thứ đã từng kiểm thử để đảm bảo nó còn ngon so với trước
    // khi sửa được gọi là kiểm thử hồi quy - regression testing
    // nhờ ci, hồi quy liên tục
    
    // bài này mình thử hồi quy = cách sửa lại hàm thoe thuật toán
    // đệ quy - recusion
}
