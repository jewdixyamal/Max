package defpackage;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: wid  reason: default package */
public final class wid extends LinearLayout implements kre {
    public final s5a a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView o;
    public final AppCompatTextView s0;
    public final LinearLayout t0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wid(android.content.Context r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r0.<init>(r1, r2)
            s5a r3 = new s5a
            r3.<init>(r1)
            int r4 = defpackage.lha.k
            r3.setId(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 96
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r5
            int r6 = defpackage.tu0.G(r6)
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r5 = r5 * r7
            int r5 = defpackage.tu0.G(r5)
            r4.<init>(r6, r5)
            r5 = 1
            r4.gravity = r5
            r6 = 12
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = defpackage.tu0.G(r7)
            r4.bottomMargin = r7
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = defpackage.tu0.G(r6)
            r4.topMargin = r6
            r3.setLayoutParams(r4)
            j5a r4 = defpackage.j5a.a
            r3.setAvatarShape(r4)
            r0.a = r3
            androidx.appcompat.widget.AppCompatTextView r4 = new androidx.appcompat.widget.AppCompatTextView
            r4.<init>(r1, r2)
            int r6 = defpackage.lha.n
            r4.setId(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            r8 = 6
            float r8 = (float) r8
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = defpackage.tu0.G(r8)
            r6.bottomMargin = r8
            r4.setLayoutParams(r6)
            r6 = 20
            float r6 = (float) r6
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r6
            int r8 = defpackage.tu0.G(r8)
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r9 * r6
            int r9 = defpackage.tu0.G(r9)
            int r10 = r4.getPaddingTop()
            int r11 = r4.getPaddingBottom()
            r4.setPaddingRelative(r8, r10, r9, r11)
            r4.setGravity(r5)
            kqe r8 = defpackage.i4f.b
            r8.b(r4, defpackage.du4.b)
            pq9 r8 = defpackage.qp4.u0
            fka r9 = r8.j(r4)
            xoe r9 = r9.getText()
            int r9 = r9.e
            r4.setTextColor(r9)
            r9 = 2
            r4.setMaxLines(r9)
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r10)
            r0.b = r4
            androidx.appcompat.widget.AppCompatTextView r11 = new androidx.appcompat.widget.AppCompatTextView
            r11.<init>(r1, r2)
            int r12 = defpackage.lha.p
            r11.setId(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r7, r7)
            r11.setLayoutParams(r12)
            r11.setGravity(r5)
            kqe r12 = defpackage.i4f.n
            r12.b(r11, defpackage.du4.b)
            fka r13 = r8.j(r11)
            xoe r13 = r13.getText()
            int r13 = r13.j
            r11.setTextColor(r13)
            r0.c = r11
            androidx.appcompat.widget.AppCompatTextView r13 = new androidx.appcompat.widget.AppCompatTextView
            r13.<init>(r1, r2)
            int r14 = defpackage.lha.m
            r13.setId(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r7, r7)
            r15 = 4
            float r15 = (float) r15
            android.content.res.Resources r16 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r16.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r9 * r15
            int r9 = defpackage.tu0.G(r9)
            r14.setMarginStart(r9)
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r15 = r15 * r9
            int r9 = defpackage.tu0.G(r15)
            r14.setMarginEnd(r9)
            r13.setLayoutParams(r14)
            java.lang.String r9 = "·"
            r13.setText(r9)
            r13.setGravity(r5)
            r12.b(r13, defpackage.du4.b)
            fka r9 = r8.j(r13)
            xoe r9 = r9.getText()
            int r9 = r9.h
            r13.setTextColor(r9)
            r0.o = r13
            androidx.appcompat.widget.AppCompatTextView r9 = new androidx.appcompat.widget.AppCompatTextView
            r9.<init>(r1, r2)
            int r2 = defpackage.lha.o
            r9.setId(r2)
            t53 r2 = new t53
            r2.<init>(r7, r7)
            r9.setLayoutParams(r2)
            r9.setGravity(r5)
            r12.b(r9, defpackage.du4.b)
            fka r2 = r8.j(r9)
            xoe r2 = r2.getText()
            int r2 = r2.j
            r9.setTextColor(r2)
            r9.setEllipsize(r10)
            r9.setMaxLines(r5)
            r0.s0 = r9
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r1)
            int r1 = defpackage.lha.l
            r2.setId(r1)
            t53 r1 = new t53
            r1.<init>(r7, r7)
            r2.setLayoutParams(r1)
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r6
            int r1 = defpackage.tu0.G(r1)
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = defpackage.tu0.G(r6)
            int r8 = r2.getPaddingTop()
            int r10 = r2.getPaddingBottom()
            r2.setPaddingRelative(r1, r8, r6, r10)
            r1 = 0
            r2.setOrientation(r1)
            r2.addView(r11)
            r2.addView(r13)
            r2.addView(r9)
            r0.t0 = r2
            int r6 = defpackage.lha.j
            r0.setId(r6)
            t53 r6 = new t53
            r8 = -1
            r6.<init>(r8, r7)
            r7 = 172(0xac, float:2.41E-43)
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = defpackage.tu0.G(r7)
            r0.setMinimumHeight(r7)
            r7 = 2
            r6.a = r7
            r7 = -1097229926(0xffffffffbe99999a, float:-0.3)
            r6.b = r7
            r7 = 24
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = defpackage.tu0.G(r7)
            r6.bottomMargin = r7
            r0.setLayoutParams(r6)
            r0.setClipToPadding(r1)
            r0.setGravity(r5)
            r0.setOrientation(r5)
            r0.addView(r3)
            r0.addView(r4)
            r0.addView(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wid.<init>(android.content.Context):void");
    }

    private final void setDivider(boolean z) {
        this.o.setVisibility(z ? 0 : 8);
    }

    private final void setNickname(String str) {
        AppCompatTextView appCompatTextView = this.s0;
        int i = 0;
        if (!(true ^ (str == null || str.length() == 0))) {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(str);
    }

    private final void setPhoneNumber(String str) {
        AppCompatTextView appCompatTextView = this.c;
        int i = 0;
        if (!(true ^ (str == null || str.length() == 0))) {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        if (str == null) {
            str = "";
        }
        appCompatTextView.setText(str);
    }

    public final void onThemeChanged(fka fka) {
        this.b.setTextColor(fka.getText().e);
        this.c.setTextColor(fka.getText().j);
        this.s0.setTextColor(fka.getText().j);
        this.o.setTextColor(fka.getText().h);
    }

    public void setAlpha(float f) {
        this.t0.setAlpha(f);
        this.a.setAlpha(f);
    }

    public final void setAvatarClickedListener(k56 k56) {
        tu0.K(this.a, 300, new m6(23, k56));
    }

    public final void setNicknameClickListener(k56 k56) {
        tu0.K(this.s0, 300, new m6(22, k56));
    }

    public final void setTopBarContent(did did) {
        s5a.i(this.a, did.b, Long.valueOf(did.a), did.d);
        this.b.setText(did.c);
        String str = did.e;
        setPhoneNumber(str);
        String str2 = did.f;
        setNickname(str2);
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                z = true;
            }
        }
        setDivider(z);
    }

    public final void setUserPhoneClickListener(k56 k56) {
        tu0.K(this.c, 300, new m6(21, k56));
    }
}
