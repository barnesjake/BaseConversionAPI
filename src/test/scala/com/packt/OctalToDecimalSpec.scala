package com.packt

import org.scalatest.{FlatSpec, Matchers}

class OctalToDecimalSpec extends FlatSpec with Matchers {

  "base conversion utility" should "convert octal number 11111122 to decimal equivalent 11111122" in {
    val decimal: Decimal = BaseConversion.octalToDecimal(Octal("11111122"))
    decimal.number shouldEqual "11111122"
  }

  it should "convert octal number 12345 to decimal equivalent 123895" in {
    val decimal: Decimal = BaseConversion.octalToDecimal(Octal("12345"))
    decimal.number shouldBe "123895"
  }

  it should "convert octal number 765432 to decimal equivalent 256794" in {
    val decimal: Decimal = BaseConversion.octalToDecimal(Octal("765432"))
    decimal.number should equal("256794")
  }

}
