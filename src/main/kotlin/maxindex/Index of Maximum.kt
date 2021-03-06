/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */
package maxindex

fun indexOfMax(a: IntArray): Int? =
    a.withIndex().fold(null as IndexedValue<Int>?) { currentAnswer: IndexedValue<Int>?, element ->
        if (currentAnswer == null || currentAnswer.value <= element.value) {
            element
        } else {
            currentAnswer
        }
    }?.index

