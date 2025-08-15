package defpackage;

import android.view.View;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: g2b  reason: default package */
public final class g2b extends kgb {
    public final /* synthetic */ int F0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2b(View view) {
        super(view);
        this.F0 = 0;
    }

    public final void A(ol7 ol7) {
        CharSequence charSequence = "";
        View view = this.a;
        switch (this.F0) {
            case 0:
                TextView textView = (TextView) view;
                CharSequence b = ((n2b) ol7).a.b(textView.getContext());
                if (b != null) {
                    charSequence = b;
                }
                textView.setText(charSequence);
                v3c.y(new v9(3, (Continuation) null, 20), textView);
                return;
            case 1:
                s0d s0d = (s0d) ol7;
                TextView textView2 = (TextView) view;
                CharSequence b2 = s0d.a.b(textView2.getContext());
                if (b2 != null) {
                    charSequence = b2;
                }
                textView2.setText(charSequence);
                v3c.y(new c3(s0d, (Continuation) null, 29), textView2);
                kqe kqe = i4f.a;
                s0d.c.b(textView2, du4.b);
                return;
            default:
                mmd mmd = (mmd) ol7;
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g2b(android.content.Context r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r0.F0 = r2
            switch(r2) {
                case 2: goto L_0x001d;
                default: goto L_0x000b;
            }
        L_0x000b:
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            r0.<init>(r2)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
            return
        L_0x001d:
            ufd r2 = new ufd
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r0 = 8
            long r4 = (long) r0
            int r0 = defpackage.vea.D0
            eqe r7 = new eqe
            r7.<init>(r0)
            int r0 = defpackage.vea.A0
            eqe r9 = new eqe
            r9.<init>(r0)
            vfd r0 = new vfd
            r14 = 0
            r15 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 1864(0x748, float:2.612E-42)
            r3 = r0
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.setModelItem(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2b.<init>(android.content.Context, int):void");
    }
}
