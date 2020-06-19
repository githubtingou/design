package com.ting.design.cas;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * cas配置类
 *
 * @author lishuang
 * @date 2020/06/19
 */
@Component
@ConfigurationProperties(prefix = "cas")
public class CasConfigDto {
    private String serverUrlPrefix;
}
