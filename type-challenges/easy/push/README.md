
# (easy) Push

## Problem

[Push | type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/03057-easy-push/README.md)

```typescript
type Result = Push<[1, 2], '3'> // [1, 2, '3']
```

## My Solution

```typescript
type Push<T extends unknown[], U> = [...T, U]
```

## Reference

[Push](https://ghaiklor.github.io/type-challenges-solutions/ko/easy-push.html)
