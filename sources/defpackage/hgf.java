package defpackage;

import android.view.WindowManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: hgf  reason: default package */
public final class hgf implements fgf, qj3, x3a, o3a, k3a {
    public final Object a;

    public /* synthetic */ hgf(Object obj) {
        this.a = obj;
    }

    public void a(Object obj) {
        ((CountDownLatch) this.a).countDown();
    }

    public void accept(Object obj) {
        m56 m56 = ((qoa) this.a).f;
        m56.invoke("error occurred: " + ((Throwable) obj));
    }

    public void b(gte gte) {
        gte.c(((WindowManager) this.a).getDefaultDisplay());
    }

    public void c() {
    }

    public void d() {
        ((CountDownLatch) this.a).countDown();
    }

    public void onFailure(Exception exc) {
        ((CountDownLatch) this.a).countDown();
    }

    public /* synthetic */ hgf(y7f y7f) {
        zig zig = new zig(y7f);
        this.a = gfg.a(new nof(gfg.a(new jo7((Object) gfg.a(new wva(zig, 19, gfg.a(new ece(zig)))), (Object) gfg.a(new mfe(zig)), (Object) zig))));
    }

    public /* synthetic */ hgf() {
        this.a = new CountDownLatch(1);
    }
}
