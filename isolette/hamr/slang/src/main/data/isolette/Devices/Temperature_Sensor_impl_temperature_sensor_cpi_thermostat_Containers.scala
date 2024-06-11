// #Sireum

package isolette.Devices

import org.sireum._
import isolette._
import isolette.util.Container

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// containers for the pre and post state values of ports and state variables

@sig trait Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container extends Container {
  def api_air: Isolette_Data_Model.PhysicalTemp_impl
}

// container for incoming ports
@datatype class Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P (
  val api_air: Isolette_Data_Model.PhysicalTemp_impl) extends Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container

// container for incoming ports and state variables
@datatype class Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS (
  val api_air: Isolette_Data_Model.PhysicalTemp_impl) extends Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container

@sig trait Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container extends Container {
  def api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl
}

// container for outgoing ports
@datatype class Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P (
  val api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl) extends Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container

// container for outgoing ports and state variables
@datatype class Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS (
  val api_current_tempWstatus: Isolette_Data_Model.TempWstatus_impl) extends Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container