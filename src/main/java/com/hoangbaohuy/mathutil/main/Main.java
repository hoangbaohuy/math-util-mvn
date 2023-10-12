package com.hoangbaohuy.mathutil.main;

import com.hoangbaohuy.mathutil.core.MathUtility;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0; // given n = 0, ý muốn tính 0!
        long expected = 1; // ý muốn là hàm n! = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); // ý nói rằng hàm chạy ra mấy, invoke, call
        
        // so sánh giữa expected vs actual
        System.out.println(n +"! -> expected: " + expected +
                            " | actual = " + actual);
        
        // test case #2 - N = 1 -> xem chi tiết mô tả ở dưới
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n +"! -> expected: " + expected +
                            " | actual = " + actual);
        
        // test case #3 - N = 5 -> xem chi tiết mô tả ở dưới      
        System.out.println("5! -> expected: 120" +
                            " | actual = " + MathUtility.getFactorial(5));
    }
    
    // test case #3: verify getFactorial(with n = 5)
    // steps/ procedures:
    //          1. Give n = 5
    //          2. Call/ invoke getFactorial(n = 5)
    // expected result:
    //          the method must return 120 in case of 5!
    // status: Passed | Failed
    
    // test case #2: verify getFactorial(with n = 1)
    // steps/ procedures:
    //          1. Give n = 1
    //          2. Call/ invoke getFactorial(n = 1)
    // expected result:
    //          the method must return 1 in case of 1!
    // status: Passed | Failed
    
    // mình la dev, mình phải test code của mình nhon trước đã 
    // muốn test code(dev) hay test app (QC/Tester) thì cần phải chuẩn bị
    // test case: tình huống kiểm thử, trường hợp kiểm thử - cách ta
    //            kiểm thử trong 1 ngữ cảnh nào đó - bàn về bộ data
    // 1 test case có cấu trúc như sau:
    // id | description | steps/ procedures | expected result | status(pass/failed)
    
    // dev em muốn kiểm thử coi hàm chính em viết getFactorial() đúng hay sai
    // thì em phải thiết kế các test case
    
    // test case #1: Verify getFactorial(with n = 0)
    // steps-procedures: [các bước run app để test]
    //          1. Given n = 0
    //          2. Execute/Call/Invoke function getFactorial(0)
    
    // Expected Result: the function must return 1(standing for 0! = 1)
    // Status: Passed, or Failed, ai biết, chờ run app/ hàm cái đã!!!
    // run hàm, run app, đưa test data vào, dc gọi là test run
}
