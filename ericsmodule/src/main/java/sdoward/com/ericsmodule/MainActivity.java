package sdoward.com.ericsmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity implements BeerView {

    RecyclerView recyclerView;
    BeerPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        recyclerView.addItemDecoration(dividerItemDecoration);
        setUpPresenter();
        presenter.start();

                                         }

    private void setUpPresenter() {
        BeerService beerService = new Retrofit.Builder()
                .baseUrl("https://api.punkapi.com/v2/beers")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(BeerService.class);
        presenter = new BeerPresenter(beerService, this);
    }


    @Override
    public void showError(Throwable throwable) {
        Log.e("qwer", "error when displaying beers", throwable);
    }



    @Override
    public void displayBeers(List<Beer> beers) {
        BeerAdapter beerAdapter= new BeerAdapter(beers,this);
        recyclerView.setAdapter(beerAdapter);

    }
}
