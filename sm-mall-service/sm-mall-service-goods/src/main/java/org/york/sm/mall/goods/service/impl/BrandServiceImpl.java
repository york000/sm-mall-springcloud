package org.york.sm.mall.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.york.sm.mall.goods.mapper.BrandMapper;
import org.york.sm.mall.goods.model.Brand;
import org.york.sm.mall.goods.service.BrandService;
import tk.mybatis.mapper.entity.Example;

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

    /**
     * 根据品牌查询
     *
     * @param brand
     * @return
     */
    @Override
    public List<Brand> findList(Brand brand) {
        Example example = creatExample(brand);
        return brandMapper.selectByExample(brand);
    }

    /**
     * 分页查询
     *
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<Brand> findPage(Integer page, Integer size) {
        //分页
        PageHelper.startPage(page, size);
        List<Brand> brands = brandMapper.selectAll();
        return new PageInfo<Brand>(brands);
    }

    @Override
    public PageInfo<Brand> findPage(Brand brand, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        Example example = creatExample(brand);
        List<Brand> brands = brandMapper.selectByExample(example);
        return new PageInfo<Brand>(brands);
    }


    /**
     * 条件构造器
     *
     * @param brand
     */
    public Example creatExample(Brand brand) {
        Example example = new Example(Brand.class);
        Example.Criteria criteria = example.createCriteria();
        if (brand != null) {
            if (!StringUtils.isEmpty(brand.getName())) {
                criteria.andLike("name", "%" + brand.getName() + "%");
            } else if (!StringUtils.isEmpty(brand.getLetter())) {
                criteria.andEqualTo("letter", brand.getLetter());
            }
        }
        return example;
    }

}
