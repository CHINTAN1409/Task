package com.example.task.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.task.R;
import com.example.task.model.Model;
import java.util.ArrayList;

public class SalesAdapter extends RecyclerView.Adapter<SalesAdapter.ViewHolder> {

    ArrayList<Model> list;
    Context context;

    public SalesAdapter(ArrayList<Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public SalesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View groupView = inflater.inflate(R.layout.item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(groupView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SalesAdapter.ViewHolder holder, int position) {
        Model model = list.get(position);
        holder.tv.setText(model.getField1());
        holder.OrderID.setText(model.getField2());
        holder.OrderDate.setText(model.getField3());
        holder.Shipdate.setText(model.getField4());
        holder.ShipMode.setText(model.getField5());
        holder.CosId.setText(model.getField6());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv,OrderID,OrderDate,Shipdate,ShipMode,CosId;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.Roe_ID);
            OrderID = itemView.findViewById(R.id.Order_ID);
            OrderDate = itemView.findViewById(R.id.order_date);
            Shipdate = itemView.findViewById(R.id.ship_date);
            ShipMode = itemView.findViewById(R.id.ship_mode);
            CosId = itemView.findViewById(R.id.customer_id);

        }
    }
}
