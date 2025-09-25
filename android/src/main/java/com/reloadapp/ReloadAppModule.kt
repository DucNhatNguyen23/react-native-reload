package com.reloadapp

import android.content.Context
import android.content.Intent
import android.util.Log
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = ReloadAppModule.NAME)
class ReloadAppModule(reactContext: ReactApplicationContext) :
  NativeReloadAppSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

override fun reloadApp(promise: Promise) {
  val context: Context = reactApplicationContext

  try {
    val packageManager = context.packageManager
    val intent = packageManager.getLaunchIntentForPackage(context.packageName)
    intent?.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

    val mainIntent = Intent.makeRestartActivityTask(intent?.component)
    context.startActivity(mainIntent)

    promise.resolve("Reload triggered") 

    Runtime.getRuntime().exit(0)
  } catch (e: Exception) {
    promise.reject("RELOAD_FAILED", e)
  }
}

  companion object {
    const val NAME = "ReloadApp"
  }
}
