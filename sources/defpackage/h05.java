package defpackage;

/* renamed from: h05  reason: default package */
public final class h05 extends rg4 {
    public final /* synthetic */ int c = 1;
    public final ww0 d;
    public final Object e;
    public final boolean f;

    public h05(fi0 fi0, do0 do0, lq8 lq8, boolean z) {
        super(fi0);
        this.d = do0;
        this.e = lq8;
        this.f = z;
    }

    public final void h(int i, Object obj) {
        o43 o;
        o43 h;
        g05 g05;
        o43 o43;
        o43 o432;
        switch (this.c) {
            case 0:
                g05 g052 = (g05) obj;
                try {
                    f46.I();
                    boolean b = fi0.b(i);
                    fi0 fi0 = this.b;
                    if (!b && g052 != null) {
                        if (!((i & 10) != 0)) {
                            g052.o0();
                            if (g052.c != ou6.c) {
                                o = o43.o(g052.a);
                                if (o != null) {
                                    h = this.f ? ((lq8) this.e).h(this.d, o) : null;
                                    o43.S(o);
                                    if (h != null) {
                                        g05 = new g05(h);
                                        g05.g(g052);
                                        o43.S(h);
                                        fi0.i(1.0f);
                                        fi0.g(i, g05);
                                        g05.d(g05);
                                        f46.I();
                                        return;
                                    }
                                }
                                fi0.g(i, g052);
                                f46.I();
                                return;
                            }
                        }
                    }
                    fi0.g(i, g052);
                    f46.I();
                    return;
                } catch (Throwable th) {
                    f46.I();
                    throw th;
                }
            case 1:
                o43 o433 = (o43) obj;
                o43 o434 = null;
                fi0 fi02 = this.b;
                if (o433 == null) {
                    if (fi0.a(i)) {
                        fi02.g(i, o434);
                        return;
                    }
                    return;
                } else if (!fi0.b(i)) {
                    if (this.f) {
                        o434 = ((lq8) this.e).h(this.d, o433);
                    }
                    try {
                        fi02.i(1.0f);
                        if (o434 != null) {
                            o433 = o434;
                        }
                        fi02.g(i, o433);
                        return;
                    } finally {
                        o43.S(o434);
                    }
                } else {
                    return;
                }
            default:
                o43 o435 = (o43) obj;
                try {
                    if (f46.W()) {
                        f46.e("BitmapMemoryCacheProducer#onNewResultImpl");
                    }
                    boolean a = fi0.a(i);
                    o43 = null;
                    fi0 fi03 = this.b;
                    if (o435 == null) {
                        if (a) {
                            fi03.g(i, (Object) null);
                        }
                        if (!f46.W()) {
                            return;
                        }
                    } else if (((l43) o435.e0()).isStateful() || fi0.l(i, 8)) {
                        fi03.g(i, o435);
                        if (!f46.W()) {
                            return;
                        }
                    } else {
                        ww0 ww0 = this.d;
                        fo0 fo0 = (fo0) this.e;
                        if (!a) {
                            o432 = fo0.b.get(ww0);
                            if (o432 != null) {
                                pqb qualityInfo = ((l43) o435.e0()).getQualityInfo();
                                pqb qualityInfo2 = ((l43) o432.e0()).getQualityInfo();
                                if (((hx6) qualityInfo2).c || ((hx6) qualityInfo2).a >= ((hx6) qualityInfo).a) {
                                    fi03.g(i, o432);
                                    o43.S(o432);
                                    if (!f46.W()) {
                                        return;
                                    }
                                } else {
                                    o43.S(o432);
                                }
                            }
                        }
                        if (this.f) {
                            o43 = fo0.b.h(ww0, o435);
                        }
                        if (a) {
                            fi03.i(1.0f);
                        }
                        if (o43 != null) {
                            o435 = o43;
                        }
                        fi03.g(i, o435);
                        o43.S(o43);
                        if (!f46.W()) {
                            return;
                        }
                    }
                    f46.A();
                    return;
                } catch (Throwable th2) {
                    if (f46.W()) {
                        f46.A();
                    }
                    throw th2;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h05(fo0 fo0, fi0 fi0, do0 do0, boolean z) {
        super(fi0);
        this.e = fo0;
        this.d = do0;
        this.f = z;
    }

    public h05(fi0 fi0, lq8 lq8, tpd tpd, boolean z) {
        super(fi0);
        this.e = lq8;
        this.d = tpd;
        this.f = z;
    }
}
