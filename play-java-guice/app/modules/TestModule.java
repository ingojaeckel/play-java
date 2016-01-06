package modules;

import com.google.inject.AbstractModule;
import services.SomeService;
import services.SomeServiceImpl;

public class TestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SomeService.class).to(SomeServiceImpl.class).asEagerSingleton();
    }
}
