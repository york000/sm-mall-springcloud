package org.york.sm.mall.goods.controller;

import org.springframework.web.bind.annotation.*;
import org.york.sm.mall.entity.Result;
import org.york.sm.mall.entity.StatusCode;
import org.york.sm.mall.goods.model.Brand;
import org.york.sm.mall.goods.service.BrandService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: BrandController
 * @Description: TODO
 * @Create by: zhouyang
 * @Date: 2021/1/15 10:54 下午
 */
@RestController
@RequestMapping(value = "/brand")
@CrossOrigin //解决跨域问题
public class BrandController {

    @Resource
    private BrandService brandService;


    /**
     * 查询所有品牌信息
     *
     * @return
     */
    @GetMapping(value = "/queryall")
    public Result<List<Brand>> queryAll() {
        List<Brand> brandList = brandService.findAll();
        if (null != brandList && brandList.size() > 0) {
            return new Result<>(true, StatusCode.OK, "查询品牌信息成功", brandList);
        } else {
            return new Result<>(true, StatusCode.ERROR, "查询品牌信息失败", new ArrayList<Brand>());
        }
    }

    /**
     * 查询品牌信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/id")
    public Result<Brand> findBydId(@PathVariable("id") Integer id) {
        Brand brand = brandService.findBydId(id);
        if (null != brand) {
            return new Result<>(true, StatusCode.OK, "查询品牌信息成功", brand);
        } else {
            return new Result<>(true, StatusCode.ERROR, "查询品牌信息失败", new ArrayList<Brand>());
        }
    }

    /**
     * @param brand
     * @return
     */
    @PostMapping(value = "/add")
    public Result add(@RequestBody Brand brand) {
        int add = brandService.add(brand);
        if (add > 0) {
            return new Result<>(true, StatusCode.OK, "品牌增加成功");
        } else {
            return new Result<>(true, StatusCode.OK, "品牌增加失败");
        }
    }

    /**
     * 品牌更新成功
     *
     * @param brand
     * @param id
     * @return
     */
    @PutMapping(value = "/{id}")
    public Result update(@RequestBody Brand brand, @PathVariable("id") Integer id) {
        brand.setId(id);
        int update = brandService.update(brand);
        if (update > 0) {
            return new Result<>(true, StatusCode.OK, "品牌更新成功");
        } else {
            return new Result<>(true, StatusCode.OK, "品牌更新失败");
        }
    }

    /**
     * @param id
     * @return
     */
    @DeleteMapping(value = "/id")
    public Result delete(@PathVariable("id") Integer id) {
        int id1 = brandService.deleteId(id);
        if (id1 > 0) {
            return new Result<>(true, StatusCode.OK, "品牌删除成功");
        } else {
            return new Result<>(true, StatusCode.OK, "品牌删除失败");
        }
    }
}
