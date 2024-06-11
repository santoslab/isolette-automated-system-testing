package RTS.system_tests.rts1

import org.sireum._
import RTS._
import org.scalatest.BeforeAndAfterAll

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

object Actuation_Subsystem_Inputs_Container_SlangCheck {

  case class NameProvider1(name: String,
                           function: Any => B)

  case class NameProvider2(name: String,
                           function: (Any, Any) => B)

  case class TestConfiguration(schema: NameProvider2,
                               description: String,
                               profile: Actuation_Subsystem_Inputs_Container_Profile,
                               filter: NameProvider1,
                               property: NameProvider2,
                               components: ISZ[String],
                               numTests: Z)
}

trait Actuation_Subsystem_Inputs_Container_SlangCheck
  extends SystemTestSuite with BeforeAndAfterAll {


  def next(profile: Actuation_Subsystem_Inputs_Container_Profile): Option[Actuation_Subsystem_Inputs_Container] = {
    return Actuation_Subsystem_Inputs_Container_Profile.nextH(profile)
  }

  def freshRandomLib: RandomLib = {
    return Actuation_Subsystem_Inputs_Container_Util.freshRandomLib
  }

  def getProfiles: MSZ[Actuation_Subsystem_Inputs_Container_Profile] = {
    return MSZ(getDefaultProfile)
  }

  //------------------------------------------------
  //  Test Vector Profiles
  //
  //   ..eventually auto-generated from a descriptor
  //     of injection vector
  //------------------------------------------------

  def getDefaultProfile: Actuation_Subsystem_Inputs_Container_Profile = {
    return Actuation_Subsystem_Inputs_Container_Profile.getDefaultProfile
  }

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