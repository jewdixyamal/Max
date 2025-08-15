package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: x30  reason: default package */
public final class x30 implements xl7 {
    public final Object X;
    public Object Y;
    public Object Z;
    public boolean a;
    public final Object b;
    public Object c;
    public Object o;
    public Object s0;
    public Object t0;
    public Object u0;

    public x30(yad yad, rpa rpa, rpa rpa2, rpa rpa3, rpa rpa4, rpa rpa5, rpa rpa6, rpa rpa7, rpa rpa8, boolean z) {
        this.b = yad;
        this.c = rpa;
        this.o = rpa2;
        this.X = rpa3;
        this.Y = rpa4;
        this.Z = rpa5;
        this.s0 = rpa6;
        this.t0 = rpa7;
        this.u0 = rpa8;
        this.a = z;
    }

    public void a(int i, int i2) {
        wja wja = (wja) this.o;
        if (wja != null) {
            wja.m(i);
            eje i3 = wja.i();
            if (c(i3, i2)) {
                wja.b(i3, i2, wja.b.isEmpty());
            }
            h();
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [s04, java.lang.Object] */
    public s04 b(wja wja, ViewPager2 viewPager2, m56 m56, a66 a66) {
        this.o = wja;
        this.Y = m56;
        this.Z = a66;
        cx5 cx5 = new cx5(0, this);
        wja.a(cx5);
        this.c = cx5;
        bx5 bx5 = new bx5(this, wja, 0);
        bx5 bx52 = new bx5(this, wja, 1);
        ? obj = new Object();
        obj.d = wja;
        obj.e = viewPager2;
        obj.a = true;
        obj.b = false;
        obj.f = bx5;
        obj.g = bx52;
        return obj;
    }

    public boolean c(eje eje, int i) {
        View view = eje.e;
        vja vja = view instanceof vja ? (vja) view : null;
        y5a y5a = (y5a) x53.j0(i, ((iv) this.t0).f);
        if (y5a == null) {
            return false;
        }
        if (vja != null) {
            vja.setTabItem(y5a);
            return true;
        }
        wja wja = (wja) this.o;
        if (wja != null) {
            vja vja2 = new vja(wja.getContext());
            vja2.setIndicatorVisible(this.a);
            vja2.setTabItem(y5a);
            eje.e = vja2;
            gje gje = eje.g;
            if (gje != null) {
                gje.e();
            }
            eje.g.setOnLongClickListener(new z52(this, vja2, y5a, 8));
            int G = tu0.G(((float) 13) * fk4.d().getDisplayMetrics().density);
            gje gje2 = eje.g;
            gje2.setPadding(G, gje2.getPaddingTop(), G, gje2.getPaddingBottom());
            gje gje3 = eje.g;
            pla.a(gje3, new re(22, gje3, this));
            return true;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public void d(t30 t30) {
        jgc jgc;
        boolean z;
        k0f k0f;
        if (this.a && !t30.equals((t30) this.s0)) {
            this.s0 = t30;
            e84 e84 = (e84) ((q64) this.c).b;
            e84.getClass();
            Looper myLooper = Looper.myLooper();
            Looper looper = e84.i0;
            if (looper != myLooper) {
                throw new IllegalStateException(k7d.j("Current looper (", myLooper == null ? "null" : myLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
            } else if (!t30.equals(e84.x)) {
                e84.x = t30;
                qqd qqd = e84.s;
                if (qqd != null) {
                    v78 v78 = (v78) qqd.b;
                    synchronized (v78.a) {
                        jgc = v78.B0;
                    }
                    if (jgc != null) {
                        cf4 cf4 = (cf4) jgc;
                        synchronized (cf4.c) {
                            z = cf4.g.w0;
                        }
                        if (z && (k0f = cf4.a) != null) {
                            ((g85) k0f).s0.f(26);
                        }
                    }
                }
            }
        }
    }

    public void e(int i, int i2) {
        wja wja = (wja) this.o;
        if (wja != null) {
            int i3 = i2 + i;
            while (i < i3) {
                eje i4 = wja.i();
                if (c(i4, i)) {
                    wja.b(i4, i, wja.b.isEmpty());
                }
                i++;
            }
            h();
        }
    }

    public void f(AudioDeviceInfo audioDeviceInfo) {
        g40 g40 = (g40) this.t0;
        g40 g402 = null;
        if (!oaf.a(audioDeviceInfo, g40 == null ? null : g40.a)) {
            if (audioDeviceInfo != null) {
                g402 = new g40(audioDeviceInfo);
            }
            this.t0 = g402;
            d(t30.b((Context) this.b, (h30) this.u0, g402));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: y5a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: y5a} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [v5a, java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(java.util.List r24) {
        /*
            r23 = this;
            r0 = r23
            boolean r1 = r24.isEmpty()
            java.lang.Object r2 = r0.t0
            iv r2 = (defpackage.iv) r2
            r3 = 0
            if (r1 == 0) goto L_0x0011
            r2.b(r3, r3)
            return
        L_0x0011:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r24.size()
            r1.<init>(r4)
            java.util.Iterator r4 = r24.iterator()
            r6 = 0
            r8 = r6
            r7 = 1
        L_0x0021:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00ed
            java.lang.Object r9 = r4.next()
            int r10 = r8 + 1
            if (r8 < 0) goto L_0x00e8
            av5 r9 = (defpackage.av5) r9
            java.lang.Object r11 = r0.u0
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x003b
            if (r8 != 0) goto L_0x003b
            r8 = 1
            goto L_0x0041
        L_0x003b:
            java.lang.String r8 = r9.a
            boolean r8 = defpackage.tpa.f(r11, r8)
        L_0x0041:
            if (r8 == 0) goto L_0x0044
            r7 = r6
        L_0x0044:
            java.lang.String r11 = r9.a
            java.lang.Object r12 = r0.X
            qi9 r12 = (defpackage.qi9) r12
            java.lang.Object r13 = r12.f(r11)
            hy3 r15 = r9.d
            if (r13 != 0) goto L_0x0078
            y5a r13 = new y5a
            if (r8 == 0) goto L_0x0059
            r19 = 1
            goto L_0x005b
        L_0x0059:
            r19 = 2
        L_0x005b:
            v5a r14 = new v5a
            int r5 = r15.a
            r14.<init>(r5)
            java.lang.String r5 = r9.a
            r21 = 0
            java.lang.CharSequence r3 = r9.b
            r22 = 0
            r16 = r13
            r17 = r5
            r18 = r3
            r20 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r12.k(r11, r13)
        L_0x0078:
            y5a r13 = (defpackage.y5a) r13
            if (r8 == 0) goto L_0x007e
            r14 = 1
            goto L_0x007f
        L_0x007e:
            r14 = 2
        L_0x007f:
            int r3 = r13.c
            java.lang.CharSequence r5 = r9.b
            if (r3 != r14) goto L_0x00cb
            np8 r3 = r13.d
            boolean r8 = r3 instanceof defpackage.v5a
            if (r8 == 0) goto L_0x00cb
            v5a r3 = (defpackage.v5a) r3
            int r3 = r3.p
            int r8 = r15.a
            if (r3 != r8) goto L_0x00cb
            java.lang.CharSequence r3 = r13.b
            boolean r8 = defpackage.eae.h0(r3, r5)
            if (r8 != 0) goto L_0x009f
            r24 = r4
            r3 = r6
            goto L_0x00c8
        L_0x009f:
            boolean r8 = r3 instanceof android.text.Spanned
            if (r8 == 0) goto L_0x00c5
            boolean r8 = r5 instanceof android.text.Spanned
            if (r8 == 0) goto L_0x00c5
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r8 = r3.length()
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            java.lang.Object[] r3 = r3.getSpans(r6, r8, r11)
            r8 = r5
            android.text.Spanned r8 = (android.text.Spanned) r8
            r24 = r4
            int r4 = r8.length()
            java.lang.Object[] r4 = r8.getSpans(r6, r4, r11)
            boolean r3 = defpackage.ys.U(r3, r4)
            goto L_0x00c8
        L_0x00c5:
            r24 = r4
            r3 = 1
        L_0x00c8:
            if (r3 != 0) goto L_0x00da
            goto L_0x00cd
        L_0x00cb:
            r24 = r4
        L_0x00cd:
            v5a r3 = new v5a
            int r4 = r15.a
            r3.<init>(r4)
            r4 = 49
            y5a r13 = defpackage.y5a.a(r13, r5, r14, r3, r4)
        L_0x00da:
            java.lang.String r3 = r9.a
            r12.k(r3, r13)
            r1.add(r13)
            r4 = r24
            r8 = r10
            r3 = 0
            goto L_0x0021
        L_0x00e8:
            defpackage.y53.R()
            r3 = 0
            throw r3
        L_0x00ed:
            if (r7 == 0) goto L_0x0103
            java.lang.Object r4 = r1.get(r6)
            y5a r4 = (defpackage.y5a) r4
            r5 = 59
            r7 = 1
            y5a r4 = defpackage.y5a.a(r4, r3, r7, r3, r5)
            java.lang.String r3 = r4.a
            r0.u0 = r3
            r1.set(r6, r4)
        L_0x0103:
            java.lang.Object r3 = r0.o
            wja r3 = (defpackage.wja) r3
            if (r3 != 0) goto L_0x010c
            r0.s0 = r1
            return
        L_0x010c:
            r0 = 0
            r2.b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x30.g(java.util.List):void");
    }

    public void h() {
        wja wja = (wja) this.o;
        if (wja != null) {
            int tabCount = wja.getTabCount();
            iv ivVar = (iv) this.t0;
            if (!ivVar.f.isEmpty() && tabCount != 0) {
                int i = tabCount - 1;
                Iterator it = ivVar.f.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (((y5a) it.next()).c == 1) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 <= i) {
                    i = i2;
                }
                if (i >= 0 && i != wja.getSelectedTabPosition()) {
                    wja.o(wja.h(i), true);
                }
            }
        }
    }

    public void m(int i, int i2) {
        wja wja = (wja) this.o;
        if (wja != null) {
            int i3 = i2 + i;
            while (i < i3) {
                if (wja.o.getChildAt(i) != null) {
                    wja.m(i);
                }
                i++;
            }
            h();
        }
    }

    public void o(int i, int i2, Object obj) {
        wja wja = (wja) this.o;
        if (wja != null) {
            int i3 = i2 + i;
            while (i < i3) {
                eje h = wja.h(i);
                if (h != null) {
                    y5a y5a = (y5a) ((iv) this.t0).f.get(i);
                    View view = h.e;
                    vja vja = view instanceof vja ? (vja) view : null;
                    if (vja != null) {
                        vja.setTabItem(y5a);
                    }
                }
                i++;
            }
            h();
        }
    }

    public x30(ExecutorService executorService, int i) {
        boolean z = (i & 1) != 0;
        executorService = (i & 2) != 0 ? ys2.a.c().a() : executorService;
        ax7 b2 = ys2.a.b();
        this.a = z;
        this.b = b2;
        this.X = new qi9();
        this.t0 = new iv(this, new qz7((Object) executorService, 4, (Object) new y34(6)));
    }

    public x30(Context context, q64 q64, h30 h30, g40 g40) {
        Uri uri;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = q64;
        this.u0 = h30;
        this.t0 = g40;
        w30 w30 = null;
        Handler p = oaf.p((hl4) null);
        this.o = p;
        int i = oaf.a;
        this.X = i >= 23 ? new v30(this) : null;
        this.Y = i >= 21 ? new an(1, this) : null;
        t30 t30 = t30.c;
        String str = oaf.c;
        if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
            uri = Settings.Global.getUriFor("external_surround_sound_enabled");
        } else {
            uri = null;
        }
        this.Z = uri != null ? new w30(this, p, applicationContext.getContentResolver(), uri) : w30;
    }
}
