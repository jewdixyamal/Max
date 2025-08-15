package defpackage;

import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* renamed from: wq  reason: default package */
public final class wq extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wq(Continuation continuation, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen) {
        super(2, continuation);
        this.Y = appearanceSettingsMultiThemeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wq) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wq wqVar = new wq(continuation, this.Y);
        wqVar.X = obj;
        return wqVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: fq} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.X
            er r7 = (defpackage.er) r7
            one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen r6 = r6.Y
            jv5 r0 = r6.Z
            java.util.List r1 = r7.a
            r0.E(r1)
            bc7[] r0 = one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen.s0
            r1 = 1
            r0 = r0[r1]
            q7c r2 = r6.o
            java.lang.Object r0 = r2.T0(r6, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.List r2 = r7.a
            java.util.Iterator r2 = r2.iterator()
        L_0x0023:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0036
            java.lang.Object r3 = r2.next()
            r5 = r3
            wre r5 = (defpackage.wre) r5
            boolean r5 = r5.a
            if (r5 == 0) goto L_0x0023
            goto L_0x0037
        L_0x0036:
            r3 = r4
        L_0x0037:
            wre r3 = (defpackage.wre) r3
            if (r3 != 0) goto L_0x003e
            iqe r2 = defpackage.jqe.a
            goto L_0x0088
        L_0x003e:
            sba r2 = defpackage.sba.d
            sba r3 = r3.c
            boolean r2 = defpackage.tpa.f(r3, r2)
            if (r2 == 0) goto L_0x0051
            int r2 = defpackage.o4a.q
            eqe r3 = new eqe
            r3.<init>(r2)
        L_0x004f:
            r2 = r3
            goto L_0x0088
        L_0x0051:
            sba r2 = defpackage.sba.e
            boolean r2 = defpackage.tpa.f(r3, r2)
            if (r2 == 0) goto L_0x0061
            int r2 = defpackage.o4a.n
            eqe r3 = new eqe
            r3.<init>(r2)
            goto L_0x004f
        L_0x0061:
            sba r2 = defpackage.sba.f
            boolean r2 = defpackage.tpa.f(r3, r2)
            if (r2 == 0) goto L_0x0071
            int r2 = defpackage.o4a.o
            eqe r3 = new eqe
            r3.<init>(r2)
            goto L_0x004f
        L_0x0071:
            sba r2 = defpackage.sba.g
            boolean r2 = defpackage.tpa.f(r3, r2)
            if (r2 == 0) goto L_0x0081
            int r2 = defpackage.o4a.p
            eqe r3 = new eqe
            r3.<init>(r2)
            goto L_0x004f
        L_0x0081:
            iqe r2 = new iqe
            java.lang.String r3 = "Неопознанный барсук"
            r2.<init>(r3)
        L_0x0088:
            android.content.Context r3 = r6.getContext()
            java.lang.CharSequence r2 = r2.b(r3)
            r0.setText(r2)
            java.util.List r0 = r7.b
            java.util.Iterator r0 = r0.iterator()
        L_0x0099:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r0.next()
            r3 = r2
            fq r3 = (defpackage.fq) r3
            java.lang.Boolean r3 = r3.b
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r3 = defpackage.tpa.f(r3, r5)
            if (r3 == 0) goto L_0x0099
            r4 = r2
        L_0x00b1:
            fq r4 = (defpackage.fq) r4
            if (r4 != 0) goto L_0x00b6
            goto L_0x00cb
        L_0x00b6:
            bc7[] r0 = one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen.s0
            r2 = 2
            r0 = r0[r2]
            q7c r2 = r6.X
            java.lang.Object r0 = r2.T0(r6, r0)
            com.google.android.material.button.MaterialButtonToggleGroup r0 = (com.google.android.material.button.MaterialButtonToggleGroup) r0
            long r2 = r4.getItemId()
            int r2 = (int) r2
            r0.b(r2, r1)
        L_0x00cb:
            android.graphics.drawable.Drawable r7 = r7.c
            if (r7 == 0) goto L_0x00df
            bc7[] r0 = one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen.s0
            r1 = 0
            r0 = r0[r1]
            q7c r1 = r6.c
            java.lang.Object r6 = r1.T0(r6, r0)
            sm2 r6 = (defpackage.sm2) r6
            r6.setBackgroundPreview(r7)
        L_0x00df:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq.o(java.lang.Object):java.lang.Object");
    }
}
