package com.mrx.aop.service;

import com.mrx.aop.domain.SysLog;
import org.springframework.stereotype.Service;


public interface SysLogService {

    void saveSysLog(SysLog sysLog);
    SysLog selectlog(int id);
}
