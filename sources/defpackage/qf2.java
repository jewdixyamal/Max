package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaListWidget;

/* renamed from: qf2  reason: default package */
public final class qf2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qf2(Continuation continuation, ChatMediaListWidget chatMediaListWidget) {
        super(2, continuation);
        this.Y = chatMediaListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qf2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qf2 qf2 = new qf2(continuation, this.Y);
        qf2.X = obj;
        return qf2;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [hdc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            defpackage.od2.a0(r6)
            java.lang.Object r6 = r5.X
            lh2 r6 = (defpackage.lh2) r6
            one.me.profile.screens.media.ChatMediaListWidget r5 = r5.Y
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = one.me.profile.screens.media.ChatMediaListWidget.m0(r5)
            r1 = 0
            r0.setRefreshingNext(r1)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = one.me.profile.screens.media.ChatMediaListWidget.m0(r5)
            androidx.recyclerview.widget.a r0 = r0.getLayoutManager()
            boolean r2 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r3 = 0
            if (r2 == 0) goto L_0x0021
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            goto L_0x0022
        L_0x0021:
            r0 = r3
        L_0x0022:
            if (r0 == 0) goto L_0x002e
            int r0 = r0.T0()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            goto L_0x002f
        L_0x002e:
            r2 = r3
        L_0x002f:
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = one.me.profile.screens.media.ChatMediaListWidget.m0(r5)
            hdc r0 = r0.getAdapter()
            boolean r4 = r0 instanceof defpackage.nf2
            if (r4 == 0) goto L_0x003e
            r3 = r0
            nf2 r3 = (defpackage.nf2) r3
        L_0x003e:
            if (r3 == 0) goto L_0x0045
            java.util.List r6 = r6.a
            r3.E(r6)
        L_0x0045:
            if (r2 != 0) goto L_0x0048
            goto L_0x0055
        L_0x0048:
            int r6 = r2.intValue()
            if (r6 != 0) goto L_0x0055
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r5 = one.me.profile.screens.media.ChatMediaListWidget.m0(r5)
            r5.B0(r1)
        L_0x0055:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf2.o(java.lang.Object):java.lang.Object");
    }
}
