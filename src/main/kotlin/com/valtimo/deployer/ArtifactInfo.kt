package com.valtimo.deployer

import java.time.LocalDateTime

data class ArtifactInfo(
    val name: String,
    val deployedOn: LocalDateTime,
    val deployed: Boolean = true
)
