package isolette.system_tests.rst

import org.sireum._
import isolette._
import org.scalatest.BeforeAndAfterAll

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

object Regulate_Subsystem_Inputs_Container_SlangCheck {

  case class NameProvider1(name: String,
                           function: Any => B)

  case class NameProvider2(name: String,
                           function: (Any, Any) => B)

  case class SystemTestConfiguration(name: String,
                                     description: String,
                                     schema: NameProvider2,
                                     profile: Regulate_Subsystem_Inputs_Container_Profile,
                                     filter: NameProvider1,
                                     property: NameProvider2,
                                     componentsOfInterest: ISZ[String],
                                     numTests: Z)
}

trait Regulate_Subsystem_Inputs_Container_SlangCheck
  extends SystemTestSuite with BeforeAndAfterAll {

  def disableLogsAndGuis(): Unit = {

    // disable the various guis
    System.setProperty("java.awt.headless", "true")

    // suppress ART's log stream
    art.ArtNative_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
      override def write(b: Int): Unit = {}
    })

    // suppress the static scheduler's log stream
    art.scheduling.static.StaticSchedulerIO_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
      override def write(b: Int): Unit = {}
    })
  }
}
