package com.spiralgang.weblabs

// Temporary compile-time stubs to satisfy CI until proper implementations are added.
// Replace these with the real implementations (or proper imports) later.

const val WORKSPACE: String = "/data/data/com.spiralgang.weblabs/workspace"
const val PROOT_BIN: String = "/system/bin/proot"
const val CHROOT_BIN: String = "/system/bin/chroot"
const val ROOTFS_DIR: String = "/data/data/com.spiralgang.weblabs/rootfs"

@Suppress("UNUSED_PARAMETER")
fun addJavaScriptInterface(vararg args: Any?) {
    // stub: real code should call WebView.addJavascriptInterface(obj, name)
}

@Suppress("UNUSED_PARAMETER")
fun downloadAlpineRootfs(vararg args: Any?): Boolean = false

@Suppress("UNUSED_PARAMETER")
fun extractAlpineRootfs(vararg args: Any?): Boolean = false

@Suppress("UNUSED_PARAMETER")
fun installPackage(vararg args: Any?): Boolean = false

// Provide a broad isActive extension so code that checks coroutine-like receivers compiles.
// This is intentionally permissive; replace with proper CoroutineScope/Job checks later.
@Suppress("EXTENSION_SHADOWED_BY_MEMBER", "unused")
val Any?.isActive: Boolean
    get() = false

