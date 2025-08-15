package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: w27  reason: default package */
public final class w27 extends q42 {
    public final View c;
    public int d;
    public int e;
    public final int[] f = new int[2];

    public w27(View view) {
        super(0);
        this.c = view;
    }

    public final void b(k6g k6g) {
        this.c.setTranslationY(0.0f);
    }

    public final void c(k6g k6g) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    public final x6g d(x6g x6g, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            k6g k6g = (k6g) it.next();
            if ((k6g.a.c() & 8) != 0) {
                this.c.setTranslationY((float) og.c(this.e, k6g.a.b(), 0));
                break;
            }
        }
        return x6g;
    }

    public final l7b e(k6g k6g, l7b l7b) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY((float) i);
        return l7b;
    }
}
