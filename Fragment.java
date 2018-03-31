/*
Fragment ͨ��getActivity()���Ի�ȡ���ڵ�Activity��

Activityͨ��FragmentManager��findFragmentById()����
findFragmentByTag()��ȡFragment

Fragment �� Activity �Ƕ�Զ�Ĺ�ϵ

*/

public class AFragment extends Fragment{

	private TextView mTvTitle;

//�൱��Activity�е�setContent
	public View onCreateView(LayoutInflater inflater, ViewGroup container ,Bundle saveInstanceState){
		
		View view = inflater.inflate(R.layout.fragment, container,false);
		return view;
	}

//�൱��Activity�е�findViewById
	public void onViewCreated(View view, Bundle savedInstanceState){
		
		super.onViewCreated(view, savedInstanceState);
		
		mTvTitle = (TextView) view.findViewById(R.id.tv_title);
	}
}