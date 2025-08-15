package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: h6g  reason: default package */
public final class h6g extends WindowInsetsAnimation$Callback {
    public final q42 a;
    public List b;
    public ArrayList c;
    public final HashMap d = new HashMap();

    public h6g(q42 q42) {
        super(q42.a);
        this.a = q42;
    }

    public final k6g a(WindowInsetsAnimation windowInsetsAnimation) {
        k6g k6g = (k6g) this.d.get(windowInsetsAnimation);
        if (k6g == null) {
            k6g = new k6g(0, (Interpolator) null, 0);
            if (Build.VERSION.SDK_INT >= 30) {
                k6g.a = new i6g(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, k6g);
        }
        return k6g;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation l = voa.l(list.get(size));
            k6g a2 = a(l);
            a2.a.d(l.getFraction());
            this.c.add(a2);
        }
        return this.a.d(x6g.f((View) null, windowInsets), this.b).e();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        l7b e = this.a.e(a(windowInsetsAnimation), new l7b(bounds));
        e.getClass();
        voa.p();
        return voa.j(((v27) e.b).d(), ((v27) e.c).d());
    }
}
