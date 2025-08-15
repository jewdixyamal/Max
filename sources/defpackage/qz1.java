package defpackage;

/* renamed from: qz1  reason: default package */
public final /* synthetic */ class qz1 implements mq1 {
    public final /* synthetic */ sz1 a;

    public /* synthetic */ qz1(sz1 sz1) {
        this.a = sz1;
    }

    public void a() {
        sz1 sz1 = this.a;
        synchronized (sz1.a) {
            try {
                if (sz1.i == 5) {
                    sz1.k(sz1.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String q(lq1 lq1) {
        String str;
        sz1 sz1 = this.a;
        synchronized (sz1.a) {
            c54.p("Release completer expected to be null", sz1.k == null);
            sz1.k = lq1;
            str = "Release[session=" + sz1 + "]";
        }
        return str;
    }
}
