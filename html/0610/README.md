## 什么是html
HTML称为超文本标记语言，是一种标识性的语言。它包括一系列标签．通过这些标签可以将网络上的文档格式统一，使分散的Internet资源连接为一个逻辑整体。HTML文本是由HTML命令组成的描述性文本，HTML命令可以说明文字，图形、动画、声音、表格、链接等。

## 文档结构
### 文档类型声明
所有主流浏览器都支持`<!DOCTYPE>` 声明。
DOCTYPE 是 document type(文档类型)的简写。
！DOCTYPE 是一个文档类型标记，是一种标准通用标记语言的文档类型声明，在 web 设计中用来说明你用的 XHTML 或者 HTML 是什么版本。
标签定义及使用说明：声明位于文档中的最前面的位置，处于 标签之前。 声明不是一个 HTML 标签；它是用来告知 Web 浏览器页面使用了哪种 HTML 版本。
### html
告知浏览器自身是一个html文档
`<html>`和`</html>`标签限定了文档的起始点和结束点，它们之间是文档的头部和主体，文档的头部由< head>标签定义，主体由< body>标签定义

#### head
定义文档的头部，是所有头部元素的容器，< head>中的元素可以引用脚本、指示浏览器在哪里找到样式表、提供元信息等
文档的头部描述了文档的各种属性和信息，包括文档的标题，在web中的位置和其他文档的关系等，绝大多数文档头部包含的数据都不会真正作为内容给读者

包含：`<base>`,`<link>`,`<meta>`,`<script>`,`<style>`,`<title>`
其中title是定义文档的标题，是head中唯一必须的元素。

注：
head应该位于文档的开始，紧跟在`<html>`之后，处于< body>或者`<frameset>`标签之前
始终要给文档定标题。

##### title

title元素可以定义文档的标题
浏览器会使用特殊的方式使用标题，通常把它放在浏览器窗口的标题栏或者状态栏上，当把文档加如用户的链接列表或者收藏夹或者书签列表的时候，标题成为文档列表的默认名称

属性 | 值 | 描述
---|---|---
dir	| rtl，itr | 规定元素中内容的文本方向
lang | language_code | 规定元素内容的语言代码
xml：lang | language_dode | 对顶xhml文档中元素内容的语言代码

##### link
link标签定义文档与外部资源的关系，最常见的用途就是链接样式表。


```
<html>

<head>
<link rel="stylesheet" type="text/css" href="/html/csstest1.css" >
</head>

<body>
<h1>我通过外部样式表进行格式化。</h1>
<p>我也一样！</p>
</body>

</html>

```

##### meta

`<meta>` 元素可提供有关页面的元信息（meta-information），比如针对搜索引擎和更新频度的描述和关键词。
`<meta> `标签位于文档的头部，不包含任何内容。`<meta>` 标签的属性定义了与文档相关联的名称/值对。
注释：`<meta>` 标签永远位于 head 元素内部。
注释：元数据总是以名称/值的形式被成对传递的。
- 必须的属性：content，定义与http-equiv或name属性相关的元信息
- 可选的属性：http-equiv 值：content-type，expires，refresh，set-cookie，描述：把content属性关联到HTTP头部。
- 可选的属性：name 值：author，description，keywords，generator，revise，others，描述：把content关联到一个名称
- 可选的属性：scheme 值：some_text 描述，定义用于翻译content属性值得格式

##### script

`<script> `标签用于定义客户端脚本，比如 JavaScript。
script 元素既可以包含脚本语句，也可以通过 src 属性指向外部脚本文件。
必需的 type 属性规定脚本的 MIME 类型。
JavaScript 的常见应用时图像操作、表单验证以及动态内容更新。
</br>
注释：假如此元素内部的代码没有位于某个函数中，那么这些代码会在页面被加载时被立即执行。`<frameset>` 标签之后的脚本会被忽略。

##### style

实例
```
<html>
<head>
<style type="text/css">
h1 {color:red}
p {color:blue}
</style>
</head>

<body>
<h1>Header 1</h1>
<p>A paragraph.</p>
</body>
</html>

```

`<style>` 标签用于为 HTML 文档定义样式信息。
在 style 中，您可以规定在浏览器中如何呈现 HTML 文档。
type 属性是必需的，定义 style 元素的内容。唯一可能的值是 "text/css"。
style 元素位于 head 部分中。



#### body
body元素定义文档的主体包含文档的所有内容（文本，超链接，图像，表格和列表等）

## 标签

### 行内元素

#### span
`<span>` 标签被用来组合文档中的行内元素。
注释：span 没有固定的格式表现。当对它应用样式时，它才会产生视觉上的变化。

#### 超链接

