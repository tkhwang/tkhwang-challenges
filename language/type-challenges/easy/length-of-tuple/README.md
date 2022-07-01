# (easy) Length of Tuple

## Problem

[Length of Tuple | type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00018-easy-tuple-length/README.md)

```typescript
type tesla = ['tesla', 'model 3', 'model X', 'model Y']
type spaceX = ['FALCON 9', 'FALCON HEAVY', 'DRAGON', 'STARSHIP', 'HUMAN SPACEFLIGHT']

type teslaLength = Length<tesla>  // expected 4
type spaceXLength = Length<spaceX> // expected 5
```

## My Solution

```typescript
type Length<T extends { length: number }> = T["length"];
```

## Reference

[Length of Tuple](https://ghaiklor.github.io/type-challenges-solutions/en/easy-tuple-length.html)
