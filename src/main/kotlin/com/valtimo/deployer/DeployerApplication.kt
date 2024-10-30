package com.valtimo.deployer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(AppConfig::class)
class DeployerApplication

fun main(args: Array<String>) {
    runApplication<DeployerApplication>(*args)
}
