package com.example.angie.id_app.model;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.angie.id_app.R;

import java.util.List;


/**
 * Created by angie on 31/01/18.
 */

public class SkillsListAdapter extends ArrayAdapter<SkillsItem> {

    public SkillsListAdapter(@NonNull Context context, List<SkillsItem> skillsItems) {
        super(context,0, skillsItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list,parent, false);
        }

        SkillsViewHolder viewHolder = (SkillsViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new SkillsViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.skillsTitle);
            viewHolder.level = (ImageView) convertView.findViewById(R.id.skillsImage);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<CustomItem> expItems
        SkillsItem item = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.title.setText(item.getTitle());
        viewHolder.level.setImageDrawable(new ColorDrawable((item.getLevel())));

        return convertView;
    }

    private class SkillsViewHolder{
        public TextView title;
        public ImageView level;
    }
}
