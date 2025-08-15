package ru.ok.messages.location;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.ok.messages.location.view.SupportMapFragmentImpl;

public class TamSupportMapFragment extends SupportMapFragmentImpl {
    public FrameLayout m1;
    public eye n1;

    public final View k0() {
        return this.m1;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [eye, android.widget.FrameLayout, android.view.ViewGroup] */
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m1 = (FrameLayout) super.x0(layoutInflater, viewGroup, bundle);
        ? frameLayout = new FrameLayout(b0());
        this.n1 = frameLayout;
        frameLayout.addView(this.m1);
        return this.n1;
    }
}
