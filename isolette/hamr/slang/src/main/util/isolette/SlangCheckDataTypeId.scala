// #Sireum

package isolette

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Heat.scala

Interface_Interaction.scala

PhysicalTemp_impl.scala

ValueStatus.scala

TempWstatus_impl.scala

On_Off.scala

Status.scala

Temp_impl.scala

Regulator_Mode.scala

Failure_Flag_impl.scala

Monitor_Mode.scala

Base_Types.scala

Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Containers.scala

Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Containers.scala

Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_Containers.scala

Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_Containers.scala

Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Containers.scala

Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Containers.scala

Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Containers.scala

Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Containers.scala

operator_interface_thread_impl_operator_interface_oip_oit_Containers.scala

Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Containers.scala

Heat_Source_impl_heat_source_cpi_heat_controller_Containers.scala

ObservationKind.scala

Container.scala

DataContent.scala

Aux_Types.scala

Regulate_Subsystem_Containers.scala

Monitor_Subsystem_Containers.scala

*/

@enum object _artDataContent_DataTypeId {
   "_artEmpty_Id"
   "Base_TypesBits_Payload_Id"
   "Base_TypesBoolean_Payload_Id"
   "Base_TypesCharacter_Payload_Id"
   "Base_TypesFloat_32_Payload_Id"
   "Base_TypesFloat_64_Payload_Id"
   "Base_TypesFloat_Payload_Id"
   "Base_TypesInteger_16_Payload_Id"
   "Base_TypesInteger_32_Payload_Id"
   "Base_TypesInteger_64_Payload_Id"
   "Base_TypesInteger_8_Payload_Id"
   "Base_TypesInteger_Payload_Id"
   "Base_TypesString_Payload_Id"
   "Base_TypesUnsigned_16_Payload_Id"
   "Base_TypesUnsigned_32_Payload_Id"
   "Base_TypesUnsigned_64_Payload_Id"
   "Base_TypesUnsigned_8_Payload_Id"
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P_Id"
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS_Id"
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P_Id"
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS_Id"
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P_Id"
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS_Id"
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P_Id"
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS_Id"
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P_Id"
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS_Id"
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P_Id"
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS_Id"
   "Isolette_Data_ModelFailure_Flag_impl_Payload_Id"
   "Isolette_Data_ModelMonitor_Mode_Payload_Id"
   "Isolette_Data_ModelOn_Off_Payload_Id"
   "Isolette_Data_ModelPhysicalTemp_impl_Payload_Id"
   "Isolette_Data_ModelRegulator_Mode_Payload_Id"
   "Isolette_Data_ModelStatus_Payload_Id"
   "Isolette_Data_ModelTempWstatus_impl_Payload_Id"
   "Isolette_Data_ModelTemp_impl_Payload_Id"
   "Isolette_Data_ModelValueStatus_Payload_Id"
   "Isolette_EnvironmentHeat_Payload_Id"
   "Isolette_EnvironmentInterface_Interaction_Payload_Id"
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P_Id"
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS_Id"
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P_Id"
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS_Id"
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P_Id"
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS_Id"
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P_Id"
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS_Id"
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P_Id"
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS_Id"
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P_Id"
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS_Id"
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P_Id"
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS_Id"
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P_Id"
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS_Id"
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P_Id"
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS_Id"
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P_Id"
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS_Id"
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P_Id"
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS_Id"
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P_Id"
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS_Id"
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P_Id"
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS_Id"
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P_Id"
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS_Id"
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P_Id"
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS_Id"
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P_Id"
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS_Id"
   "utilEmptyContainer_Id"
}

@enum object DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_DataTypeId {
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P_Id"
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS_Id"
}

@enum object DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_DataTypeId {
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P_Id"
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS_Id"
}

@enum object DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_DataTypeId {
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P_Id"
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS_Id"
}

@enum object DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_DataTypeId {
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P_Id"
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS_Id"
}

@enum object Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_DataTypeId {
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P_Id"
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS_Id"
}

@enum object Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_DataTypeId {
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P_Id"
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS_Id"
}

@enum object MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_DataTypeId {
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P_Id"
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS_Id"
}

@enum object MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_DataTypeId {
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P_Id"
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS_Id"
}

@enum object MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_DataTypeId {
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P_Id"
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS_Id"
}

@enum object MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_DataTypeId {
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P_Id"
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS_Id"
}

@enum object MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_DataTypeId {
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P_Id"
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS_Id"
}

@enum object MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_DataTypeId {
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P_Id"
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS_Id"
}

@enum object MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_DataTypeId {
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P_Id"
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS_Id"
}

@enum object MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_DataTypeId {
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P_Id"
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS_Id"
}

@enum object RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_DataTypeId {
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P_Id"
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS_Id"
}

@enum object RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_DataTypeId {
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P_Id"
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS_Id"
}

@enum object RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_DataTypeId {
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P_Id"
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS_Id"
}

@enum object RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_DataTypeId {
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P_Id"
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS_Id"
}

@enum object RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_DataTypeId {
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P_Id"
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS_Id"
}

@enum object RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_DataTypeId {
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P_Id"
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS_Id"
}

@enum object RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_DataTypeId {
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P_Id"
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS_Id"
}

@enum object RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_DataTypeId {
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P_Id"
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS_Id"
}

@enum object utilContainer_DataTypeId {
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_P_Id"
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PostState_Container_PS_Id"
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_P_Id"
   "DevicesHeat_Source_impl_heat_source_cpi_heat_controller_PreState_Container_PS_Id"
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_P_Id"
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PostState_Container_PS_Id"
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_P_Id"
   "DevicesTemperature_Sensor_impl_temperature_sensor_cpi_thermostat_PreState_Container_PS_Id"
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_P_Id"
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PostState_Container_PS_Id"
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_P_Id"
   "Isoletteoperator_interface_thread_impl_operator_interface_oip_oit_PreState_Container_PS_Id"
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_P_Id"
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PostState_Container_PS_Id"
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_P_Id"
   "MonitorDetect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_PreState_Container_PS_Id"
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_P_Id"
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PostState_Container_PS_Id"
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_P_Id"
   "MonitorManage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_PreState_Container_PS_Id"
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_P_Id"
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PostState_Container_PS_Id"
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_P_Id"
   "MonitorManage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_PreState_Container_PS_Id"
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_P_Id"
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PostState_Container_PS_Id"
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_P_Id"
   "MonitorManage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_PreState_Container_PS_Id"
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_P_Id"
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PostState_Container_PS_Id"
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_P_Id"
   "RegulateDetect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_PreState_Container_PS_Id"
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_P_Id"
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PostState_Container_PS_Id"
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P_Id"
   "RegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS_Id"
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_P_Id"
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PostState_Container_PS_Id"
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_P_Id"
   "RegulateManage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_PreState_Container_PS_Id"
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_P_Id"
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PostState_Container_PS_Id"
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P_Id"
   "RegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS_Id"
   "utilEmptyContainer_Id"
}

