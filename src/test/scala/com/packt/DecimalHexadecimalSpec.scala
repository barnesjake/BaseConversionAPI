package com.packt

import org.scalatest._

class DecimalHexadecimalSpec extends FlatSpec with Matchers {

  "base conversion utility" should "convert a number 1234 into a hexadecimal number 4D2" in {
    var hex: Hexadecimal = BaseConversion.decimalToHexadecimal(Decimal("1234"))
    assert(hex.number == "4D2")
  }

  it should "convert a number 11111122 into a hexadecimal number A98AD2" in {
    val hex: Hexadecimal = BaseConversion.decimalToHexadecimal(Decimal("11111122"))
    hex.number should be ("A98AD2")
  }

}
