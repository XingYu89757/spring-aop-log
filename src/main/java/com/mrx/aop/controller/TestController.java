package com.mrx.aop.controller;

import com.mrx.aop.annotation.Log;
import com.mrx.aop.domain.SysLog;
import com.mrx.aop.service.SysLogService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/7/20 9:44
 * @Version 1.0
 */
@RestController
public class TestController {

    @Autowired
    SysLogService sysLogService;

    @Log("执行方法一")
    @GetMapping("/one")
    public void methodOne(String name) {
        System.out.println("切面执行时间1");
        sysLogService.selectlog(123);
        System.out.println("切面执行时间2");
    }

    @Log("执行方法二")
    @GetMapping("/two")
    public void methodTwo() throws InterruptedException {
        Thread.sleep(2000);
    }

    //@Log("执行方法三")
    @GetMapping("/three")
    public SysLog methodThree(@Param(value = "id") int id) {
        SysLog selectlog = sysLogService.selectlog(id);
        return selectlog;
    }
}