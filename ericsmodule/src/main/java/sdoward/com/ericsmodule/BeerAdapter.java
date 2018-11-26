package sdoward.com.ericsmodule;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import retrofit2.http.Url;

import java.util.List;

public class BeerAdapter extends RecyclerView.Adapter<BeerAdapter.ViewHolder> {


    private  List<Beer> beers;
    private Context context;

    public BeerAdapter(List<Beer> beers){
        this.beers=beers;
        this.context = context;
    }

    @NonNull
    @Override
    public BeerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.beer_item, parent, false);
        return new BeerAdapter.ViewHolder(v);



    }


    @Override
    public void onBindViewHolder(@NonNull BeerAdapter.ViewHolder beerViewHolder, int i) {


          Beer beer = beers.get(i);
        //beerViewHolder.imageView.setImageBitmap(beer.image_url);
        //beerViewHolder.IdTextView.setText(beer.id);
        beerViewHolder.nameTextView.setText(beer.name);
        beerViewHolder.taglineTextView.setText(beer.tagline);
        beerViewHolder.firstBrewTextView.setText(beer.first_brewed);
        //beerViewHolder.abvTextView.setText(beer.abv);
        //beerViewHolder.attenuationLevelTextView.set(beer.attenuation_level);
        beerViewHolder.descriptionTextView.setText(beer.description);

    }

    @Override
    public int getItemCount() {
        return beers.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        final ImageView imageView;
        public TextView IdTextView;
        public TextView nameTextView;
        public TextView taglineTextView;
        public TextView firstBrewTextView;
        public TextView abvTextView;
        public TextView attenuationLevelTextView;
        public TextView descriptionTextView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.IdTextView=itemView.findViewById(R.id.IdTextView);
            this.nameTextView = itemView.findViewById(R.id.nameTextView);
            this.taglineTextView=itemView.findViewById(R.id.taglineTextView);
            this.firstBrewTextView=itemView.findViewById(R.id.firstBrewTextView);
            this.abvTextView=itemView.findViewById(R.id.abvTextView);
            this.attenuationLevelTextView=itemView.findViewById(R.id.attenuationLevelTextView);
            this.descriptionTextView=itemView.findViewById(R.id.descriptionTextView);
        }



    }
}
