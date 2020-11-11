package com.github.wpanas.geo.es

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GeoEsApplication

fun main(args: Array<String>) {
	runApplication<GeoEsApplication>(*args)
}
