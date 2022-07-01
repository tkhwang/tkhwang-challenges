# (easy) Exclude

## Problem

[Exclude | type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00043-easy-exclude/README.md)

```
Implement the built-in Exclude<T, U>
```

## My Solution

```typescript
type MyExclude<T, U> = T extends U ? never : T;
```

## Reference

[Exclude](https://ghaiklor.github.io/type-challenges-solutions/en/easy-exclude.html)
