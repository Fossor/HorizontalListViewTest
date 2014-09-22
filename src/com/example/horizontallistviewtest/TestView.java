package com.example.horizontallistviewtest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;


public class TestView extends RelativeLayout {
	public TestView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		System.out.println("TestView onLayout");
		super.onLayout(changed, l, t, r, b);
	}
}
