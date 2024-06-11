// #Sireum
package isolette.Monitor

import org.sireum._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

@msig trait Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Injection_Provider {
  def pre_receiveInput(): Unit
}

object Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Injection_Service {

  var providers: MSZ[Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Injection_Provider] = MSZ()

  def register(provider: Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Injection_Provider): Unit = {
    providers = providers :+ provider
  }

  def pre_receiveInput(): Unit = {
    for (provider <- providers) {
      provider.pre_receiveInput()
    }
  }
}