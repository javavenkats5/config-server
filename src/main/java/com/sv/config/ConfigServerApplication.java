package com.sv.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
/**
 * 
 * @author venkat
 *
 */
public class ConfigServerApplication {

	@Value("${server.port:8088}")
	private int port;

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

	/*
	 * @Bean
	 * 
	 * @Profile({ "dev", "cloud-qa" })
	 * 
	 * @Autowired public EurekaInstanceConfigBean
	 * eurekaInstanceConfigBean(InetUtils inetUtils) { EurekaInstanceConfigBean
	 * config = new EurekaInstanceConfigBean(inetUtils); AmazonInfo info =
	 * AmazonInfo.Builder.newBuilder().autoBuild("eureka");
	 * config.setHostname(info.get(AmazonInfo.MetaDataKey.localHostname));
	 * config.setIpAddress(info.get(AmazonInfo.MetaDataKey.localIpv4));
	 * config.setNonSecurePort(port); config.setDataCenterInfo(info); return
	 * config; }
	 */
}
