package com.bw.le.swiperefreshrectcler.recyclerview;

import android.view.View;
import android.view.ViewGroup;

abstract class AbstractFooter {
    CharSequence mLoadingText;
    CharSequence mEndText;
    CharSequence mPullToLoadText;

    public abstract View onCreateView(ViewGroup parent);
    public abstract void onBindData(View view, int state);
}
