package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: p20  reason: default package */
public final class p20 extends gmb {
    public final /* synthetic */ int F0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p20(View view, int i) {
        super(view);
        this.F0 = i;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(defpackage.ol7 r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = ""
            r2 = 0
            android.view.View r3 = r0.a
            int r0 = r0.F0
            switch(r0) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00bd;
                case 3: goto L_0x009e;
                case 4: goto L_0x0084;
                case 5: goto L_0x0080;
                case 6: goto L_0x0065;
                case 7: goto L_0x0039;
                case 8: goto L_0x001d;
                default: goto L_0x000c;
            }
        L_0x000c:
            r0 = r19
            tib r0 = (defpackage.tib) r0
            amd r3 = (defpackage.amd) r3
            cmd r0 = r3.o
            r1 = 1
            r0.c = r1
            bmd r0 = r0.b
            r0.c()
            return
        L_0x001d:
            r0 = r19
            mib r0 = (defpackage.mib) r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r1 = r0.a
            r3.setText(r1)
            m1d r1 = new m1d
            r4 = 0
            r1.<init>((java.lang.Object) r0, (kotlin.coroutines.Continuation) r2, (int) r4)
            defpackage.v3c.y(r1, r3)
            kqe r1 = defpackage.i4f.a
            kqe r0 = r0.c
            r0.b(r3, defpackage.du4.b)
            return
        L_0x0039:
            r0 = r19
            ajb r0 = (defpackage.ajb) r0
            ufd r3 = (defpackage.ufd) r3
            vfd r1 = new vfd
            int r2 = defpackage.wea.c1
            long r5 = (long) r2
            iqe r8 = new iqe
            java.lang.CharSequence r0 = r0.a
            r8.<init>(r0)
            int r0 = defpackage.yea.I
            eqe r14 = new eqe
            r14.<init>(r0)
            r13 = 0
            r17 = 1784(0x6f8, float:2.5E-42)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r4 = r1
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.setModelItem(r1)
            return
        L_0x0065:
            r0 = r19
            lib r0 = (defpackage.lib) r0
            one.me.sdk.uikit.common.button.OneMeButton r3 = (one.me.sdk.uikit.common.button.OneMeButton) r3
            b7a r1 = r0.c
            r3.setMode(r1)
            c7a r1 = r0.b
            r3.setSize(r1)
            z6a r1 = r0.o
            r3.setAppearance(r1)
            int r0 = r0.a
            r3.setText((int) r0)
            return
        L_0x0080:
            defpackage.au1.r(r19)
            throw r2
        L_0x0084:
            r0 = r19
            xib r0 = (defpackage.xib) r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "#id "
            r1.<init>(r2)
            long r4 = r0.a
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r3.setText(r0)
            return
        L_0x009e:
            r0 = r19
            wib r0 = (defpackage.wib) r0
            eq3 r3 = (defpackage.eq3) r3
            jqe r4 = r0.b
            if (r4 == 0) goto L_0x00b0
            android.content.Context r2 = r3.getContext()
            java.lang.CharSequence r2 = r4.b(r2)
        L_0x00b0:
            if (r2 != 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r1 = r2
        L_0x00b4:
            r3.setTitle(r1)
            java.lang.CharSequence r0 = r0.a
            r3.setDescription(r0)
            return
        L_0x00bd:
            r0 = r19
            uib r0 = (defpackage.uib) r0
            lk3 r3 = (defpackage.lk3) r3
            ycb r0 = r0.a
            long r4 = r0.a
            int r2 = java.lang.Long.hashCode(r4)
            r3.setId(r2)
            java.lang.String r2 = r0.d
            if (r2 != 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r1 = r2
        L_0x00d4:
            java.lang.CharSequence r2 = r0.f
            long r4 = r0.e
            r3.O(r4, r2, r1)
            java.lang.CharSequence r1 = r0.b
            r3.setName((java.lang.CharSequence) r1)
            android.content.Context r1 = r3.getContext()
            jqe r0 = r0.c
            java.lang.CharSequence r0 = r0.b(r1)
            r3.setMessage(r0)
            return
        L_0x00ee:
            r0 = r19
            qib r0 = (defpackage.qib) r0
            en2 r3 = (defpackage.en2) r3
            java.lang.CharSequence r0 = r0.a
            r3.setDescription(r0)
            return
        L_0x00fa:
            r0 = r19
            oib r0 = (defpackage.oib) r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p20.A(ol7):void");
    }

    public void F(gaa gaa) {
        switch (this.F0) {
            case 1:
                ((en2) this.a).setListener(new sy4(8, (Object) gaa));
                return;
            case 3:
                ((eq3) this.a).setListener(new ey1(10, gaa));
                return;
            default:
                return;
        }
    }

    public void G(View.OnClickListener onClickListener) {
        switch (this.F0) {
            case 0:
                tu0.K(this.a, 300, onClickListener);
                return;
            case 2:
                tu0.K(this.a, 300, onClickListener);
                return;
            case 4:
                tu0.K((TextView) this.a, 300, onClickListener);
                return;
            case 5:
                tu0.K((TextView) this.a, 300, onClickListener);
                return;
            case 6:
                tu0.K(this.a, 300, onClickListener);
                return;
            case 7:
                tu0.K(this.a, 300, onClickListener);
                return;
            default:
                return;
        }
    }

    public void H(View.OnLongClickListener onLongClickListener) {
        switch (this.F0) {
            case 2:
                ((lk3) this.a).setOnLongClickListener(onLongClickListener);
                return;
            case 7:
                ((ufd) this.a).setOnLongClickListener(onLongClickListener);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p20(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 8
            r1.F0 = r0
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r1.<init>(r0)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p20.<init>(android.content.Context):void");
    }
}
