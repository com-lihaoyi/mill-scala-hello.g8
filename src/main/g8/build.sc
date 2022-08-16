import mill._
import mill.scalalib._

object $name;format="camel"$ extends ScalaModule {

  def scalaVersion = "$scala-version$"

  object test extends Tests with TestModule.Munit {
    def ivyDeps = Agg(
      ivy"org.scalameta::munit::$munit$"
    )
  }
}

