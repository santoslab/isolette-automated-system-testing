# Workflow

1. Optional: modify the AADL model ([isolette/aadl/aadl/packages](isolette/aadl/aadl/packages)) and then rerun codegen

    * [isolette/aadl/bin/run-hamr.cmd](isolette/aadl/bin/run-hamr.cmd)

1. Modify the system testing containers by adding/removing fields
  
    The following are relative to [isolette/hamr/slang/src/main/util/isolette/system_tests](isolette/hamr/slang/src/main/util/isolette/system_tests)

    * [monitor1/Monitor_Subsystem_Containers.scala](isolette/hamr/slang/src/main/util/isolette/system_tests/monitor1/Monitor_Subsystem_Containers.scala)

    * [rst/Regulate_Subsystem_Containers.scala](isolette/hamr/slang/src/main/util/isolette/system_tests/rst/Regulate_Subsystem_Containers.scala)

1. Rerun the system testing artifact generator

    The following is relative to [isolette/hamr/slang](isolette/hamr/slang)

    * [bin/generate-system-test-artifacts.sc](isolette/hamr/slang/bin/generate-system-test-artifacts.sc)


1. Update the system testing schemas

    The following are relative to [isolette/hamr/slang/src/test/system/isolette/system_tests](isolette/hamr/slang/src/test/system/isolette/system_tests)

    * [monitor1/Monitor_Subsystem_Test_wSlangCheck.scala](isolette/hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala)

    * [rst/Regulate_Subsystem_Test_wSlangCheck.scala](isolette/hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala)


**NOTE** If you get something similar to the following error when trying to compile the Slang project inside IVE then switch to using the IDEA incremental compiler (instead of Zinc) via ``Settings`` > ``Build, Execution, Deployment`` >> ``Scala Compiler`` >> ``Incrementality Type``

```
Internal error (java.io.FileNotFoundException): isolette-automated-system-testing/isolette/hamr/slang/out/production/isolette_single_sensor_Instance/isolette
...
```
