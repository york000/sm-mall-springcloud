package org.york.sm.mall.goods.service.impl;

import org.springframework.stereotype.Service;
import org.york.sm.mall.goods.mapper.BrandMapper;
import org.york.sm.mall.goods.model.Brand;
import org.york.sm.mall.goods.service.BrandService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhouyang
 * @ClassName: BrandServiceImpl
 * @Description: TODO
 * @Create by: zhouyang
 * @Date: 2021/1/15 10:52 下午
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandMapper brandMapper;

    /**
     * 品牌查询
     *
     * @return
     */
    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }

    @Override
    public Brand findBydId(Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Brand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int update(Brand brand) {
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteId(Integer id) {
        return brandMapper.deleteByPrimaryKey(id);

    }
}
