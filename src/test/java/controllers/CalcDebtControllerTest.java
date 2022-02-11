package controllers;


import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@RunWith(JUnit4.class)
class CalcDebtControllerTest {
    private static BindingResult mockedBindingResult;
    private static Model mockedModel;
    private static CalcDebtController calcDebtController;
    @BeforeClass
    public static void setUp(){
        mockedBindingResult = mock(BindingResult.class);
        mockedModel = mock(Model.class);
        calcDebtController = new CalcDebtController();
    }
    @Test
    void index() {
        assertThat(calcDebtController.calc(mockedModel)).isEqualTo("index");
    }

    @Test
    void calc() {
    }
}