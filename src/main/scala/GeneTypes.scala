import Genes.Gene

object GeneTypes {
  case class Chromosome(g1: Gene, g2: Gene, g3: Gene, g4: Gene, g5: Gene, g6: Gene, g7: Gene, g8: Gene)
  //Include fitness in here
  //Elitism? Copy best into new population.
}
