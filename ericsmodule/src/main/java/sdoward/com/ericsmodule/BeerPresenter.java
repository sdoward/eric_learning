package sdoward.com.ericsmodule;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class BeerPresenter {

    private final BeerService beerService;

    private final BeerView beerView;

    public BeerPresenter(BeerService beerService, BeerView beerView) {
        this.beerService = beerService;
        this.beerView = beerView;
    }

    public void start(){
        beerService.getBeer()
                .enqueue(new Callback<List<Beer>>() {
                    @Override
                    public void onResponse(Call<List<Beer>> call, Response<List<Beer>> response) {
                        List<Beer> beers=response.body();
                        beerView.displayBeers(beers);
                    }



                    @Override
                    public void onFailure(Call<List<Beer>> call, Throwable t) {
                        beerView.showError(t);
                    }

                    });
                }
}
