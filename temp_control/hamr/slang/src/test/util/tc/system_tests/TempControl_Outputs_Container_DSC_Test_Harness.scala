package tc.system_tests

import org.sireum._
import tc._
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

// Distributed SlangCheck Test Harness for tc.system_tests.TempControl_Outputs_Container

@msig trait TempControl_Outputs_Container_DSC_Test_Harness
  extends Random.Gen.TestRunner[tc.system_tests.TempControl_Outputs_Container] {

  override def toCompactJson(o: tc.system_tests.TempControl_Outputs_Container): String = {
    return tc.JSON.fromsystem_testsTempControl_Outputs_Container(o, T)
  }

  override def fromJson(json: String): tc.system_tests.TempControl_Outputs_Container = {
    tc.JSON.tosystem_testsTempControl_Outputs_Container(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  // you'll need to provide implementations for the following:

  // override def next(): tc.system_tests.TempControl_Outputs_Container = {}

  // override def test(o: tc.system_tests.TempControl_Outputs_Container): B = { }
}
