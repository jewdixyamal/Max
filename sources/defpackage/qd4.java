package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* renamed from: qd4  reason: default package */
public final class qd4 implements Animation.AnimationListener {
    public final /* synthetic */ ovd a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ rd4 d;

    public qd4(ovd ovd, ViewGroup viewGroup, View view, rd4 rd4) {
        this.a = ovd;
        this.b = viewGroup;
        this.c = view;
        this.d = rd4;
    }

    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.b;
        viewGroup.post(new f5((Object) viewGroup, (Object) this.c, (Object) this.d, 18));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }
}
