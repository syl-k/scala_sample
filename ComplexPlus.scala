case class ComplexPlus(res : Double, im : Double) {
    def plus(that : ComplexPlus): ComplexPlus = ComplexPlus(res + that.res, im + that.im)
}