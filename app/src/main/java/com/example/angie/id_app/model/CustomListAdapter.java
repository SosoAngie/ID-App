package com.example.angie.id_app.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.angie.id_app.R;
import java.util.List;


/**
 * Created by angie on 31/01/18.
 */

public class CustomListAdapter extends ArrayAdapter<CustomItem> {

    public CustomListAdapter(@NonNull Context context, List<CustomItem> expItems) {
        super(context,0, expItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list,parent, false);
        }

        ExpViewHolder viewHolder = (ExpViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new ExpViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.itemTitle);
            viewHolder.description = (TextView) convertView.findViewById(R.id.itemTxt);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<CustomItem> expItems
        CustomItem item = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.title.setText(item.getTitle());
        viewHolder.description.setText(item.getDescription());

        return convertView;
    }

    private class ExpViewHolder{
        public TextView title;
        public TextView description;
    }
}
