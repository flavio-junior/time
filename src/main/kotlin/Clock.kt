import java.time.LocalTime

fun main() {
    checkHours(
        open = LocalTime.of(8, 0),
        closed = LocalTime.of(22, 0)
    )
}

fun checkHours(time: LocalTime = LocalTime.now(), open: LocalTime, closed: LocalTime) {
    if (time.isBefore(open) || time.isAfter(closed)) {
        println("closed")
    } else {
        println("open")
    }
}