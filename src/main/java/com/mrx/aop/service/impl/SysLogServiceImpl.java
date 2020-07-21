package com.mrx.aop.service.impl;

import com.mrx.aop.dao.SysLogDao;
import com.mrx.aop.domain.SysLog;
import com.mrx.aop.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName SysLogServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/7/20 10:01
 * @Version 1.0
 */
@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    SysLogDao sysLogDao;

    @Override
    public void saveSysLog(SysLog sysLog) {
        sysLogDao.saveSysLog(sysLog);
    }

    @Override
    public SysLog selectlog(int id) {
        SysLog selectlog = sysLogDao.selectlog(id);
        return selectlog;
    }
}
