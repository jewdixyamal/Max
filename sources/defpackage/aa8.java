package defpackage;

import android.content.ComponentName;

/* renamed from: aa8  reason: default package */
public final /* synthetic */ class aa8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da8 b;

    public /* synthetic */ aa8(da8 da8, int i) {
        this.a = i;
        this.b = da8;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [jo7, java.lang.Object] */
    public final void run() {
        switch (this.a) {
            case 0:
                da8 da8 = this.b;
                if (((e98) da8.g.b).e.a() == null) {
                    da8.R();
                    return;
                }
                return;
            default:
                da8 da82 = this.b;
                da82.getClass();
                ComponentName b2 = da82.c.a.b();
                ? obj = new Object();
                obj.c = da82;
                obj.a = new n68(obj);
                q68 q68 = new q68(da82.a, b2, obj);
                da82.h = q68;
                q68.a.b.connect();
                return;
        }
    }
}
