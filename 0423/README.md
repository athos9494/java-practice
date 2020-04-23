```
edzdeMacBook-Air:0423 edz$ javac -cp src src/club/banyuan/Main.java  -d out
edzdeMacBook-Air:0423 edz$ java -cp out club.banyuan.Main
训练狗狗小强
小强: 汪汪
狗狗小强和猫咪汤姆一起玩
汤姆: 喵..
```
```
edzdeMacBook-Air:0423 edz$ tree out
out
└── club
└── banyuan
├── Main.class
├── animal
│   ├── Cat.class
│   └── Dog.class
└── human
└── Person.class

edzdeMacBook-Air:0423 edz$ tree src/
src/
└── club
└── banyuan
├── Main.java
├── animal
│   ├── Cat.java
│   └── Dog.java
└── human
└── Person.java
```
