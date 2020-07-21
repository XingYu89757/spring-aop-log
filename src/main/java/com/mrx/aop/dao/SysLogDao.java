package com.mrx.aop.dao;

import com.mrx.aop.domain.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SysLogDao {
    void saveSysLog(SysLog sysLog);
    SysLog selectlog(int id);
}
