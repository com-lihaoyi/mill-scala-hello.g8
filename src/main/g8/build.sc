import mill._
import mill.scalalib._

object $name;format="camel"$ extends ScalaModule {

  def scalaVersion = "2.13.13"

  object test extends ScalaTests with TestModule.Munit {
    def ivyDeps = Agg(
      ivy"org.scalameta::munit::0.7.29"
    )
  }
}

