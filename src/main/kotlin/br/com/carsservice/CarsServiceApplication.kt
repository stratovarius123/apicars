package br.com.carsservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class CarsServiceApplication

fun main(args: Array<String>) {
	runApplication<CarsServiceApplication>(*args)
}
