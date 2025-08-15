package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: sb4  reason: default package */
public final class sb4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ yb4 c;

    public /* synthetic */ sb4(yb4 yb4, ArrayList arrayList, int i) {
        this.a = i;
        this.c = yb4;
        this.b = arrayList;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    yb4 yb4 = this.c;
                    if (hasNext) {
                        xb4 xb4 = (xb4) it.next();
                        dec dec = xb4.a;
                        yb4.getClass();
                        View view = dec.a;
                        int i = xb4.d - xb4.b;
                        int i2 = xb4.e - xb4.c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        yb4.p.add(dec);
                        animate.setDuration(yb4.e).setListener(new ub4(yb4, dec, i, view, i2, animate)).start();
                    } else {
                        arrayList.clear();
                        yb4.m.remove(arrayList);
                        return;
                    }
                }
            default:
                ArrayList arrayList2 = this.b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    yb4 yb42 = this.c;
                    if (hasNext2) {
                        dec dec2 = (dec) it2.next();
                        yb42.getClass();
                        View view2 = dec2.a;
                        ViewPropertyAnimator animate2 = view2.animate();
                        yb42.o.add(dec2);
                        animate2.alpha(1.0f).setDuration(yb42.c).setListener(new tb4(yb42, dec2, view2, animate2)).start();
                    } else {
                        arrayList2.clear();
                        yb42.l.remove(arrayList2);
                        return;
                    }
                }
        }
    }
}
