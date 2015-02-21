import GeneTypes._
import scala.util.Random

object Runner extends App {
  val calculator = new LeftRightArithmeticFitnessCalculator(22)
  val genePool = ArithmeticGenePool.genes

  val stream: Stream[Gene] = Stream.continually({
    genePool(Random.nextInt(genePool.size))
  })

  val randomEightByteChromosome = stream.take(8).toList

  println(s"Chromosome: $randomEightByteChromosome")

  calculator.calculateFitness(randomEightByteChromosome)
}
