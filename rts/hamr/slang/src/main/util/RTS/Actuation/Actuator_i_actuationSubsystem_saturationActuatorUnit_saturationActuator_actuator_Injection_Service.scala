// #Sireum
package RTS.Actuation

import org.sireum._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

@msig trait Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_Injection_Provider {
  def pre_receiveInput(): Unit
}

object Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_Injection_Service {

  var providers: MSZ[Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_Injection_Provider] = MSZ()

  def register(provider: Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_Injection_Provider): Unit = {
    providers = providers :+ provider
  }

  def pre_receiveInput(): Unit = {
    for (provider <- providers) {
      provider.pre_receiveInput()
    }
  }
}