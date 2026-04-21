import java.util.Scanner
import kotlin.math.PI

fun main() {
    val reader = Scanner(System.`in`)

    print("Burchakni gradusda kiriting (0 < a < 360): ")
    val alpha = reader.nextDouble()

    // Gradusni radianga o'tkazish
    val radian = alpha * PI / 180

    println("$alpha gradus = $radian radian")
}