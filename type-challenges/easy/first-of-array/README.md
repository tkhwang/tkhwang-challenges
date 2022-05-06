# (easy) First of Array

## Problem

[First of Array | type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00014-easy-first/README.md)

```typescript
type arr1 = ['a', 'b', 'c']
type arr2 = [3, 2, 1]

type head1 = First<arr1> // expected to be 'a'
type head2 = First<arr2> // expected to be 3x
```

## My Solution

```typescript
type First<T extends any[]> = T extends [] ? never : T[0]
```

## Reference

[Readonly](https://ghaiklor.github.io/type-challenges-solutions/en/easy-readonly.html)
