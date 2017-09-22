#### 在Spring框架中，依赖注入(DI)的设计模式是用来定义对象彼此间的依赖。它主要有两种类型：
- Setter方法注入
- 构造器注入

### 1. Setter方法注入

    public class OutputHelper
        {
        IOutputGenerator outputGenerator;
        public void setOutputGenerator(IOutputGenerator outputGenerator){
            this.outputGenerator = outputGenerator;
        }
    }
    
#### 一个 bean配置文件用来声明bean和通过 setter设置注入(property标签)的依赖.

    <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
        <bean id="OutputHelper" class="com.package.OutputHelper">
            <property name="outputGenerator">
                <ref bean="CsvOutputGenerator" />
            </property>
        </bean>
    <bean id="CsvOutputGenerator" class="com.package.impl.CsvOutputGenerator" />
    <bean id="JsonOutputGenerator" class="com.package.impl.JsonOutputGenerator"/>
    </beans>
    
#### 只需注入一个“CsvOutputGenerator” bean 到 “OutputHelper”对象，通过一个 setter 方法(setOutputGenerator)。

### 2.构造函数注入 : 此DI方法将通过构造函数注入依赖。

    public class OutputHelper
    {
        IOutputGenerator outputGenerator;
        OutputHelper(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
        }
    }

#### bean 配置文件来声明bean并通过构造函数(constructor-arg标签)设置注入依赖。

    <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
        <bean id="OutputHelper" class="com.package.OutputHelper">
            <constructor-arg>
                <bean class="com.yiibai.output.impl.CsvOutputGenerator" />
            </constructor-arg>
        </bean>
        <bean id="CsvOutputGenerator" class="com.package.impl.CsvOutputGenerator" />
        <bean id="JsonOutputGenerator" class="com.package.impl.JsonOutputGenerator" />
    </beans>
    
#### 只需通过一个构造函数注入一个 “CsvOutputGenerator” Bean 到 “OutputHelper” 对象。