package defpackage;

import android.graphics.Bitmap;

/* renamed from: wt6  reason: default package */
public final /* synthetic */ class wt6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt6 b;
    public final /* synthetic */ Bitmap c;
    public final /* synthetic */ qy5 o;

    public /* synthetic */ wt6(xt6 xt6, Bitmap bitmap, qy5 qy5, int i) {
        this.a = i;
        this.b = xt6;
        this.c = bitmap;
        this.o = qy5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c, this.o);
                return;
            default:
                this.b.b(this.c, this.o);
                return;
        }
    }
}
