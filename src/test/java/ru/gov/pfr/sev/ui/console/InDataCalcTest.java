package ru.gov.pfr.sev.ui.console;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.gov.pfr.sev.ui.console.InDataCalc;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InDataCalcTest {

//    @Rule
//    public final TextFromStandardInputStream systemInMock
//            = emptyStandardInputStream();

    private InDataCalc inDataCalc;
    @BeforeEach
    public void setUp(){
        inDataCalc = new InDataCalc();

    }

    @Test
    void getSumm() {
        assertEquals(inDataCalc.getSumm(),"Summarize.sumOfNumbersFromSystemIn()");
    }

    @Test
    void getColDaysInMonth() {
    }

    @Test
    void getColDasInMonthPol() {
    }

    @Test
    void getColPolMonth() {
    }

    @Test
    public void givenUsingJava7_whenConvertingAnInputStreamToAString_thenCorrect()
            throws IOException {
        String originalString = "123";
        InputStream inputStream = new ByteArrayInputStream(originalString.getBytes());

        String text = null;
        try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
            text = scanner.useDelimiter("\\A").next();
        }

        assertThat(text, equalTo(originalString));
    }
}