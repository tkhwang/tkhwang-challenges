# (easy) Tuple to Object easy

## Problem

[type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00011-easy-tuple-to-object/README.md)

```typescript
const tuple = ['tesla', 'model 3', 'model X', 'model Y'] as const

type result = TupleToObject<typeof tuple> // expected { tesla: 'tesla', 'model 3': 'model 3', 'model X': 'model X', 'model Y': 'model Y'}
```

## My Solution

```typescript
type TupleToObject<T extends readonly any[]> = {
  [K in T[number]]: K
}
```

## Reference

[Tuple to Object](https://ghaiklor.github.io/type-challenges-solutions/en/easy-tuple-to-object.html)
