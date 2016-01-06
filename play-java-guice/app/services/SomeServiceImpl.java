package services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import play.Configuration;

@Singleton
public class SomeServiceImpl implements SomeService {
    private final Integer someValue;

    @Inject
    public SomeServiceImpl(Configuration conf) {
        System.out.println("created 1");
        this.someValue = conf.getInt("this.is.a.value");
    }

    @Override
    public int foo(int a, int b) {
        return someValue + a + b;
    }
}
