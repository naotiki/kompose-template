package me.naotiki

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform