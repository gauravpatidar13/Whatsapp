package aide.myapp;

import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;
import java.util.*;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v7.widget.*;

public class MainActivity extends AppCompatActivity
{
	Toolbar toolbar;
	ViewPager vp;
	TabLayout tabs;
	FragmentManager fm;
	VPagerAdapter adapter;
	List<String> titles=new ArrayList<>();
	List<Fragment> fragList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		vp=(ViewPager)findViewById(R.id.view_pager);
		tabs=(TabLayout)findViewById(R.id.tab_layout);
		fm=getSupportFragmentManager();
		init();
		adapter=new VPagerAdapter(fm,fragList,titles);
		vp.setAdapter(adapter);
		tabs.setupWithViewPager(vp);
	}
	public void init(){
		addTabTitle("chats");
		addFragment(new ChatsFragment());
		addTabTitle("status");
		addFragment(new StatusFragment());
		addTabTitle("calls");
		addFragment(new CallsFragment());
	}
	public void addTabTitle(String t){
		if(titles!=null)
		titles.add(t);
	}
	public void addFragment(Fragment f){
		if(fragList!=null)
		fragList.add(f);
	}
}