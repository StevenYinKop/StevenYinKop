#### Spring注入支持4个主要的集合类型：
- List – <list/>
- Set – <set/>
- Map – <map/>
- Properties – <props/>
***
### Spring beans

#### 一个Customer对象，有四个集合属性。

    public class Customer 
    {
        private List<Object> lists;
        private Set<Object> sets;
        private Map<Object, Object> maps;
        private Properties pros;
    }
    
#### 在bean配置文件中不同的代码片段用来声明集合。
### 1. List示例

    <property name="lists">
        <list>
            <value>1</value>
            <ref bean="PersonBean" />
            <bean class="com.yiibai.common.Person">
                <property name="name" value="yiibaiList" />
                <property name="address" value="Hainan" />
                <property name="age" value="28" />
            </bean>
        </list>
    </property>
    
### 2. Set示例

    <property name="sets">
        <set>
            <value>1</value>
            <ref bean="PersonBean" />
            <bean class="com.yiibai.common.Person">
                <property name="name" value="yiibaiSet" />
                <property name="address" value="Hainan" />
                <property name="age" value="28" />
            </bean>
        </set>
    </property>
    
### 3. Map示例
    
    <property name="maps">
        <map>
            <entry key="Key 1" value="1" />
            <entry key="Key 2" value-ref="PersonBean" />
            <entry key="Key 3">
                <bean class="com.yiibai.common.Person">
                    <property name="name" value="yiibaiMap" />
                    <property name="address" value="Hainan" />
                    <property name="age" value="28" />
                </bean>
            </entry>
        </map>
    </property>
### 4. Properties示例
    <property name="pros">
        <props>
            <prop key="admin">admin@yiibai.com</prop>
            <prop key="support">support@yiibai.com</prop>
        </props>
    </property>
    
### 执行程序

    public class App 
    {
        public static void main( String[] args )
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Customer cust = (Customer)context.getBean("CustomerBean");
            System.out.println(cust);
        }
    }
#### 输出

    Customer [lists=[1, com.yiibai.common.Person@4e4ee70b, com.yiibai.common.Person@1e1867d2], 
    sets=[1, com.yiibai.common.Person@4e4ee70b, com.yiibai.common.Person@52f644b4], 
    maps={Key 1=1, Key 2=com.yiibai.common.Person@4e4ee70b, Key 3=com.yiibai.common.Person@54481b6d}, 
    pros={admin=admin@yiibai.com, support=support@yiibai.com}]