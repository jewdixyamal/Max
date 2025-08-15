package defpackage;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* renamed from: s08  reason: default package */
public final class s08 extends sc {
    public static final int e = tsb.alertDialogStyle;
    public static final int f = m2c.MaterialAlertDialog_MaterialComponents;
    public static final int g = tsb.materialAlertDialogTheme;
    public final q18 c;
    public final Rect d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s08(android.content.Context r14) {
        /*
            r13 = this;
            int r0 = g
            android.util.TypedValue r1 = defpackage.kq0.C(r14, r0)
            r2 = 0
            if (r1 != 0) goto L_0x000b
            r1 = r2
            goto L_0x000d
        L_0x000b:
            int r1 = r1.data
        L_0x000d:
            r3 = 0
            int r10 = e
            int r11 = f
            android.content.Context r4 = defpackage.y18.a(r14, r3, r10, r11)
            if (r1 != 0) goto L_0x0019
            goto L_0x001f
        L_0x0019:
            du3 r5 = new du3
            r5.<init>(r4, r1)
            r4 = r5
        L_0x001f:
            android.util.TypedValue r14 = defpackage.kq0.C(r14, r0)
            if (r14 != 0) goto L_0x0027
            r14 = r2
            goto L_0x0029
        L_0x0027:
            int r14 = r14.data
        L_0x0029:
            r13.<init>(r4, r14)
            android.content.Context r14 = r13.getContext()
            android.content.res.Resources$Theme r0 = r14.getTheme()
            int[] r1 = defpackage.z2c.MaterialAlertDialog
            int[] r9 = new int[r2]
            r2 = 0
            defpackage.sre.a(r14, r2, r10, r11)
            r4 = r14
            r5 = r2
            r6 = r1
            r7 = r10
            r8 = r11
            defpackage.sre.b(r4, r5, r6, r7, r8, r9)
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r2, r1, r10, r11)
            int r2 = defpackage.z2c.MaterialAlertDialog_backgroundInsetStart
            android.content.res.Resources r4 = r14.getResources()
            int r5 = defpackage.stb.mtrl_alert_dialog_background_inset_start
            int r4 = r4.getDimensionPixelSize(r5)
            int r2 = r1.getDimensionPixelSize(r2, r4)
            int r4 = defpackage.z2c.MaterialAlertDialog_backgroundInsetTop
            android.content.res.Resources r5 = r14.getResources()
            int r6 = defpackage.stb.mtrl_alert_dialog_background_inset_top
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r1.getDimensionPixelSize(r4, r5)
            int r5 = defpackage.z2c.MaterialAlertDialog_backgroundInsetEnd
            android.content.res.Resources r6 = r14.getResources()
            int r7 = defpackage.stb.mtrl_alert_dialog_background_inset_end
            int r6 = r6.getDimensionPixelSize(r7)
            int r5 = r1.getDimensionPixelSize(r5, r6)
            int r6 = defpackage.z2c.MaterialAlertDialog_backgroundInsetBottom
            android.content.res.Resources r7 = r14.getResources()
            int r8 = defpackage.stb.mtrl_alert_dialog_background_inset_bottom
            int r7 = r7.getDimensionPixelSize(r8)
            int r6 = r1.getDimensionPixelSize(r6, r7)
            r1.recycle()
            android.content.res.Resources r1 = r14.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            r7 = 1
            if (r1 != r7) goto L_0x009d
            r12 = r5
            r5 = r2
            r2 = r12
        L_0x009d:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r2, r4, r5, r6)
            r13.d = r1
            int r1 = defpackage.tsb.colorSurface
            java.lang.Class<s08> r2 = defpackage.s08.class
            java.lang.String r2 = r2.getCanonicalName()
            int r1 = defpackage.mr0.y(r1, r14, r2)
            int[] r2 = defpackage.z2c.MaterialAlertDialog
            android.content.res.TypedArray r2 = r14.obtainStyledAttributes(r3, r2, r10, r11)
            int r4 = defpackage.z2c.MaterialAlertDialog_backgroundTint
            int r1 = r2.getColor(r4, r1)
            r2.recycle()
            q18 r2 = new q18
            r2.<init>(r14, r3, r10, r11)
            r2.j(r14)
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r1)
            r2.l(r14)
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            r1 = 16844145(0x1010571, float:2.3697462E-38)
            r0.resolveAttribute(r1, r14, r7)
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r14.getDimension(r0)
            int r14 = r14.type
            r1 = 5
            if (r14 != r1) goto L_0x011e
            r14 = 0
            int r14 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r14 < 0) goto L_0x011e
            p18 r14 = r2.a
            gjd r14 = r14.a
            i8g r14 = r14.e()
            a0 r1 = new a0
            r1.<init>(r0)
            r14.e = r1
            a0 r1 = new a0
            r1.<init>(r0)
            r14.f = r1
            a0 r1 = new a0
            r1.<init>(r0)
            r14.g = r1
            a0 r1 = new a0
            r1.<init>(r0)
            r14.h = r1
            gjd r14 = r14.c()
            r2.setShapeAppearanceModel(r14)
        L_0x011e:
            r13.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s08.<init>(android.content.Context):void");
    }

    public final void b(int i) {
        oc ocVar = this.a;
        ocVar.f = ocVar.a.getText(i);
    }

    public final s08 c(int i, p46 p46) {
        return (s08) super.setNegativeButton(i, p46);
    }

    public final tc create() {
        tc create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        q18 q18 = this.c;
        if (q18 instanceof q18) {
            WeakHashMap weakHashMap = zmf.a;
            q18.k(omf.i(decorView));
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable(q18, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new t27(create, rect));
        return create;
    }

    public final s08 d(int i, DialogInterface.OnClickListener onClickListener) {
        return (s08) super.setPositiveButton(i, onClickListener);
    }

    public final s08 e(CharSequence charSequence) {
        return (s08) super.setTitle(charSequence);
    }

    public final s08 f(View view) {
        return (s08) super.setView(view);
    }

    public final sc setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (s08) super.setNegativeButton(i, onClickListener);
    }

    public final sc setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (s08) super.setPositiveButton(i, onClickListener);
    }

    public final sc setTitle(CharSequence charSequence) {
        return (s08) super.setTitle(charSequence);
    }

    public final sc setView(View view) {
        return (s08) super.setView(view);
    }
}
