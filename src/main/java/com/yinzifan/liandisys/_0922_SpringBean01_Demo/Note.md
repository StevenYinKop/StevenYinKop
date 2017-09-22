#### 在Spring中，有三种方式注入值到 bean 属性。
- 正常的方式
- 快捷方式
- "p"模式
#### 看到一个简单的Java类，它包含两个属性 - name 和 type。稍后将使用Spring注入值到这个 bean 属性。
***
### 1.正常方式
在一个“value”标签注入值，并附有“property”标签结束。

    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
        <bean id="FileNameGenerator" class="com.package.FileNameGenerator">
            <property name="name">
                <value>yinzifan</value>
            </property>
            <property name="type">
                <value>txt</value>
            </property>
        </bean>
    </beans>
    
### 2，快捷方式
#### 注入值“value”属性。

    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
        <bean id="FileNameGenerator" class="com.yiibai.common.FileNameGenerator">
            <property name="name" value="yiibai" />
            <property name="type" value="txt" />
        </bean>
    </beans>
    
### 3. “p” 模式

#### 通过使用“p”模式作为注入值到一个属性。

    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:p="http://www.springframework.org/schema/p"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
        <bean id="FileNameGenerator" class="com.package.FileNameGenerator" 
                 p:name="yinzifan" p:type="txt" />
    </beans>
    
### 记住声明 xmlns:p=”http://www.springframework.org/schema/p" 在Spring XML bean配置文件。