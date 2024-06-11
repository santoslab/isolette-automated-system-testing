// #Sireum

package tc.TempControlSoftwareSystem

import org.sireum._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// containers for the pre and post state values of ports and state variables

@sig trait TempControlPeriodic_p_tcproc_tempControl_PreState_Container extends art.DataContent {
  def api_currentTemp: TempSensor.Temperature_i
  def api_fanAck: CoolingFan.FanAck.Type
  def api_setPoint: TempControlSoftwareSystem.SetPoint_i
}

// container for incoming ports
@datatype class TempControlPeriodic_p_tcproc_tempControl_PreState_Container_P (
  val api_currentTemp: TempSensor.Temperature_i,
  val api_fanAck: CoolingFan.FanAck.Type,
  val api_setPoint: TempControlSoftwareSystem.SetPoint_i) extends TempControlPeriodic_p_tcproc_tempControl_PreState_Container

// container for incoming ports and state variables
@datatype class TempControlPeriodic_p_tcproc_tempControl_PreState_Container_PS (
  val In_latestFanCmd: CoolingFan.FanCmd.Type,
  val api_currentTemp: TempSensor.Temperature_i,
  val api_fanAck: CoolingFan.FanAck.Type,
  val api_setPoint: TempControlSoftwareSystem.SetPoint_i) extends TempControlPeriodic_p_tcproc_tempControl_PreState_Container

@sig trait TempControlPeriodic_p_tcproc_tempControl_PostState_Container extends art.DataContent {
  def api_fanCmd: CoolingFan.FanCmd.Type
}

// container for outgoing ports
@datatype class TempControlPeriodic_p_tcproc_tempControl_PostState_Container_P (
  val api_fanCmd: CoolingFan.FanCmd.Type) extends TempControlPeriodic_p_tcproc_tempControl_PostState_Container

// container for outgoing ports and state variables
@datatype class TempControlPeriodic_p_tcproc_tempControl_PostState_Container_PS (
  val latestFanCmd: CoolingFan.FanCmd.Type,
  val api_fanCmd: CoolingFan.FanCmd.Type) extends TempControlPeriodic_p_tcproc_tempControl_PostState_Container