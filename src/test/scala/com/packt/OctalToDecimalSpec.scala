package com.packt

import org.scalatest.{FlatSpec, Matchers}

class OctalToDecimalSpec extends FlatSpec with Matchers {

  "base conversion utility" should "convert octal number 11111122 to decimal equivalent 2396754" in {
    val decimal: Decimal = BaseConversion.octalToDecimal(Octal("11111122"))
    decimal.number shouldEqual "2396754"
  }

  it should "convert octal number 12345 to decimal equivalent 5349" in {
    val decimal: Decimal = BaseConversion.octalToDecimal(Octal("12345"))
    decimal.number shouldBe "5349"
  }

  it should "convert octal number 765432 to decimal equivalent 256794" in {
    val decimal: Decimal = BaseConversion.octalToDecimal(Octal("765432"))
    decimal.number should equal("256794")
  }

  it should "convert octal number 0 to decimal equivalent 0" in {
    val decimal: Decimal = BaseConversion.octalToDecimal(Octal("0"))
    decimal.number should equal("0")
  }

  it should "convert octal number 5 to decimal equivalent 5" in {
    val decimal: Decimal = BaseConversion.octalToDecimal(Octal("5"))
    decimal.number should equal("5")
  }

}
