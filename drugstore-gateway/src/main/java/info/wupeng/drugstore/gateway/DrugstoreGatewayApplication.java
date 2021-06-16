package info.wupeng.drugstore.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: 启动类
 * @author: wupeng
 * @create: 2021-06-16 17:51
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication()
public class DrugstoreGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrugstoreGatewayApplication.class, args);
	}
}
