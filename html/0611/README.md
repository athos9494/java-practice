## css
### 什么是css
层叠样式表(英文全称：Cascading Style Sheets)是一种用来表现HTML（标准通用标记语言的一个应用）或XML（标准通用标记语言的一个子集）等文件样式的计算机语言。CSS不仅可以静态地修饰网页，还可以配合各种脚本语言动态地对网页各元素进行格式化。
CSS 能够对网页中元素位置的排版进行像素级精确控制，支持几乎所有的字体字号样式，拥有对网页对象和模型样式编辑的能力。
### 样式

#### 背景
- 背景色：background-color为元素设置背景色
- 背景图：background-image，默认值为none，如果需要设置自一个背景图，必须设置一个url值
- 背景重复：需要在页面上对背景图像进行平铺，使用background-repeat
- 背景定位：position属性，改变图像在背景中的位置
- 背景关联：文档比较长的时候，背景图像会随着文档的向下滚动而滚动，当文档超过图像的位置的时候，就会消失，可以通过attachment属性防止这种滚动，声明fixed即可
#### 文本
css文本属性可以定义文本外观，能够改变文本的颜色，字符间距，对其文本，装饰文本，对文本进行缩进等

- 缩进文本：text-indent，所有元素的第一行可以缩进一个给定的长度

- 水平对齐：text-align，left，right，center是左右居中对齐，justify是两端对齐，文本行的左右两端都在父元素的内边界上，调整单词和字母剑的间隔，各行的长度正好相同

- 字间隔：Word-spacing改变字之间的标准间隔，默认值normal等同于0，字符间隔

- 字母间隔：letter-spacing 单词之间的间隔，
- 字符转换：texttransform uppercase大写，lowercase小写
- 文本装饰：text-decoration，underline加下划线，overline加上划线，line-through文本管穿线，blink文本闪烁
- 处理空白符：white-space

#### 字体
通用字体系列和特定字体系列

- 字体风格：font- style italic斜体，oblique，文本倾斜显式

- 变形：font- variant设定小型大写字母
- 加粗：font- weight
- 字体大小：font-size
#### 轮廓
- outline 声明一个设置所有的轮廓属性
- outline-color设置颜色
- outline-style样式
- outline-width宽度
### 盒子模型
#### 边框
元素边框border是围绕元素内容和内边距的一条或者多条先，允许规定元素边框的样式，宽度和颜色

- 样式：border-style，单边border-top、right、bottom、left-style

- 宽度border-width，单边同上

- 颜色 border-color，单边同上
#### 内边距
内边距是在边框和内容之间，控制该区域最简答的属性是padding，控制元素边框和元素内容之间的空白区域

padding-top，right，bottom，left或者直接top加四个数值
#### 外边距
围绕在元素边框的空白区域就是外边距，设置外边距会在元素外创建额外的空白，设置外边间距最简单的方法就是使用margin属性

单边外边距属性margin-top，right，bottom，left
### 选择器
#### ID选择器
D 选择器允许以一种独立于文档元素的方式来指定样式。
在某些方面，ID 选择器类似于类选择器，不过也有一些重要差别。
语法
首先，ID 选择器前面有一个 # 号 - 也称为棋盘号或井号。
请看下面的规则：
`*#intro {font-weight:bold;}`
与类选择器一样，ID 选择器中可以忽略通配选择器。前面的例子也可以写作：
`#intro {font-weight:bold;}`
这个选择器的效果将是一样的。
第二个区别是 ID 选择器不引用 class 属性的值，毫无疑问，它要引用 id 属性中的值。
以下是一个实际 ID 选择器的例子：
`<p id="intro">This is a paragraph of introduction.</p>`
#### 类选择器
类选择器允许以一种独立于文档元素的方式来指定样式。
该选择器可以单独使用，也可以与其他元素结合使用。
提示：只有适当地标记文档后，才能使用这些选择器，所以使用这两种选择器通常需要先做一些构想和计划。
要应用样式而不考虑具体设计的元素，最常用的方法就是使用类选择器。
在使用类选择器之前，需要修改具体的文档标记，以便类选择器正常工作。
为了将类选择器的样式与元素关联，必须将 class 指定为一个适当的值。请看下面的 HTML 代码：
```<h1 class="important">
This heading is very important.
</h1>

<p class="important">
This paragraph is very important.
</p>
```

