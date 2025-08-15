package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: m09  reason: default package */
public final class m09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((m09) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m09 m09 = new m09(continuation, this.Y);
        m09.X = obj;
        return m09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r4 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            defpackage.od2.a0(r4)
            java.lang.Object r4 = r3.X
            p35 r4 = (defpackage.p35) r4
            if (r4 == 0) goto L_0x000f
            java.lang.Object r4 = r4.a
            ty8 r4 = (defpackage.ty8) r4
            goto L_0x0010
        L_0x000f:
            r4 = 0
        L_0x0010:
            bc7[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            one.me.sdk.messagewrite.MessageWriteWidget r3 = r3.Y
            if (r4 == 0) goto L_0x001d
            r3.getClass()
            iv8 r4 = r4.a
            if (r4 != 0) goto L_0x001f
        L_0x001d:
            iv8 r4 = defpackage.iv8.a
        L_0x001f:
            sv8 r1 = r3.q0()
            r1.setEmojiExpandableState(r4)
            iv8 r1 = defpackage.iv8.b
            if (r4 != r1) goto L_0x0041
            sv8 r4 = r3.q0()
            zz8 r1 = new zz8
            r2 = 4
            r1.<init>(r3, r2)
            qv8 r3 = r4.c
            r3.setShowSoftInputOnFocus(r0)
            gv8 r4 = new gv8
            r4.<init>(r0, r1)
            r3.setOnFocusChangeListener(r4)
        L_0x0041:
            e5f r3 = defpackage.e5f.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m09.o(java.lang.Object):java.lang.Object");
    }
}
