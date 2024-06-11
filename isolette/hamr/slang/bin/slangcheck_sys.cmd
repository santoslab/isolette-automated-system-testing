::/*#! 2> /dev/null                                   #
@ 2>/dev/null # 2>nul & echo off & goto BOF           #
if [ -z ${SIREUM_HOME} ]; then                        #
  echo "Please set SIREUM_HOME env var"               #
  exit -1                                             #
fi                                                    #
exec ${SIREUM_HOME}/bin/sireum slang run "$0" "$@"    #
:BOF
setlocal
if not defined SIREUM_HOME (
  echo Please set SIREUM_HOME env var
  exit /B -1
)
%SIREUM_HOME%\\bin\\sireum.bat slang run "%0" %*
exit /B %errorlevel%
::!#*/
// #Sireum

import org.sireum._

val sireum = Os.path(Os.env("SIREUM_HOME").get) / "bin" / (if (Os.isWin) "sireum.bat" else "sireum")

// create SlangCheck artifacts for the Slang types used in the project

val files: ISZ[String] = ISZ("../src/main/data/isolette/Isolette_Environment/Heat.scala",
  "../src/main/data/isolette/Isolette_Environment/Interface_Interaction.scala",
  "../src/main/data/isolette/Isolette_Data_Model/PhysicalTemp_impl.scala",
  "../src/main/data/isolette/Isolette_Data_Model/ValueStatus.scala",
  "../src/main/data/isolette/Isolette_Data_Model/TempWstatus_impl.scala",
  "../src/main/data/isolette/Isolette_Data_Model/On_Off.scala",
  "../src/main/data/isolette/Isolette_Data_Model/Status.scala",
  "../src/main/data/isolette/Isolette_Data_Model/Temp_impl.scala",
  "../src/main/data/isolette/Isolette_Data_Model/Regulator_Mode.scala",
  "../src/main/data/isolette/Isolette_Data_Model/Failure_Flag_impl.scala",
  "../src/main/data/isolette/Isolette_Data_Model/Monitor_Mode.scala",
  "../src/main/data/isolette/Base_Types.scala",
  "../src/main/data/isolette/Regulate/Manage_Regulator_Interface_impl_thermostat_regulate_temperature_manage_regulator_interface_Containers.scala",
  "../src/main/data/isolette/Regulate/Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Containers.scala",
  "../src/main/data/isolette/Regulate/Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_Containers.scala",
  "../src/main/data/isolette/Regulate/Detect_Regulator_Failure_impl_thermostat_regulate_temperature_detect_regulator_failure_Containers.scala",
  "../src/main/data/isolette/Monitor/Manage_Monitor_Interface_impl_thermostat_monitor_temperature_manage_monitor_interface_Containers.scala",
  "../src/main/data/isolette/Monitor/Manage_Alarm_impl_thermostat_monitor_temperature_manage_alarm_Containers.scala",
  "../src/main/data/isolette/Monitor/Manage_Monitor_Mode_impl_thermostat_monitor_temperature_manage_monitor_mode_Containers.scala",
  "../src/main/data/isolette/Monitor/Detect_Monitor_Failure_impl_thermostat_monitor_temperature_detect_monitor_failure_Containers.scala",
  "../src/main/data/isolette/Isolette/operator_interface_thread_impl_operator_interface_oip_oit_Containers.scala",
  "../src/main/data/isolette/Devices/Temperature_Sensor_impl_temperature_sensor_cpi_thermostat_Containers.scala",
  "../src/main/data/isolette/Devices/Heat_Source_impl_heat_source_cpi_heat_controller_Containers.scala",
  "../src/main/util/isolette/runtimemonitor/ObservationKind.scala",
  "../src/main/data/isolette/util/Container.scala",
  "../src/main/art/art/DataContent.scala",
  "../src/main/data/isolette/Aux_Types.scala",

  "../src/main/util/isolette/system_tests/rst/Regulate_Subsystem_Containers.scala",
  "../src/main/util/isolette/system_tests/monitor1/Monitor_Subsystem_Containers.scala"
)

val toolargs: String = st"${(files, " ")}".render

(Os.slashDir.up / "src" / "main" / "util" / "isolette").mkdirAll()

//proc"$sireum proyek slangcheck -p isolette -o ${Os.slashDir.up}/src/main/util/isolette ${Os.slashDir.up} $toolargs".at(Os.slashDir).console.runCheck()
proc"$sireum tools slangcheck generator -p isolette -o ${Os.slashDir.up}/src/main/util/isolette $toolargs".at(Os.slashDir).console.runCheck()