## 配置mybatis

### install
使用maven构建项目的时候，将下列的依赖代码放在pom.xml中
```
<dependency>
  <groupId>org.mybatis</groupId>
  <artifactId>mybatis</artifactId>
  <version>3.5.3</version>
</dependency>
```

### 在xml中构建SqlSessionFactory
每个基于，mybatis的应用都以一个sqlsessionfactory的实例为核心，sqlsessionfactory的实例可以通过sqlsessionfactorybuilder获得，sqlsessionfactorybuilder从xml配置文件或一个预先配置的configuration实例来构建出sqlsessionfactory实例
- 建立SqlSessionFactory实例
> String resource = "mybatis-config.xml地址"; 
> InputSream ins = Resources.getResourceAsStream(resource);//获取xml配置文件内容
> SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
> SqlSessionFactory sqlSessionFactory = builder.build(ins);
> SqlSession session = sqlSessionFactory.openSession();


