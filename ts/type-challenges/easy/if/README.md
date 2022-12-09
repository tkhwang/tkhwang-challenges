# (easy) If

## Problem

[type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00268-easy-if/README.md)

```typescript
type A = If<true, 'a', 'b'>  // expected to be 'a'
type B = If<false, 'a', 'b'> // expected to be 'b'
```

## My Solution

```typescript
type If<C extends boolean, T, F> = C extends true ? T : F;
```

## Reference

[If](https://ghaiklor.github.io/type-challenges-solutions/ko/easy-if.html)
