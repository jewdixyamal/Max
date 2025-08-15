package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* renamed from: w50  reason: default package */
public final class w50 extends ht8 {
    public final /* synthetic */ int T0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w50(Context context, ViewGroup viewGroup, int i) {
        super(context, viewGroup);
        this.T0 = i;
    }

    public void D() {
        switch (this.T0) {
            case 0:
                p50 p50 = (p50) this.I0;
                p50.removeOnAttachStateChangeListener(p50.U0);
                x77 x77 = p50.T0;
                if (x77 != null) {
                    x77.cancel((CancellationException) null);
                }
                p50.T0 = null;
                x77 x772 = p50.S0;
                if (x772 != null) {
                    x772.cancel((CancellationException) null);
                }
                p50.S0 = null;
                return;
            case 4:
                ((gi5) this.I0).z();
                return;
            case 9:
                gsd gsd = (gsd) this.I0;
                gsd.removeOnAttachStateChangeListener(gsd.M0);
                x77 x773 = gsd.N0;
                if (x773 != null) {
                    x773.cancel((CancellationException) null);
                }
                gsd.N0 = null;
                return;
            case 10:
                dif dif = (dif) this.I0;
                dif.removeOnAttachStateChangeListener(dif.G0);
                vxd vxd = dif.H0;
                if (vxd != null) {
                    vxd.cancel((CancellationException) null);
                }
                dif.H0 = null;
                vxd vxd2 = dif.I0;
                if (vxd2 != null) {
                    vxd2.cancel((CancellationException) null);
                }
                dif.I0 = null;
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r5v13, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L(one.me.messages.list.loader.MessageModel r6) {
        /*
            r5 = this;
            int r0 = r5.T0
            switch(r0) {
                case 0: goto L_0x01f3;
                case 1: goto L_0x0005;
                case 2: goto L_0x01dc;
                case 3: goto L_0x01c5;
                case 4: goto L_0x01ae;
                case 5: goto L_0x018e;
                case 6: goto L_0x00a2;
                case 7: goto L_0x0081;
                case 8: goto L_0x0005;
                case 9: goto L_0x004f;
                case 10: goto L_0x0038;
                case 11: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            tz r6 = r6.u0
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.bsd
            if (r0 == 0) goto L_0x0011
            bsd r6 = (defpackage.bsd) r6
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            if (r6 != 0) goto L_0x0015
            goto L_0x0037
        L_0x0015:
            android.view.View r5 = r5.I0
            esd r5 = (defpackage.esd) r5
            r5.setModel(r6)
            o50 r0 = new o50
            r1 = 8
            r0.<init>(r5, r1, r6)
            r5.E0 = r0
            boolean r6 = r5.isAttachedToWindow()
            if (r6 == 0) goto L_0x0032
            o50 r6 = r5.E0
            if (r6 == 0) goto L_0x0032
            r6.onViewAttachedToWindow(r5)
        L_0x0032:
            o50 r6 = r5.E0
            r5.addOnAttachStateChangeListener(r6)
        L_0x0037:
            return
        L_0x0038:
            tz r6 = r6.u0
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.wgf
            if (r0 == 0) goto L_0x0043
            wgf r6 = (defpackage.wgf) r6
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            if (r6 != 0) goto L_0x0047
            goto L_0x004e
        L_0x0047:
            android.view.View r5 = r5.I0
            dif r5 = (defpackage.dif) r5
            r5.n(r6)
        L_0x004e:
            return
        L_0x004f:
            tz r6 = r6.u0
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.bsd
            if (r0 == 0) goto L_0x005a
            bsd r6 = (defpackage.bsd) r6
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 != 0) goto L_0x005e
            goto L_0x0080
        L_0x005e:
            android.view.View r5 = r5.I0
            gsd r5 = (defpackage.gsd) r5
            r5.setModel(r6)
            o50 r0 = new o50
            r1 = 9
            r0.<init>(r5, r1, r6)
            r5.M0 = r0
            boolean r6 = r5.isAttachedToWindow()
            if (r6 == 0) goto L_0x007b
            o50 r6 = r5.M0
            if (r6 == 0) goto L_0x007b
            r6.onViewAttachedToWindow(r5)
        L_0x007b:
            o50 r6 = r5.M0
            r5.addOnAttachStateChangeListener(r6)
        L_0x0080:
            return
        L_0x0081:
            tz r6 = r6.u0
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.v2e
            r1 = 0
            if (r0 == 0) goto L_0x008d
            v2e r6 = (defpackage.v2e) r6
            goto L_0x008e
        L_0x008d:
            r6 = r1
        L_0x008e:
            if (r6 != 0) goto L_0x0091
            goto L_0x00a1
        L_0x0091:
            android.view.View r5 = r5.I0
            boolean r0 = r5 instanceof defpackage.t2e
            if (r0 == 0) goto L_0x009a
            r1 = r5
            t2e r1 = (defpackage.t2e) r1
        L_0x009a:
            if (r1 == 0) goto L_0x00a1
            z2e r5 = r6.a
            r1.a(r5)
        L_0x00a1:
            return
        L_0x00a2:
            tz r0 = r6.u0
            o00 r0 = r0.d
            boolean r1 = r0 instanceof defpackage.tjd
            if (r1 == 0) goto L_0x00ad
            tjd r0 = (defpackage.tjd) r0
            goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            if (r0 != 0) goto L_0x00b2
            goto L_0x018d
        L_0x00b2:
            android.view.View r5 = r5.I0
            xkd r5 = (defpackage.xkd) r5
            int r6 = r6.I0
            r1 = 2080374784(0x7c000000, float:2.658456E36)
            r6 = r6 & r1
            boolean r6 = defpackage.ns0.b(r6)
            r5.getClass()
            pq9 r1 = defpackage.qp4.u0
            fka r1 = r1.j(r5)
            nr2 r1 = r1.a()
            is0 r6 = r1.d(r6)
            r5.t0 = r6
            je7 r6 = r5.C0
            r1 = 8
            r2 = 0
            java.lang.String r3 = r0.c
            if (r3 == 0) goto L_0x00eb
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r4 = r6
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r4.setText(r3)
            r6.setVisibility(r2)
            goto L_0x00fa
        L_0x00eb:
            boolean r3 = r6.a()
            if (r3 == 0) goto L_0x00fa
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x00fa:
            je7 r6 = r5.D0
            java.lang.String r3 = r0.d
            if (r3 == 0) goto L_0x0110
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r4 = r6
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r4.setText(r3)
            r6.setVisibility(r2)
            goto L_0x011f
        L_0x0110:
            boolean r3 = r6.a()
            if (r3 == 0) goto L_0x011f
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x011f:
            je7 r6 = r5.E0
            java.lang.String r3 = r0.e
            if (r3 == 0) goto L_0x0135
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r4 = r6
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r4.setText(r3)
            r6.setVisibility(r2)
            goto L_0x0144
        L_0x0135:
            boolean r3 = r6.a()
            if (r3 == 0) goto L_0x0144
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x0144:
            je7 r6 = r5.F0
            yt6 r3 = r0.f
            if (r3 == 0) goto L_0x015a
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r1 = r6
            bu6 r1 = (defpackage.bu6) r1
            r1.setImageAttach(r3)
            r6.setVisibility(r2)
            goto L_0x0169
        L_0x015a:
            boolean r2 = r6.a()
            if (r2 == 0) goto L_0x0169
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x0169:
            android.content.Context r6 = r5.getContext()
            zja r1 = new zja
            r2 = 23
            r1.<init>(r5, r2, r0)
            p63 r0 = new p63
            r2 = 4
            r0.<init>(r5, r2, r1)
            android.view.GestureDetector r1 = new android.view.GestureDetector
            r1.<init>(r6, r0)
            r6 = 1
            r1.setIsLongpressEnabled(r6)
            q46 r6 = new q46
            r0 = 8
            r6.<init>(r1, r0)
            r5.setOnTouchListener(r6)
        L_0x018d:
            return
        L_0x018e:
            tz r0 = r6.u0
            o00 r0 = r0.d
            boolean r1 = r0 instanceof defpackage.oa6
            if (r1 == 0) goto L_0x0199
            oa6 r0 = (defpackage.oa6) r0
            goto L_0x019a
        L_0x0199:
            r0 = 0
        L_0x019a:
            if (r0 != 0) goto L_0x019d
            goto L_0x01ad
        L_0x019d:
            android.view.View r5 = r5.I0
            pa6 r5 = (defpackage.pa6) r5
            int r6 = r6.I0
            r1 = 2080374784(0x7c000000, float:2.658456E36)
            r6 = r6 & r1
            boolean r6 = defpackage.ns0.b(r6)
            r5.b(r0, r6)
        L_0x01ad:
            return
        L_0x01ae:
            tz r6 = r6.u0
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.zf5
            if (r0 == 0) goto L_0x01b9
            zf5 r6 = (defpackage.zf5) r6
            goto L_0x01ba
        L_0x01b9:
            r6 = 0
        L_0x01ba:
            if (r6 != 0) goto L_0x01bd
            goto L_0x01c4
        L_0x01bd:
            android.view.View r5 = r5.I0
            gi5 r5 = (defpackage.gi5) r5
            r5.setFileInfo(r6)
        L_0x01c4:
            return
        L_0x01c5:
            tz r6 = r6.u0
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.bk3
            if (r0 == 0) goto L_0x01d0
            bk3 r6 = (defpackage.bk3) r6
            goto L_0x01d1
        L_0x01d0:
            r6 = 0
        L_0x01d1:
            if (r6 != 0) goto L_0x01d4
            goto L_0x01db
        L_0x01d4:
            android.view.View r5 = r5.I0
            lp3 r5 = (defpackage.lp3) r5
            r5.i(r6)
        L_0x01db:
            return
        L_0x01dc:
            tz r6 = r6.u0
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.y01
            if (r0 == 0) goto L_0x01e7
            y01 r6 = (defpackage.y01) r6
            goto L_0x01e8
        L_0x01e7:
            r6 = 0
        L_0x01e8:
            if (r6 != 0) goto L_0x01eb
            goto L_0x01f2
        L_0x01eb:
            android.view.View r5 = r5.I0
            nd1 r5 = (defpackage.nd1) r5
            r5.c(r6)
        L_0x01f2:
            return
        L_0x01f3:
            tz r6 = r6.u0
            o00 r6 = r6.d
            boolean r0 = r6 instanceof defpackage.k50
            if (r0 == 0) goto L_0x01fe
            k50 r6 = (defpackage.k50) r6
            goto L_0x01ff
        L_0x01fe:
            r6 = 0
        L_0x01ff:
            if (r6 != 0) goto L_0x0202
            goto L_0x0209
        L_0x0202:
            android.view.View r5 = r5.I0
            p50 r5 = (defpackage.p50) r5
            r5.setAudio(r6)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w50.L(one.me.messages.list.loader.MessageModel):void");
    }

    public void M(is0 is0) {
        switch (this.T0) {
            case 0:
                ((p50) this.I0).b();
                return;
            case 2:
                ((nd1) this.I0).b();
                return;
            case 3:
                ((lp3) this.I0).e();
                return;
            case 4:
                ((gi5) this.I0).y(is0);
                return;
            case 5:
                ((pa6) this.I0).d(is0);
                return;
            case 6:
                ((xkd) this.I0).n(is0);
                return;
            case 8:
                View view = this.I0;
                k34 k34 = view instanceof k34 ? (k34) view : null;
                if (k34 != null) {
                    k34.setDateTextColor(is0.d.m);
                    return;
                }
                return;
            case 9:
                ((gsd) this.I0).x(is0);
                return;
            default:
                return;
        }
    }

    public void O(v83 v83) {
        switch (this.T0) {
            case 1:
                View view = this.I0;
                am0 am0 = view instanceof am0 ? (am0) view : null;
                if (am0 != null) {
                    am0.setDateTextColor(v83.g.a);
                    return;
                }
                return;
            case 7:
                View view2 = this.I0;
                x2e x2e = view2 instanceof x2e ? (x2e) view2 : null;
                if (x2e != null) {
                    x2e.setDateTextColor(v83.g.a);
                    return;
                }
                return;
            case 9:
                gsd gsd = (gsd) this.I0;
                gsd.D0.onThemeChanged(qp4.u0.b(gsd.getContext()).i());
                if (!gsd.w()) {
                    gsd.getDate$message_list_release().setTextColor$message_list_release(v83.g.a);
                    return;
                }
                return;
            case 10:
                dif dif = (dif) this.I0;
                dif.setDateTextColor(v83.g.a);
                dif.p(v83);
                return;
            case 11:
                esd esd = (esd) this.I0;
                esd.setDateTextColor(v83.g.a);
                esd.x0.onThemeChanged(qp4.u0.b(esd.getContext()).i());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w50(Context context) {
        super(context, new ppe(context));
        this.T0 = 8;
    }
}
