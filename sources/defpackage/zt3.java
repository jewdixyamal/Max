package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: zt3  reason: default package */
public final class zt3 extends LinearLayout implements wme {
    public static final /* synthetic */ bc7[] o;
    public static final int s0 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
    public final float a = getContext().getResources().getDimension(ntb.bottom_sheet_corner_radius);
    public final ArrayList b = new ArrayList();
    public final yj c = new yj(6, this);

    static {
        oi9 oi9 = new oi9(zt3.class, "customTheme", "getCustomTheme()Lru/ok/tamtam/themes/TamTheme;");
        nec.a.getClass();
        o = new bc7[]{oi9};
        tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
    }

    public zt3(Context context) {
        super(context, (AttributeSet) null);
        sme sme;
        setOrientation(1);
        if (isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context2 = getContext();
            khe khe = sme.a0;
            sme = fm9.R(context2);
        }
        z(sme);
        addOnAttachStateChangeListener(new o50(11, (Object) this));
        setClipChildren(true);
        setClipToPadding(true);
        setClipToOutline(true);
        setOutlineProvider(new e62(this, 3));
        if (isInEditMode()) {
            a(y53.M(new st3(new eqe(c2c.tt_sms_invite_text), Integer.valueOf(bvb.btn_radio_off_mtrl), new zf3(9), 12), new st3(new eqe(c2c.tt_sms_invite_text), 17301582, new zf3(9), 12)), (a66) null);
        }
    }

