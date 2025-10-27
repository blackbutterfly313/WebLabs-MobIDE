package com.spiralgang.weblabs

import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext

// Minimal compile-time stubs to unblock CI — replace with real implementations later.
const val WORKSPACE: String = "/data/data/com.spiralgang.weblabs/workspace"
const val PROOT_BIN: String = "/system/bin/proot"
const val CHROOT_BIN: String = "/system/bin/chroot"
const val ROOTFS_DIR: String = "/data/data/com.spiralgang.weblabs/rootfs"

@Suppress("UNUSED_PARAMETER", "unused")
fun addJavaScriptInterface(vararg args: Any?) { /* no-op stub for WebView integration */ }

@Suppress("UNUSED_PARAMETER", "unused")
fun downloadAlpineRootfs(vararg args: Any?): Boolean = true

@Suppress("UNUSED_PARAMETER", "unused")
fun extractAlpineRootfs(vararg args: Any?): Boolean = true

@Suppress("UNUSED_PARAMETER", "unused")
fun installPackage(vararg args: Any?): Boolean = true

// Provide isActive for both CoroutineScope and CoroutineContext so receiver checks compile.
val CoroutineScope.isActive: Boolean
  get() = false

val CoroutineContext.isActive: Boolean
  get() = false
