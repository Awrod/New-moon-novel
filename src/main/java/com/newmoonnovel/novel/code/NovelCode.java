package com.newmoonnovel.novel.code;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

public class NovelCode {
    public static void main(String[] args) {
        // 需要构建一个 代码自动生成器 对象
        AutoGenerator autoGenerator = new AutoGenerator();
        // 配置策略
        // 1、全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        globalConfig.setOutputDir(projectPath+"/src/main/java");//输出地址
        globalConfig.setAuthor("longw");//作者名称
        globalConfig.setOpen(true);//完成后是否打开任务管理器
        globalConfig.setFileOverride(false);//是否覆盖
        globalConfig.setServiceName("%sService"); // 去Service的I前缀
        globalConfig.setIdType(IdType.ID_WORKER);//设置id类型为默认全局唯一id
        globalConfig.setDateType(DateType.ONLY_DATE);
        globalConfig.setSwagger2(true);//生成api
        autoGenerator.setGlobalConfig(globalConfig);

        //2、设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/new_moon_novel?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("qwer123321");
        dsc.setDbType(DbType.MYSQL);
        autoGenerator.setDataSource(dsc);

        //3、包的配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("user");//设置模块名
        pc.setParent("com.newmoonnovel.novel");//设置主文件名
        pc.setEntity("pojo");//设置实体类包名
        pc.setMapper("mapper");//设置持久层名称
        pc.setService("service");//设置业务层名称
        pc.setController("controller");//设置控制层名称
        autoGenerator.setPackageInfo(pc);

        //4、策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("user"); // 设置要映射的表名,可多个以逗号分隔
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true); // 自动lombok；
        strategy.setLogicDeleteFieldName("DelTag");//逻辑删除
        // 自动填充配置
        TableFill gmtCreate = new TableFill("GmtCreate", FieldFill.INSERT);
        TableFill gmtModified = new TableFill("GmtModified", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtModified);
        strategy.setTableFillList(tableFills);
        // 乐观锁
        strategy.setVersionFieldName("version");
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true); //localhost:8080/hello_id_2 驼峰转连字符
        autoGenerator.setStrategy(strategy);
        autoGenerator.execute(); //执行
    }
}
