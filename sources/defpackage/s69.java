package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: s69  reason: default package */
public final class s69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((s69) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        s69 s69 = new s69(continuation, this.Y);
        s69.X = obj;
        return s69;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: asc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: asc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: gj4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: fq0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: asc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: asc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: asc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: asc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: asc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: asc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: asc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            defpackage.od2.a0(r8)
            java.lang.Object r8 = r7.X
            a05 r8 = (defpackage.a05) r8
            bc7[] r0 = one.me.messages.list.ui.MessagesListWidget.X0
            one.me.messages.list.ui.MessagesListWidget r7 = r7.Y
            android.widget.FrameLayout r0 = r7.q0()
            r0.removeAllViews()
            boolean r0 = r8 instanceof defpackage.xz4
            r1 = 0
            r2 = 32
            r3 = 17
            r4 = -2
            if (r0 == 0) goto L_0x007b
            xz4 r8 = (defpackage.xz4) r8
            y59 r0 = new y59
            r0.<init>(r7)
            fq0 r5 = new fq0
            android.content.Context r6 = r7.getContext()
            r5.<init>(r6)
            r5.setLinkListener(r0)
            r5.setState(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r8.<init>(r0, r4, r3)
            float r0 = (float) r2
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = defpackage.tu0.G(r0)
            r8.setMargins(r0, r0, r0, r0)
            r5.setLayoutParams(r8)
            ix3 r8 = new ix3
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r2 = 1103101952(0x41c00000, float:24.0)
            float r0 = r0 * r2
            r8.<init>(r0)
            r5.setOutlineProvider(r8)
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            r0 = 0
            r8.setShape(r0)
            o48 r0 = new o48
            r2 = 1
            r0.<init>(r8, r1, r2)
            defpackage.v3c.y(r0, r5)
            r5.setBackground(r8)
            r1 = r5
            goto L_0x0153
        L_0x007b:
            boolean r0 = r8 instanceof defpackage.yz4
            r5 = 30
            if (r0 == 0) goto L_0x0108
            gj4 r1 = new gj4
            android.content.Context r0 = r7.getContext()
            r1.<init>(r0)
            yz4 r8 = (defpackage.yz4) r8
            qk2 r0 = new qk2
            r2 = 4
            r0.<init>(r2, r7)
            androidx.appcompat.widget.AppCompatTextView r2 = r1.b
            int r6 = defpackage.oda.M
            r2.setText(r6)
            androidx.appcompat.widget.AppCompatTextView r2 = r1.c
            int r6 = defpackage.oda.L
            r2.setText(r6)
            z2e r8 = r8.a
            if (r8 == 0) goto L_0x00bb
            r2 = 144(0x90, float:2.02E-43)
            float r2 = (float) r2
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r2 = r2 * r6
            int r2 = defpackage.tu0.G(r2)
            iw7 r6 = r1.o
            r6.a(r8, r2)
        L_0x00bb:
            r1.a = r0
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r0 = 262(0x106, float:3.67E-43)
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = defpackage.tu0.G(r0)
            r8.<init>(r0, r4, r3)
            r0 = 12
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = defpackage.tu0.G(r0)
            r8.setMargins(r0, r0, r0, r0)
            r1.setLayoutParams(r8)
            android.content.Context r8 = r1.getContext()
            gta r8 = defpackage.tfg.s(r8)
            boolean r8 = r8.b
            if (r8 == 0) goto L_0x0153
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r5) goto L_0x0153
            c05 r8 = new c05
            android.view.View r0 = r7.requireView()
            r8.<init>(r1, r0)
            r7.V0 = r8
            goto L_0x0153
        L_0x0108:
            boolean r0 = r8 instanceof defpackage.zz4
            if (r0 == 0) goto L_0x0151
            asc r1 = new asc
            android.content.Context r0 = r7.getContext()
            r1.<init>(r0)
            zz4 r8 = (defpackage.zz4) r8
            r1.setState(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r4, r4, r3)
            float r0 = (float) r2
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = defpackage.tu0.G(r0)
            r8.setMargins(r0, r0, r0, r0)
            r1.setLayoutParams(r8)
            android.content.Context r8 = r7.getContext()
            gta r8 = defpackage.tfg.s(r8)
            boolean r8 = r8.b
            if (r8 == 0) goto L_0x0153
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r5) goto L_0x0153
            c05 r8 = new c05
            android.view.View r0 = r7.requireView()
            r8.<init>(r1, r0)
            r7.V0 = r8
            goto L_0x0153
        L_0x0151:
            if (r8 != 0) goto L_0x0168
        L_0x0153:
            if (r1 == 0) goto L_0x0165
            wdg r8 = new wdg
            r0 = 7
            r8.<init>(r0)
            defpackage.pla.a(r1, r8)
            android.widget.FrameLayout r7 = r7.q0()
            r7.addView(r1)
        L_0x0165:
            e5f r7 = defpackage.e5f.a
            return r7
        L_0x0168:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s69.o(java.lang.Object):java.lang.Object");
    }
}
