# (easy) Readonly

## Problem

[readonly | type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00007-easy-readonly/README.md)

```typescript
interface Todo {
  title: string
  description: string
}

const todo: MyReadonly<Todo> = {
  title: "Hey",
  description: "foobar"
}

todo.title = "Hello" // Error: cannot reassign a readonly property
todo.description = "barFoo" // Error: cannot reassign a readonly property
```

## My Solution

```typescript
type MyReadonly<T> = {
  readonly [K in keyof T]: T[K]
}
```

## Reference

[Readonly](https://ghaiklor.github.io/type-challenges-solutions/en/easy-readonly.html)
