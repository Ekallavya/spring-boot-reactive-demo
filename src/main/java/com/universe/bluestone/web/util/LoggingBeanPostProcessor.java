package com.universe.bluestone.web.util;

import com.universe.bluestone.web.service.ReactiveService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class LoggingBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // Intercept only the target bean
        if (bean instanceof ReactiveService) {
            System.out.println("2. postProcessBeforeInitialization: Intercepted " + beanName);
            
            // Example modification: altering bean state before initialization methods run
            ReactiveService service = (ReactiveService) bean;
            service.setStatus("Configured By PostProcessor");
        }
        
        // Crucial: You must return the bean (either the original or a wrapped proxy)
        return bean; 
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // This runs after @PostConstruct / init methods complete
        if (bean instanceof ReactiveService reactiveService) {
            System.out.println("4. postProcessAfterInitialization: Called after initialization.");
        }
        return bean;
    }
}