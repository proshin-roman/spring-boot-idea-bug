package org.proshin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
open class LiquibaseFailureApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(LiquibaseFailureApplication::class.java, *args)
        }
    }
}
