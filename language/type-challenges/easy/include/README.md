# Include

## Problem

[Include | type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00898-easy-includes/README.md)

```typescript
type isPillarMen = Includes<['Kars', 'Esidisi', 'Wamuu', 'Santana'], 'Dio'> // expected to be `false`
```

## My Solution

```typescript
type Includes<T extends unknown[], U> = U extends T[number] ? true : false;
```

## Reference

[Includes](https://ghaiklor.github.io/type-challenges-solutions/ko/easy-includes.html)
