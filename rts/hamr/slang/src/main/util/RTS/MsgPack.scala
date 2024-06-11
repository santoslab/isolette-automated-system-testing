// #Sireum
// @formatter:off

// This file is auto-generated from Base_Types.scala, InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread__Containers.scala, EventControlMockThread_i_eventControlMock_eventControlMockThread__Containers.scala, ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread__Containers.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic__Containers.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic__Containers.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic__Containers.scala, OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic__Containers.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic__Containers.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic__Containers.scala, CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic__Containers.scala, OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic__Containers.scala, OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic__Containers.scala, Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator__Containers.scala, OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic__Containers.scala, Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator__Containers.scala, ObservationKind.scala, DataContent.scala, Aux_Types.scala, Containers.scala

package RTS

import org.sireum._

object MsgPack {

  object Constants {

    val Base_TypesBoolean_Payload: Z = -32

    val Base_TypesInteger_Payload: Z = -31

    val Base_TypesInteger_8_Payload: Z = -30

    val Base_TypesInteger_16_Payload: Z = -29

    val Base_TypesInteger_32_Payload: Z = -28

    val Base_TypesInteger_64_Payload: Z = -27

    val Base_TypesUnsigned_8_Payload: Z = -26

    val Base_TypesUnsigned_16_Payload: Z = -25

    val Base_TypesUnsigned_32_Payload: Z = -24

    val Base_TypesUnsigned_64_Payload: Z = -23

    val Base_TypesFloat_Payload: Z = -22

    val Base_TypesFloat_32_Payload: Z = -21

    val Base_TypesFloat_64_Payload: Z = -20

    val Base_TypesCharacter_Payload: Z = -19

    val Base_TypesString_Payload: Z = -18

    val Base_TypesBits_Payload: Z = -17

    val InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P: Z = -16

    val InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS: Z = -15

    val InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P: Z = -14

    val InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS: Z = -13

    val EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P: Z = -12

    val EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS: Z = -11

    val EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P: Z = -10

    val EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS: Z = -9

    val ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P: Z = -8

    val ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS: Z = -7

    val ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P: Z = -6

    val ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS: Z = -5

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P: Z = -4

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS: Z = -3

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P: Z = -2

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS: Z = -1

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P: Z = 0

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS: Z = 1

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P: Z = 2

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS: Z = 3

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P: Z = 4

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS: Z = 5

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P: Z = 6

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS: Z = 7

    val ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P: Z = 8

    val ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS: Z = 9

    val ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P: Z = 10

    val ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS: Z = 11

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P: Z = 12

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS: Z = 13

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P: Z = 14

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS: Z = 15

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P: Z = 16

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS: Z = 17

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P: Z = 18

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS: Z = 19

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P: Z = 20

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS: Z = 21

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P: Z = 22

    val ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS: Z = 23

    val ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P: Z = 24

    val ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS: Z = 25

    val ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P: Z = 26

    val ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS: Z = 27

    val ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P: Z = 28

    val ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS: Z = 29

    val ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P: Z = 30

    val ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS: Z = 31

    val ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P: Z = 32

    val ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS: Z = 33

    val ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P: Z = 34

    val ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS: Z = 35

    val ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P: Z = 36

    val ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS: Z = 37

    val ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P: Z = 38

    val ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS: Z = 39

    val ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P: Z = 40

    val ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS: Z = 41

    val ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P: Z = 42

    val ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS: Z = 43

    val _artEmpty: Z = 44

    val system_testsrts1Actuation_Subsystem_Inputs_Container: Z = 45

    val system_testsrts1Actuation_Subsystem_Outputs_Container: Z = 46

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container): Unit = {
      o match {
        case o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P => writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P(o)
        case o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS => writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS(o)
      }
    }

