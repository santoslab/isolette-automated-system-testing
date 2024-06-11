// #Sireum

import org.sireum._

val homeBin = Os.slashDir

val sireum: Os.Path = Os.path(Os.env("SIREUM_HOME").get) / "bin" / (if (Os.isWin) "sireum.bat" else "sireum")
val repoRoot: Os.Path = homeBin.up.up.up.up

proc"${homeBin / "sergen_sys.cmd"}".console.runCheck()
proc"${homeBin / "slangcheck_sys.cmd"}".console.runCheck()

val genLoc = repoRoot.up / "hamr-system-testing-artifact-generator"

val mon = homeBin.up / "src" / "main" / "util" / "isolette" / "system_tests" / "monitor1" / "Monitor_Subsystem_Containers.scala"
val reg = homeBin.up / "src" / "main" / "util" / "isolette" / "system_tests" / "rst" / "Regulate_Subsystem_Containers.scala"

var jarLoc = genLoc / "out" / "hamr-system-testing-artifact-generator" / "assemble" / "hamr-system-testing-artifact-generator.jar.bat"
if (!jarLoc.exists) {
  println("Fetching the system testing artifact generator ...")
  proc"git clone https://github.com/santoslab/hamr-system-testing-artifact-generator.git $genLoc".console.runCheck()
  proc"$sireum proyek assemble --uber -m org.sireum.hamr.systest.generator.SystemTestArtifactGen $genLoc".console.runCheck()
}

if (jarLoc.exists) {
  println("Running system testing artifact generator ...")
  proc"$jarLoc ${homeBin.up} $mon $reg".console.runCheck()
} else {
  println("Please assemble the sys test generator via the instructions in its readme")
}
