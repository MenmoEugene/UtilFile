/*
Fragment 通过getActivity()可以获取所在的Activity；

Activity通过FragmentManager的findFragmentById()或者
findFragmentByTag()获取Fragment

Fragment 和 Activity 是多对多的关系

*/

public class AFragment extends Fragment{

	private TextView mTvTitle;

//相当于Activity中的setContent
	public View onCreateView(LayoutInflater inflater, ViewGroup container ,Bundle saveInstanceState){
		
		View view = inflater.inflate(R.layout.fragment, container,false);
		return view;
	}

//相当于Activity中的findViewById
	public void onViewCreated(View view, Bundle savedInstanceState){
		
		super.onViewCreated(view, savedInstanceState);
		
		mTvTitle = (TextView) view.findViewById(R.id.tv_title);
	}
}