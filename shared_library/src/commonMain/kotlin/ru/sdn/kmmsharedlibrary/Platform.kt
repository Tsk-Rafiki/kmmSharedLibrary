package ru.sdn.kmmsharedlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform