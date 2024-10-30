package com.valtimo.deployer

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import java.time.LocalDateTime

@Configuration
@ConfigurationProperties(prefix = "service-instances")
class AppConfig {
    var serviceInstances: List<ServiceInstanceConfig> = mutableListOf(
        ServiceInstanceConfig(
            id = 1,
            name = "Municipality of Den Hague - Algemeen",
            environments = mapOf(
                OtapEnvironment.O to EnvironmentConfig(
                    name = "Municipality of Den Hague - Development",
                    url = "http://localhost:8080",
                    artifacts = listOf(
                        ArtifactInfo(
                            name = "Terugbelnotitie:0.9.1",
                            deployedOn = LocalDateTime.now().minusWeeks(20).minusDays(1).minusMinutes(434)
                        ),
                        ArtifactInfo(
                            name = "Terugbelnotitie:0.9.2",
                            deployedOn = LocalDateTime.now().minusWeeks(19).minusDays(2).minusMinutes(444)
                        ),
                        ArtifactInfo(
                            name = "Terugbelnotitie:1.0.0",
                            deployedOn = LocalDateTime.now().minusWeeks(15).minusDays(3).minusMinutes(454)
                        ),
                        ArtifactInfo(
                            name = "Interventieverzoek:0.8.1",
                            deployedOn = LocalDateTime.now().minusWeeks(2).minusDays(1).minusMinutes(434)
                        ),
                        ArtifactInfo(
                            name = "Interventieverzoek:0.9.2",
                            deployedOn = LocalDateTime.now().minusWeeks(1).minusDays(2).minusMinutes(444)
                        )
                    )
                ),
                OtapEnvironment.T to EnvironmentConfig(
                    name = "Municipality of Den Hague - Test",
                    url = "http://localhost:8081",
                    artifacts = listOf(
                        ArtifactInfo(
                            name = "Terugbelnotitie:0.9.1",
                            deployedOn = LocalDateTime.now().minusWeeks(20).minusDays(1).minusMinutes(534)
                        ),
                        ArtifactInfo(
                            name = "Terugbelnotitie:0.9.2",
                            deployedOn = LocalDateTime.now().minusWeeks(19).minusDays(1).minusMinutes(544)
                        ),
                        ArtifactInfo(
                            name = "Terugbelnotitie:1.0.0",
                            deployedOn = LocalDateTime.now().minusWeeks(15).minusDays(1).minusMinutes(554)
                        )
                    )
                ),
                OtapEnvironment.A to EnvironmentConfig(
                    name = "Municipality of Den Hague - Acceptance",
                    url = "http://localhost:8082",
                    artifacts = listOf(
                        ArtifactInfo(
                            name = "Terugbelnotitie:0.9.1",
                            deployedOn = LocalDateTime.now().minusWeeks(10).minusDays(1).minusMinutes(634)
                        ),
                        ArtifactInfo(
                            name = "Terugbelnotitie:0.9.2",
                            deployedOn = LocalDateTime.now().minusWeeks(9).minusDays(1).minusMinutes(638)
                        ),
                        ArtifactInfo(
                            name = "Terugbelnotitie:1.0.0",
                            deployedOn = LocalDateTime.now().minusWeeks(5).minusDays(1).minusMinutes(684)
                        )
                    )
                ),
                OtapEnvironment.P to EnvironmentConfig(
                    name = "Municipality of Den Hague - Production",
                    url = "http://localhost:8083",
                    artifacts = listOf(
                        ArtifactInfo(
                            name = "Terugbelnotitie:0.9.1",
                            deployedOn = LocalDateTime.now().minusWeeks(10).minusDays(1).minusMinutes(734)
                        ),
                        ArtifactInfo(
                            name = "Terugbelnotitie:0.9.2",
                            deployedOn = LocalDateTime.now().minusWeeks(9).minusDays(1).minusMinutes(734)
                        ),
                        ArtifactInfo(
                            name = "Terugbelnotitie:1.0.0",
                            deployedOn = LocalDateTime.now().minusWeeks(5).minusDays(1).minusMinutes(734),
                            deployed = false
                        )
                    )
                )
            )
        ),
        ServiceInstanceConfig(
            id = 2,
            name = "Municipality of Den Hague - Sociaal Domein",
            environments = mapOf(
                OtapEnvironment.O to EnvironmentConfig(
                    name = "Municipality of Den Hague- Development",
                    url = "http://localhost:8084",
                    artifacts = listOf(
                        ArtifactInfo(
                            name = "Waardering-mantelzorgers:0.9.1",
                            deployedOn = LocalDateTime.now().minusWeeks(30).minusDays(1).minusMinutes(834)
                        ),
                        ArtifactInfo(
                            name = "Waardering-mantelzorgers:0.9.2",
                            deployedOn = LocalDateTime.now().minusWeeks(29).minusDays(1).minusMinutes(834)
                        ),
                        ArtifactInfo(
                            name = "Waardering-mantelzorgers:1.0.0",
                            deployedOn = LocalDateTime.now().minusWeeks(25).minusDays(1).minusMinutes(834)
                        )
                    )
                ),
                OtapEnvironment.T to EnvironmentConfig(
                    name = "Municipality of Den Hague- Test",
                    url = "http://localhost:8085",
                    artifacts = listOf(
                        ArtifactInfo(
                            name = "Waardering-mantelzorgers:0.9.1",
                            deployedOn = LocalDateTime.now().minusWeeks(30).minusDays(1).minusMinutes(834)
                        ),
                        ArtifactInfo(
                            name = "Waardering-mantelzorgers:0.9.2",
                            deployedOn = LocalDateTime.now().minusWeeks(29).minusDays(1).minusMinutes(834)
                        )
                    )
                ),
                OtapEnvironment.A to EnvironmentConfig(
                    name = "Municipality of Den Hague- Acceptance",
                    url = "http://localhost:8086"
                ),
                OtapEnvironment.P to EnvironmentConfig(
                    name = "Municipality of Den Hague- Production",
                    url = "http://localhost:8087"
                )
            )
        )
    )
}
