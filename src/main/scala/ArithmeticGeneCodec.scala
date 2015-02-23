import ArithmeticProtocol._
import Genes._
import GeneTypes.Chromosome
import scodec.Err.General
import scodec._
import scodec.bits._

object ArithmeticGeneCodec {
  val encodeGene: (Gene => Either[Err, BitVector]) = {
    case Add => Right(AddBits)
    case Subtract => Right(SubtractBits)
    case Multiply => Right(MultiplyBits)
    case Divide => Right(DivideBits)
    case One => Right(OneBits)
    case Two => Right(TwoBits)
    case Three => Right(ThreeBits)
    case Four => Right(FourBits)
    case Five => Right(FiveBits)
    case Six => Right(SixBits)
    case Seven => Right(SevenBits)
    case Eight => Right(EightBits)
    case Nine => Right(NineBits)
    case _ => Left(General("Unknown Gene!", List.empty))
  }

  val decodeGene: (BitVector => Either[String, Gene]) = {
    case AddBits => Right(Add)
    case SubtractBits => Right(Subtract)
    case MultiplyBits => Right(Multiply)
    case DivideBits => Right(Divide)
    case OneBits => Right(One)
    case TwoBits => Right(Two)
    case ThreeBits => Right(Three)
    case FourBits => Right(Four)
    case FiveBits => Right(Five)
    case SixBits => Right(Six)
    case SevenBits => Right(Seven)
    case EightBits => Right(Eight)
    case NineBits => Right(Nine)
    case _ => Left("Bits did not match a Gene!")
  }

  val geneDecoder: (BitVector => Attempt[DecodeResult[Gene]]) = (bits: BitVector) => {
    val result = bits.consume(4)(decodeGene)
    val (remains, gene) = result.right.get
    Attempt.successful(DecodeResult(gene, remains))
  }

  val geneEncoder: (Gene => Attempt[BitVector]) = (gene: Gene) => {
    Attempt.fromEither(encodeGene(gene))
  }

  implicit val gene: Codec[Gene] = Codec(geneEncoder, geneDecoder)
  implicit val chromosomePartial = gene ~ gene ~ gene ~ gene ~ gene ~ gene ~ gene ~ gene
  implicit val chromosome = (gene :: gene :: gene :: gene :: gene :: gene :: gene :: gene).as[Chromosome]

//  val testBits = BitVector.fromValidBin("10101011110011011100110011001100")
//  val result1: Attempt[DecodeResult[Chromosome]] = chromosome.decode(testBits)
//  println(result1)

//  val ch2 = Chromosome(Add, One, Two, Add, Add, Add, Add, Add)
//  val result2 = chromosome.encode(ch2)
//  println(result2)

//  val result2 = chromosome.decode(testBits) map {
//    x =>
//      x.value match {
//        case g1 ~ g2 ~ g3 ~ g4 ~ g5 ~ g6 ~ g7 ~ g8 => Chromosome(g1, g2, g3, g4, g5, g6, g7, g8)
//      }
//    }
//  println(result2)
//  val result3 = chromosome.encode(Add ~ One ~ Two ~ Add ~ Add ~ Add ~ Add ~ Add)
//  println(result3)
}
