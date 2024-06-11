// #Sireum

package tc.TempSensor

import org.sireum._
import tc._
import tc.GumboXUtil.GumboXResult

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
@msig trait TempSensorPeriodic_p_tcproc_tempSensor_GumboX_TestHarness extends TempSensorPeriodic_p_tcproc_tempSensor_TestApi {
  def verbose: B

  /** Contract-based test harness for the initialise entry point
    */
  def testInitialiseCB(
      ): GumboXResult.Type = {

    if (verbose) {
      println(st"""Pre State Values:
                  """.render)
    }

    // [InvokeEntryPoint]: invoke the entry point test method
    testInitialise()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_currentTemp: TempSensor.Temperature_i = get_currentTemp().get

    if (verbose) {
      println(st"""Post State Values:
                  |  api_currentTemp = ${api_currentTemp.string}""".render)
    }

    // [CheckPost]: invoke the oracle function
    val postResult = tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_GumboX.inititialize_IEP_Post(api_currentTemp)
    val result: GumboXResult.Type =
      if (!postResult) GumboXResult.Post_Condition_Fail
      else GumboXResult.Post_Condition_Pass

    return result
  }

  def testComputeCBJ(json: String): GumboXResult.Type = {
    tc.JSON.toTempSensorTempSensorPeriodic_p_tcproc_tempSensor_PreState_Container(json) match {
      case Either.Left(o) => return testComputeCBV(o)
      case Either.Right(msg) => halt(msg.string)
    }
  }

  def testComputeCBV(o: TempSensorPeriodic_p_tcproc_tempSensor_PreState_Container): GumboXResult.Type = {
    return testComputeCB()
  }

  /** Contract-based test harness for the compute entry point
    */
  def testComputeCB(
      ): GumboXResult.Type = {

    // [SaveInLocal]: retrieve and save the current (input) values of GUMBO-declared local state variables as retrieved from the component state
    //   tempSensor does not have incoming ports or state variables

    // [CheckPre]: check/filter based on pre-condition.
    //   tempSensor's compute entry point does not have top level assume clauses

    // [PutInPorts]: put values on the input ports
    //   tempSensor does not have incoming ports

    if (verbose) {
      println(st"""Pre State Values:
                  """.render)
    }

    // [InvokeEntryPoint]: invoke the entry point test method
    testCompute()

    // [RetrieveOutState]: retrieve values of the output ports via get operations and GUMBO declared local state variable
    val api_currentTemp: TempSensor.Temperature_i = get_currentTemp().get

    if (verbose) {
      println(st"""Post State Values:
                  |  api_currentTemp = ${api_currentTemp.string}""".render)
    }

    // [CheckPost]: invoke the oracle function
    val postResult = tc.TempSensor.TempSensorPeriodic_p_tcproc_tempSensor_GumboX.compute_CEP_Post(api_currentTemp)
    val result: GumboXResult.Type =
      if (!postResult) GumboXResult.Post_Condition_Fail
      else GumboXResult.Post_Condition_Pass

    return result
  }
}