package tcs;
function isPermutation(s1, s2) {
  const lenS1 = s1.length;
  const lenS2 = s2.length;

  // If s1 is longer than s2, it can't be a permutation
  if (lenS1 > lenS2) {
      return false;
  }

  // Function to count characters
  const countChars = (str) => {
      const count = {};
      for (const char of str) {
          count[char] = (count[char] || 0) + 1;
      }
      return count;
  };

  const countS1 = countChars(s1);
  for (let i = 0; i <= lenS2 - lenS1; i++) {
      const substring = s2.slice(i, i + lenS1);
      const countSubstring = countChars(substring);

      if (JSON.stringify(countS1) === JSON.stringify(countSubstring)) {
          return true;
      }
  }

  return false;
}

// Example usage
console.log(isPermutation("tac", "catering")); // Output: true
console.log(isPermutation("wdljenjewewsn", "someotherstring")); // Output: false