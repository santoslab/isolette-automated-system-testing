// #Sireum

package isolette.Regulate

import org.sireum._
import art._
import isolette._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_EntryPoint_Companion {

  var last_api_regulator_mode: Option[Isolette_Data_Model.Regulator_Mode.Type] = None()

  /** get the value of outgoing data port regulator_mode.  If a 'fresh' value wasn't sent
    * during the last dispatch then return last_api_regulator_mode.get.
    * Note: this requires outgoing data ports to be initialized during the
    * initialization phase or prior to system testing.
    */
  def get_api_regulator_mode: Isolette_Data_Model.Regulator_Mode.Type = {
    Art.observeOutPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.operational_api.regulator_mode_Id) match {
      case Some(Isolette_Data_Model.Regulator_Mode_Payload(value)) =>
        last_api_regulator_mode = Some(value)
        return value
      case _ if last_api_regulator_mode.isEmpty =>
        assert(F, "No value found on outgoing data port regulator_mode.\n                  Note: values placed during the initialization phase will persist across dispatches")
        halt("No value found on outgoing data port regulator_mode.\n                  Note: values placed during the initialization phase will persist across dispatches")
      case _ => return last_api_regulator_mode.get
    }
  }
  var preStateContainer_wL: Option[Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS(
        lastRegulatorMode = isolette.Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.lastRegulatorMode,
        api_regulator_mode = get_api_regulator_mode)

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeInitialisePostState(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(
        In_lastRegulatorMode = isolette.Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.lastRegulatorMode, 
        api_current_tempWstatus = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.operational_api.current_tempWstatus_Id).get.asInstanceOf[Isolette_Data_Model.TempWstatus_impl_Payload].value, 
        api_interface_failure = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.operational_api.interface_failure_Id).get.asInstanceOf[Isolette_Data_Model.Failure_Flag_impl_Payload].value, 
        api_internal_failure = Art.observeInPortVariable(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.operational_api.internal_failure_Id).get.asInstanceOf[Isolette_Data_Model.Failure_Flag_impl_Payload].value))

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeComputePreState(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS(
        lastRegulatorMode = isolette.Regulate.Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode.lastRegulatorMode,
        api_regulator_mode = get_api_regulator_mode)

    // the rest can now be performed via a different thread
    isolette.runtimemonitor.RuntimeMonitor.observeComputePrePostState(Arch.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode.id, isolette.runtimemonitor.ObservationKind.isolette_single_sensor_Instance_thermostat_regulate_temperature_manage_regulator_mode_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}