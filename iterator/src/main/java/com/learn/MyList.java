package com.learn;

public class MyList<T> implements Iterable<T> {
  private Object[] arrs = null;
  private int currentCursor = 0;

  public MyList() {
    this.arrs = new Object[16];
  }

  public void add(T data) {
    if (currentCursor == arrs.length - 1) {
      throw new RuntimeException("out of index");
    }
    arrs[currentCursor] = data;
    currentCursor++;
  }

  public T get(int index) {
    if (index >= 0 && index < arrs.length && index <= currentCursor) {
      return (T) arrs[index];
    }
    return null;
  }

  @Override
  public Iterator<T> iterator() {
    return new MyListIterator();
  }

  private class MyListIterator implements Iterator<T> {
    private int cursor = 0;

    @Override
    public boolean hasNext() {
      return cursor < currentCursor;
    }

    @Override
    public T next() {
      if (cursor >= currentCursor) {
        throw new RuntimeException("out of index");
      }
      return get(cursor++);
    }
  }
}
