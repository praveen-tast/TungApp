package chatapp.tung.tuff.com.tungapp.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;

import chatapp.tung.tuff.com.tungapp.R;

/**
 * Created by Manbir on 6/3/2016.
 */
public class SearchGridAdapter extends BaseAdapter {

    Context context;
    ArrayList<HashMap<String, String>> list;
    ViewHolder holder;


    public SearchGridAdapter(Context context, ArrayList<HashMap<String, String>> arr_list) {
        this.context = context;
        this.list = arr_list;

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return list.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(final int arg0, View convertView, ViewGroup arg2) {
        holder = null;

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_search_grid, null);

            holder = new ViewHolder();
          //  holder.place_image = (ImageView) convertView.findViewById(R.id.place_image);



            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        try {

           /* String place_image = list.get(arg0).get("place_image");

            Picasso.with(context)
                    .load(place_image).fit()
                    .into(holder.place_image);*/


        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        return convertView;

    }

    @Override
    public int getItemViewType(int position) {
        // TODO Auto-generated method stub
        return position;
    }


    class ViewHolder {
        ImageView place_image;

    }
}

