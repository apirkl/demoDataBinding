package com.jamfschool

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/test")
    fun index(filterExample: FilterExample): String {
        return filterExample.toString()
    }
}

data class FilterExample(@RequestParam(required = false) var testMap: Map<String,String>? = null)