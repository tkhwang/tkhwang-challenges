# (medium) Get Return Type

## Problem

[Get Return Type | type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00002-medium-return-type/README.md)

```typescript
const fn = (v: boolean) => {
  if (v)
    return 1
  else
    return 2
}

type a = MyReturnType<typeof fn> // should be "1 | 2"
```

## My Solution

* `() => infer R`
* 어떤 매개변수도 받을 수 있고 그것에 상관하지 않을 것임을 보여주기 위해 타입의 인자에 `...args: any[]` s를 추가


```typescript
type MyReturnType<T> = T extends (...args: any[]) => infer R ? R : T;
```

## Reference

[Get Return Type](https://ghaiklor.github.io/type-challenges-solutions/ko/medium-return-type.html)
