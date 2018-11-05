package sdoward.com.ericsmodule;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface BeerService {
    @GET ("beer")
    Call<List<Beer>>getBeer();
}
