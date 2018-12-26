package sdoward.com.ericsmodule;

import java.util.List;

public interface BeerView {
    void showError(Throwable throwable);
    void displayBeers(List<Beer>beers);
}
