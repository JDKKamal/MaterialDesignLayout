package com.jdkgroup.materialdesignlayout.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jdkgroup.materialdesignlayout.R;
import com.jdkgroup.materialdesignlayout.adapter.CommonRecycleAdapter;

import java.util.ArrayList;
import java.util.List;

public class PostsFragment extends Fragment {

	 RecyclerView recyclerView;

	public static Fragment newInstance(Context context) {
		PostsFragment f = new PostsFragment();
		return f;
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		ViewGroup root = (ViewGroup) inflater.inflate(R.layout.content_main, null);
		setUpView(root);
		return root;
	}

	void setUpView(ViewGroup root){
		recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
		setUPList();
	}

	void setUPList(){
		recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
		CommonRecycleAdapter adapter = new CommonRecycleAdapter(createItemList());
		recyclerView.setAdapter(adapter);
	}

	private List<String> createItemList() {
		List<String> itemList = new ArrayList<>();
		for(int i=0;i<30;i++) {
			itemList.add("Item "+i);
		}
		return itemList;
	}
}
