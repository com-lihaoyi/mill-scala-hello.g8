import mill._
import mill.scalalib._

object $name;format="camel"$ extends ScalaModule {

  def scalaVersion = "3.9.0"

  object test extends ScalaTests with TestModule.Munit {
    def ivyDeps = Agg(
      ivy"org.scalameta::munit::1.0.1"
    )
  }
}

