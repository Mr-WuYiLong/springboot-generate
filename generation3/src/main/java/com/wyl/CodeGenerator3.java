package com.wyl;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @Description 支持 mybatis-plus-generator 3.5.1 及其以上版本
 * @Author WuYiLong
 * @Date 2022/9/8 9:33
 */
public class CodeGenerator3 {

    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/blog?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
        String username = "root";
        String password = "123456";
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("wuyilong") // 设置作者

                            .outputDir("E:\\company\\java\\project\\springboot-generation\\generation3\\src\\main\\java")
                            .disableOpenDir(); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.wyl")
                            .pathInfo(Collections.singletonMap(OutputFile.xml,"E:\\company\\java\\project\\springboot-generation\\generation3\\src\\main\\resources\\mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude("e_enterprise") // 设置需要生成的表名
                            .addTablePrefix("b_","e_")
                            .entityBuilder().enableLombok().enableRemoveIsPrefix().enableActiveRecord().enableTableFieldAnnotation().fileOverride()
                            .mapperBuilder().enableBaseResultMap().enableBaseColumnList().enableMapperAnnotation().fileOverride()
                            .serviceBuilder().formatServiceFileName("%sService").fileOverride()
                            .controllerBuilder().enableRestStyle().fileOverride();
                })
                .templateConfig(builder->{
                    builder.entity("/templates/entity.java")
                            .mapper("/templates/mapper.java")
                            .xml("/templates/mapper.xml")
                            .service("/templates/service.java")
                            .serviceImpl("/templates/serviceImpl.java")
                            .controller("/templates/controller.java");
                })
                .injectionConfig(builder->{
                    builder.fileOverride();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }

}
