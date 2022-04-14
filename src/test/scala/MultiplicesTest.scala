import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import Multiplicies._
class MultiplicesTest extends AnyFlatSpec  with should.Matchers{
    "Function calcSumOfMultipices" should " return 233168 for upperBound = 1000" in{
      calcSumOfMultipices(1000) shouldBe 233168
    }
    it should " return 23 for upperBound = 10" in {
      calcSumOfMultipices(10) shouldBe 23
    }
}
