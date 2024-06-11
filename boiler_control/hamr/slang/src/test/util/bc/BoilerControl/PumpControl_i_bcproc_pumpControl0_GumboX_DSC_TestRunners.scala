// #Sireum

package bc.BoilerControl

import org.sireum._
import bc.GumboXUtil.GumboXResult
import bc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Distribute SlangCheck test runners

@record class PumpControl_i_bcproc_pumpControl0_GumboX_DSC_TestRunner
  extends Random.Gen.TestRunner[PumpControl_i_bcproc_pumpControl0_PreState_Container_P]
  with PumpControl_i_bcproc_pumpControl0_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibprogramReady: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibopMode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibopenPump: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): PumpControl_i_bcproc_pumpControl0_PreState_Container_P = {
    val api_programReady = ranLibprogramReady.nextOption_artEmpty()
    val api_opMode = ranLibopMode.nextOptionBoilerControlOpModeType()
    val api_openPump = ranLibopenPump.nextOptionB()
    return PumpControl_i_bcproc_pumpControl0_PreState_Container_P(
      api_programReady, api_opMode, api_openPump
    )
  }

  override def toCompactJson(o: PumpControl_i_bcproc_pumpControl0_PreState_Container_P): String = {
    return bc.JSON.fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o, T)
  }

  override def fromJson(json: String): PumpControl_i_bcproc_pumpControl0_PreState_Container_P = {
    bc.JSON.toBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: PumpControl_i_bcproc_pumpControl0_PreState_Container_P): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        bc.DSC_RecordUnsatPre.report(bc.JSON.fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_P(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}

@record class PumpControl_i_bcproc_pumpControl0_GumboX_DSC_TestRunnerwL
  extends Random.Gen.TestRunner[PumpControl_i_bcproc_pumpControl0_PreState_Container_PS]
  with PumpControl_i_bcproc_pumpControl0_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibisPumpFlow: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibisPumpOpen: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpNumber: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibprogramReady: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibopMode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibopenPump: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): PumpControl_i_bcproc_pumpControl0_PreState_Container_PS = {
    val In_isPumpFlow = ranLibisPumpFlow.nextB()
    val In_isPumpOpen = ranLibisPumpOpen.nextB()
    val In_pumpNumber = ranLibpumpNumber.nextZ()
    val api_programReady = ranLibprogramReady.nextOption_artEmpty()
    val api_opMode = ranLibopMode.nextOptionBoilerControlOpModeType()
    val api_openPump = ranLibopenPump.nextOptionB()
    return PumpControl_i_bcproc_pumpControl0_PreState_Container_PS(
      In_isPumpFlow, In_isPumpOpen, In_pumpNumber, api_programReady, api_opMode, api_openPump
    )
  }

  override def toCompactJson(o: PumpControl_i_bcproc_pumpControl0_PreState_Container_PS): String = {
    return bc.JSON.fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o, T)
  }

  override def fromJson(json: String): PumpControl_i_bcproc_pumpControl0_PreState_Container_PS = {
    bc.JSON.toBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: PumpControl_i_bcproc_pumpControl0_PreState_Container_PS): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBwLV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        bc.DSC_RecordUnsatPre.report(bc.JSON.fromBoilerControlPumpControl_i_bcproc_pumpControl0_PreState_Container_PS(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}
