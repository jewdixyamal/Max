package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wof  reason: default package */
public final class wof {
    public final ArrayList a = new ArrayList();
    public long b = -1;
    public Interpolator c;
    public xof d;
    public boolean e;
    public final qwe f = new qwe(this);

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((vof) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                vof vof = (vof) it.next();
                long j = this.b;
                if (j >= 0) {
                    vof.c(j);
                }
                Interpolator interpolator = this.c;
                if (!(interpolator == null || (view = (View) vof.a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.d != null) {
                    vof.d(this.f);
                }
                View view2 = (View) vof.a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.e = true;
        }
    }
}
