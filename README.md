# Axon 3.0.1 Auto Configuration Issue

This minimal project demonstrates the issue (see [AxonFramework#253](https://github.com/AxonFramework/AxonFramework/issues/253))
in the [Axon 3.0.1](https://github.com/AxonFramework/AxonFramework/releases/tag/axon-3.0.1)
using the `axon-spring-boot-starter`:

```console
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.4.3.RELEASE)

2017-01-23 20:22:37.327  INFO 14999 --- [           main] io.switchbit.Application                 : Starting Application on Donovans-MacBook-Pro.local with PID 14999 (/Users/donovan/dev/git/contribute/axon-issue/target/classes started by donovan in /Users/donovan/dev/git/contribute/axon-issue)
2017-01-23 20:22:37.330  INFO 14999 --- [           main] io.switchbit.Application                 : No active profile set, falling back to default profiles: default
2017-01-23 20:22:37.381  INFO 14999 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@4996f2e9: startup date [Mon Jan 23 20:22:37 SAST 2017]; root of context hierarchy
2017-01-23 20:22:37.989 ERROR 14999 --- [           main] o.s.boot.SpringApplication               : Application startup failed

java.lang.IllegalStateException: Could not register object [org.axonframework.config.DefaultConfigurer@660c591f] under bean name 'org.axonframework.config.Configurer': there is already object [org.axonframework.config.DefaultConfigurer@55dd4e7a] bound
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.registerSingleton(DefaultSingletonBeanRegistry.java:130) ~[spring-beans-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.registerSingleton(DefaultListableBeanFactory.java:934) ~[spring-beans-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.axonframework.spring.config.SpringAxonAutoConfigurer.registerBeanDefinitions(SpringAxonAutoConfigurer.java:142) ~[axon-spring-3.0.1.jar:3.0.1]
        at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsFromRegistrars(ConfigurationClassBeanDefinitionReader.java:352) ~[spring-context-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsForConfigurationClass(ConfigurationClassBeanDefinitionReader.java:143) ~[spring-context-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitions(ConfigurationClassBeanDefinitionReader.java:116) ~[spring-context-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.context.annotation.ConfigurationClassPostProcessor.processConfigBeanDefinitions(ConfigurationClassPostProcessor.java:320) ~[spring-context-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.context.annotation.ConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry(ConfigurationClassPostProcessor.java:228) ~[spring-context-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanDefinitionRegistryPostProcessors(PostProcessorRegistrationDelegate.java:270) ~[spring-context-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(PostProcessorRegistrationDelegate.java:93) ~[spring-context-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:686) ~[spring-context-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:524) ~[spring-context-4.3.5.RELEASE.jar:4.3.5.RELEASE]
        at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) ~[spring-boot-1.4.3.RELEASE.jar:1.4.3.RELEASE]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:761) [spring-boot-1.4.3.RELEASE.jar:1.4.3.RELEASE]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:371) [spring-boot-1.4.3.RELEASE.jar:1.4.3.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:315) [spring-boot-1.4.3.RELEASE.jar:1.4.3.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1186) [spring-boot-1.4.3.RELEASE.jar:1.4.3.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1175) [spring-boot-1.4.3.RELEASE.jar:1.4.3.RELEASE]
        at io.switchbit.Application.main(Application.java:12) [classes/:na]
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_121]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_121]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_121]
        at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_121]
        at org.springframework.boot.maven.AbstractRunMojo$LaunchRunner.run(AbstractRunMojo.java:507) [spring-boot-maven-plugin-1.4.3.RELEASE.jar:1.4.3.RELEASE]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_121]
```

## Usage

To reproduce, clone this project and run:
 
```console
./mvnw spring-boot:run
```
