package com.document.demo.execption;

import com.document.demo.result.Result;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 全局捕获自定义的异常，返回格式化后的标准输出
 * 异常捕获优先级设定高于{@link GlobalExceptionHandler}
 *
 * @see AwesomeException
 * @see GlobalExceptionHandler
 *
 * Created by Nexus on 2017/2/9.
 */
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CustomExceptionHandler {

//    @Value("${debug}")
//    private boolean isDebug;

    @ExceptionHandler(AwesomeException.class)
    @ResponseBody
    public Result handleError(HttpServletRequest req, HttpServletResponse rsp, AwesomeException ex) {
        return new Result(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, ex.getMessage());
    }


    @ExceptionHandler({HttpMessageNotReadableException.class,
            ServletRequestBindingException.class, MethodArgumentTypeMismatchException.class})
    @ResponseBody
    public Result handleError(HttpServletRequest req,
                              HttpServletResponse rsp,
                              Exception ex) {
        return new Result(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, ex.getMessage());
    }

}
