### 从Spring 3起，JavaConfig功能已经包含在Spring核心模块，它允许开发者将bean定义和在Spring配置XML文件到Java类中。
### 但是，仍然允许使用经典的XML方式来定义bean和配置，JavaConfig是另一种替代解决方案。
### 看来看经典的XML定义和JavaConfig的不同，如下定义在Spring容器中的bean。

#### Spring XML file - applicationContext.xml :

    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">
        <bean id="helloBean" class="com.package.impl.HelloWorldImpl"></beans>
        
### 等效于以下JavaConfig的配置：

    @Configuration
    public class AppConfig {
        @Bean(name="helloBean")
        public HelloWorld helloWorld() {
            return new HelloWorldImpl();
        }
    }
    
## 3. Spring Bean
一个简单的Bean

    public interface HelloWorld {
        void printHelloWorld(String msg);
    }

    public class HelloWorldImpl implements HelloWorld {
        @Override
        public void printHelloWorld(String msg) {
            System.out.println("Hello : " + msg);
        }
    }
## 4. JavaConfig 注解

### 使用 @Configuration 注释告诉 Spring，这是核心的 Spring 配置文件，并通过 @Bean 定义 bean。

    @Configuration
    public class AppConfig {
        @Bean(name="helloBean")
        public HelloWorld helloWorld() {
            return new HelloWorldImpl();
        }
    }
    
## 5. 执行结果

#### 使用 AnnotationConfigApplicationContext 加载您的JavaConfig类

    public class App {
        public static void main(String[] args) {
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            HelloWorld obj = (HelloWorld) context.getBean("helloBean");
            obj.printHelloWorld("Spring Java Config");
        }
    }
    
#### 输出结果

    Hello : Spring Java Config
    
***
***
***

### 一般来说, 需要按模块或类别 分割Spring XML bean文件 成多个小文件, 使事情更容易维护和模块化。 例如，

    <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">
    <import resource="config/customer.xml"/>
    <import resource="config/scheduler.xml"/>
    </beans>
    
### JavaConfig它等效于 @Import 功能

    @Configuration
    @Import({ CustomerConfig.class, SchedulerConfig.class })
    public class AppConfig {}
## Spring Beans
#### File : CustomerBo.java

    public class CustomerBo {
        public void printMsg(String msg) {
            System.out.println("CustomerBo : " + msg);
        }
    }
    
#### File : SchedulerBo.java

    public class SchedulerBo {
        public void printMsg(String msg) {
            System.out.println("SchedulerBo : " + msg);
        }
    }

    @Configuration示例

#### 现在，使用JavaConfig @Configuration声明上述Bean类。
#### File : CustomerConfig.java

    @Configuration
    public class CustomerConfig {
        @Bean(name="customer")
        public CustomerBo customerBo(){
        return new CustomerBo();
        }
    }
    
#### File : SchedulerConfig.java

    @Configuration
    public class SchedulerConfig {
        @Bean(name="scheduler")
        public SchedulerBo suchedulerBo(){
        return new SchedulerBo();
        }
    }
    
## @Import示例

#### 使用@Import加载多个配置文件。

#### File : AppConfig.java

    @Configuration
    @Import({ CustomerConfig.class, SchedulerConfig.class })
    public class AppConfig {}
    
### 执行程序

    public class App {
        public static void main(String[] args) {
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            CustomerBo customer = (CustomerBo) context.getBean("customer");
            customer.printMsg("Hello 11");
            SchedulerBo scheduler = (SchedulerBo) context.getBean("scheduler");
            scheduler.printMsg("Hello 22");
        }
    }
    
#### 输出结果

    CustomerBo : Hello 11
    SchedulerBo : Hello 22