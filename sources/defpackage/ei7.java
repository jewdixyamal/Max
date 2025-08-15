package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: ei7  reason: default package */
public final class ei7 extends ol implements lme {
    public final String X;
    public final boolean Y;
    public final String Z;
    public final /* synthetic */ int o = 1;

    public ei7(long j, String str) {
        super(j);
        this.X = str;
        this.Y = false;
        this.Z = null;
    }

    public final void e(gle gle) {
        Object obj;
        String str;
        long j;
        switch (this.o) {
            case 0:
                gi7 gi7 = (gi7) gle;
                String str2 = gi7.Y;
                f52 f52 = gi7.c;
                if (f52 != null) {
                    try {
                        q().k(f52);
                    } catch (TamErrorException unused) {
                    }
                    gi9 c0 = m().c0(Collections.singletonList(f52));
                    if (c0.d > 0) {
                        long[] jArr = c0.b;
                        long[] jArr2 = c0.a;
                        int length = jArr2.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j2 = jArr2[i];
                                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j2) < 128) {
                                            long j3 = jArr[(i << 3) + i3];
                                            if (gi7.X != null) {
                                                j = p().f(j3, ((p7b) r()).a.t(), gi7.X);
                                            } else {
                                                j = -1;
                                            }
                                            l().c(new hi7(this.a, Long.valueOf(j3), j, (kq3) null, (dh6) null, (def) null, (Long) null, str2));
                                            return;
                                        }
                                        String str3 = str2;
                                        j2 >>= 8;
                                    }
                                    str = str2;
                                    if (i2 != 8) {
                                    }
                                } else {
                                    str = str2;
                                }
                                if (i != length) {
                                    i++;
                                    str2 = str;
                                }
                            }
                        }
                        throw new NoSuchElementException("The LongSet is empty");
                    }
                    return;
                }
                String str4 = str2;
                def def = gi7.s0;
                if (def != null) {
                    try {
                        q().u(def);
                        obj = e5f.a;
                    } catch (Throwable th) {
                        obj = new njc(th);
                    }
                    Throwable a = pjc.a(obj);
                    if (a != null) {
                        hm9.p(ei7.class.getName(), "fail to fetch video conference missed ids", a);
                    }
                    l().c(new hi7(this.a, (Long) null, -1, (kq3) null, (dh6) null, def, (Long) null, str4));
                    return;
                }
                n3e n3e = gi7.t0;
                if (n3e != null) {
                    pl plVar = this.c;
                    if (plVar == null) {
                        plVar = null;
                    }
                    a4e a4e = (a4e) plVar.o.getValue();
                    List singletonList = Collections.singletonList(n3e);
                    a4e.getClass();
                    hm9.m("a4e", "storeStickerSetsFromServer: sticker sets: %s", singletonList);
                    vy9 v = new e0a(qy9.j(singletonList), new x3e(a4e, 0), 3).v();
                    c4e c4e = a4e.a;
                    Objects.requireNonNull(c4e);
                    nd7.U(new qa3(v, 2, new z3e(c4e, 0)).f(new e5(15, singletonList)).g(new bqc(15, singletonList)).k(a4e.X).l(), ft.e, new ey1(19, this), ft.d);
                    l().c(new hi7(this.a, (Long) null, -1, (kq3) null, (dh6) null, (def) null, Long.valueOf(n3e.a), str4));
                    return;
                }
                kq3 kq3 = gi7.o;
                if (kq3 != null) {
                    el3 n = n();
                    wm3 wm3 = kq3.a;
                    if (n.g(wm3.a)) {
                        n().u(Collections.singletonList(wm3));
                    } else {
                        el3 n2 = n();
                        ol3 ol3 = ol3.b;
                        n2.getClass();
                        n2.t(Collections.singletonList(wm3), ol3);
                        w7b w7b = (w7b) n2.k.get();
                        r7b l = iz7.l(kq3.o);
                        w7b.getClass();
                        w7b.k(Collections.singletonMap(Long.valueOf(wm3.a), l));
                    }
                    l().c(new hi7(this.a, (Long) null, -1, kq3, (dh6) null, (def) null, (Long) null, str4));
                }
                dh6 dh6 = gi7.Z;
                if (dh6 != null) {
                    l().c(new hi7(this.a, (Long) null, -1, (kq3) null, dh6, (def) null, (Long) null, str4));
                    return;
                }
                return;
            default:
                pm1 pm1 = (pm1) gle;
                l().c(new b41(pm1.c, pm1.Y, this.a, pm1.o));
                return;
        }
    }

    public final void g(pke pke) {
        switch (this.o) {
            case 0:
                l().c(new oi0(this.a, pke));
                return;
            default:
                l().c(new oi0(this.a, pke));
                return;
        }
    }

    public final dle i() {
        switch (this.o) {
            case 0:
                return new fi7(this.X, this.Y);
            default:
                au auVar = new au((sla) null, 10);
                auVar.d("withJoinLink", true);
                auVar.p(ApiProtocol.PARAM_CONVERSATION_ID, this.X);
                auVar.p("type", this.Y ? "VIDEO" : "AUDIO");
                String str = this.Z;
                if (!oag.t(str)) {
                    auVar.p("sdpOffer", str);
                }
                return auVar;
        }
    }

    public ei7(long j, String str, boolean z) {
        super(j);
        this.X = str;
        this.Y = z;
        this.Z = ei7.class.getName();
    }
}
