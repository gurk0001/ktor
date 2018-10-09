package io.ktor.http

/**
 * Set `Content-Type` header
 */
fun HeadersBuilder.contentType(contentType: ContentType): Unit = set(HttpHeaders.ContentType, contentType.toString())

/**
 * Set `Content-Length` header
 */
fun HeadersBuilder.contentLength(length: Long): Unit = set(HttpHeaders.ContentLength, length.toString())

/**
 * Set `E-Tag` header
 */
fun HeadersBuilder.etag(entityTag: String): Unit = set(HttpHeaders.ETag, entityTag)
