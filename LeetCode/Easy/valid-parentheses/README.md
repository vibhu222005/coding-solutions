# Valid Parentheses

![Easy](https://img.shields.io/badge/Difficulty-Easy-brightgreen) | [View on LeetCode](https://leetcode.com/problems/valid-parentheses/)

## Problem

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:


	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Every close bracket has a corresponding open bracket of the same type.


 
Example 1:


Input: s = "()"

Output: true


Example 2:


Input: s = "()[]{}"

Output: true


Example 3:


Input: s = "(]"

Output: false


Example 4:


Input: s = "([])"

Output: true


Example 5:


Input: s = "([)]"

Output: false


 
Constraints:


	1 <= s.length <= 104
	s consists of parentheses only '()[]{}'.

**Example 1:**
```
Input:  s = "()"
Output: true
```

**Example 2:**
```
Input:  s = "()[]{}"
Output: true
```

**Example 3:**
```
Input:  s = "(]"
Output: false
```

**Example 4:**
```
Input:  s = "([])"
Output: true
```

**Example 5:**
```
Input:  s = "([)]"
Output: false
```

## Constraints

1 <= s.length <= 104
	s consists of parentheses only '()[]{}'.

## Tags

`String` `Stack`

## Stats

| Metric | Value |
|--------|-------|
| Runtime | N/A |
| Memory | N/A |
| Solved At | Mon, 13 Jul 2026 19:30:29 GMT |
