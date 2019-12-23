package com.learn;

public class IteratorClient {
  public static void main(String[] args) {
    MyList<Integer> myList = new MyList<>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);

    Iterator<Integer> integerIterator = myList.iterator();
    while (integerIterator.hasNext()) {
      System.out.println(integerIterator.next());
    }
  }
}
