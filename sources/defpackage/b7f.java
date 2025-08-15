package defpackage;

import java.io.File;

/* renamed from: b7f  reason: default package */
public final /* synthetic */ class b7f implements qj3, grd, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7f b;

    public /* synthetic */ b7f(d7f d7f, int i) {
        this.a = i;
        this.b = d7f;
    }

    public void accept(Object obj) {
        hm9.p("c7f", "removeUploadFromRepository: failed, data=" + this.b, (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                w8f w8f = (w8f) obj;
                d7f d7f = this.b;
                String str = d7f.a;
                w8f.getClass();
                xlc a2 = xlc.a(3, "SELECT * FROM uploads WHERE path=? AND upload_type=? AND last_modified=? LIMIT 1");
                if (str == null) {
                    a2.W(1);
                } else {
                    a2.f(1, str);
                }
                a2.j(2, (long) au1.s(d7f.c));
                a2.j(3, d7f.b);
                return new t28(new u8f(w8f, a2, 0));
            default:
                w8f w8f2 = (w8f) obj;
                d7f d7f2 = this.b;
                String str2 = d7f2.a;
                w8f2.getClass();
                return new sa3(2, new v8f(w8f2, str2, d7f2.c, d7f2.b));
        }
    }

    public void j(nqd nqd) {
        Object obj;
        hm9.m("c7f", "checkSourceFileChanged: started", new Object[0]);
        d7f d7f = this.b;
        try {
            obj = Long.valueOf(new File(d7f.a).lastModified());
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (obj instanceof njc) {
            obj = 0L;
        }
        long longValue = ((Number) obj).longValue();
        boolean z = (longValue == 0 || longValue == d7f.b) ? false : true;
        if (nqd.h()) {
            return;
        }
        if (z) {
            nqd.onError(new RuntimeException("failed to upload, file changed"));
            return;
        }
        hm9.m("c7f", "checkSourceFileChanged: finished", new Object[0]);
        nqd.a(d7f);
    }
}
