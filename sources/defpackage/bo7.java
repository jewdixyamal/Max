package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: bo7  reason: default package */
public final class bo7 extends ffe implements a66 {
    public ze0 X;
    public gbf Y;
    public int Z;
    public final /* synthetic */ o23 s0;
    public final /* synthetic */ Context t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bo7(o23 o23, Context context, Continuation continuation) {
        super(2, continuation);
        this.s0 = o23;
        this.t0 = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bo7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bo7(this.s0, this.t0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.Z
            r2 = 0
            r3 = 1
            o23 r4 = r8.s0
            if (r1 == 0) goto L_0x001d
            if (r1 != r3) goto L_0x0015
            gbf r0 = r8.Y
            ze0 r8 = r8.X
            defpackage.od2.a0(r9)
            goto L_0x0136
        L_0x0015:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001d:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r4.X
            je7 r9 = (defpackage.je7) r9
            java.lang.Object r9 = r9.getValue()
            qe5 r9 = (defpackage.qe5) r9
            se5 r9 = (defpackage.se5) r9
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f7appearancemultithemescreenenabled
            r5 = 0
            boolean r9 = r9.n(r1, r5)
            pq9 r1 = defpackage.qp4.u0
            java.lang.Object r5 = r4.a
            android.content.Context r5 = (android.content.Context) r5
            if (r9 == 0) goto L_0x006a
            qp4 r9 = r1.b(r5)
            boolean r9 = r9.j()
            if (r9 == 0) goto L_0x0059
            qp4 r9 = r1.b(r5)
            sba r9 = r9.g()
            java.lang.String r9 = r9.a
            java.lang.String r5 = "Dark"
            java.lang.String r9 = defpackage.au1.g(r9, r5)
            goto L_0x0099
        L_0x0059:
            qp4 r9 = r1.b(r5)
            sba r9 = r9.g()
            java.lang.String r9 = r9.a
            java.lang.String r5 = "Light"
            java.lang.String r9 = defpackage.au1.g(r9, r5)
            goto L_0x0099
        L_0x006a:
            qp4 r9 = r1.b(r5)
            boolean r9 = r9.j()
            java.lang.Object r5 = r4.c
            je7 r5 = (defpackage.je7) r5
            if (r9 == 0) goto L_0x0089
            java.lang.Object r9 = r5.getValue()
            q33 r9 = (defpackage.q33) r9
            t33 r9 = (defpackage.t33) r9
            ne7 r9 = r9.g
            java.lang.String r5 = "app.chat.background.dark.id"
            java.lang.String r9 = r9.getString(r5, r2)
            goto L_0x0099
        L_0x0089:
            java.lang.Object r9 = r5.getValue()
            q33 r9 = (defpackage.q33) r9
            t33 r9 = (defpackage.t33) r9
            ne7 r9 = r9.g
            java.lang.String r5 = "app.chat.background.light.id"
            java.lang.String r9 = r9.getString(r5, r2)
        L_0x0099:
            android.content.Context r5 = r8.t0
            if (r9 != 0) goto L_0x00c7
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR
            r8.setOrientation(r9)
            qp4 r9 = r1.b(r5)
            fka r9 = r9.i()
            nr2 r9 = r9.a()
            v83 r9 = r9.s()
            m73 r9 = r9.b
            l73 r9 = r9.a
            int r0 = r9.g
            int r9 = r9.h
            int[] r9 = new int[]{r0, r9}
            r8.setColors(r9)
            return r8
        L_0x00c7:
            ze0 r1 = new ze0
            r1.<init>(r9)
            android.util.LruCache r9 = defpackage.mre.a
            android.util.LruCache r9 = defpackage.mre.a
            java.lang.Object r9 = r9.get(r1)
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            java.lang.String r6 = "LoadThemeBackgroundUseCase"
            if (r9 == 0) goto L_0x00f1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Load theme "
            r8.<init>(r0)
            r8.append(r1)
            java.lang.String r0 = " from cache."
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            defpackage.hm9.m(r6, r8, new java.lang.Object[0])
            return r9
        L_0x00f1:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r7 = "Theme "
            r9.<init>(r7)
            r9.append(r1)
            java.lang.String r7 = " not cached, start loading from source."
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            defpackage.hm9.m(r6, r9, new java.lang.Object[0])
            java.lang.Object r9 = r4.b
            khe r9 = (defpackage.khe) r9
            java.lang.Object r6 = r9.getValue()
            qe0 r6 = (defpackage.qe0) r6
            java.util.LinkedHashMap r6 = r6.c(r5, r2)
            java.lang.Object r6 = r6.get(r1)
            gbf r6 = (defpackage.gbf) r6
            if (r6 == 0) goto L_0x013b
            fbf r7 = r6.a
            if (r7 == 0) goto L_0x013b
            java.lang.Object r9 = r9.getValue()
            qe0 r9 = (defpackage.qe0) r9
            r8.X = r1
            r8.Y = r6
            r8.Z = r3
            java.lang.Object r9 = r9.d(r5, r7, r8)
            if (r9 != r0) goto L_0x0134
            return r0
        L_0x0134:
            r8 = r1
            r0 = r6
        L_0x0136:
            kge r9 = (defpackage.kge) r9
            r1 = r8
            r6 = r0
            goto L_0x013c
        L_0x013b:
            r9 = r2
        L_0x013c:
            if (r6 == 0) goto L_0x014f
            qre r8 = defpackage.od2.c0(r6, r9)
            rre r2 = new rre
            r2.<init>(r8)
            r4.getClass()
            android.util.LruCache r8 = defpackage.mre.a
            defpackage.mre.a(r1, r2)
        L_0x014f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo7.o(java.lang.Object):java.lang.Object");
    }
}
