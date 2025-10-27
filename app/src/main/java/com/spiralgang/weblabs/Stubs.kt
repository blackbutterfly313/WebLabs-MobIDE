package com.spiralgang.weblabs

// Temporary, minimal compile-time stubs to unblock CI. Replace with real implementations later.

const val WORKSPACE: String = "/data/data/com.spiralgang.weblabs/workspace"
const val PROOT_BIN: String = "/system/bin/proot"
const val CHROOT_BIN: String = "/system/bin/chroot"
const val ROOTFS_DIR: String = "/data/data/com.spiralgang.weblabs/rootfs"

@Suppress("UNUSED_PARAMETER")
fun addJavaScriptInterface(vararg args: Any?) { /* stub for WebView.addJavascriptInterface */ }

@Suppress("UNUSED_PARAMETER")
fun downloadAlpineRootfs(vararg args: Any?): Boolean = false

@Suppress("UNUSED_PARAMETER")
fun extractAlpineRootfs(vararg args: Any?): Boolean = false

@Suppress("UNUSED_PARAMETER")
fun installPackage(vararg args: Any?): Boolean = false

// Very permissive isActive so mismatched receiver checks compile. Replace with proper CoroutineScope/Context checks.
@Suppress("EXTENSION_SHADOWED_BY_MEMBER", "unused")
val Any?.isActive: Boolean
  get() = false
