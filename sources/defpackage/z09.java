package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: z09  reason: default package */
public final class z09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((z09) n((w9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z09 z09 = new z09(continuation, this.Y);
        z09.X = obj;
        return z09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        r9 = r9.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.X
            w9 r10 = (defpackage.w9) r10
            bc7[] r0 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            one.me.sdk.messagewrite.MessageWriteWidget r9 = r9.Y
            sv8 r0 = r9.q0()
            r0.requestFocus()
            xz7 r9 = r9.A0
            if (r9 == 0) goto L_0x00a2
            int r0 = r10.a
            java.lang.String r1 = r10.c
            if (r1 != 0) goto L_0x001e
            goto L_0x00a2
        L_0x001e:
            android.widget.EditText r9 = r9.a
            android.text.Editable r2 = r9.getText()
            if (r2 == 0) goto L_0x00a2
            int r3 = r2.length()
            if (r3 != 0) goto L_0x002e
            goto L_0x00a2
        L_0x002e:
            int r10 = r10.b
            java.lang.Class<ek7> r3 = defpackage.ek7.class
            java.lang.Object[] r3 = r2.getSpans(r0, r10, r3)
            ek7[] r3 = (defpackage.ek7[]) r3
            r4 = 0
            if (r3 == 0) goto L_0x0083
            int r5 = r3.length
            if (r5 != 0) goto L_0x003f
            goto L_0x0083
        L_0x003f:
            r5 = 0
        L_0x0040:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x00a2
            int r6 = r5 + 1
            r5 = r3[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0078 }
            int r7 = r2.getSpanStart(r5)
            int r8 = r2.getSpanEnd(r5)
            if (r7 != r0) goto L_0x0076
            if (r8 != r10) goto L_0x0076
            r2.removeSpan(r5)
            boolean r3 = r9.isInEditMode()
            if (r3 == 0) goto L_0x005f
            ee4 r9 = defpackage.ee4.e0
            goto L_0x0069
        L_0x005f:
            android.content.Context r9 = r9.getContext()
            khe r3 = defpackage.sme.a0
            sme r9 = defpackage.fm9.R(r9)
        L_0x0069:
            int r9 = r9.k
            ek7 r3 = new ek7
            r3.<init>(r1, r9)
            r3.c = r4
            defpackage.ft.B(r2, r3, r0, r10)
            goto L_0x00a2
        L_0x0076:
            r5 = r6
            goto L_0x0040
        L_0x0078:
            r9 = move-exception
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r9)
            throw r10
        L_0x0083:
            boolean r3 = r9.isInEditMode()
            if (r3 == 0) goto L_0x008c
            ee4 r9 = defpackage.ee4.e0
            goto L_0x0096
        L_0x008c:
            android.content.Context r9 = r9.getContext()
            khe r3 = defpackage.sme.a0
            sme r9 = defpackage.fm9.R(r9)
        L_0x0096:
            int r9 = r9.k
            ek7 r3 = new ek7
            r3.<init>(r1, r9)
            r3.c = r4
            defpackage.ft.B(r2, r3, r0, r10)
        L_0x00a2:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z09.o(java.lang.Object):java.lang.Object");
    }
}
