package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* renamed from: gxc  reason: default package */
public abstract class gxc {
    public FastScroller a;
    public lq9 b;

    /* JADX WARNING: type inference failed for: r4v0, types: [kx1, java.lang.Object] */
    public final lq9 a() {
        if (this.b == null) {
            View view = ((ld4) this).c;
            int i = hsb.fastscroll__default_show;
            int i2 = hsb.fastscroll__default_hide;
            ? obj = new Object();
            obj.c = view;
            obj.a = 1.0f;
            obj.b = 1.0f;
            AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i2);
            animatorSet.setStartDelay((long) 1000);
            animatorSet.setTarget(view);
            ((AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i)).setTarget(view);
            animatorSet.addListener(new tv3(view));
            obj.a();
            this.b = new lq9(obj);
        }
        return this.b;
    }
}
