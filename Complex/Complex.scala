object ComplexConversion {
    implicit def double2complex(x:Double):Complex = Complex(x)
}

case class Complex(re: Double = 0.0, im: Double = 0.0) {
    def plus(that:Complex) = (re + that.re, im + that.im)
    def plus(x:Double) = Complex(re + x, im)

    def +(that:Complex) = plus(that)
    def +(x:Double) = plus(x)

    def minus(thatMinus:Complex) = (re - thatMinus.re, im - thatMinus.im)
    
    def times(thatTimes:Complex) = (re * thatTimes.re - im * thatTimes.im, re * thatTimes.im + im * thatTimes.re)
    def *(that:Complex) = times(that)

    def negate = (-re, -im)
    def nuary_- = negate
}