/*
 * Your task is to implement a palindrome test.
 *
 * A string is called a palindrome when it reads the same way left-to-right
 * and right-to-left.
 *
 * See http://en.wikipedia.org/wiki/Palindrome
 */
package palindrome

fun isPalindrome(s: String): Boolean {
    val halfSize = s.length / 2
    for (index in 0 until halfSize) {
        if (s[index] != s[s.length - 1 - index]) {
            return false
        }
    }
    return true
}

