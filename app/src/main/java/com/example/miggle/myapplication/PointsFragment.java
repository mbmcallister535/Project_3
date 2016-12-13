package com.example.miggle.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PointsFragment extends ListFragment {
    private Points[] points;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Points first = new Points();
        first.setBoutique("Lord Midas");
        first.setImg(R.drawable.lordmidas);
        first.setDescription("Insert Description Here");

        Points second = new Points();
        second.setBoutique("Badowers");
        second.setImg(R.drawable.badowers);
        second.setDescription("Bringing the finest in men’s clothing to Des Moines for over 50 years, Badowers offers everything from exquisite suits to well-crafted denim. We’re an independent store for guys who love clothes. Fit and quality are our first priority. ");

        Points third = new Points();
        third.setBoutique("G&L Clothing");
        third.setImg(R.drawable.g_l);
        third.setDescription(" Regular, Big and Tall, we’ve got it all! Whether in-store or online, G&L Clothing serves working men and women throughout Iowa and the world with work, casual and dress clothing from brands like Carhartt, Dickies, Levi’s®, Wrangler, Savane and much, much more. Our sizing selection is hard to beat with bottoms ranging from 26 to 80 inch waist and tops from Small to 10XL and 5XL Tall.");

        Points fourth = new Points();
        fourth.setBoutique("The Backroom");
        fourth.setImg(R.drawable.backrooom);
        fourth.setDescription("The Backroom has evolved to providing the same service experience as our premiere stores and buying opportunities with vendors have offered our clients a real value on many of the industries best.");
        points = new Points[]{first, second};

        Points fifth = new Points();
        fifth.setBoutique("Mr. B");
        fifth.setImg(R.drawable.mrb);
        fifth.setDescription("Mr B continues to deliver exceptional service for 40 years in Des Moines and a level of quality clothing not found anywhere else in the midwest. Our on-site tailoring department is unmatched in the state of Iowa. We built our brand on customer service and high quality designer fashion clothing. We continue to believe that is what people need and want when shopping for clothing and that's how we do business every day.");

        Points sixth = new Points();
        sixth.setBoutique("Aimee");
        sixth.setImg(R.drawable.aimee);
        sixth.setDescription("Women's Clothing. Shoes. Accessories. We are a charming lifestyle boutique with a little something for everyone! Over 50 different unique lines from around the world.");

        Points seventh = new Points();
        seventh.setBoutique("Blond Genius");
        seventh.setImg(R.drawable.blondgenius);
        seventh.setDescription("Blond Genius has jeans for every body. Our denim bar stocks over 150 styles of jeans for women and over 50 styles for men, all the jeans come in a wide variety of sizes and lengths. Pair your new jeans with our clothing, accessories and shoes, chosen from the trendiest fashions from New York to Los Angeles. ");

        Points eight = new Points();
        eight.setBoutique("Fun on 5th");
        eight.setImg(R.drawable.fun);
        eight.setDescription("An exceptional main street women's boutique shopping experience.");

        Points nine = new Points();
        nine.setBoutique("Mint L.A.");
        nine.setImg(R.drawable.mint);
        nine.setDescription("Mint L.A. is a trendy and affordable boutique catering to young female professionals who embrace their social life. Created for women on a budget who still want classic, timeless pieces, as well as affordable of-the-moment styles; every item is hand-selected in our Los Angeles showrooms for our amazing customers!");

        Points ten = new Points();
        ten.setBoutique("Repeat Boutique");
        ten.setImg(R.drawable.repeat);
        ten.setDescription("Insert description here");

        Points eleven = new Points();
        eleven.setBoutique("Back Allet Bargain");
        eleven.setImg(R.drawable.backalletbargain);
        eleven.setDescription("Insert Description Here");

        Points twelve = new Points();
        twelve.setBoutique("Funky Find");
        twelve.setImg(R.drawable.funkyfind);
        twelve.setDescription("Insert Description Here");

        Points thirteen = new Points();
        thirteen.setBoutique(("Hinge"));
        thirteen.setImg(R.drawable.hinge);
        thirteen.setDescription("Insert Description Here");

        Points fourteen = new Points();
        fourteen.setBoutique("byDesign");
        fourteen.setImg(R.drawable.bydesign);
        fourteen.setDescription("Insert Description Here");
        PlaceList p = new PlaceList();
        points = p.getAll();
//        if (points == null)
//            return inflater.inflate(R.layout.points_fragment, container,false);

        View myView = inflater.inflate(R.layout.points_fragment, container,false);



        PointsAdapter pAdapter = new PointsAdapter(getActivity(), points);
        setListAdapter(pAdapter);

        return myView;

    }
}
