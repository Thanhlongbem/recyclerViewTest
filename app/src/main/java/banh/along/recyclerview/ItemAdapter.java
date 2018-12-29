package banh.along.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.RecyclerViewHolder> {

    List<ItemPhanTu> itemPhanTus = new ArrayList<>();
    Context context;

    public ItemAdapter(List<ItemPhanTu> itemPhanTus, Context context) {
        this.itemPhanTus = itemPhanTus;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_test, parent, false);
        return new RecyclerViewHolder(view);
    }

    @SuppressLint("NewApi")
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int i) {
        holder.tvStep.setText(itemPhanTus.get(i).getStepp());
        holder.tvStep.setZ(1000f);
        holder.nameOfStep.setText(itemPhanTus.get(i).getNameOfStep());
    }

    @Override
    public int getItemCount() {
        return itemPhanTus.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvStep;
        TextView nameOfStep;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            tvStep = itemView.findViewById(R.id.tvStep);
            nameOfStep = itemView.findViewById(R.id.nameOfStep);


        }
    }
}
