package com.mooc.zhang.service;

import com.mooc.zhang.domain.Test;
import com.mooc.zhang.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhangjiahao
 * Date: 2022/5/15
 * Time: 10:39 上午
 * Description: No Description
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
