package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.a;
import java.util.Collections;
import java.util.Objects;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: jg5  reason: default package */
public final class jg5 {
    public final Context a;
    public final fke b = jke.b();
    public final FrgBase c;
    public Object d;
    public final ad e;
    public final s8g f;
    public final kk5 g;
    public long h;
    public long i;
    public String j;
    public boolean k;
    public int l;
    public boolean m;
    public iq1 n;
    public final sd7 o;
    public final au8 p;

    public jg5(ad adVar, s8g s8g, kk5 kk5, Context context, FrgBase frgBase, qy9 qy9, au8 au8) {
        this.a = context;
        this.c = frgBase;
        ((y8a) vl.b()).p().getClass();
        new sh0(848);
        this.e = adVar;
        this.f = s8g;
        this.g = kk5;
        this.p = au8;
        nc5 nc5 = new nc5(27);
        qy9.getClass();
        sd7 sd7 = new sd7(new gg5(this, 1), ft.f, ft.d);
        Objects.requireNonNull(sd7, "observer is null");
        try {
            qy9.a(new wz9(sd7, nc5, 0));
            this.o = sd7;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            c37.B(th);
            j47.Z(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final boolean a() {
        return this.d != null;
    }

    public final void b(es8 es8, l20 l20, a aVar, boolean z, boolean z2, int i2) {
        es8 es82 = es8;
        l20 l202 = l20;
        boolean z3 = z2;
        if (es82.a.y()) {
            this.j = null;
            this.k = false;
            this.m = false;
            this.l = 0;
            this.h = 0;
            if (!z3 || !s5c.P(l20) || l202.o.c()) {
                boolean e2 = l202.o.e();
                au8 au8 = this.p;
                cu8 cu8 = es82.a;
                s10 s10 = l202.j;
                String str = l202.r;
                if (!e2) {
                    d20 d20 = l202.o;
                    if (!d20.a() && !d20.b()) {
                        if (d20.c()) {
                            c(es82, l202, z3);
                            return;
                        } else if (!d20.d()) {
                            return;
                        } else {
                            if (s10.a == 0) {
                                long j2 = cu8.t0;
                                xxc xxc = mg4.o;
                                this.f.a(new k8d(j2, Collections.singletonList(Long.valueOf(cu8.b)), (da3) null, true, cu8.U0));
                                return;
                            }
                            au8.u(cu8, str, d20.b);
                            return;
                        }
                    }
                }
                this.e.f("ACTION_FILE_DOWNLOAD");
                this.k = z;
                this.j = str;
                this.m = z3;
                this.l = i2;
                if (wmd.j(this.a, wmd.s())) {
                    au8.u(cu8, str, d20.X);
                    pk c2 = ((jyc) this.b).c();
                    long j3 = s10.a;
                    long j4 = cu8.b;
                    k4a k4a = (k4a) c2;
                    this.h = ome.d(k4a.z(), new wg5(s10.c, l202.r, ((p7b) k4a.y()).a.o(), j3, j4), false, 0, 12);
                    return;
                }
                wmd.D(aVar, wmd.s(), 167);
                return;
            }
            c(es82, l202, true);
        }
    }

    public final void c(es8 es8, l20 l20, boolean z) {
        hg5 hg5 = new hg5(this, l20, z, es8);
        ig5 ig5 = new ig5(0);
        hle t = ((jyc) this.b).t();
        t.getClass();
        cqc.a(hg5, ((jle) t).a(), (f6) null, ig5, (ztc) null);
    }

    public final void d(String str, boolean z) {
        if (str != null && str.equals(this.j) && a() && ((FrgAttachVideo) this.d).o1 && this.c.g1() != null) {
            q1a g2 = iqd.g(Collections.singletonList(((FrgAttachVideo) this.d).C1));
            jyc jyc = (jyc) this.b;
            drd m2 = g2.m(((jle) jyc.t()).b());
            hle t = jyc.t();
            t.getClass();
            drd i2 = new uqd(m2.i(((jle) t).a()), new d74(this, 13, str), 0).i(((jle) jyc.t()).b());
            iq1 iq1 = new iq1(new xd5(this, str, z, 1), 2, new ig5(1));
            i2.k(iq1);
            this.n = iq1;
        }
    }

    @uae
    @SuppressLint({"CheckResult"})
    public void onEvent(l6f l6f) {
        if (l6f.c == this.i) {
            StringBuilder sb = new StringBuilder("UpdateMessageEvent: messageId = ");
            long j2 = l6f.c;
            sb.append(j2);
            hm9.m("jg5", sb.toString(), new Object[0]);
            jyc jyc = (jyc) this.b;
            tp7 m2 = jyc.m();
            m2.getClass();
            s28 s28 = new s28(new o28(tp7.b(m2, j2, false, 26), 0, new gg5(this, 3)), new nc5(28), 1);
            hle t = jyc.t();
            t.getClass();
            s28.h(((jle) t).a()).f(((jle) jyc.t()).b()).a(new g28(new gg5(this, 0), new nc5(29), ft.d));
        }
    }

    @uae
    public void onEvent(oi0 oi0) {
        int i2;
        if (this.h == oi0.a) {
            String str = oi0.b.b;
            int i3 = zqe.a;
            if ("file.not.found".equals(str)) {
                i2 = jpc.e0;
            } else {
                i2 = jpc.d0;
            }
            Context context = this.a;
            a14.N(0, context, context.getString(i2));
            if (a()) {
                ((FrgAttachVideo) this.d).getClass();
            }
        }
    }

    @uae
    public void onEvent(fn4 fn4) {
        if (fn4.X != this.i) {
            d(fn4.o, false);
        } else if (a()) {
            FrgAttachVideo frgAttachVideo = (FrgAttachVideo) this.d;
            if (!frgAttachVideo.o1) {
                tu0.A(frgAttachVideo.s1, fn4, true);
            } else if (this.i != 0) {
                jyc jyc = (jyc) this.b;
                tp7 m2 = jyc.m();
                long j2 = this.i;
                m2.getClass();
                q1a b2 = tp7.b(m2, j2, false, 26);
                hle t = jyc.t();
                t.getClass();
                new s28(new o28(b2.m(((jle) t).a()), 0, new ig5(2)), new ig5(3), 1).f(((jle) jyc.t()).b()).a(new g28(new gg5(this, 2), new ig5(4), ft.d));
                this.i = 0;
            }
        }
    }

    @uae
    public void onEvent(hn4 hn4) {
        if (hn4.o == this.i && a()) {
            FrgAttachVideo frgAttachVideo = (FrgAttachVideo) this.d;
            if (frgAttachVideo.o1) {
                this.i = 0;
                frgAttachVideo.j1();
                return;
            }
            tu0.A(frgAttachVideo.s1, hn4, true);
        }
    }
}
