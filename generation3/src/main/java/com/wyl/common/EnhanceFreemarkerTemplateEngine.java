package com.wyl.common;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.jetbrains.annotations.NotNull;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;
import java.util.Map;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

/**
 * @Description
 * @Author WuYiLong
 * @Date 2023/6/11 23:28
 */
public final class EnhanceFreemarkerTemplateEngine extends FreemarkerTemplateEngine {

    @Override
    protected void outputCustomFile(@NotNull Map<String, String> customFile, @NotNull TableInfo tableInfo, @NotNull Map<String, Object> objectMap) {
        String entityName = tableInfo.getEntityName();
        String dtoPath = this.getPathInfo(OutputFile.other);

        String path = StrUtil.subBefore(dtoPath, "/", true);
        customFile.forEach((key, value) -> {
            String s = key.toLowerCase();
            List<String> split = StrUtil.split(s, ".");
            String fileName = String.format(path + "/" +split.get(0)+File.separator+ entityName + "%s", key);
            this.outputFile(new File(fileName), objectMap, value);
        });
    }
}