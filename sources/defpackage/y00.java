package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: y00  reason: default package */
public final class y00 {
    public final hle a;
    public final o45 b;
    public final zi5 c;
    public final i56 d;
    public final f55 e;
    public final hc3 f;

    /* JADX WARNING: type inference failed for: r7v6, types: [hc3, java.lang.Object] */
    public y00(zi5 zi5, hle hle, o45 o45) {
        this.a = hle;
        this.b = o45;
        this.c = zi5;
        i56 i56 = new i56(200, 0);
        this.d = i56;
        hle.getClass();
        jle jle = (jle) hle;
        iba iba = (iba) jle.a.getValue();
        ExecutorService i = iba.i(iba.b().a(5, "preview-disk-cache"), "preview-disk-cache");
        trd trd = muc.a;
        this.e = new f55(i, true);
        ? obj = new Object();
        this.f = obj;
        a38 f2 = new s28(new k28(new x00(this)), new x00(this), 1).h(jle.a()).f(jle.b());
        g28 g28 = new g28(new ync(6, i56), new x00(this), ft.d);
        f2.a(g28);
        obj.a(g28);
    }
}
