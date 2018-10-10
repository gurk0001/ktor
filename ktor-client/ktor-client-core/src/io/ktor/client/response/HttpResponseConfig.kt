package io.ktor.client.response

import kotlinx.io.charsets.*

open class HttpResponseConfig {
    /**
     * Default [Charset] for response content if not specified, the initial value is ISO_8859_1.
     * Use UTF_8 as fallback.
     */
    var defaultCharset: Charset = try {
        Charset.forName("ISO_8859_1")
    } catch (_: Throwable) {
        Charsets.UTF_8
    }
}
