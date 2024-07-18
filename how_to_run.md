# Workflow

1. Optional: modify the AADL model and then rerun codegen

    * [isolette/aadl/bin/run-hamr.cmd](isolette/aadl/bin/run-hamr.cmd)
    
    The model is in [isolette/aadl/aadl/packages](isolette/aadl/aadl/packages)

1. Modify system testing containers
  
    The following are relative to [isolette/hamr/slang/src/main/util/isolette/system_tests](isolette/hamr/slang/src/main/util/isolette/system_tests)

    * [monitor1/Monitor_Subsystem_Containers.scala](isolette/hamr/slang/src/main/util/isolette/system_tests/monitor1/Monitor_Subsystem_Containers.scala)

    * [rst/Regulate_Subsystem_Containers.scala](isolette/hamr/slang/src/main/util/isolette/system_tests/rst/Regulate_Subsystem_Containers.scala)

1. Rerun system testing artifact generator

    The following is relative to [isolette/hamr/slang](isolette/hamr/slang)

    * [bin/generate-system-test-artifacts.sc](isolette/hamr/slang/bin/generate-system-test-artifacts.sc)


1. Update system testing schemas

    The following are relative to [isolette/hamr/slang/src/test/system/isolette/system_tests](isolette/hamr/slang/src/test/system/isolette/system_tests)

    * [monitor1/Monitor_Subsystem_Test_wSlangCheck.scala](isolette/hamr/slang/src/test/system/isolette/system_tests/monitor1/Monitor_Subsystem_Test_wSlangCheck.scala)

    * [rst/Regulate_Subsystem_Test_wSlangCheck.scala](isolette/hamr/slang/src/test/system/isolette/system_tests/rst/Regulate_Subsystem_Test_wSlangCheck.scala)


