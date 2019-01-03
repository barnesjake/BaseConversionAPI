package com.packt
import scala.annotation.tailrec
object BaseConversion {

  def decimalToBinary(x: Decimal): Binary = {
    Binary(toBinary(BigInt(x.number), "").toString)
  }

  @tailrec
  private def toBinary(num: BigInt, acc: String): String = {
    if (num < 2) num.toString + acc
    else toBinary(num / 2, (num mod 2).toString ++ acc)
  }

  def binaryToDecimal(binary: Binary): Decimal = {
    val seq = binary.number.reverse.zipWithIndex.map {
      case (a, i) => a.toString.toInt * math.pow(2, i)
    }
    Decimal(seq.sum.toInt.toString)
  }

  val hexTable =
    Array('0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F')

  def decimalToHexadecimal(number: Decimal): Hexadecimal = {
    Hexadecimal(toHexadecimal(BigInt(number.number), "").toString)
  }

  @tailrec
  def toHexadecimal(num: BigInt, str: String): String = {
    if (num < 16) hexTable(num.toInt).toString + str
    else toHexadecimal(num / 16, hexTable((num mod 16).toInt).toString ++ str)
  }


}
