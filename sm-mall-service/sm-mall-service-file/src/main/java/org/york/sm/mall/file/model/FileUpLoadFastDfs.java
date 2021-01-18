package org.york.sm.mall.file.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author by: zhouyang
 * @name: FileUpLoadFastDfs
 * @Description: TODO 封装文件上传信息
 * @Date: 2021/1/18 9:36 下午
 */
@Data
public class FileUpLoadFastDfs implements Serializable {
    private static final long serialVersionUID = 6226948521277059572L;
    //文件名字
    private String name;
    //文件内容
    private byte[] content;
    //文件扩展名
    private String ext;
    //文件MD5摘要值
    private String md5;
    //文件创建作者
    private String author;


}
