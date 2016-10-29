package br.com.richardcsantana;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author richard.santana
 */
@SpringCloudApplication
@EnableEurekaServer
public class DiscoveryApplication {

	public static void main(final String[] args) {
		SpringApplication.run(DiscoveryApplication.class, args);
	}
}
