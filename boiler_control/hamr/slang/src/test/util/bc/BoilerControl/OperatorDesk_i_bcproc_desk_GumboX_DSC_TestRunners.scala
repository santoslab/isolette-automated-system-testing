// #Sireum

package bc.BoilerControl

import org.sireum._
import bc.GumboXUtil.GumboXResult
import bc.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Distribute SlangCheck test runners

@record class OperatorDesk_i_bcproc_desk_GumboX_DSC_TestRunner
  extends Random.Gen.TestRunner[OperatorDesk_i_bcproc_desk_PreState_Container_P]
  with OperatorDesk_i_bcproc_desk_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLiblevelFail: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLiblevelRepairAck: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlFail0: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlFail1: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlFail2: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlFail3: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlRepairAck0: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlRepairAck1: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlRepairAck2: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlRepairAck3: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpFail0: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpFail1: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpFail2: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpFail3: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpRepairAck0: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpRepairAck1: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpRepairAck2: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpRepairAck3: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibsteamFail: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibsteamRepairAck: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibopMode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): OperatorDesk_i_bcproc_desk_PreState_Container_P = {
    val api_levelFail = ranLiblevelFail.nextOption_artEmpty()
    val api_levelRepairAck = ranLiblevelRepairAck.nextOption_artEmpty()
    val api_pumpControlFail0 = ranLibpumpControlFail0.nextOption_artEmpty()
    val api_pumpControlFail1 = ranLibpumpControlFail1.nextOption_artEmpty()
    val api_pumpControlFail2 = ranLibpumpControlFail2.nextOption_artEmpty()
    val api_pumpControlFail3 = ranLibpumpControlFail3.nextOption_artEmpty()
    val api_pumpControlRepairAck0 = ranLibpumpControlRepairAck0.nextOption_artEmpty()
    val api_pumpControlRepairAck1 = ranLibpumpControlRepairAck1.nextOption_artEmpty()
    val api_pumpControlRepairAck2 = ranLibpumpControlRepairAck2.nextOption_artEmpty()
    val api_pumpControlRepairAck3 = ranLibpumpControlRepairAck3.nextOption_artEmpty()
    val api_pumpFail0 = ranLibpumpFail0.nextOption_artEmpty()
    val api_pumpFail1 = ranLibpumpFail1.nextOption_artEmpty()
    val api_pumpFail2 = ranLibpumpFail2.nextOption_artEmpty()
    val api_pumpFail3 = ranLibpumpFail3.nextOption_artEmpty()
    val api_pumpRepairAck0 = ranLibpumpRepairAck0.nextOption_artEmpty()
    val api_pumpRepairAck1 = ranLibpumpRepairAck1.nextOption_artEmpty()
    val api_pumpRepairAck2 = ranLibpumpRepairAck2.nextOption_artEmpty()
    val api_pumpRepairAck3 = ranLibpumpRepairAck3.nextOption_artEmpty()
    val api_steamFail = ranLibsteamFail.nextOption_artEmpty()
    val api_steamRepairAck = ranLibsteamRepairAck.nextOption_artEmpty()
    val api_opMode = ranLibopMode.nextOptionBoilerControlOpModeType()
    return OperatorDesk_i_bcproc_desk_PreState_Container_P(
      api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode
    )
  }

  override def toCompactJson(o: OperatorDesk_i_bcproc_desk_PreState_Container_P): String = {
    return bc.JSON.fromBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o, T)
  }

  override def fromJson(json: String): OperatorDesk_i_bcproc_desk_PreState_Container_P = {
    bc.JSON.toBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: OperatorDesk_i_bcproc_desk_PreState_Container_P): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        bc.DSC_RecordUnsatPre.report(bc.JSON.fromBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_P(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}

@record class OperatorDesk_i_bcproc_desk_GumboX_DSC_TestRunnerwL
  extends Random.Gen.TestRunner[OperatorDesk_i_bcproc_desk_PreState_Container_PS]
  with OperatorDesk_i_bcproc_desk_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibisLevelBroken: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibisPumpBroken0: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibisPumpBroken1: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibisPumpBroken2: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibisPumpBroken3: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibisPumpControlBroken0: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibisPumpControlBroken1: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibisPumpControlBroken2: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibisPumpControlBroken3: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibisSteamBroken: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLiblevelFail: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLiblevelRepairAck: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlFail0: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlFail1: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlFail2: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlFail3: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlRepairAck0: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlRepairAck1: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlRepairAck2: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpControlRepairAck3: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpFail0: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpFail1: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpFail2: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpFail3: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpRepairAck0: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpRepairAck1: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpRepairAck2: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibpumpRepairAck3: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibsteamFail: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibsteamRepairAck: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibopMode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): OperatorDesk_i_bcproc_desk_PreState_Container_PS = {
    val In_isLevelBroken = ranLibisLevelBroken.nextB()
    val In_isPumpBroken0 = ranLibisPumpBroken0.nextB()
    val In_isPumpBroken1 = ranLibisPumpBroken1.nextB()
    val In_isPumpBroken2 = ranLibisPumpBroken2.nextB()
    val In_isPumpBroken3 = ranLibisPumpBroken3.nextB()
    val In_isPumpControlBroken0 = ranLibisPumpControlBroken0.nextB()
    val In_isPumpControlBroken1 = ranLibisPumpControlBroken1.nextB()
    val In_isPumpControlBroken2 = ranLibisPumpControlBroken2.nextB()
    val In_isPumpControlBroken3 = ranLibisPumpControlBroken3.nextB()
    val In_isSteamBroken = ranLibisSteamBroken.nextB()
    val api_levelFail = ranLiblevelFail.nextOption_artEmpty()
    val api_levelRepairAck = ranLiblevelRepairAck.nextOption_artEmpty()
    val api_pumpControlFail0 = ranLibpumpControlFail0.nextOption_artEmpty()
    val api_pumpControlFail1 = ranLibpumpControlFail1.nextOption_artEmpty()
    val api_pumpControlFail2 = ranLibpumpControlFail2.nextOption_artEmpty()
    val api_pumpControlFail3 = ranLibpumpControlFail3.nextOption_artEmpty()
    val api_pumpControlRepairAck0 = ranLibpumpControlRepairAck0.nextOption_artEmpty()
    val api_pumpControlRepairAck1 = ranLibpumpControlRepairAck1.nextOption_artEmpty()
    val api_pumpControlRepairAck2 = ranLibpumpControlRepairAck2.nextOption_artEmpty()
    val api_pumpControlRepairAck3 = ranLibpumpControlRepairAck3.nextOption_artEmpty()
    val api_pumpFail0 = ranLibpumpFail0.nextOption_artEmpty()
    val api_pumpFail1 = ranLibpumpFail1.nextOption_artEmpty()
    val api_pumpFail2 = ranLibpumpFail2.nextOption_artEmpty()
    val api_pumpFail3 = ranLibpumpFail3.nextOption_artEmpty()
    val api_pumpRepairAck0 = ranLibpumpRepairAck0.nextOption_artEmpty()
    val api_pumpRepairAck1 = ranLibpumpRepairAck1.nextOption_artEmpty()
    val api_pumpRepairAck2 = ranLibpumpRepairAck2.nextOption_artEmpty()
    val api_pumpRepairAck3 = ranLibpumpRepairAck3.nextOption_artEmpty()
    val api_steamFail = ranLibsteamFail.nextOption_artEmpty()
    val api_steamRepairAck = ranLibsteamRepairAck.nextOption_artEmpty()
    val api_opMode = ranLibopMode.nextOptionBoilerControlOpModeType()
    return OperatorDesk_i_bcproc_desk_PreState_Container_PS(
      In_isLevelBroken, In_isPumpBroken0, In_isPumpBroken1, In_isPumpBroken2, In_isPumpBroken3, In_isPumpControlBroken0, In_isPumpControlBroken1, In_isPumpControlBroken2, In_isPumpControlBroken3, In_isSteamBroken, api_levelFail, api_levelRepairAck, api_pumpControlFail0, api_pumpControlFail1, api_pumpControlFail2, api_pumpControlFail3, api_pumpControlRepairAck0, api_pumpControlRepairAck1, api_pumpControlRepairAck2, api_pumpControlRepairAck3, api_pumpFail0, api_pumpFail1, api_pumpFail2, api_pumpFail3, api_pumpRepairAck0, api_pumpRepairAck1, api_pumpRepairAck2, api_pumpRepairAck3, api_steamFail, api_steamRepairAck, api_opMode
    )
  }

  override def toCompactJson(o: OperatorDesk_i_bcproc_desk_PreState_Container_PS): String = {
    return bc.JSON.fromBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o, T)
  }

  override def fromJson(json: String): OperatorDesk_i_bcproc_desk_PreState_Container_PS = {
    bc.JSON.toBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: OperatorDesk_i_bcproc_desk_PreState_Container_PS): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBwLV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        bc.DSC_RecordUnsatPre.report(bc.JSON.fromBoilerControlOperatorDesk_i_bcproc_desk_PreState_Container_PS(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}
