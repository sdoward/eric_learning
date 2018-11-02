package sdoward.com.samsmodule;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class BreweryAdapter extends RecyclerView.Adapter<BreweryAdapter.BreweryViewHolder> {

    private final List<Brewery> breweries;

    public BreweryAdapter(List<Brewery> breweries) {
        this.breweries = breweries;
    }

    @NonNull
    @Override
    public BreweryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.brewery_item, parent, false);
        return new BreweryViewHolder(viewGroup);
    }

    @Override
    public void onBindViewHolder(@NonNull BreweryViewHolder breweryViewHolder, int i) {
        Brewery brewery = breweries.get(i);
        breweryViewHolder.nameTextView.setText(brewery.name);
        breweryViewHolder.typeTextView.setText(brewery.brewery_type);
    }

    @Override
    public int getItemCount() {
        return breweries.size();
    }


    class BreweryViewHolder extends RecyclerView.ViewHolder {

        final TextView nameTextView;
        final TextView typeTextView;

        public BreweryViewHolder(View itemView) {
            super(itemView);
            this.nameTextView = itemView.findViewById(R.id.nameTextView);
            this.typeTextView = itemView.findViewById(R.id.typeTextView);
        }
    }

}
