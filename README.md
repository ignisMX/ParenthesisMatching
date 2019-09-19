# Balanced Brackets

A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is balanced if the following conditions are met:
- It contains no unmatched brackets.
- The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.

Given **n** strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.

## Function Description

Complete the function isBalanced in the editor below. It must return a string: YES if the sequence is balanced or NO if it is not.

isBalanced has the following parameter(s):
- s: a string of brackets

## Examples

For each string, return YES or NO.

Sample Input

```bash
{[()]}
{[(])}
{{[[(())]]}}
```

Sample Output

```bash
YES
NO
YES
```

## Usage
You should run this with java 8 or higher

```bash
cd ParenthesisMatching/
javac ParenthesisMatching.java
java ParenthesisMatching
```

## Solution Overview
Add every open bracket in stack and removed it when find its closed pair. Closed bracket should be pair of last open bracket in stack.  


## License
[MIT](https://choosealicense.com/licenses/mit/)