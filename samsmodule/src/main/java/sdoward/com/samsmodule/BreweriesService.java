package sdoward.com.samsmodule;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface BreweriesService {

    @GET("breweries")
    Call<List<Brewery>> getBreweries();

}
