package sh.antisla.grm.heatmanager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HeatmanagerApplication

fun main(args: Array<String>) {
    runApplication<HeatmanagerApplication>(*args)
}
