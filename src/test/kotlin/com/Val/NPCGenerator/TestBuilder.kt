import com.Val.NPCGenerator.Race
import com.Val.NPCGenerator.WeightedCollection

fun makeWeightedCollection() = WeightedCollection(
    listOf(1, 2, 3, 4),
    listOf(25, 25, 25, 25)
)

fun makeWrongWeightedCollection() = WeightedCollection(
    listOf(3, 4, 5, 6, 7, 8, 9),
    listOf(5, 1, 15, 20, 30, 20, 5)
)

fun makeTestRace() = Race(
    "human",
    WeightedCollection(
        arrayListOf(3, 4, 5, 6, 7, 8, 9),
        arrayListOf(5, 10, 15, 20, 25, 20, 5)
    ), 2
)