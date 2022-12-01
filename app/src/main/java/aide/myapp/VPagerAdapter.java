package aide.myapp;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.*;
import java.util.*;

public class VPagerAdapter extends FragmentPagerAdapter
{
	FragmentManager fm;
    List<Fragment> fragList;
	List<String> fragTitles;

	public VPagerAdapter(FragmentManager fm, List<Fragment> fragList, List<String> fragTitles)
	{
		super(fm);
		this.fm = fm;
		this.fragList = fragList;
		this.fragTitles = fragTitles;
	}
	

	@Override
	public int getCount()
	{
		return fragList.size();
	}

	@Override
	public Fragment getItem(int p1)
	{
		return fragList.get(p1);
	}

	@Override
	public CharSequence getPageTitle(int position)
	{
		return fragTitles.get(position);
	}
	
}