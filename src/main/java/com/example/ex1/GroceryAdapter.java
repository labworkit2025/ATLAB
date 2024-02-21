package com.example.ex1;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryAdapter.ViewHolder> {

    private List<GroceryItem> groceryItemList;

    public GroceryAdapter(List<GroceryItem> groceryItemList) {
        this.groceryItemList = groceryItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    // Inside onBindViewHolder method

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GroceryItem groceryItem = groceryItemList.get(position);
        holder.textViewItemName.setText(groceryItem.getName());
        holder.textViewItemPrice.setText("$" + String.valueOf(groceryItem.getPrice())); // Displaying price
        holder.checkBoxItem.setChecked(groceryItem.isSelected());

        holder.checkBoxItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groceryItem.setSelected(holder.checkBoxItem.isChecked());
            }
        });
    }


    @Override
    public int getItemCount() {
        return groceryItemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewItemName;
        private TextView textViewItemPrice;
        private CheckBox checkBoxItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewItemName = itemView.findViewById(R.id.textViewItemName);
            textViewItemPrice = itemView.findViewById(R.id.textViewItemPrice);
            checkBoxItem = itemView.findViewById(R.id.checkBoxItem);
        }
    }


}