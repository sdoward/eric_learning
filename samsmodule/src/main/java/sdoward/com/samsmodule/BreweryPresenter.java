package sdoward.com.samsmodule;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class BreweryPresenter {

    private final BreweriesService breweriesService;

    private final BreweryView breweryView;

    public BreweryPresenter(BreweriesService breweriesService, BreweryView breweryView) {
        this.breweriesService = breweriesService;
        this.breweryView = breweryView;
    }

    public void start() {
        breweriesService.getBreweries()
                .enqueue(new Callback<List<Brewery>>() {
                    @Override
                    public void onResponse(Call<List<Brewery>> call, Response<List<Brewery>> response) {
                        List<Brewery> breweries = response.body();
                        breweryView.displayBreweries(breweries);
                        breweryView.displayBreweryCount(breweries.size());
                    }

                    @Override
                    public void onFailure(Call<List<Brewery>> call, Throwable throwable) {
                        breweryView.showError(throwable);
                    }
                });
    }

}
