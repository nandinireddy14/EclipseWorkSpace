package cgg.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPP implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("My Bean Factory Post processor is called");
	}

}
//this is the method that spring is going to run before the bean factory
//itself is being initialised and what argument we get is benafactory itselfs
//what spring going to dod is call postProcessorBeanFActory() of all the
//classes thats declared in spring.xml which implemnets BeanFactoryProcessosr
//when rhe beanFActory i sbeing initialised then this method of this class is being called
//
//when spring initialises beanfactory the first thing it does is initalise all
//the singleton beans(defaukt beahaviour).
//beanfactory postprocessor is first called the n the beanfactory is initialized
//and then all the singleton beans are initialized this is the order in which execution goes this is the handy way in 
//which we can plugin extra funcitonality if you want to override some of the default behavipur when the beanfactory is initalised

//one example of bean factory postprocessor that comes ou tof the box is called propertyplcaeholder configurer

//what it helps us to do is if we want to have some kind of placeholder for bean configuration

//inorder to let spring know that these values have to ber substitued over here
//use out of the box beanfactorypostprocessor that spring provides which is called
//inorder to define any beanfactorypostprocessor all we need to do is
//write a simple bean tag
//if we were to write our own beanfactorypostprocessor we have to write the class and add it to spring.xml
//if you are using out of the box beanfactorypostprocessor dont even write the class spring
//is already providing that class just add classname in spring.xml

//PropertyPlaceHolderConfigurer
//This class is going to look at the properties file anfd then goin gto look at
//spring.xml then wherever you have tth eplaceholders it sgoing to lookup the propereties
//and then substitute it
//this gets execeuted before the beanfctory gets executed so the
//beanfctory will not see the plcaehodler.the beanfactory will have the completley
//substituded xml file ready
