package info.papdt.express.helper.ui.fragment;

import info.papdt.express.helper.ui.adapter.HomeCardRecyclerAdapter;

public class HomeFragment extends BaseHomeFragment {

	private HomeCardRecyclerAdapter mAdapter;

	public static HomeFragment newInstance() {
		HomeFragment fragment = new HomeFragment();
		return fragment;
	}

	public HomeFragment() {
	}

	@Override
	public void setUpAdapter() {
		mAdapter = new HomeCardRecyclerAdapter(getActivity().getApplicationContext(), mDB, headerView);
		mRecyclerView.setAdapter(mAdapter);
		setUpAdapterListener();
	}

}