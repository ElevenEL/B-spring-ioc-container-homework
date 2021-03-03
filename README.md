<h3>Spring: @Component versus @Bean ?</h3>

<p>@Component与@Bean是完成两件完全不同的事情，不应混淆。</p>

<p>@Component(@Service @Repository)使用类路径扫描, 自动检测并自动配置bean。
@Component注释的类和Bean之间存在隐式的一对一映射。
由于@Component是声明性的，因此对装配的控制非常有限。</p>

<p>@Bean用于显式声明单个bean，而不是像上面那样让Spring自动执行。
它使Bean的声明与类定义脱钩，并使您可以完全按照自己的选择创建和配置Bean。</p>

<p>@Component是类级别的注释，而@Bean是方法级别的注释</p>