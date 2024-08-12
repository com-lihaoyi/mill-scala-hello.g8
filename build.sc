import $ivy.`io.chris-kipp::mill-giter8::0.2.7`

import io.kipp.mill.giter8.G8Module
import mill._
import mill.scalalib._

object g8 extends G8Module {
  override def validationTargets =
    Seq(
      "scalaHelloWorld.compile",
      "scalaHelloWorld.run",
      "scalaHelloWorld.test"
    )
}

/** Just a placeholder module to ensure that Scala Steward detects these and
  * then updates them in the actual template.
  */
object Steward extends ScalaModule {
  def scalaVersion = "2.13.14"
  def ivyDeps = Agg(
    ivy"org.scalameta::munit::1.0.1"
  )
}
