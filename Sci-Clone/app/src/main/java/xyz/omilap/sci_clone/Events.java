package xyz.omilap.sci_clone;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class Events extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView ImgView1=(ImageView) findViewById(R.id.imageView2);
        ImgView1.setBackgroundResource(R.drawable.even);
        Toast toast= Toast.makeText(getApplicationContext(),
                "Select an Event ", Toast.LENGTH_LONG);
        ImageView bimg=(ImageView) findViewById(R.id.imageView2);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        drawer.openDrawer(Gravity.LEFT);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        bimg.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast toast= Toast.makeText(getApplicationContext(),
                                                "SWIPE > >", Toast.LENGTH_SHORT);
                                        toast.setGravity(Gravity.CENTER | Gravity.LEFT, 0, 0);
                                        toast.show();


                                    }
                                }

        );
    }

    @Override
    public void onBackPressed() {
       finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.events, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        ScrollView sv=(ScrollView) findViewById(R.id.scrlv);
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        TextView titlev=(TextView) findViewById(R.id.textView6);
        ImageView ImgView=(ImageView) findViewById(R.id.imageView2);

        TextView tv1 =(TextView) findViewById(R.id.textView7);
        TextView tv2 =(TextView) findViewById(R.id.textView8);
        TextView tv3 =(TextView) findViewById(R.id.textView9);
        TextView tv4 =(TextView) findViewById(R.id.textView10);
        TextView tv5 =(TextView) findViewById(R.id.textView11);
        TextView tv6 =(TextView) findViewById(R.id.textView12);
        TextView tv7 =(TextView) findViewById(R.id.textView12);
        TextView tv8 =(TextView) findViewById(R.id.textView13);
        TextView tv9 =(TextView) findViewById(R.id.textView14);
        TextView tv10 =(TextView) findViewById(R.id.textView15);
        TextView tv11 =(TextView) findViewById(R.id.textView16);
        TextView tv12 =(TextView) findViewById(R.id.textView17);
        TextView tv13 =(TextView) findViewById(R.id.textView18);
        TextView tv14 =(TextView) findViewById(R.id.textView19);
        TextView tv15 =(TextView) findViewById(R.id.textView20);
        TextView tv16 =(TextView) findViewById(R.id.textView21);
        TextView tv17 =(TextView) findViewById(R.id.textView23);
        TextView tv18 =(TextView) findViewById(R.id.textView24);
        TextView tv19 =(TextView) findViewById(R.id.textView25);
        TextView tv20 =(TextView) findViewById(R.id.textView25);
       /* TextView tv21 =(TextView) findViewById(R.id.textView02);
        TextView tv22 =(TextView) findViewById(R.id.textView03);
        TextView tv23 =(TextView) findViewById(R.id.textView04);
        TextView tv24 =(TextView) findViewById(R.id.textView05);
        TextView tv25 =(TextView) findViewById(R.id.textView06);
        TextView tv26 =(TextView) findViewById(R.id.textView07);
        TextView tv27 =(TextView) findViewById(R.id.textView08);
        TextView tv28 =(TextView) findViewById(R.id.textView09);
        TextView tv29 =(TextView) findViewById(R.id.textView010);
        TextView tv30 =(TextView) findViewById(R.id.textView011);
        TextView tv31 =(TextView) findViewById(R.id.textView012);*/
        TextView venue =(TextView) findViewById(R.id.venue);



        if (id == R.id.nav_home) {
            startActivity(new Intent(Events.this, HomeActivity.class));
        } else if (id == R.id.nav_extempore) {
            titlev.setText("Rules - ");
            tv1.setText("1) Three Minutes will be given to a participant to speak");
            tv2.setText("2) Competetor have to choose any chit randomly");
            tv3.setText("3) The Competetor have to speak on the topic written on the chosen chit.");
            tv4.setText("4) Registration fees is Rs.50");
            tv5.setText("5) Additional rules may be announced during the event. ");
            tv6.setText("6) The rules may change without any prior notice. ");
            tv7.setText("7) Rules may subject to change without any prior notice. ");
            tv8.setText("8) The contestant can speak in Hindi, English and Marathi only ");
            tv9.setText(" ");
            tv10.setText(" ");
            tv11.setText(" ");
            tv12.setText(" ");
            tv13.setText(" ");
            tv14.setText(" ");
            tv15.setText(" ");
            tv16.setText(" ");
            tv18.setText("");
            tv17.setText("");

            tv20.setText("Extempore");
            venue.setText("Fourth Floor - 28th Feb.");

            sv.fullScroll(ScrollView.FOCUS_UP);
            ImgView.setBackgroundResource(R.drawable.debate);
        } else if (id == R.id.nav_futsal) {
            titlev.setText("");
            titlev.setText("Rules - ");
            tv1.setText("1) Five Players per Team. ");
            tv2.setText("2) Four Players on the ground at once and one will be a substitute ");
            tv3.setText("3) There will be not use his hands Goal keeper.");
            tv4.setText("4) No Rough game is allowed. ");
            tv5.setText("5) Shoots over the height of waist are not allowed.");
            tv6.setText("6) Penalty shootout has to be taken without a keeper at the post. ");
            tv8.setText("7) A player has to score a goal from the outside of 'D' ");
            tv9.setText("8) The game will be of 14 Minutes, with each half of 7 Minutes. ");
            tv10.setText("9) Registration fees is Rs.50");
            tv11.setText("10) Additional rules may be announced or changed during the event.");
            tv12.setText(" ");
            tv13.setText(" ");
            tv14.setText(" ");
            tv15.setText(" ");
            sv.fullScroll(ScrollView.FOCUS_UP);
            tv15.setText(" ");
            tv16.setText(" "); tv18.setText("");
            tv17.setText("");
            tv20.setText("Futsal");
            venue.setText("College Premises - 25th Feb");
            ImgView.setBackgroundResource(R.drawable.ball);
        } else if (id == R.id.nav_hunt) {
            titlev.setText("");
            titlev.setText("Rules - ");
            tv1.setText("1) Only four members are allowed in each team. ");
            tv2.setText("2) Time limit to complete the whole game is 25 Minutes. ");
            tv3.setText("3) There will be four spots to complete the game. ");
            tv4.setText("4) First clue will be given by volunteers, it will mark the start of game. ");
            tv5.setText("5) Team completing the whole game (all the clues) at earliest will be the winner. ");
            tv6.setText("6) The clues will be written in three languages(Marathi, Hindi, English) with riddles.");
            tv8.setText("7) The rules may change as per situations at that time.");
            tv9.setText("8) The teams cannot change once they are fixed. ");
            tv10.setText("9) Any kind of Misbehavior will not be tolerated. ");
            tv11.setText("10) Registration fees is Rs.80 ");
            tv12.setText(" ");
            tv13.setText(" ");
            tv14.setText(" ");
            tv15.setText(" ");
            tv16.setText(" ");
            tv17.setText(" ");sv.fullScroll(ScrollView.FOCUS_UP);
            tv18.setText("");
            tv19.setText("");
            venue.setText("Fourth Floor - 28th Feb.");
            tv20.setText("Hunt-Era ");
            ImgView.setBackgroundResource(R.drawable.detective);
        } else if (id == R.id.nav_art) {
            titlev.setText("");
            titlev.setText("Rules - ");
            tv1.setText("1) Each team can have three or two members.");
            tv2.setText("2) Poster must contain a title. ");
            tv3.setText("3) It should have background information related to the subject chosen by the participants. ");
            tv4.setText("4) It should have project objectives, results combined with tables, graphs or charts.");
            tv5.setText("5) The poster will be of A1 (Drawing paper) sized paper.  ");
            tv6.setText("6) Participants can select any topic of their choice from the given. ");
            tv8.setText("7) All text should be based on the chosen topic. ");
            tv9.setText("8) Winners will be decided according to their poster text, its research, conclusion, and its its predictions about future. ");
            tv10.setText(" ");
            tv11.setText("Topics - ");
            tv12.setText("1)'Technology for Human welfare.'");
            tv13.setText("2) 'Use of Social Media.'");
            tv14.setText("3) 'Is India ready for cashless economy ?' ");
            tv15.setText("4) 'Application of green chemistry, effects of global warming.' ");
            tv16.setText("5) 'Indian Satellites' ");
            tv18.setText(" Registration fees is Rs.80");
            tv19.setText("");
            tv17.setText("6) 'Need of Conservation of Historical Places.'");
            ImgView.setBackgroundResource(R.drawable.paints);
            venue.setText("Fourth Floor - 28th Feb.");
            tv19.setText("Poster Making");
            sv.fullScroll(ScrollView.FOCUS_UP);
        } else if (id == R.id.nav_register) {
            startActivity(new Intent(Events.this, RegisterActivity.class));
        } else if(id== R.id.nav_cric){
            titlev.setText("");
            titlev.setText("Rules - ");
            tv1.setText(" ");
            tv2.setText("Rules for Girls");
            tv3.setText(" ");
            tv4.setText("1) Each team should be of two players. ");
            tv5.setText("2) Both teams will play two overs. ");
            tv6.setText("3) If a Batsman gets out then two runs will be reduced from the runs that team has scored. ");
            tv8.setText("4) Six runs will not be declared as out. ");
            tv9.setText("5) there will be Two members in a team, out of which one will be bowling and the other will be wicket keeping.");
            tv10.setText("");
            tv11.setText("Rules for Boys");
            tv12.setText(" ");
            tv13.setText("1) Each team should be of Five Players");
            tv14.setText("2) Four overs per Team, out of which one will be a power over. The runs scored in a power over gets doubled. ");
            tv15.setText("3) One bowler - One Over ");
            tv16.setText("4) Six is Out. ");
            tv17.setText("");
            tv18.setText("Registration fees is Rs.50 for Girls and Rs.100 for Boys.");
            tv19.setText("");
            tv20.setText("Cric Box");
            venue.setText("Basketball Court - 25th Feb.");sv.fullScroll(ScrollView.FOCUS_UP);
            ImgView.setBackgroundResource(R.drawable.cricind);
        }else if(id==R.id.nav_gamer){
            titlev.setText("Gaming Rules - ");
            tv1.setText("I) Counter Strike 1.6 - ");
            tv2.setText(" 1) Use of personal mouse or keyboard shall lead to disqualification");
            tv3.setText(" 2) The map to be played will be decided at the time of the each match by the Co-Ordinators");
            tv4.setText(" 3) All weapons are available in the game and open to all the players.");
            tv5.setText(" 4) All Matches will be Knockout Matches. There will be rounds in knockout match and teams will switch from CT to T and vice-versa. ");
            tv6.setText(" 5) Instructions to preceding rounds will be provided by the co-ordinators to the winning team. Registration fees is Rs.150 per team.");
            tv8.setText("II) Mini Militia - ");
            tv9.setText(" 1) Use of rooted mobiles will lead to disqualification.");
            tv10.setText(" 2) Maps will be decided at the time of event.");
            tv11.setText(" 3) Airplane mode is compulsory");
            tv12.setText(" 4) Members can not be substituted");
            tv13.setText(" 5) Re-Entry of a team is allowed. Registration fees is Rs.20 per person.");
            tv14.setText("Common Rules -");
            tv15.setText(" 1) No foul language is allowed while playing ");
            tv16.setText(" 2) Participants shall obey the event coordinator all times. His decision is final.");
            tv17.setText(" 3) Use of any unfair means (PENDRIVE , ANY KIND OF FILES EXCEPT GAME FILES,ETC...) shall result in disqualification");
            tv18.setText(" 4) The participants should not mishandle the PCs and consoles. Any damage caused, will be borne by themselves");
            tv19.setText(" 5) RULES OF THE GAME ARE SUBJECT TO CHANGE WITHOUT ANY PRIOR NOTICE.");
            tv20.setText("Gamer's Asylum");sv.fullScroll(ScrollView.FOCUS_UP);

            venue.setText("516 - Language Lab - 28th Feb");




            ImgView.setBackgroundResource(R.drawable.lan);
        }else if(id==R.id.nav_coord) {
            titlev.setText("Event Coordinators -");
            tv1.setText(" ");
            tv2.setText("1) Poster Making - Tejasvi Pathade - 8793512723");
            tv3.setText(" ");
            tv4.setText("2) Futsal - Shubham Patil – 8668378434 / 9604145139.");
            tv5.setText(" ");
            tv6.setText("3) Extempore - Shantanu Naik – 8208435743");
            tv8.setText(" ");
            tv9.setText("4)  Hunt-Era - Harshvardhan Ghuge - 9403009002");
            tv10.setText(" ");
            tv11.setText("5) Cric Box - Boys – Sanskar Mane - 9028041661");
            tv12.setText(" Girls - Anushka Kulkarni - 7276191227");
            tv13.setText(" ");
            tv14.setText("6) Gamer's Asylum - Swanand Shingne / Ashutosh Bagdiya - 7218863740 / 8273291237");
            tv15.setText(" ");
            tv16.setText(" ");
            tv17.setText(" ");sv.fullScroll(ScrollView.FOCUS_UP);
            tv18.setText("");
            tv17.setText("");

            tv20.setText("Event Coordinators");
            venue.setText("The Sci-Clone App by Omkar-Bahiwal");
            ImgView.setBackgroundResource(R.drawable.even);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
