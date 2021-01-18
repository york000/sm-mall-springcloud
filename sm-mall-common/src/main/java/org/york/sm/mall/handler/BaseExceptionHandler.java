package org.york.sm.mall.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.york.sm.mall.entity.Result;
import org.york.sm.mall.entity.StatusCode;

/**
 * @author by: zhouyang
 * @name: BaseExceptionHandler
 * @Description: TODO 全局异常处理
 * @Date: 2021/1/16 10:25 下午
 */
@ControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handlerException(Exception e) {
        e.printStackTrace();
        return new Result(false, StatusCode.ERROR, e.getMessage());
    }

}
