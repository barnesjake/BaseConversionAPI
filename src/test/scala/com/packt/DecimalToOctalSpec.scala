package com.packt

import org.scalatest.{FlatSpec, Matchers}

class DecimalToOctalSpec extends FlatSpec with Matchers {

  "base conversion utility" should "convert a number 1234 into an octal number 2322" in {
    var oct: Octal = BaseConversion.decimalToOctal(Decimal("1234"))
    assert(oct.number == "2322")
  }

  it should "convert a number 11111122 into an octal number 52305322" in {
    val oct: Octal = BaseConversion.decimalToOctal(Decimal("11111122"))
    oct.number should be ("52305322")
  }

}
