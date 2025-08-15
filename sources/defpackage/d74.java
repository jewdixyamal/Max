package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.login.inputphone.InputPhoneScreen;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: d74  reason: default package */
public final /* synthetic */ class d74 implements km7, ra5, grd, ree, ue4, ve4, b66, l3a, jm7, qj3, d7b, kea, y2a, ve7, cc3, u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d74(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public x6g P(View view, x6g x6g) {
        return (x6g) ((c66) this.b).invoke(view, x6g, (Rect) this.c);
    }

    public la5[] a() {
        oc4 oc4 = (oc4) this.b;
        mbe mbe = oc4.c;
        qy5 qy5 = (qy5) this.c;
        return new la5[]{mbe.a(qy5) ? new gbe(oc4.c.e(qy5), qy5) : new mc4(qy5)};
    }

    public void accept(Object obj) {
        Object obj2 = this.c;
        int i = 0;
        Object obj3 = this.b;
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                FrgAttachView frgAttachView = (FrgAttachView) obj3;
                frgAttachView.C1 = (es8) obj;
                while (true) {
                    if (i < frgAttachView.C1.a.z0.i()) {
                        l20 h = frgAttachView.C1.a.z0.h(i);
                        if (h.r.equals(frgAttachView.D1.r)) {
                            frgAttachView.D1 = h;
                        } else {
                            if (h.g()) {
                                c20 c20 = h.g;
                                if (c20.g.r.equals(frgAttachView.D1.r)) {
                                    frgAttachView.D1 = c20.g;
                                }
                            }
                            i++;
                        }
                    }
                }
                if (frgAttachView.r1() != null) {
                    ((ActAttachesView) frgAttachView.r1()).n0(frgAttachView.C1);
                }
                ((f6) obj2).run();
                return;
            default:
                dq7 dq7 = (dq7) obj3;
                dq7.getClass();
                if (((Boolean) obj).booleanValue()) {
                    dq7.d(0, (String) obj2);
                    return;
                }
                p4d p4d = dq7.b;
                up7 up7 = dq7.X;
                awa e = p4d.e(up7);
                Uri uri = e != null ? e.X : null;
                qq7 qq7 = dq7.a;
                qq7.N(up7, (Uri) null, 0, uri);
                hm9.k("dq7", "requestThumbnail " + up7);
                long j = up7.b;
                if (j == j) {
                    Uri N = j47.N(up7.c);
                    if (N == null) {
                        qq7.N(up7, (Uri) null, 0, (Uri) null);
                        return;
                    } else {
                        dq7.d(0, N.toString());
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    /* renamed from: apply  reason: collision with other method in class */
    public boolean m3apply(Object obj) {
        ((iu6) this.b).getClass();
        String c2 = ((ww0) obj).c();
        int i = 0;
        while (true) {
            List list = (List) this.c;
            if (i >= list.size()) {
                return true;
            }
            if (!TextUtils.isEmpty(c2) && c2.startsWith((String) list.get(i))) {
                return false;
            }
            i++;
        }
    }

    public void c(qr6 qr6, int i) {
        switch (this.a) {
            case 23:
                w98 w98 = (w98) this.b;
                w98.getClass();
                qr6.u0(w98.c, i, ((gd8) this.c).c());
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                qr6.i0(((w98) this.b).c, i, (Surface) this.c);
                return;
            case 25:
                qr6.B(((w98) this.b).c, i, ((j0f) this.c).c());
                return;
            case 26:
                w98 w982 = (w98) this.b;
                w982.getClass();
                qr6.d0(w982.c, i, ((tb8) this.c).d(true));
                return;
            case 27:
                w98 w983 = (w98) this.b;
                w983.getClass();
                c3b c3b = (c3b) this.c;
                c3b.getClass();
                Bundle bundle = new Bundle();
                bundle.putFloat(c3b.e, c3b.a);
                bundle.putFloat(c3b.f, c3b.b);
                qr6.o0(w983.c, i, bundle);
                return;
            default:
                w98 w984 = (w98) this.b;
                w984.getClass();
                ww6 i2 = zw6.i();
                int i3 = 0;
                while (true) {
                    List list = (List) this.c;
                    if (i3 < list.size()) {
                        i2.a(((tb8) list.get(i3)).d(true));
                        i3++;
                    } else {
                        qr6.Q(w984.c, i, new pu0(i2.j()));
                        return;
                    }
                }
        }
    }

    public String e(String str, String str2) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 16:
                bc7[] bc7Arr = InputPhoneScreen.E0;
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) obj2;
                return kp.j((zua) inputPhoneScreen.y0.getValue(), ((lea) obj).getCode(), str2, str, ((my3) inputPhoneScreen.q0().x0.a.getValue()).b);
            default:
                bc7[] bc7Arr2 = InviteByPhoneScreen.B0;
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) obj2;
                return kp.j((zua) inviteByPhoneScreen.x0.getValue(), ((lea) obj).getCode(), str2, str, ((my3) inviteByPhoneScreen.p0().y0.a.getValue()).b);
        }
    }

    public Object f(bg4 bg4) {
        return new va0((String) this.b, ((ig5) this.c).i((Context) bg4.a(Context.class)));
    }

    public void g(cc0 cc0) {
        ce4 ce4 = (ce4) this.b;
        ce4.getClass();
        l76 l76 = l76.b;
        if (((see) this.c).c.a() && cc0.d) {
            l76 = l76.c;
        }
        zm4 zm4 = ce4.a;
        o76.d((AtomicBoolean) zm4.c, true);
        o76.c((Thread) zm4.e);
        if (((l76) zm4.n) != l76) {
            zm4.n = l76;
            zm4.v(zm4.b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ffc i(int r17, defpackage.qze r18, int[] r19) {
        /*
            r16 = this;
            r0 = r16
            r8 = r18
            int r1 = r0.a
            switch(r1) {
                case 6: goto L_0x0035;
                default: goto L_0x0009;
            }
        L_0x0009:
            ww6 r9 = defpackage.zw6.i()
            r1 = 0
            r10 = r1
        L_0x000f:
            int r1 = r8.a
            if (r10 >= r1) goto L_0x0030
            se4 r11 = new se4
            r6 = r19[r10]
            java.lang.Object r1 = r0.b
            r5 = r1
            ne4 r5 = (defpackage.ne4) r5
            java.lang.Object r1 = r0.c
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r1 = r11
            r2 = r17
            r3 = r18
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.a(r11)
            int r10 = r10 + 1
            goto L_0x000f
        L_0x0030:
            ffc r0 = r9.j()
            return r0
        L_0x0035:
            java.lang.Object r1 = r0.c
            int[] r1 = (int[]) r1
            r9 = r1[r17]
            java.lang.Object r0 = r0.b
            r10 = r0
            ne4 r10 = (defpackage.ne4) r10
            int r0 = r10.t0
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            if (r0 == r12) goto L_0x00ac
            int r1 = r10.u0
            if (r1 != r12) goto L_0x004e
            goto L_0x00ac
        L_0x004e:
            r3 = r12
            r2 = r13
        L_0x0050:
            int r4 = r8.a
            if (r2 >= r4) goto L_0x00aa
            oy5[] r4 = r8.c
            r4 = r4[r2]
            int r5 = r4.B0
            if (r5 <= 0) goto L_0x00a7
            int r6 = r4.C0
            if (r6 <= 0) goto L_0x00a7
            boolean r7 = r10.v0
            if (r7 == 0) goto L_0x0073
            if (r5 <= r6) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = r13
        L_0x0069:
            if (r0 <= r1) goto L_0x006d
            r14 = 1
            goto L_0x006e
        L_0x006d:
            r14 = r13
        L_0x006e:
            if (r7 == r14) goto L_0x0073
            r7 = r0
            r14 = r1
            goto L_0x0075
        L_0x0073:
            r14 = r0
            r7 = r1
        L_0x0075:
            int r15 = r5 * r7
            int r11 = r6 * r14
            if (r15 < r11) goto L_0x0085
            android.graphics.Point r7 = new android.graphics.Point
            int r5 = defpackage.maf.g(r11, r5)
            r7.<init>(r14, r5)
            goto L_0x008f
        L_0x0085:
            android.graphics.Point r5 = new android.graphics.Point
            int r11 = defpackage.maf.g(r15, r6)
            r5.<init>(r11, r7)
            r7 = r5
        L_0x008f:
            int r4 = r4.B0
            int r5 = r4 * r6
            int r11 = r7.x
            float r11 = (float) r11
            r14 = 1065017672(0x3f7ae148, float:0.98)
            float r11 = r11 * r14
            int r11 = (int) r11
            if (r4 < r11) goto L_0x00a7
            int r4 = r7.y
            float r4 = (float) r4
            float r4 = r4 * r14
            int r4 = (int) r4
            if (r6 < r4) goto L_0x00a7
            if (r5 >= r3) goto L_0x00a7
            r3 = r5
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x00aa:
            r11 = r3
            goto L_0x00ad
        L_0x00ac:
            r11 = r12
        L_0x00ad:
            ww6 r14 = defpackage.zw6.i()
            r15 = r13
        L_0x00b2:
            int r0 = r8.a
            if (r15 >= r0) goto L_0x00e2
            oy5[] r0 = r8.c
            r0 = r0[r15]
            int r0 = r0.b()
            if (r11 == r12) goto L_0x00c8
            r1 = -1
            if (r0 == r1) goto L_0x00c6
            if (r0 > r11) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r7 = r13
            goto L_0x00c9
        L_0x00c8:
            r7 = 1
        L_0x00c9:
            ze4 r6 = new ze4
            r5 = r19[r15]
            r0 = r6
            r1 = r17
            r2 = r18
            r3 = r15
            r4 = r10
            r12 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.a(r12)
            int r15 = r15 + 1
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b2
        L_0x00e2:
            ffc r0 = r14.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d74.i(int, qze, int[]):ffc");
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((gd) obj).M((fd) this.b, (h30) this.c);
                return;
            case 1:
                jlf jlf = (jlf) this.c;
                ((gd) obj).T((fd) this.b, jlf);
                int i = jlf.a;
                return;
            case 2:
                ((gd) obj).B0((fd) this.b, (Exception) this.c);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((m3b) obj).G(((z2b) this.b).h, (b0f) this.c);
                return;
            default:
                ((n3b) obj).G(((Integer) this.c).intValue(), (tb8) this.b);
                return;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|(2:30|31)|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00df */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(defpackage.nqd r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.c
            java.lang.Object r1 = r10.b
            int r10 = r10.a
            switch(r10) {
                case 4: goto L_0x009f;
                default: goto L_0x0009;
            }
        L_0x0009:
            vy7 r1 = (defpackage.vy7) r1
            r1.getClass()
            defpackage.vy7.a()
            xke r10 = r1.f
            r10.getClass()
            int r2 = defpackage.gpc.E
            pq9 r3 = defpackage.qp4.u0
            android.content.Context r10 = r10.a
            bs6 r4 = defpackage.k7d.h(r3, r10)
            android.content.Context r0 = (android.content.Context) r0
            int r4 = r4.k
            android.graphics.Bitmap r2 = defpackage.j47.o0(r2, r4, r0)
            int r4 = r2.getWidth()
            double r4 = (double) r4
            r6 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r4 = r4 * r6
            int r4 = (int) r4
            int r5 = r2.getHeight()
            double r8 = (double) r5
            double r8 = r8 * r6
            int r5 = (int) r8
            android.graphics.Bitmap r4 = defpackage.j47.j0(r4, r5, r2)
            java.util.concurrent.ConcurrentHashMap r5 = r1.e
            uy7 r8 = defpackage.uy7.a
            qx7 r9 = r1.g
            r9.getClass()
            sn0 r9 = defpackage.qx7.i(r2)
            r5.put(r8, r9)
            boolean r1 = r1.h
            if (r1 == 0) goto L_0x0053
            r2.recycle()
        L_0x0053:
            uy7 r2 = defpackage.uy7.b
            sn0 r8 = defpackage.qx7.i(r4)
            r5.put(r2, r8)
            if (r1 == 0) goto L_0x0061
            r4.recycle()
        L_0x0061:
            int r2 = defpackage.gpc.F
            bs6 r10 = defpackage.k7d.h(r3, r10)
            int r10 = r10.k
            android.graphics.Bitmap r10 = defpackage.j47.o0(r2, r10, r0)
            int r0 = r10.getWidth()
            double r2 = (double) r0
            double r2 = r2 * r6
            int r0 = (int) r2
            int r2 = r10.getHeight()
            double r2 = (double) r2
            double r2 = r2 * r6
            int r2 = (int) r2
            android.graphics.Bitmap r0 = defpackage.j47.j0(r0, r2, r10)
            uy7 r2 = defpackage.uy7.c
            sn0 r3 = defpackage.qx7.i(r10)
            r5.put(r2, r3)
            if (r1 == 0) goto L_0x008d
            r10.recycle()
        L_0x008d:
            uy7 r10 = defpackage.uy7.o
            sn0 r2 = defpackage.qx7.i(r0)
            r5.put(r10, r2)
            if (r1 == 0) goto L_0x009b
            r0.recycle()
        L_0x009b:
            r11.a(r5)
            return
        L_0x009f:
            java.lang.String r10 = "bd4"
            mpb r0 = (defpackage.mpb) r0
            bd4 r1 = (defpackage.bd4) r1
            r1.getClass()
            boolean r1 = r11.h()     // Catch:{ Exception -> 0x00c6 }
            if (r1 != 0) goto L_0x00e9
            eh3 r1 = r0.f     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00c6 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r2 = "start connect to host: %s"
            defpackage.hm9.m(r10, r2, r1)     // Catch:{ Exception -> 0x00c6 }
            r0.e = r11     // Catch:{ Exception -> 0x00c8 }
            r0.connect()     // Catch:{ Exception -> 0x00c8 }
            r11.a(r0)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00e9
        L_0x00c6:
            r10 = move-exception
            goto L_0x00e0
        L_0x00c8:
            r1 = move-exception
            eh3 r2 = r0.f     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00c6 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r3 = "close socket for host: %s"
            defpackage.hm9.m(r10, r3, r2)     // Catch:{ Exception -> 0x00c6 }
            java.net.Socket r10 = r0.d     // Catch:{ Exception -> 0x00c6 }
            if (r10 == 0) goto L_0x00df
            r10.close()     // Catch:{ Exception -> 0x00df }
        L_0x00df:
            throw r1     // Catch:{ Exception -> 0x00c6 }
        L_0x00e0:
            boolean r0 = r11.h()
            if (r0 != 0) goto L_0x00e9
            r11.onError(r10)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d74.j(nqd):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ffc k(int r17, defpackage.rze r18, int[] r19) {
        /*
            r16 = this;
            r0 = r16
            r8 = r18
            int r1 = r0.a
            switch(r1) {
                case 7: goto L_0x0035;
                default: goto L_0x0009;
            }
        L_0x0009:
            ww6 r9 = defpackage.zw6.i()
            r1 = 0
            r10 = r1
        L_0x000f:
            int r1 = r8.a
            if (r10 >= r1) goto L_0x0030
            te4 r11 = new te4
            r6 = r19[r10]
            java.lang.Object r1 = r0.b
            r5 = r1
            oe4 r5 = (defpackage.oe4) r5
            java.lang.Object r1 = r0.c
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r1 = r11
            r2 = r17
            r3 = r18
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.a(r11)
            int r10 = r10 + 1
            goto L_0x000f
        L_0x0030:
            ffc r0 = r9.j()
            return r0
        L_0x0035:
            java.lang.Object r1 = r0.c
            int[] r1 = (int[]) r1
            r9 = r1[r17]
            java.lang.Object r0 = r0.b
            r10 = r0
            oe4 r10 = (defpackage.oe4) r10
            int r0 = r10.i
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            if (r0 == r12) goto L_0x00ac
            int r1 = r10.j
            if (r1 != r12) goto L_0x004e
            goto L_0x00ac
        L_0x004e:
            r3 = r12
            r2 = r13
        L_0x0050:
            int r4 = r8.a
            if (r2 >= r4) goto L_0x00aa
            qy5[] r4 = r8.d
            r4 = r4[r2]
            int r5 = r4.t
            if (r5 <= 0) goto L_0x00a7
            int r6 = r4.u
            if (r6 <= 0) goto L_0x00a7
            boolean r7 = r10.k
            if (r7 == 0) goto L_0x0073
            if (r5 <= r6) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = r13
        L_0x0069:
            if (r0 <= r1) goto L_0x006d
            r14 = 1
            goto L_0x006e
        L_0x006d:
            r14 = r13
        L_0x006e:
            if (r7 == r14) goto L_0x0073
            r7 = r0
            r14 = r1
            goto L_0x0075
        L_0x0073:
            r14 = r0
            r7 = r1
        L_0x0075:
            int r15 = r5 * r7
            int r11 = r6 * r14
            if (r15 < r11) goto L_0x0085
            android.graphics.Point r7 = new android.graphics.Point
            int r5 = defpackage.oaf.g(r11, r5)
            r7.<init>(r14, r5)
            goto L_0x008f
        L_0x0085:
            android.graphics.Point r5 = new android.graphics.Point
            int r11 = defpackage.oaf.g(r15, r6)
            r5.<init>(r11, r7)
            r7 = r5
        L_0x008f:
            int r4 = r4.t
            int r5 = r4 * r6
            int r11 = r7.x
            float r11 = (float) r11
            r14 = 1065017672(0x3f7ae148, float:0.98)
            float r11 = r11 * r14
            int r11 = (int) r11
            if (r4 < r11) goto L_0x00a7
            int r4 = r7.y
            float r4 = (float) r4
            float r4 = r4 * r14
            int r4 = (int) r4
            if (r6 < r4) goto L_0x00a7
            if (r5 >= r3) goto L_0x00a7
            r3 = r5
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x00aa:
            r11 = r3
            goto L_0x00ad
        L_0x00ac:
            r11 = r12
        L_0x00ad:
            ww6 r14 = defpackage.zw6.i()
            r15 = r13
        L_0x00b2:
            int r0 = r8.a
            if (r15 >= r0) goto L_0x00e2
            qy5[] r0 = r8.d
            r0 = r0[r15]
            int r0 = r0.b()
            if (r11 == r12) goto L_0x00c8
            r1 = -1
            if (r0 == r1) goto L_0x00c6
            if (r0 > r11) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r7 = r13
            goto L_0x00c9
        L_0x00c8:
            r7 = 1
        L_0x00c9:
            af4 r6 = new af4
            r5 = r19[r15]
            r0 = r6
            r1 = r17
            r2 = r18
            r3 = r15
            r4 = r10
            r12 = r6
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.a(r12)
            int r15 = r15 + 1
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b2
        L_0x00e2:
            ffc r0 = r14.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d74.k(int, rze, int[]):ffc");
    }

    public void l(Task task) {
        ((f25) this.b).a((Intent) this.c);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 10:
                sx4 sx4 = (sx4) this.b;
                sx4.getClass();
                lw4 lw4 = (lw4) this.c;
                int i = lw4.a;
                CharSequence e = sx4.c.e(lw4.c);
                return new lw4(i, lw4.b, e, (List) obj, lw4.e, lw4.f, lw4.g);
            default:
                jg5 jg5 = (jg5) this.b;
                jg5.getClass();
                for (es8 es8 : (List) obj) {
                    cu8 cu8 = es8.a;
                    g20 g20 = g20.u0;
                    if (cu8.m(g20)) {
                        cu8 cu82 = es8.a;
                        l20 k = cu82.z0.k(g20);
                        if (k != null) {
                            if (((String) this.c).equals(k.r)) {
                                tp7 m = ((jyc) jg5.b).m();
                                m.getClass();
                                return tp7.b(m, cu82.b, false, 26);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return iqd.f(new IllegalStateException("no message found on screen"));
        }
    }
}
