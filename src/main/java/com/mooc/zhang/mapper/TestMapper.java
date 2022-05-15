package com.mooc.zhang.mapper;

import com.mooc.zhang.domain.Test;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhangjiahao
 * Date: 2022/5/15
 * Time: 10:08 上午
 * Description: No Description
 */
@Service
public interface TestMapper {

    List<Test> list();
}
