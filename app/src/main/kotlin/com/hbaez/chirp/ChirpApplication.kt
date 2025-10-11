package com.hbaez.chirp

import com.hbaez.chat.Test
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChirpApplication

fun main(args: Array<String>) {
    Test()
	runApplication<ChirpApplication>(*args)
}
