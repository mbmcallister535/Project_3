package com.example.miggle.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by miggle on 12/12/16.
 */

public class PlaceList {
    private SharedPreferences sharedPreferences;
    private Points[] boutiques = new Points[14];
    private double user_lat;
    private double user_long;
    Context pref;
    public PlaceList(Context c) {
        this.pref = c;
        this.user_lat = user_lat;
        this.user_long = user_long;

        boutiques[0] = new Points();
        boutiques[0].setBoutique("Back Alley Bargains");
        boutiques[0].setImg(R.drawable.backalletbargain);
        boutiques[0].setDescription("Back Allet Bargain is a one-stop shop for all the strange and wondrous knick-knacks you could ever want.");
        boutiques[0].setLocation(41.5815043, -93.7168694);

        boutiques[1] = new Points();
        boutiques[1].setBoutique("Funky Find");
        boutiques[1].setImg(R.drawable.funkyfind);
        boutiques[1].setDescription("Funky Find is a fresh take on home goods, offering a playful, whimsical assortment of products.");
        boutiques[1].setLocation(42.9892343, -81.3006206);

        boutiques[2] = new Points();
        boutiques[2].setBoutique(("Hinge"));
        boutiques[2].setImg(R.drawable.hinge);
        boutiques[2].setDescription("Here at Hinge, we sell only locally crafted furniture. #buylocal");
        boutiques[2].setLocation(41.5731856, -93.7785209);

        boutiques[3] = new Points();
        boutiques[3].setBoutique("byDesign");
        boutiques[3].setImg(R.drawable.bydesign);
        boutiques[3].setDescription("Shop at byDesign for all of your modern, sleek furniture needs!");
        boutiques[3].setLocation(41.6044827, -93.8070129);

        boutiques[4] = new Points();
        boutiques[4].setBoutique("Lord Midas");
        boutiques[4].setImg(R.drawable.lordmidas);
        boutiques[4].setDescription("Lord Midas is your go-to shop for high-end, fashion forward menswear to propel you further in both your career and your personal life.");
        boutiques[4].setLocation(41.5871327,-93.6948199);

        boutiques[5] = new Points();
        boutiques[5].setBoutique("Badowers");
        boutiques[5].setImg(R.drawable.badowers);
        boutiques[5].setDescription("Bringing the finest in men’s clothing to Des Moines for over 50 years, Badowers offers everything from exquisite suits to well-crafted denim. We’re an independent store for guys who love clothes. Fit and quality are our first priority. ");
        boutiques[5].setLocation(41.5860322,-93.7253725);

        boutiques[6] = new Points();
        boutiques[6].setBoutique("G&L Clothing");
        boutiques[6].setImg(R.drawable.g_l);
        boutiques[6].setDescription(" Regular, Big and Tall, we’ve got it all! Whether in-store or online, G&L Clothing serves working men and women throughout Iowa and the world with work, casual and dress clothing from brands like Carhartt, Dickies, Levi’s®, Wrangler, Savane and much, much more. Our sizing selection is hard to beat with bottoms ranging from 26 to 80 inch waist and tops from Small to 10XL and 5XL Tall.");
        boutiques[6].setLocation(41.5864367,-93.7115168);

        boutiques[7] = new Points();
        boutiques[7].setBoutique("The Backroom");
        boutiques[7].setImg(R.drawable.backrooom);
        boutiques[7].setDescription("The Backroom has evolved to providing the same service experience as our premiere stores and buying opportunities with vendors have offered our clients a real value on many of the industries best.");
        boutiques[7].setLocation(41.6182266,-93.7428565);

        boutiques[8] = new Points();
        boutiques[8].setBoutique("Mr. B");
        boutiques[8].setImg(R.drawable.mrb);
        boutiques[8].setDescription("Mr B continues to deliver exceptional service for 40 years in Des Moines and a level of quality clothing not found anywhere else in the midwest. Our on-site tailoring department is unmatched in the state of Iowa. We built our brand on customer service and high quality designer fashion clothing. We continue to believe that is what people need and want when shopping for clothing and that's how we do business every day.");
        boutiques[8].setLocation(41.6108579,-93.8058037);

        boutiques[9]= new Points();
        boutiques[9].setBoutique("Aimee");
        boutiques[9].setImg(R.drawable.aimee);
        boutiques[9].setDescription("Women's Clothing. Shoes. Accessories. We are a charming lifestyle boutique with a little something for everyone! Over 50 different unique lines from around the world.");
        boutiques[9].setLocation(41.58979,-93.6815206);

        boutiques[10] = new Points();
        boutiques[10].setBoutique("Blond Genius");
        boutiques[10].setImg(R.drawable.blondgenius);
        boutiques[10].setDescription("Blond Genius has jeans for every body. Our denim bar stocks over 150 styles of jeans for women and over 50 styles for men, all the jeans come in a wide variety of sizes and lengths. Pair your new jeans with our clothing, accessories and shoes, chosen from the trendiest fashions from New York to Los Angeles. ");
        boutiques[10].setLocation(41.5663153,-93.8808268);

        boutiques[11] = new Points();
        boutiques[11].setBoutique("Fun on 5th");
        boutiques[11].setImg(R.drawable.fun);
        boutiques[11].setDescription("An exceptional main street women's boutique shopping experience.");
        boutiques[11].setLocation(41.5718675,-93.7792593);

        boutiques[12] = new Points();
        boutiques[12].setBoutique("Mint L.A.");
        boutiques[12].setImg(R.drawable.mint);
        boutiques[12].setDescription("Mint L.A. is a trendy and affordable boutique catering to young female professionals who embrace their social life. Created for women on a budget who still want classic, timeless pieces, as well as affordable of-the-moment styles; every item is hand-selected in our Los Angeles showrooms for our amazing customers!");
        boutiques[12].setLocation(41.7048742,-93.6968293);

        boutiques[13] = new Points();
        boutiques[13].setBoutique("Repeat Boutique");
        boutiques[13].setImg(R.drawable.repeat);
        boutiques[13].setDescription("Repeat Boutique has all the best trends from the past, brought forward and presented in a fashionable, chic way.");
        boutiques[13].setLocation(41.586732,-93.7403457);

    }
    public Points[] getHomeGoods()
    {
        return new Points[]{boutiques[0],boutiques[1],boutiques[2],boutiques[3]};
    }
    public Points[] getMen()
    {
        return new Points[]{boutiques[4],boutiques[5],boutiques[6],boutiques[7],boutiques[8]};
    }
    public Points[] getWomen()
    {
        return new Points[]{boutiques[9],boutiques[10],boutiques[11],boutiques[12],boutiques[13]};
    }
    // the bubble sort code was found at https://mathbits.com/MathBits/Java/arrays/Bubble.htm, I only modified it to suit my needs.
    public Points[] getAll()
    {
        sharedPreferences = pref.getSharedPreferences("MyPrefs", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();


        Points[] copy = boutiques;
        for(int i = 0; i < copy.length; i++)
        {
            int points =  sharedPreferences.getInt(copy[i].getBoutique(),0);
            copy[i].setDescription(Integer.toString(points));
            copy[i].setCount(points);
        }

        int j;
        boolean flag = true;   // set flag to true to begin first pass
        Points temp = new Points();   //holding variable
        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < copy.length -1;  j++ )
            {
                if ( copy[ j ].getCount() < copy[j+1].getCount() )   // change to > for ascending sort
                {
                    temp = copy[ j ];                //swap elements
                    copy[ j ] = copy[ j+1 ];
                    copy[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
        return copy;

    }
    public void setUserLocation(double lat, double longi)
    {
        user_lat = lat;
        user_long = longi;
    }
    public double getUser_lat(){return user_lat; }
    public double getUser_long(){return  user_long; }


}
