package com.valtimo.deployer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestClient

@RestController
class ServiceController(
    private val appConfig: AppConfig
) {

    @GetMapping("/api/services")
    fun getServices(): List<ServiceInstanceConfig> {
        return appConfig.serviceInstances
    }

    @GetMapping("/api/service")
    fun getServices(
        @RequestParam id: String
    ): ServiceInstanceConfig {
        return appConfig.serviceInstances.first { it.id == id.toInt() }
    }

    private fun restClient(url: String): RestClient {
        return RestClient.builder()
            .baseUrl(url)
            .build()
    }

}
