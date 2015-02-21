import GeneTypes._

import scala.collection.immutable.Seq

object ArithmeticGenePool {
  
  val operatorGenes: Seq[Gene] = Seq("1010", "1011", "1100", "1101")
  val numberGenes: Seq[Gene] = Seq("0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001")
  val invalidGenes: Seq[Gene] = Seq("1110", "1111")
  val genes: Seq[Gene] = operatorGenes ++ numberGenes ++ invalidGenes

   def geneToOperator(gene: String): Option[OperatorGene] = {
     gene match {
       case "1010" => Some(Add)
       case "1011" => Some(Subtract)
       case "1100" => Some(Multiply)
       case "1101" => Some(Divide)
       case _ => None
     }
   }

   def geneToNumber(gene: String): Option[Int] = {
     gene match {
       case "0000" => Some(0)
       case "0001" => Some(1)
       case "0010" => Some(2)
       case "0011" => Some(3)
       case "0100" => Some(4)
       case "0101" => Some(5)
       case "0110" => Some(6)
       case "0111" => Some(7)
       case "1000" => Some(8)
       case "1001" => Some(9)
       case _ => None
     }
   }
 }