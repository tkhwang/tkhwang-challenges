# (easy) Awaited

## Problem

[Awaited | type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00189-easy-awaited/README.md)

```
If we have a type which is wrapped type like Promise.
How we can get a type which is inside the wrapped type?

For example if we have Promise<ExampleType>
how to get ExampleType?
```

## My Solution

```typescript
type Awaited<T> = T extends Promise<infer R> ? Awaited<R> : T;
```

## Reference

[Awaited](https://ghaiklor.github.io/type-challenges-solutions/ko/easy-awaited.html)
