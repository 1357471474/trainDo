package com.traindo.config;

import javax.jms.ConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.traindo.common.SecurityInterceptor;

/**
 * 项目配置
 * @author zfg
 * @date 2019年3月18日
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

	private final String[] notLoginInterceptPaths = { "/views/**", "/js/**","/css/**","/fonts/**","/img/**",
			"/file/upload/**" };
	private static String mImagesPath = "E:/file/upload/";	

	/**
	 * 添加拦截器 拦截除了static
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authenticationInterceptor()).addPathPatterns("/**")
				.excludePathPatterns(notLoginInterceptPaths);
	}

	@Bean
	public SecurityInterceptor authenticationInterceptor() {
		return new SecurityInterceptor();
	}

	/**
	 * 访问硬盘文件
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/file/upload/**").addResourceLocations("file:" + mImagesPath);
	}
	
	/**
	 * 消息队列pub/sub模式
	 * @param connectionFactory
	 * @return
	 */
	@Bean
	JmsListenerContainerFactory<?> myJmsListenerContainerFactory(ConnectionFactory connectionFactory){
		SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory);
		factory.setPubSubDomain(true);
		return factory;
	}
}
