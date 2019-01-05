package sdoward.com.samsmodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity implements BreweryView {

    RecyclerView recyclerView;
    TextView breweryCountTextView;
    BreweryPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        breweryCountTextView = findViewById(R.id.breweryCountTextView);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        recyclerView.addItemDecoration(dividerItemDecoration);
        setUpPresenter();
        presenter.start();
    }

    private void setUpPresenter() {
        BreweriesService breweriesService = new Retrofit.Builder()
                .baseUrl("https://api.openbrewerydb.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(BreweriesService.class);
        presenter = new BreweryPresenter(breweriesService, this);
    }

    @Override
    public void showError(Throwable throwable) {
        Log.e("qwer", "error when displaying breweries", throwable);
    }

    @Override
    public void displayBreweries(List<Brewery> breweries) {
        BreweryAdapter breweryAdapter = new BreweryAdapter(breweries);
        recyclerView.setAdapter(breweryAdapter);
    }

    @Override
    public void displayBreweryCount(int breweryCount) {
        breweryCountTextView.setText(String.valueOf(breweryCount));
    }
}
