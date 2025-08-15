package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.arch.Widget;

/* renamed from: vf1  reason: default package */
public final class vf1 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vf1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    public final void afterTextChanged(Editable editable) {
        String str;
        int i = 0;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) obj;
                EditText editText = (EditText) this.b;
                if (editable == null || w9e.C0(editable)) {
                    ArrayList arrayList = qqe.a;
                    editText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else if (!tpa.f(editText.getCompoundDrawablesRelative()[2], (Drawable) callOpponentsListWidget.X.getValue())) {
                    ArrayList arrayList2 = qqe.a;
                    editText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) callOpponentsListWidget.X.getValue(), (Drawable) null);
                }
                bc7[] bc7Arr = CallOpponentsListWidget.H0;
                of1 r0 = callOpponentsListWidget.r0();
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                j47.T(r0.a, ((w9a) r0.X).e(), (vx3) null, new mf1(r0, str, (Continuation) null), 2);
                return;
            case 1:
                ((m56) this.b).invoke(String.valueOf(editable));
                n04 n04 = (n04) obj;
                TextView textView = n04.c;
                int i2 = n04.a;
                if (editable != null) {
                    i = editable.length();
                }
                textView.setText(String.valueOf(i2 - i));
                return;
            case 2:
                ((m56) this.b).invoke(String.valueOf(editable));
                xh4 xh4 = (xh4) obj;
                TextView textView2 = xh4.u0;
                int maxCount = xh4.getMaxCount();
                if (editable != null) {
                    i = editable.length();
                }
                textView2.setText(String.valueOf(maxCount - i));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                ((m56) this.b).invoke(((sv8) obj).getText());
                return;
            case 8:
                return;
            default:
                if (((tmd) this.b).H0.isFocused()) {
                    ((m56) obj).invoke(String.valueOf(editable));
                    return;
                }
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    /* JADX WARNING: type inference failed for: r4v19, types: [i24] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r1.j == true) goto L_0x0041;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            vx3 r6 = defpackage.vx3.b
            r7 = 1
            r8 = 0
            java.lang.Object r0 = r4.c
            r1 = 0
            int r2 = r4.a
            switch(r2) {
                case 0: goto L_0x012a;
                case 1: goto L_0x012a;
                case 2: goto L_0x012a;
                case 3: goto L_0x011a;
                case 4: goto L_0x00ce;
                case 5: goto L_0x0080;
                case 6: goto L_0x006f;
                case 7: goto L_0x006e;
                case 8: goto L_0x0045;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.Object r4 = r4.b
            tmd r4 = (defpackage.tmd) r4
            i24 r6 = r4.F0
            boolean r6 = r6 instanceof defpackage.omd
            if (r6 == 0) goto L_0x0044
            android.widget.ImageView r6 = r4.L0
            if (r5 == 0) goto L_0x0023
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r5 = r8
            goto L_0x0024
        L_0x0023:
            r5 = r7
        L_0x0024:
            r5 = r5 ^ r7
            if (r5 == 0) goto L_0x003f
            androidx.appcompat.widget.AppCompatEditText r5 = r4.H0
            boolean r5 = r5.isFocused()
            if (r5 != 0) goto L_0x003f
            i24 r4 = r4.F0
            boolean r5 = r4 instanceof defpackage.omd
            if (r5 == 0) goto L_0x0038
            r1 = r4
            omd r1 = (defpackage.omd) r1
        L_0x0038:
            if (r1 == 0) goto L_0x003f
            boolean r4 = r1.j
            if (r4 != r7) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r8 = 8
        L_0x0041:
            r6.setVisibility(r8)
        L_0x0044:
            return
        L_0x0045:
            java.lang.Object r4 = r4.b
            android.widget.EditText r4 = (android.widget.EditText) r4
            if (r5 == 0) goto L_0x006b
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0052
            goto L_0x006b
        L_0x0052:
            cka r0 = (defpackage.cka) r0
            je7 r5 = r0.w0
            java.lang.Object r5 = r5.getValue()
            r6 = r5
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            boolean r6 = r4.isEnabled()
            if (r6 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r5 = r1
        L_0x0065:
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r4.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r5, r1)
            goto L_0x006e
        L_0x006b:
            r4.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r1)
        L_0x006e:
            return
        L_0x006f:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r4 = r4.b
            m56 r4 = (defpackage.m56) r4
            r4.invoke(r5)
            ae7 r0 = (defpackage.ae7) r0
            r0.E(r1)
            return
        L_0x0080:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = defpackage.tpa.f(r2, r5)
            if (r2 != 0) goto L_0x00cd
            bc7[] r2 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.B0
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r0 = (one.me.inviteactions.invitebyphone.InviteByPhoneScreen) r0
            c67 r2 = r0.p0()
            r2.getClass()
            y57 r3 = new y57
            r3.<init>(r2, r1)
            vxd r6 = defpackage.pnf.n(r2, r1, r6, r3, r7)
            bc7[] r1 = defpackage.c67.F0
            r1 = r1[r7]
            w4d r3 = r2.A0
            r3.o1(r2, r1, r6)
            r4.b = r5
            bc7[] r4 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.B0
            r6 = r4[r8]
            fs r6 = r0.X
            r6.b(r0, r5)
            one.me.sdk.uikit.common.button.OneMeButton r5 = r0.n0()
            r4 = r4[r8]
            java.lang.Object r4 = r6.a(r0)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r7 = r8
        L_0x00ca:
            r5.setEnabled(r7)
        L_0x00cd:
            return
        L_0x00ce:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = defpackage.tpa.f(r2, r5)
            if (r2 != 0) goto L_0x0119
            bc7[] r2 = one.me.login.inputphone.InputPhoneScreen.E0
            one.me.login.inputphone.InputPhoneScreen r0 = (one.me.login.inputphone.InputPhoneScreen) r0
            q27 r2 = r0.q0()
            r2.getClass()
            m27 r3 = new m27
            r3.<init>(r2, r1)
            vxd r6 = defpackage.pnf.n(r2, r1, r6, r3, r7)
            bc7[] r1 = defpackage.q27.B0
            r7 = r1[r7]
            w4d r1 = r2.v0
            r1.o1(r2, r7, r6)
            r4.b = r5
            bc7[] r4 = one.me.login.inputphone.InputPhoneScreen.E0
            r4 = r4[r8]
            fs r4 = r0.X
            r4.b(r0, r5)
            q27 r4 = r0.q0()
            lea r6 = r0.p0()
            java.lang.String r6 = r6.getCode()
            q0e r4 = r4.y0
            java.lang.String r5 = r6.concat(r5)
            r4.setValue(r5)
        L_0x0119:
            return
        L_0x011a:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r4 = r4.b
            m56 r4 = (defpackage.m56) r4
            r4.invoke(r5)
            rl5 r0 = (defpackage.rl5) r0
            r0.E(r1)
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf1.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public /* synthetic */ vf1(Widget widget, int i) {
        this.a = i;
        this.c = widget;
    }
}
