package defpackage;

import android.graphics.Bitmap;

/* renamed from: ko0  reason: default package */
public final /* synthetic */ class ko0 implements xff {
    public final /* synthetic */ no0 a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ t26 c;
    public final /* synthetic */ uue d;

    public /* synthetic */ ko0(no0 no0, Bitmap bitmap, t26 t26, uue uue) {
        this.a = no0;
        this.b = bitmap;
        this.c = t26;
        this.d = uue;
    }

    public final void run() {
        no0 no0 = this.a;
        no0.getClass();
        uue uue = this.d;
        fm9.e("Bitmap queued but no timestamps provided.", uue.hasNext());
        no0.o.add(new mo0(this.b, this.c, uue));
        no0.A();
        no0.u0 = false;
    }
}
