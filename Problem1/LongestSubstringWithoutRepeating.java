package test;

public class LongestSubstringWithoutRepeating {
	public static int lengthOfLongestSubstring(String s) {
		int maxLength = 0; // Length of longest substring found
		int start = 0; // Start index of the current substring
		int[] charIndex = new int[128]; // Array to store the last index of characters (ASCII size)

		for (int end = 0; end < s.length(); end++) {
			char currentChar = s.charAt(end);
			// Update the start index if we find a repeating character
			start = Math.max(start, charIndex[currentChar]);
			// Calculate the current length of substring
			maxLength = Math.max(maxLength, end - start + 1);
			// Update the last seen index of the current character
			charIndex[currentChar] = end + 1; // Store the index of the character for future reference
		}

		return maxLength; // Return the length of the longest substring found
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
		System.out.println(lengthOfLongestSubstring("bbbbb")); // Output: 1
		System.out.println(lengthOfLongestSubstring("pwwkew")); // Output: 3
		System.out.println(lengthOfLongestSubstring("")); // Output: 0
		System.out.println(lengthOfLongestSubstring("abcdefg")); // Output: 7
	}
}