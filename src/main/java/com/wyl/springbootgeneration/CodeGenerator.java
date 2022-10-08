package com.wyl.springbootgeneration;



import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description  支持 mybatis-plus-generator 3.4.0
 * @Author YiLong Wu
 * @Date {DATE} {TIME}
 */
public class CodeGenerator {

    // 表前缀
    private static final String TABLE_PREFIX = "qc_,d_,p_,t_,e_,p_,qcc_,m_";
    //表名
    private static final String TABLE_NAMES =
            "e_enterprise_shareholder,e_enterprise_out_investment,e_enterprise_main_member," +
                    "e_enterprise_change_record,e_enterprise_branch,e_enterprise_administrative_license" +
                    ",e_enterprise_credit_evaluation,e_enterprise_credit_evaluation_env,e_enterprise_tender," +
                    "e_enterprise_job,e_enterprise_im_ex_credit,e_enterprise_supplier,e_enterprise_customer,e_enterprise_finance," +
                    "e_enterprise_billboard,e_enterprise_honor,d_enterprise_features,e_enterprise_certificate,e_enterprise_soft," +
                    "e_enterprise_standard,e_enterprise_trademark,e_enterprise_judicial_case,e_enterprise_executed_person,e_enterprise_judgment_doc," +
                    "e_enterprise_abnormal_operation,e_enterprise_equity_pledge,e_enterprise_assistance,e_enterprise_share_pledge,e_enterprise_penalties," +
                    "e_enterprise_promise,e_enterprise_judicial_sale,e_enterprise_serious_violation,e_enterprise_mortgage,e_enterprise_court_announce," +
                    "e_enterprise_hear_announcement,e_enterprise_file_info,e_enterprise_land_mortgage,m_talent,t_talent";


    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();

        String projectPath = System.getProperty("user.dir");
        // 输出路径
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("wuyilong");
        gc.setDateType(DateType.ONLY_DATE);
//        gc.setFileOverride(true);
        gc.setOpen(false);
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        // gc.setSwagger2(true); 实体属性 Swagger2 注解
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
//        gc.setMapperName("%sMapper");
        gc.setMapperName("%sMapper");

        gc.setXmlName("%sMapper");
        gc.setActiveRecord(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/blog?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC&allowPublicKeyRetrieval=true");
        // dsc.setSchemaName("public");
//        dsc.setUrl("jdbc:mysql://localhost:3306/blog?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("springbootgeneration");
        pc.setParent("com.wyl");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
        @Override
        public void initMap() {
        // to do nothing
        }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
        @Override
        public String outputFile(TableInfo tableInfo) {
        // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
        return projectPath + "/src/main/resources/mapper/"
                + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
        }
        });

//        // service
//        templatePath = "/templates/service.java.ftl";
//        focList.add(new FileOutConfig(templatePath) {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                return projectPath+"/src/main/java/com/wyl/springbootgeneration/service/"+tableInfo.getServiceName()+StringPool.DOT_JAVA;
//            }
//        });
//
//        // serviceImpl
//        templatePath = "/templates/serviceImpl.java.ftl";
//        focList.add(new FileOutConfig(templatePath) {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                return projectPath+"/src/main/java/com/wyl/springbootgeneration/service/impl/"+tableInfo.getServiceImplName()+StringPool.DOT_JAVA;
//            }
//        });


        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();

        templateConfig.setXml(null);
        templateConfig.setMapper("templates/mapper.java");
        templateConfig.setEntity("templates/entity.java");
        templateConfig.setService("templates/service.java");
        templateConfig.setServiceImpl("templates/serviceImpl.java");
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //        strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
        strategy.setEntityLombokModel(true);
//        strategy.setChainModel(true);
        strategy.setEntitySerialVersionUID(true);
        strategy.setEntityTableFieldAnnotationEnable(true);
        strategy.setChainModel(true);
        strategy.setRestControllerStyle(true);

        // 公共父类
        //        strategy.setSuperControllerClass("你自己的父类控制器,没有就不用设置!");
        // 写于父类中的公共字段
//        strategy.setSuperEntityColumns("id");

        strategy.setEntityTableFieldAnnotationEnable(true);
        strategy.setInclude(TABLE_NAMES.split(","));
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(TABLE_PREFIX.split(","));

        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
