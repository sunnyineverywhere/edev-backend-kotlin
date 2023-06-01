package com.edev.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController {
    @GetMapping
    fun test() : String {
        return "와랄라랄라"
    }
}