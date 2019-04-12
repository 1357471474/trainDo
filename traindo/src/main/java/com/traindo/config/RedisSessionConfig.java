package com.traindo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * redish共享session配置
 * @author zfg
 * @date 2019年3月18日
 */
@Configuration  
@EnableRedisHttpSession
public class RedisSessionConfig {

}