    def writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P): Unit = {
      writer.writeZ(Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P)
    }

    def writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS)
    }

    def writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container): Unit = {
      o match {
        case o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P => writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P(o)
        case o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS => writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS(o)
      }
    }

    def writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P): Unit = {
      writer.writeZ(Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P)
      writer.writeB(o.api_unit1_pressureLogic_channel1)
      writer.writeB(o.api_unit1_pressureLogic_channel2)
      writer.writeB(o.api_unit1_pressureLogic_channel3)
      writer.writeB(o.api_unit1_pressureLogic_channel4)
      writer.writeB(o.api_unit1_saturationLogic_channel1)
      writer.writeB(o.api_unit1_saturationLogic_channel2)
      writer.writeB(o.api_unit1_saturationLogic_channel3)
      writer.writeB(o.api_unit1_saturationLogic_channel4)
      writer.writeB(o.api_unit1_temperatureLogic_channel1)
      writer.writeB(o.api_unit1_temperatureLogic_channel2)
      writer.writeB(o.api_unit1_temperatureLogic_channel3)
      writer.writeB(o.api_unit1_temperatureLogic_channel4)
      writer.writeB(o.api_unit2_pressureLogic_channel1)
      writer.writeB(o.api_unit2_pressureLogic_channel2)
      writer.writeB(o.api_unit2_pressureLogic_channel3)
      writer.writeB(o.api_unit2_pressureLogic_channel4)
      writer.writeB(o.api_unit2_saturationLogic_channel1)
      writer.writeB(o.api_unit2_saturationLogic_channel2)
      writer.writeB(o.api_unit2_saturationLogic_channel3)
      writer.writeB(o.api_unit2_saturationLogic_channel4)
      writer.writeB(o.api_unit2_temperatureLogic_channel1)
      writer.writeB(o.api_unit2_temperatureLogic_channel2)
      writer.writeB(o.api_unit2_temperatureLogic_channel3)
      writer.writeB(o.api_unit2_temperatureLogic_channel4)
    }

    def writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS)
      writer.writeB(o.api_unit1_pressureLogic_channel1)
      writer.writeB(o.api_unit1_pressureLogic_channel2)
      writer.writeB(o.api_unit1_pressureLogic_channel3)
      writer.writeB(o.api_unit1_pressureLogic_channel4)
      writer.writeB(o.api_unit1_saturationLogic_channel1)
      writer.writeB(o.api_unit1_saturationLogic_channel2)
      writer.writeB(o.api_unit1_saturationLogic_channel3)
      writer.writeB(o.api_unit1_saturationLogic_channel4)
      writer.writeB(o.api_unit1_temperatureLogic_channel1)
      writer.writeB(o.api_unit1_temperatureLogic_channel2)
      writer.writeB(o.api_unit1_temperatureLogic_channel3)
      writer.writeB(o.api_unit1_temperatureLogic_channel4)
      writer.writeB(o.api_unit2_pressureLogic_channel1)
      writer.writeB(o.api_unit2_pressureLogic_channel2)
      writer.writeB(o.api_unit2_pressureLogic_channel3)
      writer.writeB(o.api_unit2_pressureLogic_channel4)
      writer.writeB(o.api_unit2_saturationLogic_channel1)
      writer.writeB(o.api_unit2_saturationLogic_channel2)
      writer.writeB(o.api_unit2_saturationLogic_channel3)
      writer.writeB(o.api_unit2_saturationLogic_channel4)
      writer.writeB(o.api_unit2_temperatureLogic_channel1)
      writer.writeB(o.api_unit2_temperatureLogic_channel2)
      writer.writeB(o.api_unit2_temperatureLogic_channel3)
      writer.writeB(o.api_unit2_temperatureLogic_channel4)
    }

    def writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container): Unit = {
      o match {
        case o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P => writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P(o)
        case o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS => writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS(o)
      }
    }

    def writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P): Unit = {
      writer.writeZ(Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P)
    }

    def writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS)
    }

    def writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container): Unit = {
      o match {
        case o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P => writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P(o)
        case o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS => writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS(o)
      }
    }

    def writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P): Unit = {
      writer.writeZ(Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P)
      writer.writeB(o.api_manualActuatorInput1)
      writer.writeB(o.api_manualActuatorInput2)
    }

    def writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS)
      writer.writeB(o.api_manualActuatorInput1)
      writer.writeB(o.api_manualActuatorInput2)
    }

    def writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container): Unit = {
      o match {
        case o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P => writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P(o)
        case o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS => writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS(o)
      }
    }

    def writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P)
      writer.writeB(o.api_saturationActuate)
      writer.writeB(o.api_tempPressureActuate)
    }

    def writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS)
      writer.writeB(o.api_saturationActuate)
      writer.writeB(o.api_tempPressureActuate)
    }

    def writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container): Unit = {
      o match {
        case o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P => writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P(o)
        case o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS => writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS(o)
      }
    }

    def writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P)
    }

    def writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P)
      writer.writeB(o.api_actuate)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS)
      writer.writeB(o.api_actuate)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P)
      writer.writeB(o.api_actuate)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS)
      writer.writeB(o.api_actuate)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P)
      writer.writeB(o.api_actuate)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS)
      writer.writeB(o.api_actuate)
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container): Unit = {
      o match {
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P => writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS(o)
      }
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container): Unit = {
      o match {
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P => writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS(o)
      }
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P)
      writer.writeB(o.api_actuate)
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS)
      writer.writeB(o.api_actuate)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P)
      writer.writeB(o.api_actuate)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS)
      writer.writeB(o.api_actuate)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P)
      writer.writeB(o.api_actuate)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS)
      writer.writeB(o.api_actuate)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
      writer.writeB(o.api_channel3)
      writer.writeB(o.api_channel4)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container): Unit = {
      o match {
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS(o)
      }
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P)
      writer.writeB(o.api_actuate)
    }

    def writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS)
      writer.writeB(o.api_actuate)
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container): Unit = {
      o match {
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P => writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS(o)
      }
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container): Unit = {
      o match {
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P => writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS(o)
      }
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P)
      writer.writeB(o.api_actuate)
    }

    def writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS)
      writer.writeB(o.api_actuate)
    }

    def writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container): Unit = {
      o match {
        case o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P => writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS(o)
      }
    }

    def writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container): Unit = {
      o match {
        case o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P => writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS(o)
      }
    }

    def writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P)
      writer.writeB(o.api_actuate)
    }

    def writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS)
      writer.writeB(o.api_actuate)
    }

    def writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container): Unit = {
      o match {
        case o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P => writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P(o)
        case o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS => writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS(o)
      }
    }

    def writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P)
      writer.writeB(o.api_input)
      writer.writeB(o.api_manualActuatorInput)
    }

    def writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS)
      writer.writeB(o.api_input)
      writer.writeB(o.api_manualActuatorInput)
    }

    def writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container): Unit = {
      o match {
        case o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P => writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P(o)
        case o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS => writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS(o)
      }
    }

    def writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P)
      writer.writeB(o.api_output)
    }

    def writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS)
      writer.writeB(o.api_output)
    }

    def writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container): Unit = {
      o match {
        case o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P => writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS(o)
      }
    }

    def writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS)
      writer.writeB(o.api_channel1)
      writer.writeB(o.api_channel2)
    }

    def writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container): Unit = {
      o match {
        case o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P => writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS(o)
      }
    }

    def writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P)
      writer.writeB(o.api_actuate)
    }

    def writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS)
      writer.writeB(o.api_actuate)
    }

    def writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container): Unit = {
      o match {
        case o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P => writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P(o)
        case o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS => writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS(o)
      }
    }

    def writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P)
      writer.writeB(o.api_input)
      writer.writeB(o.api_manualActuatorInput)
    }

    def writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS)
      writer.writeB(o.api_input)
      writer.writeB(o.api_manualActuatorInput)
    }

    def writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container): Unit = {
      o match {
        case o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P => writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P(o)
        case o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS => writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS(o)
      }
    }

    def writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P): Unit = {
      writer.writeZ(Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P)
      writer.writeB(o.api_output)
    }

    def writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS)
      writer.writeB(o.api_output)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P => writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P(o)
        case o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS => writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS(o)
        case o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P => writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P(o)
        case o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS => writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS(o)
        case o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P => writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P(o)
        case o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS => writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS(o)
        case o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P => writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P(o)
        case o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS => writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P => writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P => writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P => writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P => writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS(o)
        case o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P => writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P(o)
        case o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS => writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS(o)
        case o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P => writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P(o)
        case o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS => writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS(o)
        case o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P => writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P(o)
        case o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS => writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS(o)
        case o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P => writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P(o)
        case o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS => writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS(o)
        case o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P => writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P(o)
        case o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS => writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS(o)
        case o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P => writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P(o)
        case o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS => writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P => writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P => writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS(o)
        case o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS => writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P => writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P => writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P(o)
        case o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS => writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def writesystem_testsrts1Actuation_Subsystem_Inputs_Container(o: system_tests.rts1.Actuation_Subsystem_Inputs_Container): Unit = {
      writer.writeZ(Constants.system_testsrts1Actuation_Subsystem_Inputs_Container)
      writer.writeB(o.au1_temp_coincidenceLogic_channel1)
      writer.writeB(o.au1_temp_coincidenceLogic_channel2)
      writer.writeB(o.au1_temp_coincidenceLogic_channel3)
      writer.writeB(o.au1_temp_coincidenceLogic_channel4)
      writer.writeB(o.au1_press_coincidenceLogic_channel1)
      writer.writeB(o.au1_press_coincidenceLogic_channel2)
      writer.writeB(o.au1_press_coincidenceLogic_channel3)
      writer.writeB(o.au1_press_coincidenceLogic_channel4)
      writer.writeB(o.au1_satlogic_coincidenceLogic_channel1)
      writer.writeB(o.au1_satlogic_coincidenceLogic_channel2)
      writer.writeB(o.au1_satlogic_coincidenceLogic_channel3)
      writer.writeB(o.au1_satlogic_coincidenceLogic_channel4)
      writer.writeB(o.au2_temp_coincidenceLogic_channel1)
      writer.writeB(o.au2_temp_coincidenceLogic_channel2)
      writer.writeB(o.au2_temp_coincidenceLogic_channel3)
      writer.writeB(o.au2_temp_coincidenceLogic_channel4)
      writer.writeB(o.au2_press_coincidenceLogic_channel1)
      writer.writeB(o.au2_press_coincidenceLogic_channel2)
      writer.writeB(o.au2_press_coincidenceLogic_channel3)
      writer.writeB(o.au2_press_coincidenceLogic_channel4)
      writer.writeB(o.au2_satlogic_coincidenceLogic_channel1)
      writer.writeB(o.au2_satlogic_coincidenceLogic_channel2)
      writer.writeB(o.au2_satlogic_coincidenceLogic_channel3)
      writer.writeB(o.au2_satlogic_coincidenceLogic_channel4)
      writer.writeB(o.tempPressManualActuatorInput)
      writer.writeB(o.satManualActuatorInput)
    }

    def writesystem_testsrts1Actuation_Subsystem_Outputs_Container(o: system_tests.rts1.Actuation_Subsystem_Outputs_Container): Unit = {
      writer.writeZ(Constants.system_testsrts1Actuation_Subsystem_Outputs_Container)
      writer.writeB(o.TPAU_tempPressA_actuator_output)
      writer.writeB(o.SAU_satActuator_actuator)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container(): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P => val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PT(T); return r
        case Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS => val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container.")
          val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PST(T)
          return r
      }
    }

    def readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P(): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P = {
      val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PT(F)
      return r
    }

    def readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PT(typeParsed: B): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P)
      }
      return Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P()
    }

    def readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS(): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS = {
      val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PST(F)
      return r
    }

    def readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PST(typeParsed: B): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS)
      }
      return Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS()
    }

    def readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container(): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P => val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PT(T); return r
        case Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS => val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container.")
          val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PST(T)
          return r
      }
    }

    def readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P(): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P = {
      val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PT(F)
      return r
    }

    def readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PT(typeParsed: B): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P)
      }
      val api_unit1_pressureLogic_channel1 = reader.readB()
      val api_unit1_pressureLogic_channel2 = reader.readB()
      val api_unit1_pressureLogic_channel3 = reader.readB()
      val api_unit1_pressureLogic_channel4 = reader.readB()
      val api_unit1_saturationLogic_channel1 = reader.readB()
      val api_unit1_saturationLogic_channel2 = reader.readB()
      val api_unit1_saturationLogic_channel3 = reader.readB()
      val api_unit1_saturationLogic_channel4 = reader.readB()
      val api_unit1_temperatureLogic_channel1 = reader.readB()
      val api_unit1_temperatureLogic_channel2 = reader.readB()
      val api_unit1_temperatureLogic_channel3 = reader.readB()
      val api_unit1_temperatureLogic_channel4 = reader.readB()
      val api_unit2_pressureLogic_channel1 = reader.readB()
      val api_unit2_pressureLogic_channel2 = reader.readB()
      val api_unit2_pressureLogic_channel3 = reader.readB()
      val api_unit2_pressureLogic_channel4 = reader.readB()
      val api_unit2_saturationLogic_channel1 = reader.readB()
      val api_unit2_saturationLogic_channel2 = reader.readB()
      val api_unit2_saturationLogic_channel3 = reader.readB()
      val api_unit2_saturationLogic_channel4 = reader.readB()
      val api_unit2_temperatureLogic_channel1 = reader.readB()
      val api_unit2_temperatureLogic_channel2 = reader.readB()
      val api_unit2_temperatureLogic_channel3 = reader.readB()
      val api_unit2_temperatureLogic_channel4 = reader.readB()
      return Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P(api_unit1_pressureLogic_channel1, api_unit1_pressureLogic_channel2, api_unit1_pressureLogic_channel3, api_unit1_pressureLogic_channel4, api_unit1_saturationLogic_channel1, api_unit1_saturationLogic_channel2, api_unit1_saturationLogic_channel3, api_unit1_saturationLogic_channel4, api_unit1_temperatureLogic_channel1, api_unit1_temperatureLogic_channel2, api_unit1_temperatureLogic_channel3, api_unit1_temperatureLogic_channel4, api_unit2_pressureLogic_channel1, api_unit2_pressureLogic_channel2, api_unit2_pressureLogic_channel3, api_unit2_pressureLogic_channel4, api_unit2_saturationLogic_channel1, api_unit2_saturationLogic_channel2, api_unit2_saturationLogic_channel3, api_unit2_saturationLogic_channel4, api_unit2_temperatureLogic_channel1, api_unit2_temperatureLogic_channel2, api_unit2_temperatureLogic_channel3, api_unit2_temperatureLogic_channel4)
    }

    def readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS(): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS = {
      val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PST(F)
      return r
    }

    def readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PST(typeParsed: B): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS)
      }
      val api_unit1_pressureLogic_channel1 = reader.readB()
      val api_unit1_pressureLogic_channel2 = reader.readB()
      val api_unit1_pressureLogic_channel3 = reader.readB()
      val api_unit1_pressureLogic_channel4 = reader.readB()
      val api_unit1_saturationLogic_channel1 = reader.readB()
      val api_unit1_saturationLogic_channel2 = reader.readB()
      val api_unit1_saturationLogic_channel3 = reader.readB()
      val api_unit1_saturationLogic_channel4 = reader.readB()
      val api_unit1_temperatureLogic_channel1 = reader.readB()
      val api_unit1_temperatureLogic_channel2 = reader.readB()
      val api_unit1_temperatureLogic_channel3 = reader.readB()
      val api_unit1_temperatureLogic_channel4 = reader.readB()
      val api_unit2_pressureLogic_channel1 = reader.readB()
      val api_unit2_pressureLogic_channel2 = reader.readB()
      val api_unit2_pressureLogic_channel3 = reader.readB()
      val api_unit2_pressureLogic_channel4 = reader.readB()
      val api_unit2_saturationLogic_channel1 = reader.readB()
      val api_unit2_saturationLogic_channel2 = reader.readB()
      val api_unit2_saturationLogic_channel3 = reader.readB()
      val api_unit2_saturationLogic_channel4 = reader.readB()
      val api_unit2_temperatureLogic_channel1 = reader.readB()
      val api_unit2_temperatureLogic_channel2 = reader.readB()
      val api_unit2_temperatureLogic_channel3 = reader.readB()
      val api_unit2_temperatureLogic_channel4 = reader.readB()
      return Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS(api_unit1_pressureLogic_channel1, api_unit1_pressureLogic_channel2, api_unit1_pressureLogic_channel3, api_unit1_pressureLogic_channel4, api_unit1_saturationLogic_channel1, api_unit1_saturationLogic_channel2, api_unit1_saturationLogic_channel3, api_unit1_saturationLogic_channel4, api_unit1_temperatureLogic_channel1, api_unit1_temperatureLogic_channel2, api_unit1_temperatureLogic_channel3, api_unit1_temperatureLogic_channel4, api_unit2_pressureLogic_channel1, api_unit2_pressureLogic_channel2, api_unit2_pressureLogic_channel3, api_unit2_pressureLogic_channel4, api_unit2_saturationLogic_channel1, api_unit2_saturationLogic_channel2, api_unit2_saturationLogic_channel3, api_unit2_saturationLogic_channel4, api_unit2_temperatureLogic_channel1, api_unit2_temperatureLogic_channel2, api_unit2_temperatureLogic_channel3, api_unit2_temperatureLogic_channel4)
    }

    def readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container(): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P => val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PT(T); return r
        case Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS => val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container.")
          val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PST(T)
          return r
      }
    }

    def readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P(): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P = {
      val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PT(F)
      return r
    }

    def readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PT(typeParsed: B): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P)
      }
      return EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P()
    }

    def readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS(): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS = {
      val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PST(F)
      return r
    }

    def readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PST(typeParsed: B): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS)
      }
      return EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS()
    }

    def readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container(): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P => val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PT(T); return r
        case Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS => val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container.")
          val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PST(T)
          return r
      }
    }

    def readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P(): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P = {
      val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PT(F)
      return r
    }

    def readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PT(typeParsed: B): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P)
      }
      val api_manualActuatorInput1 = reader.readB()
      val api_manualActuatorInput2 = reader.readB()
      return EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P(api_manualActuatorInput1, api_manualActuatorInput2)
    }

    def readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS(): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS = {
      val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PST(F)
      return r
    }

    def readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PST(typeParsed: B): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS)
      }
      val api_manualActuatorInput1 = reader.readB()
      val api_manualActuatorInput2 = reader.readB()
      return EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS(api_manualActuatorInput1, api_manualActuatorInput2)
    }

    def readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container(): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P => val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PT(T); return r
        case Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS => val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container.")
          val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PST(T)
          return r
      }
    }

    def readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P(): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P = {
      val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PT(F)
      return r
    }

    def readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PT(typeParsed: B): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P)
      }
      val api_saturationActuate = reader.readB()
      val api_tempPressureActuate = reader.readB()
      return Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P(api_saturationActuate, api_tempPressureActuate)
    }

    def readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS(): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS = {
      val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PST(F)
      return r
    }

    def readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PST(typeParsed: B): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS)
      }
      val api_saturationActuate = reader.readB()
      val api_tempPressureActuate = reader.readB()
      return Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS(api_saturationActuate, api_tempPressureActuate)
    }

    def readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container(): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P => val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PT(T); return r
        case Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS => val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container.")
          val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PST(T)
          return r
      }
    }

    def readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P(): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P = {
      val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PT(F)
      return r
    }

    def readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PT(typeParsed: B): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P)
      }
      return Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P()
    }

    def readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS(): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS = {
      val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PST(F)
      return r
    }

    def readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PST(typeParsed: B): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS)
      }
      return Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS()
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P(api_actuate)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS(api_actuate)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P(api_actuate)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS(api_actuate)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P(api_actuate)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS(api_actuate)
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container.")
          val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P = {
      val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P(api_channel1, api_channel2)
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS = {
      val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PST(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PST(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS(api_channel1, api_channel2)
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container.")
          val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P = {
      val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P)
      }
      val api_actuate = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P(api_actuate)
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS = {
      val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PST(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PST(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS)
      }
      val api_actuate = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS(api_actuate)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P(api_actuate)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS(api_actuate)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P(api_actuate)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS(api_actuate)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      val api_channel3 = reader.readB()
      val api_channel4 = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS(api_channel1, api_channel2, api_channel3, api_channel4)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container.")
          val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PT(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PT(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P(api_actuate)
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS(): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS = {
      val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PST(F)
      return r
    }

    def readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PST(typeParsed: B): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS)
      }
      val api_actuate = reader.readB()
      return Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS(api_actuate)
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container.")
          val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P = {
      val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P(api_channel1, api_channel2)
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS = {
      val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PST(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PST(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS(api_channel1, api_channel2)
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container.")
          val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P = {
      val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P)
      }
      val api_actuate = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P(api_actuate)
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS(): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS = {
      val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PST(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PST(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS)
      }
      val api_actuate = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS(api_actuate)
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container(): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container.")
          val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P(): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P = {
      val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P(api_channel1, api_channel2)
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS(): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS = {
      val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PST(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PST(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS(api_channel1, api_channel2)
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container(): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container.")
          val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P(): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P = {
      val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P)
      }
      val api_actuate = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P(api_actuate)
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS(): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS = {
      val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PST(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PST(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS)
      }
      val api_actuate = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS(api_actuate)
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container(): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P => val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PT(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS => val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container.")
          val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P(): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P = {
      val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PT(F)
      return r
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PT(typeParsed: B): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P)
      }
      val api_input = reader.readB()
      val api_manualActuatorInput = reader.readB()
      return Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P(api_input, api_manualActuatorInput)
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS(): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS = {
      val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PST(F)
      return r
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PST(typeParsed: B): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS)
      }
      val api_input = reader.readB()
      val api_manualActuatorInput = reader.readB()
      return Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS(api_input, api_manualActuatorInput)
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container(): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P => val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PT(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS => val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container.")
          val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P(): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P = {
      val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PT(F)
      return r
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PT(typeParsed: B): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P)
      }
      val api_output = reader.readB()
      return Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P(api_output)
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS(): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS = {
      val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PST(F)
      return r
    }

    def readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PST(typeParsed: B): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS)
      }
      val api_output = reader.readB()
      return Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS(api_output)
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container(): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container.")
          val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P(): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P = {
      val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P(api_channel1, api_channel2)
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS(): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS = {
      val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PST(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PST(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS)
      }
      val api_channel1 = reader.readB()
      val api_channel2 = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS(api_channel1, api_channel2)
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container(): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container.")
          val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P(): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P = {
      val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PT(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PT(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P)
      }
      val api_actuate = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P(api_actuate)
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS(): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS = {
      val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PST(F)
      return r
    }

    def readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PST(typeParsed: B): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS)
      }
      val api_actuate = reader.readB()
      return Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS(api_actuate)
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container(): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P => val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PT(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS => val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container.")
          val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PST(T)
          return r
      }
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P(): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P = {
      val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PT(F)
      return r
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PT(typeParsed: B): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P)
      }
      val api_input = reader.readB()
      val api_manualActuatorInput = reader.readB()
      return Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P(api_input, api_manualActuatorInput)
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS(): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS = {
      val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PST(F)
      return r
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PST(typeParsed: B): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS)
      }
      val api_input = reader.readB()
      val api_manualActuatorInput = reader.readB()
      return Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS(api_input, api_manualActuatorInput)
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container(): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P => val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PT(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS => val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container.")
          val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PST(T)
          return r
      }
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P(): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P = {
      val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PT(F)
      return r
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PT(typeParsed: B): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P)
      }
      val api_output = reader.readB()
      return Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P(api_output)
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS(): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS = {
      val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PST(F)
      return r
    }

    def readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PST(typeParsed: B): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS)
      }
      val api_output = reader.readB()
      return Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS(api_output)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P => val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PT(T); return r
        case Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS => val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PST(T); return r
        case Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P => val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PT(T); return r
        case Constants.ActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS => val r = readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PST(T); return r
        case Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P => val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PT(T); return r
        case Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS => val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PST(T); return r
        case Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P => val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PT(T); return r
        case Constants.EventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS => val r = readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PST(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PST(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PST(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PST(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PST(T); return r
        case Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P => val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PT(T); return r
        case Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS => val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PST(T); return r
        case Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P => val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PT(T); return r
        case Constants.InstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS => val r = readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PST(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P => val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PT(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS => val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PST(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P => val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PT(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS => val r = readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P => val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PT(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS => val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PST(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P => val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PT(T); return r
        case Constants.ActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS => val r = readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PST(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PT(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case Constants.ActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS => val r = readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PST(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PST(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P => val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PT(T); return r
        case Constants.ActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS => val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

    def readsystem_testsrts1Actuation_Subsystem_Inputs_Container(): system_tests.rts1.Actuation_Subsystem_Inputs_Container = {
      val r = readsystem_testsrts1Actuation_Subsystem_Inputs_ContainerT(F)
      return r
    }

    def readsystem_testsrts1Actuation_Subsystem_Inputs_ContainerT(typeParsed: B): system_tests.rts1.Actuation_Subsystem_Inputs_Container = {
      if (!typeParsed) {
        reader.expectZ(Constants.system_testsrts1Actuation_Subsystem_Inputs_Container)
      }
      val au1_temp_coincidenceLogic_channel1 = reader.readB()
      val au1_temp_coincidenceLogic_channel2 = reader.readB()
      val au1_temp_coincidenceLogic_channel3 = reader.readB()
      val au1_temp_coincidenceLogic_channel4 = reader.readB()
      val au1_press_coincidenceLogic_channel1 = reader.readB()
      val au1_press_coincidenceLogic_channel2 = reader.readB()
      val au1_press_coincidenceLogic_channel3 = reader.readB()
      val au1_press_coincidenceLogic_channel4 = reader.readB()
      val au1_satlogic_coincidenceLogic_channel1 = reader.readB()
      val au1_satlogic_coincidenceLogic_channel2 = reader.readB()
      val au1_satlogic_coincidenceLogic_channel3 = reader.readB()
      val au1_satlogic_coincidenceLogic_channel4 = reader.readB()
      val au2_temp_coincidenceLogic_channel1 = reader.readB()
      val au2_temp_coincidenceLogic_channel2 = reader.readB()
      val au2_temp_coincidenceLogic_channel3 = reader.readB()
      val au2_temp_coincidenceLogic_channel4 = reader.readB()
      val au2_press_coincidenceLogic_channel1 = reader.readB()
      val au2_press_coincidenceLogic_channel2 = reader.readB()
      val au2_press_coincidenceLogic_channel3 = reader.readB()
      val au2_press_coincidenceLogic_channel4 = reader.readB()
      val au2_satlogic_coincidenceLogic_channel1 = reader.readB()
      val au2_satlogic_coincidenceLogic_channel2 = reader.readB()
      val au2_satlogic_coincidenceLogic_channel3 = reader.readB()
      val au2_satlogic_coincidenceLogic_channel4 = reader.readB()
      val tempPressManualActuatorInput = reader.readB()
      val satManualActuatorInput = reader.readB()
      return system_tests.rts1.Actuation_Subsystem_Inputs_Container(au1_temp_coincidenceLogic_channel1, au1_temp_coincidenceLogic_channel2, au1_temp_coincidenceLogic_channel3, au1_temp_coincidenceLogic_channel4, au1_press_coincidenceLogic_channel1, au1_press_coincidenceLogic_channel2, au1_press_coincidenceLogic_channel3, au1_press_coincidenceLogic_channel4, au1_satlogic_coincidenceLogic_channel1, au1_satlogic_coincidenceLogic_channel2, au1_satlogic_coincidenceLogic_channel3, au1_satlogic_coincidenceLogic_channel4, au2_temp_coincidenceLogic_channel1, au2_temp_coincidenceLogic_channel2, au2_temp_coincidenceLogic_channel3, au2_temp_coincidenceLogic_channel4, au2_press_coincidenceLogic_channel1, au2_press_coincidenceLogic_channel2, au2_press_coincidenceLogic_channel3, au2_press_coincidenceLogic_channel4, au2_satlogic_coincidenceLogic_channel1, au2_satlogic_coincidenceLogic_channel2, au2_satlogic_coincidenceLogic_channel3, au2_satlogic_coincidenceLogic_channel4, tempPressManualActuatorInput, satManualActuatorInput)
    }

    def readsystem_testsrts1Actuation_Subsystem_Outputs_Container(): system_tests.rts1.Actuation_Subsystem_Outputs_Container = {
      val r = readsystem_testsrts1Actuation_Subsystem_Outputs_ContainerT(F)
      return r
    }

    def readsystem_testsrts1Actuation_Subsystem_Outputs_ContainerT(typeParsed: B): system_tests.rts1.Actuation_Subsystem_Outputs_Container = {
      if (!typeParsed) {
        reader.expectZ(Constants.system_testsrts1Actuation_Subsystem_Outputs_Container)
      }
      val TPAU_tempPressA_actuator_output = reader.readB()
      val SAU_satActuator_actuator = reader.readB()
      return system_tests.rts1.Actuation_Subsystem_Outputs_Container(TPAU_tempPressA_actuator_output, SAU_satActuator_actuator)
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container(o)
    return w.result
  }

  def toInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container(data: ISZ[U8]): Either[Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container, MessagePack.ErrorMsg] = {
    def fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container(reader: Reader): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container = {
      val r = reader.readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container()
      return r
    }
    val r = to(data, fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container _)
    return r
  }

  def fromInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P(o)
    return w.result
  }

  def toInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P(data: ISZ[U8]): Either[Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P(reader: Reader): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P = {
      val r = reader.readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P()
      return r
    }
    val r = to(data, fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_P _)
    return r
  }

  def fromInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS(o)
    return w.result
  }

  def toInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS(data: ISZ[U8]): Either[Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS(reader: Reader): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS = {
      val r = reader.readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS()
      return r
    }
    val r = to(data, fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PreState_Container_PS _)
    return r
  }

  def fromInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container(o)
    return w.result
  }

  def toInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container(data: ISZ[U8]): Either[Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container, MessagePack.ErrorMsg] = {
    def fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container(reader: Reader): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container = {
      val r = reader.readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container()
      return r
    }
    val r = to(data, fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container _)
    return r
  }

  def fromInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P(o)
    return w.result
  }

  def toInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P(data: ISZ[U8]): Either[Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P(reader: Reader): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P = {
      val r = reader.readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P()
      return r
    }
    val r = to(data, fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_P _)
    return r
  }

  def fromInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS(o: Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS(o)
    return w.result
  }

  def toInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS(data: ISZ[U8]): Either[Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS(reader: Reader): Instrumentation.InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS = {
      val r = reader.readInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS()
      return r
    }
    val r = to(data, fInstrumentationInstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_PostState_Container_PS _)
    return r
  }

  def fromEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container(o)
    return w.result
  }

  def toEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container(data: ISZ[U8]): Either[EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container, MessagePack.ErrorMsg] = {
    def fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container(reader: Reader): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container = {
      val r = reader.readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container()
      return r
    }
    val r = to(data, fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container _)
    return r
  }

  def fromEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P(o)
    return w.result
  }

  def toEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P(data: ISZ[U8]): Either[EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P(reader: Reader): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P = {
      val r = reader.readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P()
      return r
    }
    val r = to(data, fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_P _)
    return r
  }

  def fromEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS(o)
    return w.result
  }

  def toEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS(data: ISZ[U8]): Either[EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS(reader: Reader): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS = {
      val r = reader.readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS()
      return r
    }
    val r = to(data, fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PreState_Container_PS _)
    return r
  }

  def fromEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container(o)
    return w.result
  }

  def toEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container(data: ISZ[U8]): Either[EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container, MessagePack.ErrorMsg] = {
    def fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container(reader: Reader): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container = {
      val r = reader.readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container()
      return r
    }
    val r = to(data, fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container _)
    return r
  }

  def fromEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P(o)
    return w.result
  }

  def toEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P(data: ISZ[U8]): Either[EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P(reader: Reader): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P = {
      val r = reader.readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P()
      return r
    }
    val r = to(data, fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_P _)
    return r
  }

  def fromEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS(o: EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS(o)
    return w.result
  }

  def toEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS(data: ISZ[U8]): Either[EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS(reader: Reader): EventControl.EventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS = {
      val r = reader.readEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS()
      return r
    }
    val r = to(data, fEventControlEventControlMockThread_i_eventControlMock_eventControlMockThread_PostState_Container_PS _)
    return r
  }

  def fromActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container(o)
    return w.result
  }

  def toActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container(data: ISZ[U8]): Either[Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container(reader: Reader): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container = {
      val r = reader.readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container()
      return r
    }
    val r = to(data, fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container _)
    return r
  }

  def fromActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P(o)
    return w.result
  }

  def toActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P(data: ISZ[U8]): Either[Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P(reader: Reader): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P = {
      val r = reader.readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P()
      return r
    }
    val r = to(data, fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_P _)
    return r
  }

  def fromActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS(o)
    return w.result
  }

  def toActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS(data: ISZ[U8]): Either[Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS(reader: Reader): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS = {
      val r = reader.readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PreState_Container_PS _)
    return r
  }

  def fromActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container(o)
    return w.result
  }

  def toActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container(data: ISZ[U8]): Either[Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container(reader: Reader): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container = {
      val r = reader.readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container()
      return r
    }
    val r = to(data, fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container _)
    return r
  }

  def fromActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P(o)
    return w.result
  }

  def toActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P(data: ISZ[U8]): Either[Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P(reader: Reader): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P = {
      val r = reader.readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P()
      return r
    }
    val r = to(data, fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_P _)
    return r
  }

  def fromActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS(o: Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS(o)
    return w.result
  }

  def toActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS(data: ISZ[U8]): Either[Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS(reader: Reader): Actuators.ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS = {
      val r = reader.readActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuatorsActuatorsMockThread_i_actuatorsMock_actuatorsMockThread_PostState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PreState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_PostState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PreState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_PostState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PreState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_PostState_Container_PS _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_P _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PreState_Container_PS _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_P _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PreState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_PostState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PreState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_PostState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PreState_Container_PS _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_P _)
    return r
  }

  def fromActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS(o: Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS(o)
    return w.result
  }

  def toActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS(reader: Reader): Actuation.CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS = {
      val r = reader.readActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationCoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_PostState_Container_PS _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_P _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PreState_Container_PS _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_P _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_PostState_Container_PS _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_P _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PreState_Container_PS _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_P _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_PostState_Container_PS _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container(reader: Reader): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container = {
      val r = reader.readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P(reader: Reader): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P = {
      val r = reader.readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_P _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS(reader: Reader): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS = {
      val r = reader.readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PreState_Container_PS _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container(reader: Reader): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container = {
      val r = reader.readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P(reader: Reader): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P = {
      val r = reader.readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_P _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS(o: Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS(reader: Reader): Actuation.Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS = {
      val r = reader.readActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_PostState_Container_PS _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_P _)
    return r
  }

  def fromActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS(o: Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS(o)
    return w.result
  }

  def toActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS(reader: Reader): Actuation.OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS = {
      val r = reader.readActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationOrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PostState_Container_PS _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container(reader: Reader): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container = {
      val r = reader.readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P(reader: Reader): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P = {
      val r = reader.readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_P _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS(reader: Reader): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS = {
      val r = reader.readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PreState_Container_PS _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container(reader: Reader): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container = {
      val r = reader.readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P(reader: Reader): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P = {
      val r = reader.readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_P _)
    return r
  }

  def fromActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS(o: Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS(o)
    return w.result
  }

  def toActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS(data: ISZ[U8]): Either[Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS(reader: Reader): Actuation.Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS = {
      val r = reader.readActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS()
      return r
    }
    val r = to(data, fActuationActuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_PostState_Container_PS _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

  def fromsystem_testsrts1Actuation_Subsystem_Inputs_Container(o: system_tests.rts1.Actuation_Subsystem_Inputs_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writesystem_testsrts1Actuation_Subsystem_Inputs_Container(o)
    return w.result
  }

  def tosystem_testsrts1Actuation_Subsystem_Inputs_Container(data: ISZ[U8]): Either[system_tests.rts1.Actuation_Subsystem_Inputs_Container, MessagePack.ErrorMsg] = {
    def fsystem_testsrts1Actuation_Subsystem_Inputs_Container(reader: Reader): system_tests.rts1.Actuation_Subsystem_Inputs_Container = {
      val r = reader.readsystem_testsrts1Actuation_Subsystem_Inputs_Container()
      return r
    }
    val r = to(data, fsystem_testsrts1Actuation_Subsystem_Inputs_Container _)
    return r
  }

  def fromsystem_testsrts1Actuation_Subsystem_Outputs_Container(o: system_tests.rts1.Actuation_Subsystem_Outputs_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writesystem_testsrts1Actuation_Subsystem_Outputs_Container(o)
    return w.result
  }

  def tosystem_testsrts1Actuation_Subsystem_Outputs_Container(data: ISZ[U8]): Either[system_tests.rts1.Actuation_Subsystem_Outputs_Container, MessagePack.ErrorMsg] = {
    def fsystem_testsrts1Actuation_Subsystem_Outputs_Container(reader: Reader): system_tests.rts1.Actuation_Subsystem_Outputs_Container = {
      val r = reader.readsystem_testsrts1Actuation_Subsystem_Outputs_Container()
      return r
    }
    val r = to(data, fsystem_testsrts1Actuation_Subsystem_Outputs_Container _)
    return r
  }

}