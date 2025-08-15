package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: hsf  reason: default package */
public final class hsf extends ffe implements c66 {
    public final /* synthetic */ int X = 0;
    public /* synthetic */ lsf Y;

    public /* synthetic */ hsf(int i, Continuation continuation) {
        super(i, continuation);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                fka fka = (fka) obj2;
                hsf hsf = new hsf(3, (Continuation) obj3);
                hsf.Y = (lsf) obj;
                e5f e5f = e5f.a;
                hsf.o(e5f);
                return e5f;
            default:
                TextView textView = (TextView) obj;
                fka fka2 = (fka) obj2;
                hsf hsf2 = new hsf(this.Y, (Continuation) obj3);
                e5f e5f2 = e5f.a;
                hsf2.o(e5f2);
                return e5f2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: uac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: uac} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r4) {
        /*
            r3 = this;
            e5f r0 = defpackage.e5f.a
            r1 = 0
            int r2 = r3.X
            switch(r2) {
                case 0: goto L_0x002e;
                default: goto L_0x0008;
            }
        L_0x0008:
            defpackage.od2.a0(r4)
            lsf r3 = r3.Y
            isf r4 = r3.o
            if (r4 == 0) goto L_0x0028
            y8 r4 = (defpackage.y8) r4
            bc7[] r1 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.b1
            java.lang.Object r4 = r4.a
            one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget r4 = (one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget) r4
            cbc r4 = r4.I0()
            w7c r4 = r4.w0
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            r1 = r4
            uac r1 = (defpackage.uac) r1
        L_0x0028:
            boolean r4 = r1 instanceof defpackage.rac
            r3.setDurationColor(r4)
            return r0
        L_0x002e:
            defpackage.od2.a0(r4)
            lsf r3 = r3.Y
            isf r4 = r3.o
            if (r4 == 0) goto L_0x004e
            y8 r4 = (defpackage.y8) r4
            bc7[] r1 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.b1
            java.lang.Object r4 = r4.a
            one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget r4 = (one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget) r4
            cbc r4 = r4.I0()
            w7c r4 = r4.w0
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            r1 = r4
            uac r1 = (defpackage.uac) r1
        L_0x004e:
            boolean r4 = r1 instanceof defpackage.rac
            r3.setBackgroundColor(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsf.o(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hsf(lsf lsf, Continuation continuation) {
        super(3, continuation);
        this.Y = lsf;
    }
}
