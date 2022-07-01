# (easy) Pick

## Problem

[type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00004-easy-pick/README.md)

```typescript
interface Todo {
  title: string
  description: string
  completed: boolean
}

type TodoPreview = MyPick<Todo, 'title' | 'completed'>

const todo: TodoPreview = {
    title: 'Clean room',
    completed: false,
}
```

## My Solution

```typescript
type MyPick<T, K extends keyof T> = {
  [P in K]: T[P]
}
```

## Reference

[Pick](https://ghaiklor.github.io/type-challenges-solutions/en/easy-pick.html)
