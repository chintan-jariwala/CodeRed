package com.example.samberg.codered;

        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import java.util.List;

/**
 * Created by cidseuser on 6/14/2016.
 */


public class CycleAdapter extends RecyclerView.Adapter<CycleAdapter.CycleDetailsViewHolder>{

    private List<Details> detailsList;

    public CycleAdapter(List<Details> detailsList) {
       this.detailsList = detailsList;
    }

    @Override
    public CycleDetailsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.card_item, parent, false);

        return new CycleDetailsViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(CycleDetailsViewHolder holder, int position) {
        Details item = detailsList.get(position);
        holder.tvStartDate.setText(item.getStartDate());
        holder.tvEndDate.setText(item.getEndDate());
        holder.tvSymptoms.setText(item.getSymptoms());


    }

    @Override
    public int getItemCount() {
        return detailsList.size();
    }


    public class CycleDetailsViewHolder extends RecyclerView.ViewHolder {

        TextView tvCardViewId;
        TextView tvStartDate;
        TextView tvEndDate;
        TextView tvSymptoms;


        public CycleDetailsViewHolder(View itemView) {
            super(itemView);

            tvCardViewId = (TextView) itemView.findViewById(R.id.tvCardViewId);
            tvStartDate = (TextView) itemView.findViewById(R.id.tvStartDate);
            tvEndDate = (TextView) itemView.findViewById(R.id.tvEndDate);
            tvSymptoms = (TextView) itemView.findViewById(R.id.tvSymptoms);
        }

    }

}