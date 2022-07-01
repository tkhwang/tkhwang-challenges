# (easy) Unshift

## Problem

[Unshift | type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/03060-easy-unshift/README.md)

```typescript
type Result = Unshift<[1, 2], 0> // [0, 1, 2,]
```

## My Solution

```typescript
type Unshift<T extends unknown [], U> = [U, ...T];
```

## Reference

[Unshift](https://ghaiklor.github.io/type-challenges-solutions/ko/easy-unshift.html)
