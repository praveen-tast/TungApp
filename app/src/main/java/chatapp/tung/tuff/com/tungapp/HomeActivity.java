package chatapp.tung.tuff.com.tungapp;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;

import chatapp.tung.tuff.com.tungapp.util.TypefaceTextView;

public class HomeActivity extends TabActivity {

    TypefaceTextView tabName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


      final  TabHost tabHost = getTabHost();
        tabName = (TypefaceTextView)findViewById(R.id.tabName);

        // Tab for Discover
       final TabHost.TabSpec Discoverspec = tabHost.newTabSpec("Discover");
        Discoverspec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu1));
        Intent photosIntent = new Intent(this, SearchActivity.class);
        Discoverspec.setContent(photosIntent);

        // Tab for Discover2
        final  TabHost.TabSpec discoverSpec2 = tabHost.newTabSpec("Discover2");
        // setting Title and Icon for the Tab
        discoverSpec2.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu2));
        Intent songsIntent = new Intent(this, NotificationActivty.class);
        discoverSpec2.setContent(songsIntent);

        // Tab for Chat
        final  TabHost.TabSpec chatSpec = tabHost.newTabSpec("CHAT");
        chatSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu3));
        Intent videosIntent = new Intent(this, NotificationActivty.class);
        chatSpec.setContent(videosIntent);

        // Tab for Notification
        final TabHost.TabSpec notificationSpec = tabHost.newTabSpec("Notify");
        notificationSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu4));
        Intent Search4Intent = new Intent(this, NotificationActivty.class);
        notificationSpec.setContent(Search4Intent);

        // Tab for Profile
        final  TabHost.TabSpec profileSpec = tabHost.newTabSpec("PROFILE");
        profileSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu5));
        Intent Search5Intent = new Intent(this, NotificationActivty.class);
        profileSpec.setContent(Search5Intent);

        // Adding all TabSpec to TabHost
        tabHost.addTab(Discoverspec); // Adding photos tab
        tabHost.addTab(discoverSpec2); // Adding songs tab
        tabHost.addTab(chatSpec);
        tabHost.addTab(notificationSpec);
        tabHost.addTab(profileSpec);// Adding videos tab

        tabHost.getTabWidget().setStripEnabled(false);
        setTabColor(tabHost);



        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if (tabId.equalsIgnoreCase("Discover")){
                    tabName.setText("DISCOVER");

                    /*Discoverspec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu1_active));
                    discoverSpec2.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu2));
                    chatSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu3));
                    notificationSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu4));
                    profileSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu5));*/

                }
                else if (tabId.equalsIgnoreCase("Discover2")){
                    tabName.setText("SAMPLE");
                   /* Discoverspec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu1));
                    discoverSpec2.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu2_active));
                    chatSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu3));
                    notificationSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu4));
                    profileSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu5));*/
                }

                else if (tabId.equalsIgnoreCase("CHAT")){
                    tabName.setText("CHAT");
                   /* Discoverspec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu1));
                    discoverSpec2.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu2));
                    chatSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu3_active));
                    notificationSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu4));
                    profileSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu5));*/
                }
                else if (tabId.equalsIgnoreCase("Notify")){
                    tabName.setText("NOTIFICATIONS");
                    /*Discoverspec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu1));
                    discoverSpec2.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu2));
                    chatSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu3));
                    notificationSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu4_active));
                    profileSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu5));*/
                }
                else if (tabId.equalsIgnoreCase("PROFILE")){
                    tabName.setText("PROFILE");
                    /*Discoverspec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu1));
                    discoverSpec2.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu2));
                    chatSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu3));
                    notificationSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu4));
                    profileSpec.setIndicator(null, getResources().getDrawable(R.drawable.discover_menu5_active));*/
                }

              //  setTabColor(tabHost);


            }
        });



    }

    @Override
    public void onBackPressed() {

        Intent in = new Intent(HomeActivity.this, SignInSignUp.class);
        startActivity(in);
        finish();

    }


    public static void setTabColor(TabHost tabhost) {
        for(int i=0;i<tabhost.getTabWidget().getChildCount();i++) {
            tabhost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#ffffff")); //unselected
        }
        tabhost.getTabWidget().getChildAt(tabhost.getCurrentTab()).setBackgroundColor(Color.parseColor("#ffffff")); // selected

    }


}