// #Sireum

package RTS.Instrumentation

import org.sireum._
import art._
import RTS._
import RTS.Instrumentation.{InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread => component}

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

@datatype class InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge(
  val id: Art.BridgeId,
  val name: String,
  val dispatchProtocol: DispatchPropertyProtocol,
  val dispatchTriggers: Option[ISZ[Art.PortId]],

  unit1_temperatureLogic_channel1: Port[Base_Types.Boolean],
  unit1_temperatureLogic_channel2: Port[Base_Types.Boolean],
  unit1_temperatureLogic_channel3: Port[Base_Types.Boolean],
  unit1_temperatureLogic_channel4: Port[Base_Types.Boolean],
  unit1_pressureLogic_channel1: Port[Base_Types.Boolean],
  unit1_pressureLogic_channel2: Port[Base_Types.Boolean],
  unit1_pressureLogic_channel3: Port[Base_Types.Boolean],
  unit1_pressureLogic_channel4: Port[Base_Types.Boolean],
  unit1_saturationLogic_channel1: Port[Base_Types.Boolean],
  unit1_saturationLogic_channel2: Port[Base_Types.Boolean],
  unit1_saturationLogic_channel3: Port[Base_Types.Boolean],
  unit1_saturationLogic_channel4: Port[Base_Types.Boolean],
  unit2_temperatureLogic_channel1: Port[Base_Types.Boolean],
  unit2_temperatureLogic_channel2: Port[Base_Types.Boolean],
  unit2_temperatureLogic_channel3: Port[Base_Types.Boolean],
  unit2_temperatureLogic_channel4: Port[Base_Types.Boolean],
  unit2_pressureLogic_channel1: Port[Base_Types.Boolean],
  unit2_pressureLogic_channel2: Port[Base_Types.Boolean],
  unit2_pressureLogic_channel3: Port[Base_Types.Boolean],
  unit2_pressureLogic_channel4: Port[Base_Types.Boolean],
  unit2_saturationLogic_channel1: Port[Base_Types.Boolean],
  unit2_saturationLogic_channel2: Port[Base_Types.Boolean],
  unit2_saturationLogic_channel3: Port[Base_Types.Boolean],
  unit2_saturationLogic_channel4: Port[Base_Types.Boolean]
  ) extends Bridge {

  val ports : Bridge.Ports = Bridge.Ports(
    dataIns = ISZ[art.UPort](),

    dataOuts = ISZ[art.UPort](unit1_temperatureLogic_channel1,
                              unit1_temperatureLogic_channel2,
                              unit1_temperatureLogic_channel3,
                              unit1_temperatureLogic_channel4,
                              unit1_pressureLogic_channel1,
                              unit1_pressureLogic_channel2,
                              unit1_pressureLogic_channel3,
                              unit1_pressureLogic_channel4,
                              unit1_saturationLogic_channel1,
                              unit1_saturationLogic_channel2,
                              unit1_saturationLogic_channel3,
                              unit1_saturationLogic_channel4,
                              unit2_temperatureLogic_channel1,
                              unit2_temperatureLogic_channel2,
                              unit2_temperatureLogic_channel3,
                              unit2_temperatureLogic_channel4,
                              unit2_pressureLogic_channel1,
                              unit2_pressureLogic_channel2,
                              unit2_pressureLogic_channel3,
                              unit2_pressureLogic_channel4,
                              unit2_saturationLogic_channel1,
                              unit2_saturationLogic_channel2,
                              unit2_saturationLogic_channel3,
                              unit2_saturationLogic_channel4),

    eventIns = ISZ[art.UPort](),

    eventOuts = ISZ[art.UPort]()
  )

  val initialization_api : InstrumentationMockThread_i_Initialization_Api = {
    val api = InstrumentationMockThread_i_Initialization_Api(
      id,
      unit1_temperatureLogic_channel1.id,
      unit1_temperatureLogic_channel2.id,
      unit1_temperatureLogic_channel3.id,
      unit1_temperatureLogic_channel4.id,
      unit1_pressureLogic_channel1.id,
      unit1_pressureLogic_channel2.id,
      unit1_pressureLogic_channel3.id,
      unit1_pressureLogic_channel4.id,
      unit1_saturationLogic_channel1.id,
      unit1_saturationLogic_channel2.id,
      unit1_saturationLogic_channel3.id,
      unit1_saturationLogic_channel4.id,
      unit2_temperatureLogic_channel1.id,
      unit2_temperatureLogic_channel2.id,
      unit2_temperatureLogic_channel3.id,
      unit2_temperatureLogic_channel4.id,
      unit2_pressureLogic_channel1.id,
      unit2_pressureLogic_channel2.id,
      unit2_pressureLogic_channel3.id,
      unit2_pressureLogic_channel4.id,
      unit2_saturationLogic_channel1.id,
      unit2_saturationLogic_channel2.id,
      unit2_saturationLogic_channel3.id,
      unit2_saturationLogic_channel4.id
    )
    InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_initialization_api = Some(api)
    api
  }

  val operational_api : InstrumentationMockThread_i_Operational_Api = {
    val api = InstrumentationMockThread_i_Operational_Api(
      id,
      unit1_temperatureLogic_channel1.id,
      unit1_temperatureLogic_channel2.id,
      unit1_temperatureLogic_channel3.id,
      unit1_temperatureLogic_channel4.id,
      unit1_pressureLogic_channel1.id,
      unit1_pressureLogic_channel2.id,
      unit1_pressureLogic_channel3.id,
      unit1_pressureLogic_channel4.id,
      unit1_saturationLogic_channel1.id,
      unit1_saturationLogic_channel2.id,
      unit1_saturationLogic_channel3.id,
      unit1_saturationLogic_channel4.id,
      unit2_temperatureLogic_channel1.id,
      unit2_temperatureLogic_channel2.id,
      unit2_temperatureLogic_channel3.id,
      unit2_temperatureLogic_channel4.id,
      unit2_pressureLogic_channel1.id,
      unit2_pressureLogic_channel2.id,
      unit2_pressureLogic_channel3.id,
      unit2_pressureLogic_channel4.id,
      unit2_saturationLogic_channel1.id,
      unit2_saturationLogic_channel2.id,
      unit2_saturationLogic_channel3.id,
      unit2_saturationLogic_channel4.id
    )
    InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.c_operational_api = Some(api)
    api
  }

  val entryPoints : Bridge.EntryPoints =
    InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge.EntryPoints(
      id,

      unit1_temperatureLogic_channel1.id,
      unit1_temperatureLogic_channel2.id,
      unit1_temperatureLogic_channel3.id,
      unit1_temperatureLogic_channel4.id,
      unit1_pressureLogic_channel1.id,
      unit1_pressureLogic_channel2.id,
      unit1_pressureLogic_channel3.id,
      unit1_pressureLogic_channel4.id,
      unit1_saturationLogic_channel1.id,
      unit1_saturationLogic_channel2.id,
      unit1_saturationLogic_channel3.id,
      unit1_saturationLogic_channel4.id,
      unit2_temperatureLogic_channel1.id,
      unit2_temperatureLogic_channel2.id,
      unit2_temperatureLogic_channel3.id,
      unit2_temperatureLogic_channel4.id,
      unit2_pressureLogic_channel1.id,
      unit2_pressureLogic_channel2.id,
      unit2_pressureLogic_channel3.id,
      unit2_pressureLogic_channel4.id,
      unit2_saturationLogic_channel1.id,
      unit2_saturationLogic_channel2.id,
      unit2_saturationLogic_channel3.id,
      unit2_saturationLogic_channel4.id,

      dispatchTriggers,

      initialization_api,
      operational_api)
}

object InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Bridge {

  var c_initialization_api: Option[InstrumentationMockThread_i_Initialization_Api] = None()
  var c_operational_api: Option[InstrumentationMockThread_i_Operational_Api] = None()

  @datatype class EntryPoints(
    InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_BridgeId : Art.BridgeId,
    unit1_temperatureLogic_channel1_Id : Art.PortId,
    unit1_temperatureLogic_channel2_Id : Art.PortId,
    unit1_temperatureLogic_channel3_Id : Art.PortId,
    unit1_temperatureLogic_channel4_Id : Art.PortId,
    unit1_pressureLogic_channel1_Id : Art.PortId,
    unit1_pressureLogic_channel2_Id : Art.PortId,
    unit1_pressureLogic_channel3_Id : Art.PortId,
    unit1_pressureLogic_channel4_Id : Art.PortId,
    unit1_saturationLogic_channel1_Id : Art.PortId,
    unit1_saturationLogic_channel2_Id : Art.PortId,
    unit1_saturationLogic_channel3_Id : Art.PortId,
    unit1_saturationLogic_channel4_Id : Art.PortId,
    unit2_temperatureLogic_channel1_Id : Art.PortId,
    unit2_temperatureLogic_channel2_Id : Art.PortId,
    unit2_temperatureLogic_channel3_Id : Art.PortId,
    unit2_temperatureLogic_channel4_Id : Art.PortId,
    unit2_pressureLogic_channel1_Id : Art.PortId,
    unit2_pressureLogic_channel2_Id : Art.PortId,
    unit2_pressureLogic_channel3_Id : Art.PortId,
    unit2_pressureLogic_channel4_Id : Art.PortId,
    unit2_saturationLogic_channel1_Id : Art.PortId,
    unit2_saturationLogic_channel2_Id : Art.PortId,
    unit2_saturationLogic_channel3_Id : Art.PortId,
    unit2_saturationLogic_channel4_Id : Art.PortId,
    dispatchTriggers : Option[ISZ[Art.PortId]],
    initialization_api: InstrumentationMockThread_i_Initialization_Api,
    operational_api: InstrumentationMockThread_i_Operational_Api) extends Bridge.EntryPoints {

    val dataInPortIds: ISZ[Art.PortId] = IS()

    val eventInPortIds: ISZ[Art.PortId] = IS()

    val dataOutPortIds: ISZ[Art.PortId] = IS(unit1_temperatureLogic_channel1_Id,
                                             unit1_temperatureLogic_channel2_Id,
                                             unit1_temperatureLogic_channel3_Id,
                                             unit1_temperatureLogic_channel4_Id,
                                             unit1_pressureLogic_channel1_Id,
                                             unit1_pressureLogic_channel2_Id,
                                             unit1_pressureLogic_channel3_Id,
                                             unit1_pressureLogic_channel4_Id,
                                             unit1_saturationLogic_channel1_Id,
                                             unit1_saturationLogic_channel2_Id,
                                             unit1_saturationLogic_channel3_Id,
                                             unit1_saturationLogic_channel4_Id,
                                             unit2_temperatureLogic_channel1_Id,
                                             unit2_temperatureLogic_channel2_Id,
                                             unit2_temperatureLogic_channel3_Id,
                                             unit2_temperatureLogic_channel4_Id,
                                             unit2_pressureLogic_channel1_Id,
                                             unit2_pressureLogic_channel2_Id,
                                             unit2_pressureLogic_channel3_Id,
                                             unit2_pressureLogic_channel4_Id,
                                             unit2_saturationLogic_channel1_Id,
                                             unit2_saturationLogic_channel2_Id,
                                             unit2_saturationLogic_channel3_Id,
                                             unit2_saturationLogic_channel4_Id)

    val eventOutPortIds: ISZ[Art.PortId] = IS()

    def initialise(): Unit = {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_EntryPoint_Companion.pre_initialise()

      // implement the following method in 'component':  def initialise(api: InstrumentationMockThread_i_Initialization_Api): Unit = {}
      component.initialise(initialization_api)

      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_EntryPoint_Companion.post_initialise()

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def compute(): Unit = {
      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_Injection_Service.pre_receiveInput()

      Art.receiveInput(eventInPortIds, dataInPortIds)

      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_EntryPoint_Companion.pre_compute()

      // implement the following in 'component':  def timeTriggered(api: InstrumentationMockThread_i_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread_EntryPoint_Companion.post_compute()

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def finalise(): Unit = {
      // implement the following method in 'component':  def finalise(api: InstrumentationMockThread_i_Operational_Api): Unit = {}
      component.finalise(operational_api)
    }

    override
    def testInitialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: InstrumentationMockThread_i_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testCompute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: InstrumentationMockThread_i_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }
  }
}