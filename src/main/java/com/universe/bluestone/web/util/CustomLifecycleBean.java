package com.universe.bluestone.web.util;

// Import statements managed by Spring
import com.universe.bluestone.web.service.ReactiveService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// Aware interfaces and lifecycle callbacks
import org.springframework.beans.factory.*;

@Component
public class CustomLifecycleBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private ReactiveService reactiveService;

    // 1. Instantiation
    public CustomLifecycleBean() {
        System.out.println("-> [Step 1] CustomLifecycleBean: Constructor executed.");
    }

    // 2. Dependency Injection
    @Autowired
    public void setReactiveService(ReactiveService reactiveService) {
        this.reactiveService = reactiveService;
        System.out.println("-> [Step 2] CustomLifecycleBean: Dependencies injected.");
    }

    // 3. Aware Interfaces
    @Override
    public void setBeanName(@NonNull String name) {
        System.out.println("-> [Step 3] BeanNameAware: Bean ID registered.");
    }

    @Override
    public void setBeanFactory(@NonNull BeanFactory beanFactory)  {
        System.out.println("-> [Step 3] BeanFactoryAware: Container reference set.");
    }

    // 4. Initialization
    @PostConstruct
    public void postConstruct() {
        System.out.println("-> [Step 4] @PostConstruct: Annotation hook.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("-> [Step 4] InitializingBean: Interface hook.");
    }

    // 5. Destruction
    @PreDestroy
    public void preDestroy() {
        System.out.println("-> [Step 6] @PreDestroy: Annotation cleanup.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("-> [Step 6] DisposableBean: Interface cleanup.");
    }
}
