package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: t4d  reason: default package */
public final class t4d extends dec {
    public static final /* synthetic */ int L0 = 0;
    public final p58 F0;
    public final OneMeDraweeView G0;
    public final View H0;
    public q4d I0;
    public Uri J0;
    public Uri K0;

    public t4d(p58 p58, OneMeDraweeView oneMeDraweeView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout) {
        super(frameLayout);
        this.F0 = p58;
        this.G0 = oneMeDraweeView;
        this.H0 = appCompatImageView2;
        tu0.K(oneMeDraweeView, 300, new s4d(this, 0));
        tu0.K(appCompatImageView, 300, new s4d(this, 1));
    }
}
