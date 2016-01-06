package controllers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import play.mvc.Controller;
import play.mvc.Result;
import services.SomeService;

@Singleton
public class CalculatorController extends Controller {
    private final SomeService someService;

    @Inject
    public CalculatorController(SomeService someService) {
        this.someService = someService;
        System.out.println("created 2");
    }

    public Result calculate() {
        return ok(String.valueOf(someService.foo(1, 2)));
    }
}
