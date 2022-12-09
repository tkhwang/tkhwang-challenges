# (easy) Concat

## Problem

[Concat | type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00533-easy-concat/README.md)

```typescript
type Result = Concat<[1], [2]> // expected to be [1, 2]
```

## My Solution

```typescript
type Concat<T extends unknown[], U extends unknown []> = [ ...T, ...U];
```

## Reference

[Concat](https://ghaiklor.github.io/type-challenges-solutions/ko/easy-concat.html)