在上面的代码中，两个元素的 class 都指定为 important：第一个标题（ h1 元素），第二个段落（p 元素）。
语法
然后我们使用以下语法向这些归类的元素应用样式，即类名前有一个点号（.），然后结合通配选择器：
`*.important {color:red;}`
如果您只想选择所有类名相同的元素，可以在类选择器中忽略通配选择器，这没有任何不好的影响：
`.important {color:red;}`
在上一节中，我们处理了 class 值中包含一个词的情况。在 HTML 中，一个 class 值中可能包含一个词列表，各个词之间用空格分隔。例如，如果希望将一个特定的元素同时标记为重要（important）和警告（warning），就可以写作：
```<p class="important warning">
This paragraph is a very important warning.
</p>
```
这两个词的顺序无关紧要，写成 warning important 也可以。

结合元素选择器
类选择器可以结合元素选择器来使用。
例如，您可能希望只有段落显示为红色文本：
`p.important {color:red;}`
选择器现在会匹配 class 属性包含 important 的所有 p 元素，但是其他任何类型的元素都不匹配，不论是否有此 class 属性。选择器 p.important 解释为：“其 class 属性值为 important 的所有段落”。 因为 h1 元素不是段落，这个规则的选择器与之不匹配，因此 h1 元素不会变成红色文本。
如果你确实希望为 h1 元素指定不同的样式，可以使用选择器 h1.important：
```p.important {color:red;}
h1.important {color:blue;}
```
#### 复合选择器
##### 后代选择器
后代选择器（descendant selector）又称为包含选择器。
后代选择器可以选择作为某元素后代的元素。
根据上下文选择元素
我们可以定义后代选择器来创建一些规则，使这些规则在某些文档结构中起作用，而在另外一些结构中不起作用。
举例来说，如果您希望只对 h1 元素中的 em 元素应用样式，可以这样写：
`h1 em {color:red;}`
上面这个规则会把作为 h1 元素后代的 em 元素的文本变为 红色。其他 em 文本（如段落或块引用中的 em）则不会被这个规则选中：
```
<h1>This is a <em>important</em> heading</h1>
<p>This is a <em>important</em> paragraph.</p>
```
语法解释
在后代选择器中，规则左边的选择器一端包括两个或多个用空格分隔的选择器。选择器之间的空格是一种结合符（combinator）。每个空格结合符可以解释为“... 在 ... 找到”、“... 作为 ... 的一部分”、“... 作为 ... 的后代”，但是要求必须从右向左读选择器。
因此，h1 em 选择器可以解释为 “作为 h1 元素后代的任何 em 元素”。如果要从左向右读选择器，可以换成以下说法：“包含 em 的所有 h1 会把以下样式应用到该 em”。
##### 子元素选择器
与后代选择器相比，子元素选择器（Child selectors）只能选择作为某元素子元素的元素。

如果您不希望选择任意的后代元素，而是希望缩小范围，只选择某个元素的子元素，请使用子元素选择器（Child selector）。
例如，如果您希望选择只作为 h1 元素子元素的 strong 元素，可以这样写：
`h1 > strong {color:red;}`
这个规则会把第一个 h1 下面的两个 strong 元素变为红色，但是第二个 h1 中的 strong 不受影响：
```
<h1>This is <strong>very</strong> <strong>very</strong> important.</h1>
<h1>This is <em>really <strong>very</strong></em> important.</h1>
```
语法解释
您应该已经注意到了，子选择器使用了大于号（子结合符）。
子结合符两边可以有空白符，这是可选的。因此，以下写法都没有问题：
```
h1 > strong
h1> strong
h1 >strong
h1>strong
```
如果从右向左读，选择器 h1 > strong 可以解释为“选择作为 h1 元素子元素的所有 strong 元素”。
##### 交集选择器
交集选择器：格式中标签与标签之间没用任何东西，
交集选择器选择出符合和满足各个标签属性的标签：如：标签1标签2标签3{属性：值；} 最终找到同时满足标签1，标签2，标签3的标签。
##### 并集选择器
并集选择器：格式中中，分隔开。格式：标签1，标签2{属性：值；}

并集选择器是用来找出所有的满足和符合标签1或标签2的标签。如：标签2，标签2，标签3{ 属性：值；}，最终系统找出所有的 满足标签1或标签2或标签3的标签。满足标签1的标签数量+满足标签2的标签数量+满足标签3的标签数量=系统选出的标签数量