    private final sme getCurrentTheme() {
        sme customTheme = getCustomTheme();
        if (customTheme != null) {
            return customTheme;
        }
        if (isInEditMode()) {
            return ee4.e0;
        }
        Context context = getContext();
        khe khe = sme.a0;
        return fm9.R(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0038 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r12, defpackage.a66 r13) {
        /*
            r11 = this;
            int r0 = r12.size()
            java.util.ArrayList r1 = r11.b
            r2 = 1
            r3 = 12
            r4 = 16
            if (r0 != r2) goto L_0x0024
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0024
            float r0 = (float) r4
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = defpackage.tu0.G(r0)
            goto L_0x0034
        L_0x0024:
            float r0 = (float) r3
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = defpackage.tu0.G(r0)
        L_0x0034:
            java.util.Iterator r12 = r12.iterator()
        L_0x0038:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0169
            java.lang.Object r2 = r12.next()
            st3 r2 = (defpackage.st3) r2
            androidx.appcompat.widget.AppCompatTextView r5 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r6 = r11.getContext()
            r7 = 0
            r5.<init>(r6, r7)
            r6 = 8388611(0x800003, float:1.1754948E-38)
            r5.setGravity(r6)
            jqe r6 = r2.a
            android.content.Context r8 = r5.getContext()
            java.lang.CharSequence r6 = r6.b(r8)
            r5.setText(r6)
            sme r6 = r11.getCurrentTheme()
            rme r8 = r2.d
            if (r8 == 0) goto L_0x0080
            t63 r6 = r6.f
            je7 r6 = r6.T
            java.lang.Object r6 = r6.getValue()
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r6 = r6.get(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0083
            int r6 = r6.intValue()
            goto L_0x0089
        L_0x0080:
            r6.getClass()
        L_0x0083:
            sme r6 = r11.getCurrentTheme()
            int r6 = r6.F
        L_0x0089:
            r5.setTextColor(r6)
            r6 = 1097859072(0x41700000, float:15.0)
            r5.setTextSize(r6)
            java.lang.Integer r6 = r2.b
            if (r6 == 0) goto L_0x00d4
            android.content.Context r8 = r5.getContext()
            int r9 = r6.intValue()
            android.graphics.drawable.Drawable r8 = defpackage.kt3.b(r8, r9)
            sme r9 = r11.getCurrentTheme()
            rme r10 = r2.c
            if (r10 == 0) goto L_0x00c0
            t63 r9 = r9.f
            je7 r9 = r9.T
            java.lang.Object r9 = r9.getValue()
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x00c3
            int r9 = r9.intValue()
            goto L_0x00c9
        L_0x00c0:
            r9.getClass()
        L_0x00c3:
            sme r9 = r11.getCurrentTheme()
            int r9 = r9.w
        L_0x00c9:
            defpackage.ngg.G(r8, r9)
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) r8, (android.graphics.drawable.Drawable) r7, (android.graphics.drawable.Drawable) r7, (android.graphics.drawable.Drawable) r7)
            int r7 = s0
            r5.setCompoundDrawablePadding(r7)
        L_0x00d4:
            sme r7 = r11.getCurrentTheme()
            int r7 = r7.m
            sme r8 = r11.getCurrentTheme()
            int r8 = r8.i
            android.graphics.drawable.RippleDrawable r7 = defpackage.hm9.L(r7, r8)
            r5.setBackground(r7)
            if (r6 == 0) goto L_0x011e
            float r6 = (float) r4
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = defpackage.tu0.G(r7)
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = defpackage.tu0.G(r6)
            r8 = 22
            float r8 = (float) r8
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = defpackage.tu0.G(r8)
            r5.setPaddingRelative(r7, r6, r8, r0)
            goto L_0x0150
        L_0x011e:
            float r6 = (float) r3
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = defpackage.tu0.G(r7)
            float r8 = (float) r4
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = defpackage.tu0.G(r8)
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r6 = r6 * r9
            int r6 = defpackage.tu0.G(r6)
            r5.setPaddingRelative(r7, r8, r6, r0)
        L_0x0150:
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -1
            r8 = -2
            r6.<init>(r7, r8)
            r11.addView(r5, r6)
            kpa r6 = new kpa
            r6.<init>(r2, r5)
            r1.add(r6)
            if (r13 == 0) goto L_0x0038
            r13.invoke(r2, r5)
            goto L_0x0038
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt3.a(java.util.List, a66):void");
    }

    public final ArrayList<kpa> getActions() {
        return this.b;
    }

    public final sme getCustomTheme() {
        bc7 bc7 = o[0];
        return (sme) this.c.b;
    }

    public final void setCustomTheme(sme sme) {
        this.c.o1(this, o[0], sme);
    }

    public final void z(sme sme) {
        int i;
        int i2;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            kpa kpa = (kpa) it.next();
            st3 st3 = (st3) kpa.a;
            View view = (View) kpa.b;
            if (st3 instanceof st3) {
                view.setBackground(hm9.L(getCurrentTheme().m, getCurrentTheme().i));
                AppCompatTextView appCompatTextView = (AppCompatTextView) view;
                Drawable drawable = (Drawable) ys.f0(0, appCompatTextView.getCompoundDrawables());
                if (drawable != null) {
                    sme currentTheme = getCurrentTheme();
                    rme rme = st3.c;
                    if (rme != null) {
                        Integer num = (Integer) ((Map) currentTheme.f.T.getValue()).get(rme);
                        if (num != null) {
                            i2 = num.intValue();
                            ngg.G(drawable, i2);
                        }
                    } else {
                        currentTheme.getClass();
                    }
                    i2 = Integer.valueOf(getCurrentTheme().w).intValue();
                    ngg.G(drawable, i2);
                }
                sme currentTheme2 = getCurrentTheme();
                rme rme2 = st3.d;
                if (rme2 != null) {
                    Integer num2 = (Integer) ((Map) currentTheme2.f.T.getValue()).get(rme2);
                    if (num2 != null) {
                        i = num2.intValue();
                        appCompatTextView.setTextColor(i);
                    }
                } else {
                    currentTheme2.getClass();
                }
                i = Integer.valueOf(getCurrentTheme().F).intValue();
                appCompatTextView.setTextColor(i);
            }
        }
    }
}
