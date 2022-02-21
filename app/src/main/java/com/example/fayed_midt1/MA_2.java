package com.example.fayed_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MA_2 extends AppCompatActivity {

    Integer Animals [] ={R.drawable.cub2,R.drawable.cute6,R.drawable.deer8,R.drawable.jir1,
            R.drawable.lioness5};

    ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma2);
        Button gtA2 = (Button) findViewById(R.id.gtA2);

        gtA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MA_2.this, MA_3.class));
            }
        });

        Toast toast = new Toast(getBaseContext());
        toast.setDuration(Toast.LENGTH_LONG);

        GridView grid =(GridView) findViewById(R.id.grid);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view, int position, long id) {

                toast.setText("Species No "+(position+1));
                toast.show();
                pic.setImageResource(Animals[position]);
            }
        });

    }

    private class ImageAdapter extends BaseAdapter {

        private Context context;
        public ImageAdapter(Context c) {
            context =c;
        }

        @Override
        public int getCount() {
            return Animals.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            pic = new ImageView(context);
            pic.setImageResource(Animals[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330, 300));
            return pic;
        }
    }
}