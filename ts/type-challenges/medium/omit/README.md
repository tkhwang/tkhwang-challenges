# (medium) Omit

## Problem

[type-challenges/README.md at main · type-challenges/type-challenges](https://github.com/type-challenges/type-challenges/blob/main/questions/00003-medium-omit/README.md)

```typescript
interface Todo {
  title: string
  description: string
  completed: boolean
}

type TodoPreview = MyOmit<Todo, 'description' | 'title'>

const todo: TodoPreview = {
  completed: false,
}
```

## My Solution

* [as문법을 사용한 키맵핑](https://www.typescriptlang.org/docs/handbook/release-notes/typescript-4-1.html#key-remapping-in-mapped-types)

```typescript
  [P in keyof T as P extends K ? never : P]: T[P]
```

## Reference

[Omit](https://ghaiklor.github.io/type-challenges-solutions/ko/medium-omit.html)
