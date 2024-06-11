// #Sireum

package bc.BoilerControl

import org.sireum._
import art._
import bc._
import bc.BoilerControl.{OperatorDesk_i_bcproc_desk => component}

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

@datatype class OperatorDesk_i_bcproc_desk_Bridge(
  val id: Art.BridgeId,
  val name: String,
  val dispatchProtocol: DispatchPropertyProtocol,
  val dispatchTriggers: Option[ISZ[Art.PortId]],

  opMode: Port[BoilerControl.OpMode.Type],
  pumpFail0: Port[art.Empty],
  pumpFail1: Port[art.Empty],
  pumpFail2: Port[art.Empty],
  pumpFail3: Port[art.Empty],
  pumpControlFail0: Port[art.Empty],
  pumpControlFail1: Port[art.Empty],
  pumpControlFail2: Port[art.Empty],
  pumpControlFail3: Port[art.Empty],
  levelFail: Port[art.Empty],
  steamFail: Port[art.Empty],
  pumpRepairAck0: Port[art.Empty],
  pumpRepairAck1: Port[art.Empty],
  pumpRepairAck2: Port[art.Empty],
  pumpRepairAck3: Port[art.Empty],
  pumpControlRepairAck0: Port[art.Empty],
  pumpControlRepairAck1: Port[art.Empty],
  pumpControlRepairAck2: Port[art.Empty],
  pumpControlRepairAck3: Port[art.Empty],
  levelRepairAck: Port[art.Empty],
  steamRepairAck: Port[art.Empty],
  stop: Port[art.Empty],
  pumpRepair0: Port[art.Empty],
  pumpRepair1: Port[art.Empty],
  pumpRepair2: Port[art.Empty],
  pumpRepair3: Port[art.Empty],
  pumpControlRepair0: Port[art.Empty],
  pumpControlRepair1: Port[art.Empty],
  pumpControlRepair2: Port[art.Empty],
  pumpControlRepair3: Port[art.Empty],
  levelRepair: Port[art.Empty],
  steamRepair: Port[art.Empty],
  pumpFailAck0: Port[art.Empty],
  pumpFailAck1: Port[art.Empty],
  pumpFailAck2: Port[art.Empty],
  pumpFailAck3: Port[art.Empty],
  pumpControlFailAck0: Port[art.Empty],
  pumpControlFailAck1: Port[art.Empty],
  pumpControlFailAck2: Port[art.Empty],
  pumpControlFailAck3: Port[art.Empty],
  levelFailAck: Port[art.Empty],
  steamFailAck: Port[art.Empty]
  ) extends Bridge {

  val ports : Bridge.Ports = Bridge.Ports(
    dataIns = ISZ[art.UPort](),

    dataOuts = ISZ[art.UPort](),

    eventIns = ISZ[art.UPort](opMode,
                              pumpFail0,
                              pumpFail1,
                              pumpFail2,
                              pumpFail3,
                              pumpControlFail0,
                              pumpControlFail1,
                              pumpControlFail2,
                              pumpControlFail3,
                              levelFail,
                              steamFail,
                              pumpRepairAck0,
                              pumpRepairAck1,
                              pumpRepairAck2,
                              pumpRepairAck3,
                              pumpControlRepairAck0,
                              pumpControlRepairAck1,
                              pumpControlRepairAck2,
                              pumpControlRepairAck3,
                              levelRepairAck,
                              steamRepairAck),

    eventOuts = ISZ[art.UPort](stop,
                               pumpRepair0,
                               pumpRepair1,
                               pumpRepair2,
                               pumpRepair3,
                               pumpControlRepair0,
                               pumpControlRepair1,
                               pumpControlRepair2,
                               pumpControlRepair3,
                               levelRepair,
                               steamRepair,
                               pumpFailAck0,
                               pumpFailAck1,
                               pumpFailAck2,
                               pumpFailAck3,
                               pumpControlFailAck0,
                               pumpControlFailAck1,
                               pumpControlFailAck2,
                               pumpControlFailAck3,
                               levelFailAck,
                               steamFailAck)
  )

  val initialization_api : OperatorDesk_i_Initialization_Api = {
    val api = OperatorDesk_i_Initialization_Api(
      id,
      opMode.id,
      pumpFail0.id,
      pumpFail1.id,
      pumpFail2.id,
      pumpFail3.id,
      pumpControlFail0.id,
      pumpControlFail1.id,
      pumpControlFail2.id,
      pumpControlFail3.id,
      levelFail.id,
      steamFail.id,
      pumpRepairAck0.id,
      pumpRepairAck1.id,
      pumpRepairAck2.id,
      pumpRepairAck3.id,
      pumpControlRepairAck0.id,
      pumpControlRepairAck1.id,
      pumpControlRepairAck2.id,
      pumpControlRepairAck3.id,
      levelRepairAck.id,
      steamRepairAck.id,
      stop.id,
      pumpRepair0.id,
      pumpRepair1.id,
      pumpRepair2.id,
      pumpRepair3.id,
      pumpControlRepair0.id,
      pumpControlRepair1.id,
      pumpControlRepair2.id,
      pumpControlRepair3.id,
      levelRepair.id,
      steamRepair.id,
      pumpFailAck0.id,
      pumpFailAck1.id,
      pumpFailAck2.id,
      pumpFailAck3.id,
      pumpControlFailAck0.id,
      pumpControlFailAck1.id,
      pumpControlFailAck2.id,
      pumpControlFailAck3.id,
      levelFailAck.id,
      steamFailAck.id
    )
    OperatorDesk_i_bcproc_desk_Bridge.c_initialization_api = Some(api)
    api
  }

  val operational_api : OperatorDesk_i_Operational_Api = {
    val api = OperatorDesk_i_Operational_Api(
      id,
      opMode.id,
      pumpFail0.id,
      pumpFail1.id,
      pumpFail2.id,
      pumpFail3.id,
      pumpControlFail0.id,
      pumpControlFail1.id,
      pumpControlFail2.id,
      pumpControlFail3.id,
      levelFail.id,
      steamFail.id,
      pumpRepairAck0.id,
      pumpRepairAck1.id,
      pumpRepairAck2.id,
      pumpRepairAck3.id,
      pumpControlRepairAck0.id,
      pumpControlRepairAck1.id,
      pumpControlRepairAck2.id,
      pumpControlRepairAck3.id,
      levelRepairAck.id,
      steamRepairAck.id,
      stop.id,
      pumpRepair0.id,
      pumpRepair1.id,
      pumpRepair2.id,
      pumpRepair3.id,
      pumpControlRepair0.id,
      pumpControlRepair1.id,
      pumpControlRepair2.id,
      pumpControlRepair3.id,
      levelRepair.id,
      steamRepair.id,
      pumpFailAck0.id,
      pumpFailAck1.id,
      pumpFailAck2.id,
      pumpFailAck3.id,
      pumpControlFailAck0.id,
      pumpControlFailAck1.id,
      pumpControlFailAck2.id,
      pumpControlFailAck3.id,
      levelFailAck.id,
      steamFailAck.id
    )
    OperatorDesk_i_bcproc_desk_Bridge.c_operational_api = Some(api)
    api
  }

  val entryPoints : Bridge.EntryPoints =
    OperatorDesk_i_bcproc_desk_Bridge.EntryPoints(
      id,

      opMode.id,
      pumpFail0.id,
      pumpFail1.id,
      pumpFail2.id,
      pumpFail3.id,
      pumpControlFail0.id,
      pumpControlFail1.id,
      pumpControlFail2.id,
      pumpControlFail3.id,
      levelFail.id,
      steamFail.id,
      pumpRepairAck0.id,
      pumpRepairAck1.id,
      pumpRepairAck2.id,
      pumpRepairAck3.id,
      pumpControlRepairAck0.id,
      pumpControlRepairAck1.id,
      pumpControlRepairAck2.id,
      pumpControlRepairAck3.id,
      levelRepairAck.id,
      steamRepairAck.id,
      stop.id,
      pumpRepair0.id,
      pumpRepair1.id,
      pumpRepair2.id,
      pumpRepair3.id,
      pumpControlRepair0.id,
      pumpControlRepair1.id,
      pumpControlRepair2.id,
      pumpControlRepair3.id,
      levelRepair.id,
      steamRepair.id,
      pumpFailAck0.id,
      pumpFailAck1.id,
      pumpFailAck2.id,
      pumpFailAck3.id,
      pumpControlFailAck0.id,
      pumpControlFailAck1.id,
      pumpControlFailAck2.id,
      pumpControlFailAck3.id,
      levelFailAck.id,
      steamFailAck.id,

      dispatchTriggers,

      initialization_api,
      operational_api)
}

