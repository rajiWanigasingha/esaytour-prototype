package org.prototype.esaytour

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform