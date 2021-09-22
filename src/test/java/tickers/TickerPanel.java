package tickers;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.List;

public class TickerPanel {
    public static Question<List<String>> tickerNames(){
        return TextContent.of(".ticker-name").asAList();
    }
}