object OperatorDesk_i_bcproc_desk_Bridge {

  var c_initialization_api: Option[OperatorDesk_i_Initialization_Api] = None()
  var c_operational_api: Option[OperatorDesk_i_Operational_Api] = None()

  @datatype class EntryPoints(
    OperatorDesk_i_bcproc_desk_BridgeId : Art.BridgeId,
    opMode_Id : Art.PortId,
    pumpFail0_Id : Art.PortId,
    pumpFail1_Id : Art.PortId,
    pumpFail2_Id : Art.PortId,
    pumpFail3_Id : Art.PortId,
    pumpControlFail0_Id : Art.PortId,
    pumpControlFail1_Id : Art.PortId,
    pumpControlFail2_Id : Art.PortId,
    pumpControlFail3_Id : Art.PortId,
    levelFail_Id : Art.PortId,
    steamFail_Id : Art.PortId,
    pumpRepairAck0_Id : Art.PortId,
    pumpRepairAck1_Id : Art.PortId,
    pumpRepairAck2_Id : Art.PortId,
    pumpRepairAck3_Id : Art.PortId,
    pumpControlRepairAck0_Id : Art.PortId,
    pumpControlRepairAck1_Id : Art.PortId,
    pumpControlRepairAck2_Id : Art.PortId,
    pumpControlRepairAck3_Id : Art.PortId,
    levelRepairAck_Id : Art.PortId,
    steamRepairAck_Id : Art.PortId,
    stop_Id : Art.PortId,
    pumpRepair0_Id : Art.PortId,
    pumpRepair1_Id : Art.PortId,
    pumpRepair2_Id : Art.PortId,
    pumpRepair3_Id : Art.PortId,
    pumpControlRepair0_Id : Art.PortId,
    pumpControlRepair1_Id : Art.PortId,
    pumpControlRepair2_Id : Art.PortId,
    pumpControlRepair3_Id : Art.PortId,
    levelRepair_Id : Art.PortId,
    steamRepair_Id : Art.PortId,
    pumpFailAck0_Id : Art.PortId,
    pumpFailAck1_Id : Art.PortId,
    pumpFailAck2_Id : Art.PortId,
    pumpFailAck3_Id : Art.PortId,
    pumpControlFailAck0_Id : Art.PortId,
    pumpControlFailAck1_Id : Art.PortId,
    pumpControlFailAck2_Id : Art.PortId,
    pumpControlFailAck3_Id : Art.PortId,
    levelFailAck_Id : Art.PortId,
    steamFailAck_Id : Art.PortId,
    dispatchTriggers : Option[ISZ[Art.PortId]],
    initialization_api: OperatorDesk_i_Initialization_Api,
    operational_api: OperatorDesk_i_Operational_Api) extends Bridge.EntryPoints {

    val dataInPortIds: ISZ[Art.PortId] = IS()

    val eventInPortIds: ISZ[Art.PortId] = IS(opMode_Id,
                                             pumpFail0_Id,
                                             pumpFail1_Id,
                                             pumpFail2_Id,
                                             pumpFail3_Id,
                                             pumpControlFail0_Id,
                                             pumpControlFail1_Id,
                                             pumpControlFail2_Id,
                                             pumpControlFail3_Id,
                                             levelFail_Id,
                                             steamFail_Id,
                                             pumpRepairAck0_Id,
                                             pumpRepairAck1_Id,
                                             pumpRepairAck2_Id,
                                             pumpRepairAck3_Id,
                                             pumpControlRepairAck0_Id,
                                             pumpControlRepairAck1_Id,
                                             pumpControlRepairAck2_Id,
                                             pumpControlRepairAck3_Id,
                                             levelRepairAck_Id,
                                             steamRepairAck_Id)

    val dataOutPortIds: ISZ[Art.PortId] = IS()

    val eventOutPortIds: ISZ[Art.PortId] = IS(stop_Id,
                                              pumpRepair0_Id,
                                              pumpRepair1_Id,
                                              pumpRepair2_Id,
                                              pumpRepair3_Id,
                                              pumpControlRepair0_Id,
                                              pumpControlRepair1_Id,
                                              pumpControlRepair2_Id,
                                              pumpControlRepair3_Id,
                                              levelRepair_Id,
                                              steamRepair_Id,
                                              pumpFailAck0_Id,
                                              pumpFailAck1_Id,
                                              pumpFailAck2_Id,
                                              pumpFailAck3_Id,
                                              pumpControlFailAck0_Id,
                                              pumpControlFailAck1_Id,
                                              pumpControlFailAck2_Id,
                                              pumpControlFailAck3_Id,
                                              levelFailAck_Id,
                                              steamFailAck_Id)

    def initialise(): Unit = {
      OperatorDesk_i_bcproc_desk_EntryPoint_Companion.pre_initialise()

      // implement the following method in 'component':  def initialise(api: OperatorDesk_i_Initialization_Api): Unit = {}
      component.initialise(initialization_api)

      OperatorDesk_i_bcproc_desk_EntryPoint_Companion.post_initialise()

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def compute(): Unit = {
      OperatorDesk_i_bcproc_desk_Injection_Service.pre_receiveInput()

      Art.receiveInput(eventInPortIds, dataInPortIds)

      OperatorDesk_i_bcproc_desk_EntryPoint_Companion.pre_compute()

      // implement the following in 'component':  def timeTriggered(api: OperatorDesk_i_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      OperatorDesk_i_bcproc_desk_EntryPoint_Companion.post_compute()

      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def activate(): Unit = {
      // implement the following method in 'component':  def activate(api: OperatorDesk_i_Operational_Api): Unit = {}
      component.activate(operational_api)
    }

    def deactivate(): Unit = {
      // implement the following method in 'component':  def deactivate(api: OperatorDesk_i_Operational_Api): Unit = {}
      component.deactivate(operational_api)
    }

    def finalise(): Unit = {
      // implement the following method in 'component':  def finalise(api: OperatorDesk_i_Operational_Api): Unit = {}
      component.finalise(operational_api)
    }

    def recover(): Unit = {
      // implement the following method in 'component':  def recover(api: OperatorDesk_i_Operational_Api): Unit = {}
      component.recover(operational_api)
    }

    override
    def testInitialise(): Unit = {
      // implement the following method in 'component':  def initialise(api: OperatorDesk_i_Initialization_Api): Unit = {}
      component.initialise(initialization_api)
      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testCompute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)

      // implement the following in 'component':  def timeTriggered(api: OperatorDesk_i_Operational_Api): Unit = {}
      component.timeTriggered(operational_api)

      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }
  }
}