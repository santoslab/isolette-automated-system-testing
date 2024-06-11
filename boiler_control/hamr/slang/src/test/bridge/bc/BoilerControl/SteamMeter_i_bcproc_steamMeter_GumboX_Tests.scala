package bc.BoilerControl

import org.sireum._
import bc.BoilerControl._
import bc._
import org.sireum.Random.Impl.Xoshiro256

// This file will not be overwritten so is safe to edit

class SteamMeter_i_bcproc_steamMeter_GumboX_Tests extends SteamMeter_i_bcproc_steamMeter_GumboX_TestHarness_ScalaTest_Generator {

  // set verbose to T to see pre/post state values and generated unit tests
  // that can be copied/pasted to replay a test
  override val verbose: B = F

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  override val failOnUnsatPreconditions: B = F

  // profiles that will be used for the initialise tests
  override def getInitialiseProfiles: MSZ[SteamMeter_i_bcproc_steamMeter_Profile] = {
    return MSZ(getDefaultInitialiseProfile)
  }

  // profiles that will be used to generate the incoming port values
  override def getProfiles_P: MSZ[SteamMeter_i_bcproc_steamMeter_Profile_P] = {
    return MSZ(getDefaultProfile_P)
  }

  // profiles that will be used to generate the incoming port values
  // and the pre-state values of the state variables
  override def getProfiles_PS: MSZ[SteamMeter_i_bcproc_steamMeter_Profile_PS] = {
    return MSZ(getDefaultProfile_PS)
  }
}