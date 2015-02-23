import scodec.bits.BitVector
import scala.collection.immutable.Seq

object ArithmeticProtocol {
  val ZeroBits = BitVector.fromValidBin("0000")
  val OneBits = BitVector.fromValidBin("0001")
  val TwoBits = BitVector.fromValidBin("0010")
  val ThreeBits = BitVector.fromValidBin("0011")
  val FourBits = BitVector.fromValidBin("0100")
  val FiveBits = BitVector.fromValidBin("0101")
  val SixBits = BitVector.fromValidBin("0110")
  val SevenBits = BitVector.fromValidBin("0111")
  val EightBits = BitVector.fromValidBin("1000")
  val NineBits = BitVector.fromValidBin("1001")
  val AddBits = BitVector.fromValidBin("1010")
  val SubtractBits = BitVector.fromValidBin("1011")
  val MultiplyBits = BitVector.fromValidBin("1100")
  val DivideBits = BitVector.fromValidBin("1101")

  val all = Seq(
    ZeroBits, OneBits, TwoBits, ThreeBits, FourBits, FiveBits, SixBits, SevenBits, EightBits, NineBits,
    AddBits, SubtractBits, MultiplyBits, DivideBits
  )
}
