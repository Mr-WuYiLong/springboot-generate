package com.wyl;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description 支持 mybatis-plus-generator 3.5.1 及其以上版本
 * @Author WuYiLong
 * @Date 2022/9/8 9:33
 */
public class CodeGenerator3 {

    private static List<String> tableList = Arrays.asList("t_possible_relation_0");

    public static void main(String[] args) {


//        String url = "jdbc:mysql://192.168.0.46:3306/db_df_enterprise?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
//        String username = "root";
//        String password = "Boshi@888";

//        String url = "jdbc:mysql://192.168.0.54:3306/db_df_enterprise?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
//        String username = "root";
//        String password = "root_I12013#";

        String url = "jdbc:mysql://192.168.0.56:3306/db_df_possible_relation?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
        String username = "root";
        String password = "root_I12013#";

//        String url = "jdbc:mysql://192.168.0.42:3306/db_df_enterprise?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
//        String username = "root";
//        String password = "root_I12013#";

//        String url = "jdbc:mysql://192.168.0.44:3306/db_df_possible_relation?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
//        String username = "root";
//        String password = "root_I12013#";
//        String url = "jdbc:mysql://localhost:3306/blog?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
//        String username = "root";
//        String password = "123456";
//
//        String url = "jdbc:mysql://192.168.0.46:3306/db_algorithm?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
//        String username = "root";
//        String password = "Boshi@888";

//        String url = "jdbc:mysql://121.37.224.225/quchuang_zhengshi?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
//        String username = "quchuang";
//        String password = "Quchuang@888";

//        String url = "jdbc:mysql://192.168.0.95:23306/investment_bank?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
//        String username = "root";
//        String password = "123456";

//        String url = "jdbc:mysql://192.168.0.49:3306/business-platform-common?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
//        String username = "root";
//        String password = "boshikeji";

//        String url = "jdbc:mysql://192.168.0.25:3306/datacenter-patent?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8";
//        String username = "root";
//        String password = "Boshi@888";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("wuyilong") // 设置作者

//                            .outputDir("E:\\company\\java\\project\\springboot-generation\\generation3\\src\\main\\java")
                            .outputDir("/Users/yilongwu/long/git/springboot-generate/generation3/src/main/java")
                            .disableOpenDir(); // 指定输出目录

                })
                .packageConfig(builder -> {
                    builder.parent("com.wyl")
                            .pathInfo(Collections.singletonMap(OutputFile.xml,"/Users/yilongwu/long/git/springboot-generate/generation3/src/main/resources/mapper"));
//                            .pathInfo(Collections.singletonMap(OutputFile.xml,"E:\\company\\java\\project\\springboot-generation\\generation3\\src\\main\\resources\\mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tableList) // 设置需要生成的表名
                            .addTablePrefix("b_","e_","t_","d_")
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
