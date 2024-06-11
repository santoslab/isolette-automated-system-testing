package isolette.system_tests.rst

import org.sireum._
import isolette._
import isolette.system_tests.rst.Regulate_Subsystem_Inputs_Container_SlangCheck.SystemTestConfiguration

object Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness extends App {

  override def main(args: ISZ[String]): Z = {
    // Regenerate the json files and emit their locations to the console. The
    // exampleJenkinsScript.cmd will use these to get the test configurations keys
    Regulate_Subsystem_Test_wSlangCheck.genJsons(T)

    return 0
  }
}

class Regulate_Subsystem_Test_wSlangCheck_DSC_Test_Harness
  extends Regulate_Subsystem_Test_wSlangCheck
    with Regulate_Subsystem_Inputs_Container_DSC_Test_Harness {

  override def next(): isolette.system_tests.rst.Regulate_Subsystem_Inputs_Container = {
    return getConfig().profile.next()
  }

  override def test(o: isolette.system_tests.rst.Regulate_Subsystem_Inputs_Container): B = {
    val config = getConfig()


    if (verbose) {
      println(genTestName(config))
    }

    disableLogsAndGuis()

    super.beforeEach()

    if (!config.filter.function(o)) {

      if (verbose) {
        println(s"  Didn't pass pre state check ${o}")
      }

      DSC_RecordUnsatPre.report(toCompactJson(o))

      return T
    } else {

      val result = config.schema.function(o, config.property.function)

      this.afterEach()

      if (verbose) {
        println(s"  ${result}")
      }
      return result
    }
  }

  def getConfig(): SystemTestConfiguration = {
    Os.prop("DSC_TEST_CONFIGURATION_NAME") match {
      case Some(v) => return ops.ISZOps(configurations).filter(p => p.name == v)(0)
      case _ =>
        Os.env("DSC_TEST_CONFIGURATION_NAME") match {
          case Some(v) => return ops.ISZOps(configurations).filter(p => p.name == v)(0)
          case _ =>
        }
    }
    halt("DSC_TEST_CONFIGURATION_NAME not defined")
  }

  override def string: String = toString

  override def $clonable: Boolean = F

  override def $clonable_=(b: Boolean): org.sireum.$internal.MutableMarker = this

  override def $owned: Boolean = F

  override def $owned_=(b: Boolean): org.sireum.$internal.MutableMarker = this

  override def $clone: org.sireum.$internal.MutableMarker = this
}
