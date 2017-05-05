/**
 * Created by hwu on 5/5/17.
 */

double derivative(fn, x, dx=10**-8) {
    (fn(x+dx) - fn(x))/dx
}

double circleArea(double r) {
    Math.PI*r**2
}

def circleAreaClosure = {
    Math.PI*it**2
}
print(circleArea(1))
// this is not work, because the difference between normal method
// and cloure
//def tt = derivative(circleArea, 1)
//println(tt)
def ttt = derivative(circleAreaClosure, 1)
println(ttt)



(5..10).each({
    def d = derivative(circleAreaClosure, it)
    def p = Math.PI * 2 * it
    println([it, d, p, d - p])
    }
)

