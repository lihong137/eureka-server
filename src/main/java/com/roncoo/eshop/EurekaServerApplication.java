package com.roncoo.eshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
