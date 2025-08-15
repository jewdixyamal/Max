package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: ld2  reason: default package */
public final class ld2 implements lr2, d4f {
    public final Context a;
    public final k56 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final khe i = new khe(new ed2(this, 3));
    public final khe j = new khe(new ed2(this, 5));
    public final khe k = new khe(new ed2(this, 6));
    public final khe l = new khe(new ed2(this, 7));
    public final khe m = new khe(new ed2(this, 8));
    public final khe n = new khe(new ed2(this, 9));
    public final khe o = new khe(new ed2(this, 10));
    public final khe p = new khe(new ed2(this, 0));
    public final khe q = new khe(new ed2(this, 1));
    public final khe r = new khe(new ed2(this, 2));
    public final khe s = new khe(new ed2(this, 4));
    public final id2 t = new id2(this);
    public final String u = ld2.class.getName();
    public final kd2 v;

    public ld2(Context context, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, kke kke, je7 je76, ot2 ot2) {
        this.a = context;
        this.b = ot2;
        this.c = je72;
        this.d = je7;
        this.e = je74;
        this.f = je73;
        this.g = je75;
        this.h = je76;
        this.v = new kd2(je72, je7, this);
        context.registerComponentCallbacks(new fd2(0, (Object) this));
        od2.L(new zn5((w7c) qp4.u0.b(context).t0, new jd2(this, (Continuation) null), 5), j1e.a(((w9a) kke).a()));
    }

