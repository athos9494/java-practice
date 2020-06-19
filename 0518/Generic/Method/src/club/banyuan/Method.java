package club.banyuan;

/*
编写一个通用的静态方法，方法接收一个Iterable接口，打印其中的所有元素，元素应以逗号分隔。
 */

import java.util.Iterator;

class Main
{

    public static void main(String[] args)
    {


        MyString s = new MyString("1234567");


        for(char c:s)
        {
            System.out.print(c+",");
        }



    }

}




class MyString implements Iterable<Character>
{

    private int length = 0;
    private String ineers = null;

    public MyString(String s)
    {
        this.ineers = s;
        this.length = s.length();

    }


    @Override
    public Iterator<Character> iterator()
    {


        class iter  implements Iterator<Character>     //方法内部类
        {
            private int cur= 0;


            @Override
            public boolean hasNext()
            {
                return cur != length;
            }

            @Override
            public Character next()
            {

                Character c = ineers.charAt(cur);
                cur++;
                return c;
            }

            public void remove()
            {
                // do nothing

            }

        }
        return new iter();     //安装Iterable接口的约定，返回迭代器

    }

}