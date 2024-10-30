package com.valtimo.deployer

data class ServiceInstanceConfig(
    val id: Int,
    val name: String,
    val environments: Map<OtapEnvironment, EnvironmentConfig>
)
