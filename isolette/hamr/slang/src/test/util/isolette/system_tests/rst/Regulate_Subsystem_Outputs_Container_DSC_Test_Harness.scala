package isolette.system_tests.rst

import org.sireum._
import isolette._
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

// Distributed SlangCheck Test Harness for isolette.system_tests.rst.Regulate_Subsystem_Outputs_Container

@msig trait Regulate_Subsystem_Outputs_Container_DSC_Test_Harness
  extends Random.Gen.TestRunner[isolette.system_tests.rst.Regulate_Subsystem_Outputs_Container] {

  override def toCompactJson(o: isolette.system_tests.rst.Regulate_Subsystem_Outputs_Container): String = {
    return isolette.JSON.fromsystem_testsrstRegulate_Subsystem_Outputs_Container(o, T)
  }

  override def fromJson(json: String): isolette.system_tests.rst.Regulate_Subsystem_Outputs_Container = {
    isolette.JSON.tosystem_testsrstRegulate_Subsystem_Outputs_Container(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  // you'll need to provide implementations for the following:

  // override def next(): isolette.system_tests.rst.Regulate_Subsystem_Outputs_Container = {}

  // override def test(o: isolette.system_tests.rst.Regulate_Subsystem_Outputs_Container): B = { }
}
