package com.gamedev.codetube;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder> {

    Context context;
    List<AndroidCourse> androidCourses;

    public CourseAdapter(Context context, List<AndroidCourse> androidCourses) {
        this.context = context;
        this.androidCourses = androidCourses;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.course_item, parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.TvTitle.setText(androidCourses.get(position).getTitle());
        holder.ImgCourse.setImageResource(androidCourses.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return androidCourses.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView TvTitle;
        private ImageView ImgCourse;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            TvTitle = itemView.findViewById(R.id.item_course_title);
            ImgCourse = itemView.findViewById(R.id.item_course_img);
        }
    }
}