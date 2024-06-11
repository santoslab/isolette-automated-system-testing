package tc.system_tests

import org.sireum._
import tc._
import tc.system_tests.TempControl_Inputs_Container_SlangCheck.TestRow

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

object Example_TempControl_Inputs_Container_DSC_Test_Harness extends App {

  // main generates the Jenkins build parameters string and the JSON serialized testRow information
  override def main(args: ISZ[String]): Z = {
    val projectName = "tc"

    var args: ISZ[(String, String)] = ISZ()

    args = args :+ ("DSC_TIMEOUT", s"$$DSC_TIMEOUT")

    args = args :+ ("DSC_PROJECT_NAME", projectName)

    val instance = new Example_TempControl_Inputs_Container_DSC_Test_Harness()

    val runnerClassName = ops.StringOps(instance.getClass.getName).replaceAllLiterally("$", "")
    val runnerSimpleName = ops.StringOps(instance.getClass.getSimpleName).replaceAllLiterally("$", "")

    args = args :+ ("DSC_RUNNER_SIMPLE_NAME", runnerSimpleName)
    args = args :+ ("DSC_RUNNER_CLASS_NAME", runnerClassName)

    val families: ISZ[(String, TestRow)] = instance.testMatrix.entries

    for (e <- families) {
      val familyName = e._1

      assert (!ops.StringOps(familyName).contains(" "), s"keys cannot contain spaces: $familyName")

      val fargs = args :+ ("DSC_TEST_FAMILY_NAME", familyName)

      val data = for(f <- fargs) yield s"--data ${f._1}=${f._2}"
      val command = st"${(data, " ")}"

      println(command.render)
      println(instance.genTestNameJson(e._1, e._2))
    }
    return 0
  }
}

class Example_TempControl_Inputs_Container_DSC_Test_Harness
  extends Example_TempControl_Inputs_Container_Test_wSlangCheck
  with TempControl_Inputs_Container_DSC_Test_Harness {

  override def next(): tc.system_tests.TempControl_Inputs_Container = {
    val testRow = testMatrix.get(getTestId()).get
    return TempControl_Inputs_Container_Profile.next(testRow.profile)
  }

  override def test(o: tc.system_tests.TempControl_Inputs_Container): B = {
    val testId = getTestId()
    val testRow = testMatrix.get(testId).get

    if (verbose) {
      println(genTestName(testId, testRow))
    }

    disableLogsAndGuis()

    super.beforeEach()

    if (!testRow.preStateCheck(o)) {

      if (verbose) {
        println(s"  Didn't pass pre state check ${o}")
      }

      DSC_RecordUnsatPre.report(toCompactJson(o))

      return T
    } else {

      val result = testRow.testMethod.function(o, testRow.property.function)

      this.afterEach()

      if (verbose) {
        println(s"  ${result}")
      }
      return result
    }
  }

  def getTestId(): String = {
    Os.prop("DSC_TEST_FAMILY_NAME") match {
      case Some(v) => return v
      case _ =>
        Os.env("DSC_TEST_FAMILY_NAME") match {
          case Some(v) => return v
          case _ =>
        }
    }
    halt("DSC_TEST_FAMILY_NAME not defined")
  }

  override def string: String = toString

  override def $clonable: Boolean = F

  override def $clonable_=(b: Boolean): org.sireum.$internal.MutableMarker = this

  override def $owned: Boolean = F

  override def $owned_=(b: Boolean): org.sireum.$internal.MutableMarker = this

  override def $clone: org.sireum.$internal.MutableMarker = this
}