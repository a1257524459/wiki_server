package com.mooc.zhang.service;

import com.mooc.zhang.domain.Ebook;
import com.mooc.zhang.domain.EbookExample;
import com.mooc.zhang.mapper.EbookMapper;
import com.mooc.zhang.req.EbookReq;
import com.mooc.zhang.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhangjiahao
 * Date: 2022/5/15
 * Time: 10:39 上午
 * Description: No Description
 */
@Service
public class EbookService {

    @Autowired
    EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        // 生成一个where条件
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        // 模糊匹配
        criteria.andNameLike("%" + req.getName() + "%");
        // 生成一个从数据库产生的list
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        // 转换为resp list
        ArrayList<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
            // 传统方式复制
            // ebookResp.setDescription("张佳浩");
            respList.add(ebookResp);
//            用util工具复制一个没太搞懂，后面用到再说吧
//            EbookResp resp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(resp);
        }
//        用util工具复制整个列表确实简单
//        return CopyUtil.copyList(ebookList, EbookResp.class);

        return respList;
    }
}
