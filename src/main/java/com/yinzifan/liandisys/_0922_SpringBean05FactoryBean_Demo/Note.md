#### ListFactoryBean”类为开发者提供了一种在Spring的bean配置文件中创建一个具体的列表集合类(ArrayList和LinkedList)。
这里有一个 ListFactoryBean 示例，在运行时它将实例化一个ArrayList，并注入到一个 bean 属性。

    public class Customer 
    {
        private List lists;
        //...
    }
#### Spring bean配置文件 - applicationContext.html 文件的内容。

    <bean id="CustomerBean" class="com.package.Customer">
        <property name="lists">
            <bean class="org.springframework.beans.factory.config.ListFactoryBean">
                <property name="targetListClass">
                    <value>java.util.ArrayList</value>
                </property>
                <property name="sourceList">
                    <list>
                        <value>one</value>
                        <value>2</value>
                        <value>three</value>
                    </list>
                </property>
            </bean>
        </property>
    </bean>
    
#### 另外，还可以使用 util 模式和<util:list> 来达到同样的目的。

    <bean id="CustomerBean" class="com.package.Customer">
        <property name="lists">
            <util:list list-class="java.util.ArrayList">
                <value>one</value>
                <value>2</value>
                <value>three</value>
            </util:list>
        </property>
    </bean>

### 请记住要包函 util 模式，否则会出现下面的错误
    Caused by: org.xml.sax.SAXParseException: The prefix "util" for element "util:list" is not bound.
#### 执行，查看结果：

    public class App {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext(
                    "applicationContext.xml");
            Customer cust = (Customer) context.getBean("CustomerBean");
            System.out.println(cust);
            
        }
    }

#### 输出结果

    Customer [lists=[one, 2, three]] Type=[class java.util.ArrayList]
    
#### 在运行时实例化ArrayList并注入列表到客户的属性。


#### SetFactoryBean 类为开发者提供了一种可在 Spring bean 配置文件创建一个具体的Set集合(HashSet 和 TreeSet)。
#### 这里有一个 ListFactoryBean。例如，在运行时它将实例化 HashSet，并注入到一个 bean 属性中。
    public class Customer 
    {
        private Set sets;
        //...
    }
#### Spring的bean配置文件。
    <bean id="CustomerBean" class="com.package.Customer">
        <property name="sets">
            <bean class="org.springframework.beans.factory.config.SetFactoryBean">
                <property name="targetSetClass">
                    <value>java.util.HashSet</value>
                </property>
                <property name="sourceSet">
                    <list>
                        <value>one</value>
                        <value>2</value>
                        <value>three</value>
                    </list>
                </property>
            </bean>
        </property>
    </bean>
    </beans>
#### 另外，还可以使用 util的模式 和<util:set> 来做到同样的事情。
    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
        http://www.springframework.org/schema/util
        http://www.springframework.org/schema/util/spring-util-2.5.xsd">
    <bean id="CustomerBean" class="com.package.Customer">
        <property name="sets">
            <util:set set-class="java.util.HashSet">
                <value>one</value>
                <value>2</value>
                <value>three</value>
            </util:set>
        </property>
        </bean>
    </beans>
### 请记住必须包函 util 模式，否则会出现下面的错误：
    Caused by: org.xml.sax.SAXParseException: 
        The prefix "util" for element "util:set" is not bound.
#### 执行结果
    public class App 
    {
        public static void main( String[] args )
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Customer cust = (Customer)context.getBean("CustomerBean");
            System.out.println(cust);
        }
    }
#### 输出结果：
    Customer [sets=[2, one, three]] Type=[class java.util.HashSet]
#### 实例化 HashSet，在运行时注入到客户的set集合属性。

#### MapFactoryBean类为开发者提供了一种在Spring的bean配置文件中创建一个具体的Map集合类(HashMap和TreeMap)。
#### 这里有一个MapFactoryBean。例如，在运行时它将实例化一个HashMap，并注入到一个bean属性。
    public class Customer 
    {
        private Map maps;
        //...
    }
#### Spring 的 bean 配置文件。
    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        <bean id="CustomerBean" class="com.package.Customer">
            <property name="maps">
                <bean class="org.springframework.beans.factory.config.MapFactoryBean">
                    <property name="targetMapClass">
                        <value>java.util.HashMap</value>
                    </property>
                    <property name="sourceMap">
                        <map>
                            <entry key="Key1" value="one" />
                            <entry key="Key2" value="two" />
                            <entry key="Key3" value="three" />
                        </map>
                    </property>
                </bean>
            </property>
        </bean>
    </beans>
#### 另外，还可以使用 util 的模式和<util:map>来做到同样的事情。

    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
        xmlns:util="http://www.springframework.org/schema/util"
        xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util-2.5.xsd">
        <bean id="CustomerBean" class="com.package.Customer">
            <property name="maps">
                <util:map map-class="java.util.HashMap">
                    <entry key="Key1" value="1" />
                    <entry key="Key2" value="2" />
                    <entry key="Key3" value="3" />
                </util:map>
            </property>
        </bean>
    </beans>
### 请记住包函util模式，否则会出现下面的错误
    Caused by: org.xml.sax.SAXParseException: 
        The prefix "util" for element "util:map" is not bound.
#### 执行结果...
    public class App 
    {
        public static void main( String[] args )
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
            Customer cust = (Customer)context.getBean("CustomerBean");
            System.out.println(cust);
        }
    }
#### 输出结果：
    Customer [maps={Key2=two, Key1=one, Key3=three}]
#### 在运行时实例化一个HashMap和注入到客户的映射(Map)属性。