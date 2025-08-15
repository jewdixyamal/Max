package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: x6f  reason: default package */
public final /* synthetic */ class x6f implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7f b;

    public /* synthetic */ x6f(c7f c7f, int i) {
        this.a = i;
        this.b = c7f;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                this.b.b((v6f) obj);
                return;
            case 5:
                v6f v6f = (v6f) obj;
                c7f c7f = this.b;
                c7f.getClass();
                if (v6f.a()) {
                    d7f d7f = v6f.a;
                    int i = d7f.c;
                    if (i != 6 && !h4f.a(i)) {
                        c7f.b(v6f);
                        return;
                    } else {
                        c7f.d(d7f);
                        return;
                    }
                } else {
                    return;
                }
            default:
                c7f c7f2 = this.b;
                zl4 zl4 = (zl4) obj;
                synchronized (c7f2) {
                    c7f2.i.a(zl4);
                }
                return;
        }
    }

    public Object apply(Object obj) {
        dle dle;
        int i;
        String str = null;
        c7f c7f = this.b;
        switch (this.a) {
            case 0:
                v6f v6f = (v6f) obj;
                c7f.getClass();
                hm9.m("c7f", "prepareUploadFiles: started for upload=%s", v6f);
                if (!oag.t(v6f.b)) {
                    return iqd.g(v6f);
                }
                it3 c = ((cj0) ((af8) c7f.g.g.getValue())).c(v6f.a.a);
                if (c == null) {
                    return iqd.f(new RuntimeException("failed to prepare upload files"));
                }
                long j = c.b;
                if (j == 0) {
                    return iqd.f(new RuntimeException("content is zero length"));
                }
                String str2 = c.e;
                if (oag.t(str2)) {
                    hm9.m("c7f", "prepareUploadFiles: need copy for upload=%s", v6f);
                    q1a q1a = new q1a(1, new u00((Object) c7f, (Object) v6f, (Object) c, 29));
                    ztc ztc = c7f.f;
                    return q1a.m(ztc).i(ztc);
                }
                u6f b2 = v6f.b();
                b2.c = c.c;
                b2.b = str2;
                b2.f = j;
                return iqd.g(new v6f(b2));
            case 1:
                v6f v6f2 = (v6f) obj;
                c7f.getClass();
                ztc b3 = muc.b();
                int i2 = v6f2.a.c;
                boolean z = i2 == 3;
                ztc ztc2 = c7f.f;
                return (z || h4f.a(i2)) ? new q1a(2, new z6f(c7f, v6f2, 1)).m(b3).i(ztc2) : h4f.b(i2) ? new q1a(2, new z6f(c7f, v6f2, 0)).m(b3).i(ztc2) : iqd.g(v6f2);
            case 3:
                v6f v6f3 = (v6f) obj;
                c7f.getClass();
                if (!oag.t(v6f3.d)) {
                    hm9.m("c7f", "requestUrlSingle: already have upload url" + v6f3, new Object[0]);
                    return iqd.g(v6f3);
                }
                hm9.m("c7f", "requestUrlSingle: request upload url" + v6f3, new Object[0]);
                int i3 = v6f3.a.c;
                switch (au1.s(i3)) {
                    case 1:
                        dle = new gs9(1, 1);
                        break;
                    case 2:
                    case 6:
                        dle = new gs9(Boolean.FALSE);
                        break;
                    case 3:
                        dle = new gs9(Boolean.TRUE);
                        break;
                    case 4:
                        dle = new tq2();
                        break;
                    case 5:
                        dle = new gs9(3, 1);
                        break;
                    case 7:
                        dle = new gs9((sla) null, 11);
                        break;
                    case 8:
                        dle = new gs9(2, 1);
                        break;
                    default:
                        throw new RuntimeException("tamRequestFromUploadType, can't request url for unknown media type= ".concat(h4f.t(i3)));
                }
                uqd h = ((k4a) c7f.e).K(dle, c7f.f).h(new a7f(v6f3, 1));
                fme fme = c7f.c;
                fme.getClass();
                return h.j(new dme(fme, 1, 0));
            case 4:
                v6f v6f4 = (v6f) obj;
                c7f.getClass();
                hm9.m("c7f", "uploadFileObservable: upload=%s", v6f4);
                int i4 = v6f4.a.c;
                if (i4 == 5 || h4f.b(i4)) {
                    str = v6f4.c;
                }
                String str3 = str;
                switch (au1.s(i4)) {
                    case 1:
                    case 8:
                        i = 3;
                        break;
                    case 2:
                    case 3:
                    case 6:
                        i = 1;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 2;
                        break;
                    case 7:
                        i = 5;
                        break;
                    default:
                        throw new RuntimeException("unknown http type for upload type ".concat(h4f.t(i4)));
                }
                ime ime = c7f.b;
                ime.getClass();
                je7 je7 = ime.a;
                String str4 = v6f4.b;
                String str5 = v6f4.d;
                ztc ztc3 = c7f.f;
                ty9 ty9 = new ty9(new oz9(new e0a(new uq6(je7, i, str4, str3, str5, ztc3).r(ztc3), new ui0((Object) c7f, i4, (Object) v6f4, 14), 3), ft.e, new ypc(c7f, 13, v6f4), ft.d), new vg4(new AtomicLong(), TimeUnit.MILLISECONDS, 500, (b7b) new n2f(7)), 1);
                ((t33) c7f.d).getClass();
                return new e0a(new e0a(ty9, new pc5(TimeUnit.DAYS.toMillis(7), v6f4.i, 3), 4), new bqc(26, c7f.c), 6);
            case 6:
                d7f d7f = (d7f) obj;
                f28 d = c7f.a.d(d7f);
                n2f n2f = new n2f(5);
                kj6 kj6 = ft.e;
                r66 r66 = ft.d;
                return new c38(new e38(new e38(new e38(d, n2f, kj6, r66), kj6, new n2f(6), r66), kj6, kj6, new y6f(d7f, 0)));
            case 7:
                v6f v6f5 = (v6f) obj;
                c7f.getClass();
                return v6f5.a() ? qy9.m(v6f5) : new oz9(new q28(new rqd(new uqd(new rqd(new uqd(new uqd(iqd.g(v6f5).m(c7f.f), new x6f(c7f, 0), 0), new x6f(c7f, 1), 0), new x6f(c7f, 2), 2), new x6f(c7f, 3), 0), new x6f(c7f, 2), 2), new x6f(c7f, 4), 3), new x6f(c7f, 5), ft.e, ft.d);
            default:
                return c7f.e((d7f) obj);
        }
    }
}
