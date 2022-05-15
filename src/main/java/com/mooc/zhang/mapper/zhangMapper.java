package com.mooc.zhang.mapper;

import com.mooc.zhang.domain.zhang;
import com.mooc.zhang.domain.zhangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface zhangMapper {
    long countByExample(zhangExample example);

    int deleteByExample(zhangExample example);

    int insert(zhang record);

    int insertSelective(zhang record);

    List<zhang> selectByExample(zhangExample example);

    int updateByExampleSelective(@Param("record") zhang record, @Param("example") zhangExample example);

    int updateByExample(@Param("record") zhang record, @Param("example") zhangExample example);
}