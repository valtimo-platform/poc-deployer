package com.valtimo.deployer

data class EnvironmentConfig(
    val name: String,
    val url: String,
    val artifacts: List<ArtifactInfo> = emptyList()
)
