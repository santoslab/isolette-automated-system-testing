// #Sireum

import org.sireum._

val homeBin = Os.slashDir

val sireum: Os.Path = Os.path(Os.env("SIREUM_HOME").get) / "bin" / (if(Os.isWin) "sireum.bat" else "sireum")
val repoRoot: Os.Path = homeBin.up.up.up.up

proc"${homeBin / "sergen_sys.cmd"}".console.runCheck()
proc"${homeBin / "slangcheck_sys.cmd"}".console.runCheck()

val genLoc = repoRoot.up / "hamr-system-testing-artifact-generator"

val mon = homeBin.up / "src" / "main" / "util" / "isolette" / "system_tests" / "monitor1" / "Monitor_Subsystem_Containers.scala"
val reg = homeBin.up / "src" / "main" / "util" / "isolette" / "system_tests" / "rst" / "Regulate_Subsystem_Containers.scala"

if (genLoc.exists) {
  val jarLoc = genLoc / "out" / "hamr-system-testing-artifact-generator" / "assemble" / "hamr-system-testing-artifact-generator.jar.bat"
  if (jarLoc.exists) {
    println("Running system testing artifact generator ...")
    proc"$jarLoc ${homeBin.up} $mon $reg".console.runCheck()
  } else {
    println("Please assemble the sys test generator via the instructions in its readme")
  }
} else {
  println(s"Expected the sys testing artifact generator to be at ${genLoc.value}")
}