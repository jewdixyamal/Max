package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: uv3  reason: default package */
public final class uv3 implements qv3 {
    public final LinkedHashSet a = new LinkedHashSet();
    public AnimatorSet b;
    public View c;
    public View d;
    public final je7 e = tu0.r(3, new rv3(this, 0));
    public final je7 f = tu0.r(3, new rv3(this, 1));
    public boolean g = true;
    public m56 h;
    public m56 i;
    public ov3 j;
    public ov3 k;

    public uv3() {
        pz2 pz2 = new pz2(11);
        this.h = pz2;
        this.i = new pz2(11);
        this.j = new ov3();
        this.k = new ov3();
        pz2.invoke(true);
    }

    public static final void a(uv3 uv3, boolean z) {
        uv3.b = null;
        uv3.h.invoke(Boolean.valueOf(z));
        for (pv3 L : uv3.a) {
            L.L();
        }
    }

    public final void b(pv3 pv3) {
        this.a.add(pv3);
    }

    public final void c(boolean z) {
        View view;
        boolean z2 = z;
        boolean z3 = this.g;
        if (z3 == z2 || this.b != null) {
            this.h.invoke(Boolean.valueOf(z3));
            return;
        }
        this.j = ov3.a(this.j, 0, 0, z2, 3);
        ov3 a2 = ov3.a(this.k, 0, 0, z2, 3);
        this.k = a2;
        this.g = z2;
        View view2 = this.c;
        if (view2 != null && (view = this.d) != null) {
            boolean z4 = this.j.c;
            int i2 = z4 ? 1 : -1;
            boolean z5 = a2.c;
            int i3 = !z5 ? 1 : -1;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            int b2 = this.j.b();
            float f2 = ((float) b2) * ((float) i2);
            nv3 nv3 = r8;
            AnimatorSet animatorSet2 = animatorSet;
            nv3 nv32 = new nv3(z4, b2, i2, f2, view2.getY(), this.j.b);
            int b3 = this.k.b();
            float f3 = ((float) b3) * ((float) i3);
            nv3 nv33 = new nv3(z5, b3, i3, f3, view.getY(), this.k.b);
            Property property = View.ALPHA;
            float f4 = 0.0f;
            Float valueOf = Float.valueOf(0.0f);
            if (!z4) {
                valueOf = null;
            }
            float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
            Float valueOf2 = Float.valueOf(1.0f);
            if (!z4) {
                valueOf2 = null;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, new float[]{floatValue, valueOf2 != null ? valueOf2.floatValue() : 0.0f});
            Property property2 = View.Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property2, new float[]{view2.getY(), view2.getY() + f2});
            Float valueOf3 = Float.valueOf(0.0f);
            if (!z5) {
                valueOf3 = null;
            }
            float floatValue2 = valueOf3 != null ? valueOf3.floatValue() : 1.0f;
            Float valueOf4 = Float.valueOf(1.0f);
            if (!z5) {
                valueOf4 = null;
            }
            if (valueOf4 != null) {
                f4 = valueOf4.floatValue();
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, property, new float[]{floatValue2, f4});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, property2, new float[]{view.getY(), view.getY() + f3});
            LinkedHashSet<pv3> linkedHashSet = this.a;
            ArrayList arrayList = new ArrayList(z53.S(linkedHashSet, 10));
            for (pv3 H : linkedHashSet) {
                arrayList.add(H.H(nv3, nv33));
            }
            ArrayList T = z53.T(arrayList);
            kl7 l = j1e.l();
            l.add(ofFloat);
            l.add(ofFloat2);
            l.add(ofFloat3);
            l.add(ofFloat4);
            l.addAll(T);
            AnimatorSet animatorSet3 = animatorSet2;
            animatorSet3.playTogether(j1e.d(l));
            animatorSet3.addListener(new tv3(this, this.g, 0));
            animatorSet3.start();
            this.b = animatorSet3;
        }
    }
}