    public final boolean a(int i2, e52 e52, es8 es8, SpannableStringBuilder spannableStringBuilder, boolean z) {
        if (i2 != 1 && !z && !es8.a.x()) {
            pq9 pq9 = qp4.u0;
            Context context = this.a;
            uj3 uj3 = es8.b;
            if (uj3 == null || uj3.n() != ((Number) this.b.invoke()).longValue()) {
                if (e52.J()) {
                    g5a g5a = new g5a(context, j5a.a);
                    g5a.b(oag.a(uj3.m(), Long.valueOf(uj3.n())), uj3.p(kk0.a));
                    tpa.d(spannableStringBuilder, 8203, new yl5((Drawable) g5a, (sl5) null, 6));
                    spannableStringBuilder.append(8288);
                    tpa.d(spannableStringBuilder, 8203, new bvd(tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density)));
                    spannableStringBuilder.append(8288);
                    tpa.e(spannableStringBuilder, String.valueOf(uj3.d()), new mse(pq9.b(context).i(), new we1(11)));
                    spannableStringBuilder.append(8288);
                    if (uj3.u()) {
                        spannableStringBuilder.append(" ");
                        spannableStringBuilder.setSpan(new fcf(context, 1, true, new we1(12)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append(8288);
                    }
                    tpa.e(spannableStringBuilder, ":", new mse(pq9.b(context).i(), new we1(13)));
                    spannableStringBuilder.append(8288);
                    tpa.d(spannableStringBuilder, 8203, new bvd(tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density)));
                    return true;
                }
            } else if (e52.J()) {
                tpa.e(spannableStringBuilder, au1.g(context.getString(dpc.E), ":"), new mse(pq9.b(context).i(), new we1(15)));
                spannableStringBuilder.append(8288);
                tpa.d(spannableStringBuilder, 8203, new bvd(tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density)));
                spannableStringBuilder.append(8288);
                return true;
            }
        }
        return false;
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, es8 es8, boolean z) {
        List list;
        Drawable drawable;
        l10 d2;
        l10 d3;
        Object obj;
        cu8 cu8 = es8.a;
        c6d c6d = vz4.a;
        if (cu8 == null) {
            hm9.p(this.u, "Empty MessageDb while process message", (Throwable) null);
        } else if (cu8.p()) {
            c6d = ys.Q(new Drawable[]{(Drawable) this.i.getValue()});
        } else if (cu8.w()) {
            c6d = ys.Q(new Drawable[]{(Drawable) this.j.getValue()});
        } else if (cu8.y()) {
            ph5 ph5 = new ph5(this.a);
            String F = s5c.F(cu8.g());
            Iterator it = sf5.c.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    obj = null;
                    break;
                }
                obj = u1Var.next();
                if (eae.k0(((sf5) obj).name(), F, true)) {
                    break;
                }
            }
            uf5 uf5 = (sf5) obj;
            if (uf5 == null) {
                tf5 tf5 = tf5.c;
                uf5 = ema.w(F);
            }
            ph5.a(uf5);
            c6d = ys.Q(new ph5[]{ph5});
        } else if (cu8.u()) {
            c6d = ys.Q(new Drawable[]{(Drawable) this.l.getValue()});
        } else if (cu8.z()) {
            c6d = ys.Q(new Drawable[]{(Drawable) this.m.getValue()});
        } else if (cu8.v()) {
            l10 d4 = cu8.d();
            if (d4 == null || !d4.d() || (d3 = cu8.d()) == null || !d3.b()) {
                l10 d5 = cu8.d();
                if (d5 == null || !d5.d()) {
                    l10 d6 = cu8.d();
                    if (d6 == null || d6.d() || (d2 = cu8.d()) == null || !d2.b()) {
                        l10 d7 = cu8.d();
                        khe khe = this.n;
                        drawable = (d7 == null || d7.d()) ? (Drawable) khe.getValue() : (Drawable) khe.getValue();
                    } else {
                        drawable = (Drawable) this.p.getValue();
                    }
                } else {
                    drawable = (Drawable) this.o.getValue();
                }
            } else {
                drawable = (Drawable) this.q.getValue();
            }
            c6d = ys.Q(new Drawable[]{drawable});
        } else {
            k8g k8g = cu8.z0;
            c6d g0 = (k8g == null || (list = (List) k8g.a) == null) ? null : l6d.g0(l6d.e0(new at(2, list), new ga(this, 2, es8)), 3);
            if (g0 != null) {
                c6d = g0;
            }
        }
        List i0 = l6d.i0(c6d);
        if (!(!i0.isEmpty())) {
            i0 = null;
        }
        if (i0 != null) {
            if (!z) {
                tpa.d(spannableStringBuilder, 8203, new bvd(tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density)));
                spannableStringBuilder.append(8288);
            }
            int i2 = 0;
            for (Object next : i0) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    tpa.d(spannableStringBuilder, 8203, new yl5((Drawable) next, sl5.a, 4));
                    spannableStringBuilder.append(8288);
                    if (i2 < i0.size() - 1) {
                        tpa.d(spannableStringBuilder, 8203, new bvd(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density)));
                        spannableStringBuilder.append(8288);
                    }
                    i2 = i3;
                } else {
                    y53.R();
                    throw null;
                }
            }
            tpa.d(spannableStringBuilder, 8203, new bvd(tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density)));
            spannableStringBuilder.append(8288);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v29, types: [gvd, android.text.SpannableString] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r17, defpackage.e52 r18, defpackage.es8 r19, android.text.SpannableStringBuilder r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 1
            cu8 r7 = r3.a
            r6 = 0
            if (r7 != 0) goto L_0x0019
            java.lang.String r0 = r0.u
            java.lang.String r1 = "Empty MessageDb while process message"
            defpackage.hm9.p(r0, r1, r6)
            goto L_0x0260
        L_0x0019:
            boolean r8 = r7.D()
            if (r8 == 0) goto L_0x0051
            je7 r1 = r0.e
            java.lang.Object r1 = r1.getValue()
            r5 = r1
            are r5 = (defpackage.are) r5
            je7 r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            r7 = r1
            ida r7 = (defpackage.ida) r7
            cu8 r8 = r3.a
            k56 r1 = r0.b
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            long r13 = r1.longValue()
            android.content.Context r6 = r0.a
            r10 = 1
            r15 = 0
            r9 = 0
            r11 = 1
            r12 = 0
            java.lang.String r0 = r5.f(r6, r7, r8, r9, r10, r11, r12, r13, r15)
            if (r0 == 0) goto L_0x0260
            r4.append(r0)
            goto L_0x0260
        L_0x0051:
            boolean r8 = r7.w()
            r9 = 0
            if (r8 == 0) goto L_0x006f
            android.content.Context r1 = r0.a
            n10 r2 = r7.e()
            je7 r0 = r0.g
            java.lang.Object r0 = r0.getValue()
            ak3 r0 = (defpackage.ak3) r0
            java.lang.String r0 = defpackage.are.j(r1, r2, r0, r9, r9)
            r4.append(r0)
            goto L_0x0260
        L_0x006f:
            boolean r8 = r7.C()
            if (r8 == 0) goto L_0x00cb
            u6b r0 = r3.X
            r0.f = r2
            ida r1 = r0.a
            int r3 = r1.f()
            int r1 = r1.e()
            r0.i(r2, r3, r1)
            java.lang.CharSequence r0 = r0.g
            if (r0 == 0) goto L_0x00c4
            int r1 = defpackage.gvd.a
            gvd r0 = defpackage.crd.l(r0, r5)
            int r1 = r0.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            java.lang.Object[] r1 = r0.getSpans(r9, r1, r2)     // Catch:{ all -> 0x009b }
            goto L_0x009c
        L_0x009b:
            r1 = r6
        L_0x009c:
            android.text.style.ClickableSpan[] r1 = (android.text.style.ClickableSpan[]) r1
            if (r1 == 0) goto L_0x00ab
            int r2 = r1.length
            r3 = r9
        L_0x00a2:
            if (r3 >= r2) goto L_0x00ab
            r7 = r1[r3]
            r0.removeSpan(r7)
            int r3 = r3 + r5
            goto L_0x00a2
        L_0x00ab:
            int r1 = r0.length()
            java.lang.Class<android.text.style.URLSpan> r2 = android.text.style.URLSpan.class
            java.lang.Object[] r6 = r0.getSpans(r9, r1, r2)     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            android.text.style.URLSpan[] r6 = (android.text.style.URLSpan[]) r6
            if (r6 == 0) goto L_0x00c3
            int r1 = r6.length
        L_0x00ba:
            if (r9 >= r1) goto L_0x00c3
            r2 = r6[r9]
            r0.removeSpan(r2)
            int r9 = r9 + r5
            goto L_0x00ba
        L_0x00c3:
            r6 = r0
        L_0x00c4:
            if (r6 == 0) goto L_0x0260
            r4.append(r6)
            goto L_0x0260
        L_0x00cb:
            boolean r8 = r7.x()
            if (r8 == 0) goto L_0x0120
            q10 r8 = r7.f()
            if (r8 == 0) goto L_0x00da
            p10 r8 = r8.a
            goto L_0x00db
        L_0x00da:
            r8 = r6
        L_0x00db:
            p10 r10 = defpackage.p10.u0
            if (r8 != r10) goto L_0x0120
            if (r21 != 0) goto L_0x0105
            bvd r1 = new bvd
            r6 = 6
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = defpackage.tu0.G(r6)
            r1.<init>(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r6 = 8203(0x200b, float:1.1495E-41)
            defpackage.tpa.d(r4, r6, r1)
            r1 = 8288(0x2060, float:1.1614E-41)
            r4.append(r1)
        L_0x0105:
            android.content.Context r1 = r0.a
            int r6 = defpackage.yoc.t0
            java.lang.String r1 = r1.getString(r6)
            r4.append(r1)
            java.lang.String r1 = ": "
            r4.append(r1)
            es8 r1 = r3.o
            android.text.SpannableString r0 = r0.e(r2, r1, r5, false)
            r4.append(r0)
            goto L_0x0260
        L_0x0120:
            boolean r8 = r7.F()
            if (r8 == 0) goto L_0x01c1
            boolean r0 = r7.F()
            if (r0 == 0) goto L_0x0137
            g20 r0 = defpackage.g20.y0
            k8g r1 = r7.z0
            l20 r0 = r1.k(r0)
            j5g r0 = r0.n
            goto L_0x0138
        L_0x0137:
            r0 = r6
        L_0x0138:
            if (r0 == 0) goto L_0x0175
            java.util.List r1 = r0.a
            java.util.Iterator r1 = r1.iterator()
        L_0x0140:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0166
            java.lang.Object r2 = r1.next()
            r3 = r2
            f5g r3 = (defpackage.f5g) r3
            boolean r7 = r3.c()
            if (r7 != 0) goto L_0x0167
            e5g r7 = defpackage.e5g.o
            e5g r8 = r3.a
            if (r8 != r7) goto L_0x0140
            d5g r3 = r3.b
            if (r3 == 0) goto L_0x0140
            java.lang.String r3 = r3.a
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0140
            goto L_0x0167
        L_0x0166:
            r2 = r6
        L_0x0167:
            f5g r2 = (defpackage.f5g) r2
            if (r2 == 0) goto L_0x0170
            d5g r1 = r2.b
            if (r1 == 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            d5g r1 = defpackage.d5g.c
        L_0x0172:
            java.lang.String r1 = r1.a
            goto L_0x0176
        L_0x0175:
            r1 = r6
        L_0x0176:
            if (r0 == 0) goto L_0x01a7
            java.util.List r0 = r0.a
            java.util.Iterator r0 = r0.iterator()
        L_0x017e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x019e
            java.lang.Object r2 = r0.next()
            r3 = r2
            f5g r3 = (defpackage.f5g) r3
            e5g r7 = defpackage.e5g.X
            e5g r8 = r3.a
            if (r8 != r7) goto L_0x017e
            d5g r3 = r3.b
            if (r3 == 0) goto L_0x017e
            java.lang.String r3 = r3.a
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x017e
            goto L_0x019f
        L_0x019e:
            r2 = r6
        L_0x019f:
            f5g r2 = (defpackage.f5g) r2
            if (r2 == 0) goto L_0x01a7
            java.lang.String r6 = r2.a()
        L_0x01a7:
            r4.append(r1)
            if (r6 == 0) goto L_0x01b2
            int r0 = r6.length()
            if (r0 != 0) goto L_0x01b3
        L_0x01b2:
            r9 = r5
        L_0x01b3:
            r0 = r9 ^ 1
            if (r0 == 0) goto L_0x0260
            java.lang.String r0 = ". "
            r4.append(r0)
            r4.append(r6)
            goto L_0x0260
        L_0x01c1:
            boolean r8 = r7.v()
            if (r8 == 0) goto L_0x01e0
            android.content.Context r6 = r0.a
            k56 r0 = r0.b
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r10 = r0.longValue()
            r8 = 0
            r9 = 1
            java.lang.String r0 = defpackage.are.h(r6, r7, r8, r9, r10)
            r4.append(r0)
            goto L_0x0260
        L_0x01e0:
            boolean r7 = r7.p()
            if (r7 == 0) goto L_0x0203
            es8 r7 = r19.a()
            if (r7 == 0) goto L_0x0203
            es8 r3 = r19.a()
        L_0x01f0:
            es8 r6 = r3.a()
            if (r6 == 0) goto L_0x01fb
            es8 r3 = r3.a()
            goto L_0x01f0
        L_0x01fb:
            android.text.SpannableString r0 = r0.e(r2, r3, r1, r5)
            r4.append(r0)
            goto L_0x0260
        L_0x0203:
            r0 = 2
            if (r1 != r0) goto L_0x021f
            r18.j0()
            java.lang.CharSequence r0 = r2.v0
            if (r0 == 0) goto L_0x0213
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0214
        L_0x0213:
            r9 = r5
        L_0x0214:
            r1 = r9 ^ 1
            if (r1 == 0) goto L_0x0219
            r6 = r0
        L_0x0219:
            if (r6 == 0) goto L_0x0260
            r4.append(r6)
            goto L_0x0260
        L_0x021f:
            if (r1 != r5) goto L_0x0260
            kqe r0 = defpackage.i4f.m
            du4 r1 = defpackage.du4.b
            long r0 = r0.g(r1)
            float r0 = defpackage.ck4.e(r0)
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = (int) r0
            u6b r1 = r3.X
            r1.f = r2
            boolean r3 = r1.q
            if (r3 != 0) goto L_0x0259
            cu8 r3 = r1.d
            java.lang.String r2 = r1.a(r2, r3)
            ida r6 = r1.a
            tx4 r7 = r6.j
            java.lang.CharSequence r2 = r7.b(r0, r2)
            java.util.List r3 = r3.R0
            java.lang.CharSequence r0 = r6.j(r2, r3, r0)
            r1.j = r0
            r1.q = r5
        L_0x0259:
            java.lang.CharSequence r0 = r1.j
            if (r0 == 0) goto L_0x0260
            r4.append(r0)
        L_0x0260:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld2.c(int, e52, es8, android.text.SpannableStringBuilder, boolean):void");
    }

    public final CharSequence d(e52 e52) {
        Object c2 = this.t.c(new gd2(e52));
        CharSequence charSequence = (CharSequence) c2;
        if (charSequence == null || w9e.C0(charSequence)) {
            c2 = null;
        }
        CharSequence charSequence2 = (CharSequence) c2;
        if (charSequence2 != null) {
            return charSequence2;
        }
        return e52.b.f(((Number) this.b.invoke()).longValue()) ? this.a.getString(dpc.o) : charSequence2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061 A[LOOP:0: B:17:0x005f->B:18:0x0061, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableString e(defpackage.e52 r9, defpackage.es8 r10, int r11, boolean r12) {
        /*
            r8 = this;
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r7 = 0
            r0 = r8
            r1 = r11
            r2 = r9
            r3 = r10
            r4 = r6
            r5 = r12
            boolean r12 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x001b }
            if (r12 != 0) goto L_0x001d
            int r12 = r6.length()     // Catch:{ all -> 0x001b }
            if (r12 != 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            r5 = r7
            goto L_0x001f
        L_0x001b:
            r9 = move-exception
            goto L_0x002d
        L_0x001d:
            r12 = 1
            r5 = r12
        L_0x001f:
            r8.b(r6, r10, r5)     // Catch:{ all -> 0x001b }
            r0 = r8
            r1 = r11
            r2 = r9
            r3 = r10
            r4 = r6
            r0.c(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x001b }
            e5f r9 = defpackage.e5f.a     // Catch:{ all -> 0x001b }
            goto L_0x0033
        L_0x002d:
            njc r10 = new njc
            r10.<init>(r9)
            r9 = r10
        L_0x0033:
            java.lang.Throwable r9 = defpackage.pjc.a(r9)
            if (r9 == 0) goto L_0x0052
            java.lang.String r10 = r8.u
            java.lang.String r11 = "FAILURE process last message for chatRow"
            defpackage.hm9.p(r10, r11, r9)
            je7 r8 = r8.h
            java.lang.Object r8 = r8.getValue()
            ty3 r8 = (defpackage.ty3) r8
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r11, r9)
            java.lang.String r9 = "ONEME-16071"
            r8.a(r9, r10)
        L_0x0052:
            android.text.SpannableString r8 = new android.text.SpannableString
            int r9 = r6.length()
            java.lang.Class<yz7> r10 = defpackage.yz7.class
            java.lang.Object[] r9 = r6.getSpans(r7, r9, r10)
            int r10 = r9.length
        L_0x005f:
            if (r7 >= r10) goto L_0x006b
            r11 = r9[r7]
            yz7 r11 = (defpackage.yz7) r11
            r6.removeSpan(r11)
            int r7 = r7 + 1
            goto L_0x005f
        L_0x006b:
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld2.e(e52, es8, int, boolean):android.text.SpannableString");
    }

    public final CharSequence g(long j2) {
        fi9 fi9;
        Map a2 = ((mz6) this.c.getValue()).a(j2);
        if (a2 == null) {
            return null;
        }
        if (a2.isEmpty()) {
            fi9 = rv7.a;
        } else {
            fi9 fi92 = new fi9(a2.size());
            for (Map.Entry entry : a2.entrySet()) {
                fi92.f(((Number) entry.getKey()).longValue(), entry.getValue());
            }
            fi9 = fi92;
        }
        if (fi9 == null) {
            return null;
        }
        return (CharSequence) this.v.c(new hd2(j2, fi9));
    }
}
