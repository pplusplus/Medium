package uk.co.patrickpowell.core

open class Result<T>

data class Ok<out T>(val value: T) : Result<T>
data class Err(val exception: Throwable) : Result<Nothing>