package designPattern.chap11.proxy;

import designPattern.chap11.entity.Person;

import java.lang.reflect.Proxy;

public class PersonProxy {

    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }
}