`<a> `标签定义超链接，用于从一张页面链接到另一张页面。
`<a>` 元素最重要的属性是 href 属性，它指示链接的目标。
在所有浏览器中，链接的默认外观是：
未被访问的链接带有下划线而且是蓝色的
已被访问的链接带有下划线而且是紫色的
活动链接带有下划线而且是红色的
提示：如果不使用 href 属性，则不可以使用如下属性：download, hreflang, media, rel, target 以及 type 属性。
提示：被链接页面通常显示在当前浏览器窗口中，除非您规定了另一个目标（target 属性）。
提示：请使用 CSS 来设置链接的样式。
```
<html>

<body>

<a href="http://www.w3school.com.cn/" target="_blank">Visit W3School!</a>

<p>如果把链接的 target 属性设置为 "_blank"，该链接会在新窗口中打开。</p>

</body>

</html>
```

链接到本页面的不同位置
```
<html>

<body>

<p>
<a href="#C4">查看 Chapter 4。</a>
</p>

<h2>Chapter 1</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 2</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 3</h2>
<p>This chapter explains ba bla bla</p>

<h2><a name="C4">Chapter 4</a></h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 5</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 6</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 7</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 8</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 9</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 10</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 11</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 12</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 13</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 14</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 15</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 16</h2>
<p>This chapter explains ba bla bla</p>

<h2>Chapter 17</h2>
<p>This chapter explains ba bla bla</p>

</body>
</html>
```
图像作为链接
```
<html>

<body>
<p>
您也可以使用图像来作链接：
<a href="/example/html/lastpage.html">
<img border="0" src="/i/eg_buttonnext.gif" />
</a>
</p>

</body>
</html>
```

#### 可选列表
创建带有 4 个选项的选择列表：
```
<select>
  <option value ="volvo">Volvo</option>
  <option value ="saab">Saab</option>
  <option value="opel">Opel</option>
  <option value="audi">Audi</option>
</select>
```
select 元素可创建单选或多选菜单。
`<select&> `元素中的 `<option>` 标签用于定义列表中的可用选项。

### 可变元素

#### button
以下代码标记了一个按钮：
`<button type="button">Click Me!</button>`


`<button> `标签定义一个按钮。
在 button 元素内部，您可以放置内容，比如文本或图像。这是该元素与使用 input 元素创建的按钮之间的不同之处。
`<button> `控件 与 `<input type="button">` 相比，提供了更为强大的功能和更丰富的内容。`<button> `与 `</button>` 标签之间的所有内容都是按钮的内容，其中包括任何可接受的正文内容，比如文本或多媒体内容。例如，我们可以在按钮中包括一个图像和相关的文本，用它们在按钮中创建一个吸引人的标记图像。
唯一禁止使用的元素是图像映射，因为它对鼠标和键盘敏感的动作会干扰表单按钮的行为。
请始终为按钮规定 type 属性。Internet Explorer 的默认类型是 "button"，而其他浏览器中（包括 W3C 规范）的默认值是 "submit"。

#### img

img 元素向网页中嵌入一幅图像。
请注意，从技术上讲，   `<img>` 标签并不会在网页中插入图像，而是从网页上链接图像。`<img>` 标签创建的是被引用图像的占位空间。
`<img>` 标签有两个必需的属性：src 属性 （图像的url）和 alt 属性（图像的替代文本）。
```
<!DOCTYPE HTML>
<html>

<body>

<p>
一幅图像：
<img src="/i/eg_mouse.jpg" width="128" height="128" />
</p>

<p>
一幅动画图像：
<img src="/i/eg_cute.gif" width="50" height="50" />
</p>

<p>请注意，插入动画图像的语法与插入普通图像的语法没有区别。</p>

</body>
</html>
```

#### 输入框

一个简单的 HTML 表单，包含两个文本输入框和一个提交按钮：
```
<form action="form_action.asp" method="get">
  First name: <input type="text" name="fname" />
  Last name: <input type="text" name="lname" />
  <input type="submit" value="Submit" />
</form>
```
`<input>` 标签用于搜集用户信息。
根据不同的 type 属性值，输入字段拥有很多种形式。输入字段可以是文本字段、复选框、掩码后的文本控件、单选按钮、按钮等等。

### 块级元素

#### 段落
以下代码标记了一个段落：
`<p>This is some text in a very short paragraph</p>`
`<p> `标签定义段落。
p 元素会自动在其前后创建一些空白。浏览器会自动添加这些空间，您也可以在样式表中规定。

#### 列表

##### 有序列表

有序 HTML 列表：
```
<ol>
  <li>Coffee</li>
  <li>Tea</li>
  <li>Milk</li>
</ol>
```

##### 无序列表

无序 HTML 列表：
```
<ul>
  <li>Coffee</li>
  <li>Tea</li>
  <li>Milk</li>
</ul>
```
##### 自定义列表
```
<html>

<body>

<h2>一个定义列表：</h2>

<dl>
   <dt>计算机</dt>
   <dd>用来计算的仪器 ... ...</dd>
   <dt>显示器</dt>
   <dd>以视觉方式显示信息的装置 ... ...</dd>
</dl>

</body>
</html>
```