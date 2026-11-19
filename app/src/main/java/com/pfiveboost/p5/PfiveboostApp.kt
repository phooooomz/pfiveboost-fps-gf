// app/src/main/java/com/pfiveboost/p5/PfiveboostApp.kt
package com.pfiveboost.p5

import android.app.Application
import com.pfiveboost.p5.telemetry.CapabilityReporter

/**
 * Process entry point. Its only job is to give the opt-in capability reporter an application
 * context, because the shell executor that feeds it has no context of its own.
 */
class PfiveboostApp : Application() {
    override fun onCreate() {
        super.onCreate()
        CapabilityReporter.init(this)
    }
}
