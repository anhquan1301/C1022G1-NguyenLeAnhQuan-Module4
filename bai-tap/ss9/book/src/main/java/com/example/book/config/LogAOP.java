package com.example.book.config;

import com.example.book.controller.BookController;
import com.example.book.model.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAOP {
    @Pointcut("execution(* com.example.book.controller.BookController.borrow(..))")
    public void loggingPerformBorrowPointCut(){}

    @Pointcut("execution(* com.example.book.controller.BookController.showList())")
    public void loggingShowAllList () {}
    int count = 0;
    @AfterReturning(pointcut = "loggingShowAllList()")
    public void handleAfterReturningLoggingShowAllList() {
        System.out.println("Tong so nguoi ghe tham thu vien:" + ++count);
        System.out.println("*******************");
    }
//    @AfterReturning(pointcut = "loggingPerformBorrowPointCut()")
//    public void handleAfterReturningPerformBorrow(JoinPoint joinPoint) {
//        Book book = ((BookController)joinPoint.getTarget()).borrow(((Integer) joinPoint.getArgs()[0]).intValue());
//        System.out.println("Sach "+ book.equals(book) + " da bi muon di 1, con lai: "
//                + book.getQuantity() +" quyen sach");
//        System.out.println("*******************");
//    }


}
