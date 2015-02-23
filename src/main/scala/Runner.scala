import GeneTypes._
import Genes.Gene
import scodec.{DecodeResult, Attempt}
import scodec.bits.BitVector
import scala.util.Random

object Runner extends App {
  /*
  Just an excuse to play around with Scodec - not because this is the best approach! :-)
   */
  val genePool = Genes.all
  val codec = ArithmeticGeneCodec.chromosome

  val stream: Stream[Gene] = Stream.continually({
    genePool(Random.nextInt(genePool.size))
  })

  val genes = stream.take(8).toList

  val randomEightGeneChromosome = Chromosome(
    genes(0), genes(1), genes(2), genes(3),
    genes(4), genes(5), genes(6), genes(7)
  )

  val decodeResult: Attempt[DecodeResult[Chromosome]] =
    codec.decode(BitVector.fromValidBin("10101011110011011100110011001100"))
  val encodeResult: Attempt[BitVector] = codec.encode(
    Chromosome(genes(0), genes(1), genes(2), genes(3), genes(4), genes(5), genes(6), genes(7))
  )

  println(s"Chromosome: $randomEightGeneChromosome")
  println(s"Decode Result $decodeResult")
  println(s"Encode Result $encodeResult")
}
