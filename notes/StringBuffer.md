## String StringBuffer StringBuilder

- String

字符串常量，每次对String对象进行修改，相当于新建一个String对象，然后将指针指向新的对象，一般如果变量经常需要变动的时候，不建议使用String

- StringBuffer

直接对StringBuffer对象本身进行修改，不会生成新的对象，再改变对象的引用，经常改变字符串对象的时候可以使用StringBuffer

append方法将追加的字符串增加到缓冲区的末端，insert在指定的点添加字符。

> StringBuffer stringBuffer = new StringBuffer().append().append();

```
StringBuffer stringBuffer = new StringBuffer("i").append(" love").append(" China");
        stringBuffer.insert(1," really");
        System.out.println(stringBuffer);

//i really love China
```

- StringBuilder

和StringBuffer基本方法相同，但是不是线程安全的（不能同步访问），但是如果不对线程安全做要求的话，StringBuilder速度优势很大，一般首选都是StringBuilder