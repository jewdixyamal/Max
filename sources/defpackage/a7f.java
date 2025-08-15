package defpackage;

import java.util.ArrayList;

/* renamed from: a7f  reason: default package */
public final /* synthetic */ class a7f implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6f b;

    public /* synthetic */ a7f(v6f v6f, int i) {
        this.a = i;
        this.b = v6f;
    }

    public void accept(Object obj) {
        v6f v6f = this.b;
        switch (this.a) {
            case 0:
                hm9.q("c7f", "putUploadInRepository: failed, upload=%s", v6f, (Throwable) obj);
                return;
            default:
                j10 j10 = (j10) obj;
                j10.i = d20.X;
                d7f d7f = v6f.a;
                j10.m = d7f.a;
                j10.u = d7f.b;
                j10.k = v6f.e;
                j10.o = v6f.f;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, o8f] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, o8f] */
    /* JADX WARNING: type inference failed for: r2v1, types: [mx1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, o8f] */
    public Object apply(Object obj) {
        o8f o8f;
        switch (this.a) {
            case 1:
                gle gle = (gle) obj;
                boolean z = gle instanceof plf;
                v6f v6f = this.b;
                if (z) {
                    ArrayList arrayList = ((plf) gle).c;
                    qlf qlf = (qlf) (arrayList != null ? x53.D0(arrayList) : nz4.a).get(0);
                    u6f b2 = v6f.b();
                    b2.d = qlf.a;
                    ? obj2 = new Object();
                    obj2.a = qlf.c;
                    obj2.b = qlf.b;
                    b2.h = new p8f(obj2);
                    return new v6f(b2);
                } else if (gle instanceof mj5) {
                    nj5 nj5 = (nj5) ((mj5) gle).c.get(0);
                    u6f b3 = v6f.b();
                    b3.d = nj5.c;
                    ? obj3 = new Object();
                    obj3.a = nj5.b;
                    obj3.b = nj5.a;
                    b3.h = new p8f(obj3);
                    return new v6f(b3);
                } else if (gle instanceof gwa) {
                    u6f b4 = v6f.b();
                    b4.d = ((gwa) gle).c;
                    return new v6f(b4);
                } else if (gle instanceof i4e) {
                    u6f b5 = v6f.b();
                    b5.d = ((i4e) gle).c;
                    return new v6f(b5);
                } else {
                    throw new RuntimeException("requestUrlSingle, can't request url for unknown media type= ".concat(h4f.t(v6f.a.c)));
                }
            case 3:
                return new ly8(this.b, (d2e) obj);
            default:
                w8f w8f = (w8f) obj;
                e7f e7f = new e7f();
                v6f v6f2 = this.b;
                d7f d7f = v6f2.a;
                e7f.b = d7f.d;
                ? obj4 = new Object();
                obj4.c = d7f.a;
                obj4.a = d7f.c;
                obj4.b = d7f.b;
                e7f.a = obj4;
                e7f.c = v6f2.b;
                e7f.d = v6f2.c;
                e7f.e = v6f2.d;
                e7f.f = v6f2.e;
                e7f.g = v6f2.f;
                e7f.h = v6f2.g;
                p8f p8f = v6f2.h;
                if (p8f == null) {
                    o8f = null;
                } else {
                    ? obj5 = new Object();
                    obj5.b = p8f.b;
                    obj5.a = p8f.a;
                    o8f = obj5;
                }
                e7f.i = o8f;
                e7f.j = v6f2.i;
                w8f.getClass();
                return new sa3(2, new uh(w8f, 28, e7f));
        }
    }
}
