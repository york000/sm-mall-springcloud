package org.york.sm.mall.goods.service;

import com.github.pagehelper.PageInfo;
import org.york.sm.mall.goods.model.Brand;

import java.util.List;

/**
 * @author zhouyang
 * @ClassName: BrandService
 * @Description: TODO
 * @Create by: zhouyang
 * @Date: 2021/1/15 10:53 下午
 */
public interface BrandService {

    /**
     * 查询所有
     */
    List<Brand> findAll();

    /**
     * @param id
     * @return
     */
    Brand findBydId(Integer id);

    /**
     * add
     *
     * @param brand
     * @return
     */
    int add(Brand brand);

    int update(Brand brand);

    int deleteId(Integer id);

    /**
     * 根据品牌搜索
     */
    List<Brand> findList(Brand brand);

    /**
     * 条件搜索
     * @page 页码
     * @size 条数
     */
    public PageInfo<Brand> findPage(Integer page,Integer size);

    /**
     * 条件搜索
     * @page 页码
     * @size 条数
     */
    public PageInfo<Brand> findPage(Brand brand,Integer page,Integer size);





















}









