import $ivy.`io.chris-kipp::mill-giter8::0.2.0`

import io.kipp.mill.giter8.G8Module

object g8 extends G8Module {
  override def validationTargets =
    Seq("scalaHelloWorld.compile", "scalaHelloWorld.run", "scalaHelloWorld.test")
}
