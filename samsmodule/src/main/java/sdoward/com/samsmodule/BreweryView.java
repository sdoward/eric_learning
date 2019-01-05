package sdoward.com.samsmodule;

import java.util.List;

public interface BreweryView {
    void showError(Throwable throwable);

    void displayBreweries(List<Brewery> breweries);

    void displayBreweryCount(int breweryCount);
}
