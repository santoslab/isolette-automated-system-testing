// #Sireum

package isolette.Devices

import org.sireum._
import isolette._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// containers for the pre and post state values of ports and state variables

@sig trait Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container extends art.DataContent {
  def api_heat_control: Isolette_Data_Model.On_Off.Type
}

// container for incoming ports
@datatype class Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P (
  val api_heat_control: Isolette_Data_Model.On_Off.Type) extends Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container

// container for incoming ports and state variables
@datatype class Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS (
  val api_heat_control: Isolette_Data_Model.On_Off.Type) extends Heat_Source_impl_heat_source_cpi_heat_controller_PreState_Container

@sig trait Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container extends art.DataContent {
  def api_heat_out: Isolette_Environment.Heat.Type
}

// container for outgoing ports
@datatype class Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P (
  val api_heat_out: Isolette_Environment.Heat.Type) extends Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container

// container for outgoing ports and state variables
@datatype class Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS (
  val api_heat_out: Isolette_Environment.Heat.Type) extends Heat_Source_impl_heat_source_cpi_heat_controller_PostState_Container