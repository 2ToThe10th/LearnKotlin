/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */
package sum

fun sum(a: IntArray): Int {
    var answer = 0
    for (i in a)
        answer += i
    return answer
}
