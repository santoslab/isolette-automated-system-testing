// #Sireum

package bc.BoilerControl

import org.sireum._
import bc.GumboXUtil.GumboXResult
import bc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Distribute SlangCheck test runners

@record class Boiler_i_bcproc_boiler_GumboX_DSC_TestRunner
  extends Random.Gen.TestRunner[Boiler_i_bcproc_boiler_PreState_Container_P]
  with Boiler_i_bcproc_boiler_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibprogramReady: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibvalve: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibopMode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): Boiler_i_bcproc_boiler_PreState_Container_P = {
    val api_programReady = ranLibprogramReady.nextOption_artEmpty()
    val api_valve = ranLibvalve.nextOption_artEmpty()
    val api_opMode = ranLibopMode.nextOptionBoilerControlOpModeType()
    return Boiler_i_bcproc_boiler_PreState_Container_P(
      api_programReady, api_valve, api_opMode
    )
  }

  override def toCompactJson(o: Boiler_i_bcproc_boiler_PreState_Container_P): String = {
    return bc.JSON.fromBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o, T)
  }

  override def fromJson(json: String): Boiler_i_bcproc_boiler_PreState_Container_P = {
    bc.JSON.toBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: Boiler_i_bcproc_boiler_PreState_Container_P): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        bc.DSC_RecordUnsatPre.report(bc.JSON.fromBoilerControlBoiler_i_bcproc_boiler_PreState_Container_P(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}

@record class Boiler_i_bcproc_boiler_GumboX_DSC_TestRunnerwL
  extends Random.Gen.TestRunner[Boiler_i_bcproc_boiler_PreState_Container_PS]
  with Boiler_i_bcproc_boiler_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibMode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibValveOpen: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibprogramReady: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibvalve: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibopMode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): Boiler_i_bcproc_boiler_PreState_Container_PS = {
    val In_Mode = ranLibMode.nextBoilerControlOpModeType()
    val In_ValveOpen = ranLibValveOpen.nextB()
    val api_programReady = ranLibprogramReady.nextOption_artEmpty()
    val api_valve = ranLibvalve.nextOption_artEmpty()
    val api_opMode = ranLibopMode.nextOptionBoilerControlOpModeType()
    return Boiler_i_bcproc_boiler_PreState_Container_PS(
      In_Mode, In_ValveOpen, api_programReady, api_valve, api_opMode
    )
  }

  override def toCompactJson(o: Boiler_i_bcproc_boiler_PreState_Container_PS): String = {
    return bc.JSON.fromBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o, T)
  }

  override def fromJson(json: String): Boiler_i_bcproc_boiler_PreState_Container_PS = {
    bc.JSON.toBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: Boiler_i_bcproc_boiler_PreState_Container_PS): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBwLV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        bc.DSC_RecordUnsatPre.report(bc.JSON.fromBoilerControlBoiler_i_bcproc_boiler_PreState_Container_PS(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}