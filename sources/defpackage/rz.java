package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* renamed from: rz  reason: default package */
public final class rz {
    public static final int w = ((int) vl.o.getResources().getDimension(jtb.attach_drawable));
    public static final Drawable x = vl.o.getResources().getDrawable(gpc.w);
    public static final Drawable y = vl.o.getResources().getDrawable(woc.B0);
    public static final Drawable z = vl.o.getResources().getDrawable(gpc.V);
    public final r20 a = new r20(vl.o);
    public final r20 b;
    public final r20 c;
    public final ed3 d;
    public final o20 e;
    public final bk4 f;
    public final Context g;
    public final qz h;
    public l20 i;
    public es8 j;
    public boolean k;
    public boolean l;
    public VideoInfoTextView m;
    public VideoPlayerSeekBar n;
    public boolean o;
    public final GradientDrawable p;
    public final sme q;
    public boolean r;
    public LiveVideoPlaceHolderView s;
    public sd7 t;
    public float[] u;
    public e52 v;

    public rz(View view, qz qzVar) {
        r20 r20 = new r20(vl.o);
        this.b = r20;
        r20 r202 = new r20(vl.o, gpc.V);
        this.c = r202;
        this.k = false;
        this.o = true;
        ed3 b2 = vl.b();
        this.d = b2;
        this.g = view.getContext();
        this.e = ((y8a) b2).d();
        this.f = bk4.b();
        this.h = qzVar;
        r20.setCallback(view);
        r202.setCallback(view);
        Context context = view.getContext();
        khe khe = sme.a0;
        sme R = fm9.R(context);
        this.q = R;
        this.p = hm9.S(Integer.valueOf(R.r), (Integer) null, (Integer) null);
        Drawable drawable = x;
        int i2 = R.t;
        ngg.G(drawable, i2);
        ngg.G(z, i2);
        ngg.G(y, i2);
    }

    public final void a(la6 la6, fm9 fm9) {
        boolean N = s5c.N(this.i);
        l20 l20 = this.i;
        boolean z2 = false;
        if (l20.a == g20.c || N) {
            x10 x10 = N ? l20.j.d.b : l20.b;
            boolean z3 = l20.o.a() || this.i.o.b();
            if (x10.s0 == 0 || x10.X || (z3 && !h(x10))) {
                la6.i((Drawable) null, 3);
            } else {
                la6.i(this.a, 3);
            }
        } else {
            la6.i((Drawable) null, 3);
        }
        if (this.v != null && s5c.U(this.i, this.j)) {
            z2 = true;
        }
        BitmapDrawable b2 = this.e.b(this.i, z2);
        if (b2 != null) {
            la6.i(new psc(b2, fm9), 1);
        } else {
            la6.i((Drawable) null, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01fd, code lost:
        if (defpackage.oag.d((r5.B0 == null || (r5 = r5.F0) == null) ? null : r5.r, r0.i.r) != false) goto L_0x01ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x027c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.graphics.Canvas r18, android.graphics.Rect r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            l20 r3 = r0.i
            g20 r4 = r3.a
            g20 r5 = defpackage.g20.c
            vx8 r6 = defpackage.vx8.EDITED
            android.graphics.drawable.GradientDrawable r7 = r0.p
            r20 r9 = r0.b
            android.graphics.drawable.Drawable r10 = x
            r11 = 0
            int r13 = w
            if (r4 == r5) goto L_0x0020
            boolean r3 = defpackage.s5c.N(r3)
            if (r3 == 0) goto L_0x0024
        L_0x0020:
            r5 = r6
            r4 = r9
            goto L_0x02e0
        L_0x0024:
            l20 r3 = r0.i
            g20 r4 = r3.a
            g20 r5 = defpackage.g20.o
            if (r4 == r5) goto L_0x0032
            boolean r3 = defpackage.s5c.P(r3)
            if (r3 == 0) goto L_0x0498
        L_0x0032:
            int r3 = r19.centerX()
            int r4 = r19.centerY()
            l20 r5 = r0.i
            boolean r5 = defpackage.s5c.P(r5)
            if (r5 == 0) goto L_0x004b
            l20 r5 = r0.i
            s10 r5 = r5.j
            l20 r5 = r5.d
            k20 r5 = r5.d
            goto L_0x004f
        L_0x004b:
            l20 r5 = r0.i
            k20 r5 = r5.d
        L_0x004f:
            l20 r8 = r0.i
            boolean r8 = defpackage.s5c.P(r8)
            android.graphics.drawable.Drawable r14 = z
            if (r8 != 0) goto L_0x018e
            l20 r8 = r0.i
            k20 r15 = r8.d
            r20 = r5
            r16 = r6
            long r5 = r15.a
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x0069
            goto L_0x0190
        L_0x0069:
            boolean r5 = defpackage.s5c.R(r8)
            if (r5 != 0) goto L_0x0159
            l20 r5 = r0.i
            k20 r6 = r5.d
            r15 = r9
            long r8 = r6.a
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0084
            d20 r5 = r5.o
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x0084
            goto L_0x015a
        L_0x0084:
            l20 r5 = r0.i
            d20 r5 = r5.o
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x00cc
            l20 r5 = r0.i
            k20 r5 = r5.d
            long r5 = r5.a
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x00cc
            int r5 = r10.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r6 = r10.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r4 - r6
            int r8 = r10.getIntrinsicWidth()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r9 = r10.getIntrinsicHeight()
            int r9 = r9 / 2
            int r9 = r9 + r4
            r10.setBounds(r5, r6, r8, r9)
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            r7.setBounds(r5, r6, r3, r13)
            r7.draw(r1)
            r10.draw(r1)
            goto L_0x0231
        L_0x00cc:
            l20 r5 = r0.i
            d20 r5 = r5.o
            boolean r5 = r5.c()
            if (r5 != 0) goto L_0x0125
            l20 r5 = r0.i
            d20 r5 = r5.o
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x0125
            l20 r5 = r0.i
            k20 r5 = r5.d
            boolean r6 = r5.g
            if (r6 != 0) goto L_0x0125
            java.lang.String r5 = r5.h
            boolean r5 = defpackage.oag.t(r5)
            if (r5 != 0) goto L_0x00f1
            goto L_0x0125
        L_0x00f1:
            int r5 = r10.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r6 = r10.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r4 - r6
            int r8 = r10.getIntrinsicWidth()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r9 = r10.getIntrinsicHeight()
            int r9 = r9 / 2
            int r9 = r9 + r4
            r10.setBounds(r5, r6, r8, r9)
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            r7.setBounds(r5, r6, r3, r13)
            r7.draw(r1)
            r10.draw(r1)
            goto L_0x0231
        L_0x0125:
            int r5 = r14.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r6 = r14.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r4 - r6
            int r8 = r14.getIntrinsicWidth()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r9 = r14.getIntrinsicHeight()
            int r9 = r9 / 2
            int r9 = r9 + r4
            r14.setBounds(r5, r6, r8, r9)
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            r7.setBounds(r5, r6, r3, r13)
            r7.draw(r1)
            r14.draw(r1)
            goto L_0x0231
        L_0x0159:
            r15 = r9
        L_0x015a:
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            r4 = r15
            r4.setBounds(r5, r6, r3, r13)
            l20 r3 = r0.i
            float r3 = r3.q
            r5 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r5
            int r3 = (int) r3
            r0.g(r3)
            l20 r3 = r0.i
            k20 r3 = r3.d
            long r5 = r3.a
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x0188
            es8 r3 = r0.j
            cu8 r3 = r3.a
            vx8 r3 = r3.v0
            r5 = r16
            if (r3 == r5) goto L_0x0186
            goto L_0x0188
        L_0x0186:
            r8 = 0
            goto L_0x0189
        L_0x0188:
            r8 = 1
        L_0x0189:
            r4.b(r1, r8)
            goto L_0x0231
        L_0x018e:
            r20 = r5
        L_0x0190:
            boolean r5 = r0.o
            if (r5 == 0) goto L_0x0231
            l20 r5 = r0.i
            boolean r5 = defpackage.s5c.R(r5)
            if (r5 == 0) goto L_0x01c1
            l20 r5 = r0.i
            boolean r5 = defpackage.s5c.P(r5)
            if (r5 != 0) goto L_0x01c1
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            r20 r4 = r0.c
            r4.setBounds(r5, r6, r3, r13)
            l20 r3 = r0.i
            float r3 = r3.q
            r5 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r5
            int r3 = (int) r3
            r4.setLevel(r3)
            r3 = 1
            r4.b(r1, r3)
            goto L_0x0231
        L_0x01c1:
            r5 = r20
            boolean r5 = r5.o
            if (r5 != 0) goto L_0x01ff
            ed3 r5 = r0.d
            y8a r5 = (defpackage.y8a) r5
            ye8 r6 = r5.k()
            boolean r6 = r6.q()
            if (r6 == 0) goto L_0x01ff
            es8 r6 = r0.j
            if (r6 == 0) goto L_0x01ff
            cu8 r6 = r6.a
            int r6 = r6.b()
            r8 = 1
            if (r6 != r8) goto L_0x01ff
            ye8 r5 = r5.k()
            o1b r5 = r5.u0
            lj9 r6 = r5.B0
            if (r6 == 0) goto L_0x01f4
            l20 r5 = r5.F0
            if (r5 != 0) goto L_0x01f1
            goto L_0x01f4
        L_0x01f1:
            java.lang.String r5 = r5.r
            goto L_0x01f5
        L_0x01f4:
            r5 = 0
        L_0x01f5:
            l20 r6 = r0.i
            java.lang.String r6 = r6.r
            boolean r5 = defpackage.oag.d(r5, r6)
            if (r5 == 0) goto L_0x0231
        L_0x01ff:
            int r5 = r14.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r3 - r5
            int r6 = r14.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r4 - r6
            int r8 = r14.getIntrinsicWidth()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r9 = r14.getIntrinsicHeight()
            int r9 = r9 / 2
            int r9 = r9 + r4
            r14.setBounds(r5, r6, r8, r9)
            int r13 = r13 / 2
            int r5 = r3 - r13
            int r6 = r4 - r13
            int r3 = r3 + r13
            int r13 = r13 + r4
            r7.setBounds(r5, r6, r3, r13)
            r7.draw(r1)
            r14.draw(r1)
        L_0x0231:
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r3 = r0.s
            if (r3 == 0) goto L_0x0240
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0240
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r3 = r0.s
            r3.draw(r1)
        L_0x0240:
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r3 = r0.n
            bk4 r4 = r0.f
            if (r3 == 0) goto L_0x0272
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0272
            l20 r3 = r0.i
            boolean r3 = defpackage.s5c.w(r3)
            if (r3 == 0) goto L_0x0272
            r18.save()
            int r3 = r2.left
            int r5 = r4.e
            int r3 = r3 + r5
            float r3 = (float) r3
            int r5 = r2.bottom
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r6 = r0.n
            int r6 = r6.getMeasuredHeight()
            int r5 = r5 - r6
            float r5 = (float) r5
            r1.translate(r3, r5)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r3 = r0.n
            r3.draw(r1)
            r18.restore()
        L_0x0272:
            ru.ok.messages.views.widgets.VideoInfoTextView r3 = r0.m
            if (r3 == 0) goto L_0x0498
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0498
            r18.save()
            r4.getClass()
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = (int) r3
            int r4 = defpackage.fk4.b(r3)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r5 = r0.n
            if (r5 == 0) goto L_0x029a
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x029a
            r4 = 1086324736(0x40c00000, float:6.0)
            int r4 = (int) r4
            int r4 = defpackage.fk4.b(r4)
        L_0x029a:
            ru.ok.messages.views.widgets.VideoInfoTextView r5 = r0.m
            boolean r5 = defpackage.c54.K(r5)
            if (r5 == 0) goto L_0x02c0
            int r5 = r2.right
            ru.ok.messages.views.widgets.VideoInfoTextView r6 = r0.m
            int r6 = r6.getMeasuredWidth()
            int r5 = r5 - r6
            int r3 = defpackage.fk4.b(r3)
            int r5 = r5 - r3
            float r3 = (float) r5
            int r2 = r2.bottom
            ru.ok.messages.views.widgets.VideoInfoTextView r5 = r0.m
            int r5 = r5.getMeasuredHeight()
            int r2 = r2 - r5
            int r2 = r2 - r4
            float r2 = (float) r2
            r1.translate(r3, r2)
            goto L_0x02d6
        L_0x02c0:
            int r5 = r2.left
            int r3 = defpackage.fk4.b(r3)
            int r3 = r3 + r5
            float r3 = (float) r3
            int r2 = r2.bottom
            ru.ok.messages.views.widgets.VideoInfoTextView r5 = r0.m
            int r5 = r5.getMeasuredHeight()
            int r2 = r2 - r5
            int r2 = r2 - r4
            float r2 = (float) r2
            r1.translate(r3, r2)
        L_0x02d6:
            ru.ok.messages.views.widgets.VideoInfoTextView r0 = r0.m
            r0.draw(r1)
            r18.restore()
            goto L_0x0498
        L_0x02e0:
            int r3 = r19.centerX()
            int r2 = r19.centerY()
            l20 r6 = r0.i
            boolean r6 = defpackage.s5c.N(r6)
            if (r6 == 0) goto L_0x02f9
            l20 r8 = r0.i
            s10 r8 = r8.j
            l20 r8 = r8.d
            x10 r8 = r8.b
            goto L_0x02fd
        L_0x02f9:
            l20 r8 = r0.i
            x10 r8 = r8.b
        L_0x02fd:
            long r14 = r8.s0
            int r9 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x033d
            l20 r9 = r0.i
            d20 r9 = r9.o
            boolean r9 = r9.b()
            if (r9 != 0) goto L_0x033d
            l20 r9 = r0.i
            d20 r9 = r9.o
            boolean r9 = r9.c()
            if (r9 != 0) goto L_0x033d
            l20 r6 = r0.i
            float r6 = r6.q
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r7
            int r6 = (int) r6
            r0.g(r6)
            int r13 = r13 / 2
            int r6 = r3 - r13
            int r7 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r4.setBounds(r6, r7, r3, r13)
            es8 r0 = r0.j
            cu8 r0 = r0.a
            vx8 r0 = r0.v0
            if (r0 == r5) goto L_0x0337
            r8 = 1
            goto L_0x0338
        L_0x0337:
            r8 = 0
        L_0x0338:
            r4.b(r1, r8)
            goto L_0x0498
        L_0x033d:
            l20 r5 = r0.i
            d20 r5 = r5.o
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x036b
            java.lang.String r5 = r8.t0
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x036b
            l20 r5 = r0.i
            float r5 = r5.q
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r6
            int r5 = (int) r5
            r0.g(r5)
            int r13 = r13 / 2
            int r0 = r3 - r13
            int r5 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r4.setBounds(r0, r5, r3, r13)
            r0 = 1
            r4.b(r1, r0)
            goto L_0x0498
        L_0x036b:
            if (r6 != 0) goto L_0x03ab
            l20 r4 = r0.i
            d20 r4 = r4.o
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x03ab
            int r0 = r10.getIntrinsicWidth()
            int r0 = r0 / 2
            int r0 = r3 - r0
            int r4 = r10.getIntrinsicHeight()
            int r4 = r4 / 2
            int r4 = r2 - r4
            int r5 = r10.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r5 + r3
            int r6 = r10.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r6 + r2
            r10.setBounds(r0, r4, r5, r6)
            int r13 = r13 / 2
            int r0 = r3 - r13
            int r4 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r7.setBounds(r0, r4, r3, r13)
            r7.draw(r1)
            r10.draw(r1)
            goto L_0x0498
        L_0x03ab:
            if (r6 != 0) goto L_0x03f7
            l20 r4 = r0.i
            d20 r4 = r4.o
            boolean r4 = r4.b()
            if (r4 == 0) goto L_0x03f7
            boolean r4 = r0.h(r8)
            if (r4 != 0) goto L_0x03f7
            long r4 = r8.s0
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x03f7
            int r0 = r10.getIntrinsicWidth()
            int r0 = r0 / 2
            int r0 = r3 - r0
            int r4 = r10.getIntrinsicHeight()
            int r4 = r4 / 2
            int r4 = r2 - r4
            int r5 = r10.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r5 + r3
            int r6 = r10.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r6 + r2
            r10.setBounds(r0, r4, r5, r6)
            int r13 = r13 / 2
            int r0 = r3 - r13
            int r4 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r7.setBounds(r0, r4, r3, r13)
            r7.draw(r1)
            r10.draw(r1)
            goto L_0x0498
        L_0x03f7:
            l20 r4 = r0.i
            d20 r4 = r4.o
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x045c
            l20 r4 = r0.i
            d20 r4 = r4.o
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x045c
            l20 r4 = r0.i
            d20 r4 = r4.o
            boolean r4 = r4.d()
            if (r4 != 0) goto L_0x045c
            boolean r4 = r8.X
            if (r4 == 0) goto L_0x045c
            qz r4 = r0.h
            if (r4 == 0) goto L_0x045c
            l20 r5 = r0.i
            boolean r4 = r4.j(r5)
            if (r4 != 0) goto L_0x045c
            if (r20 != 0) goto L_0x045c
            android.graphics.drawable.Drawable r0 = y
            int r4 = r0.getIntrinsicWidth()
            int r4 = r4 / 2
            int r4 = r3 - r4
            int r5 = r0.getIntrinsicHeight()
            int r5 = r5 / 2
            int r5 = r2 - r5
            int r6 = r0.getIntrinsicWidth()
            int r6 = r6 / 2
            int r6 = r6 + r3
            int r8 = r0.getIntrinsicHeight()
            int r8 = r8 / 2
            int r8 = r8 + r2
            r0.setBounds(r4, r5, r6, r8)
            int r13 = r13 / 2
            int r4 = r3 - r13
            int r5 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r7.setBounds(r4, r5, r3, r13)
            r7.draw(r1)
            r0.draw(r1)
            goto L_0x0498
        L_0x045c:
            if (r6 == 0) goto L_0x0462
            boolean r4 = r0.l
            if (r4 == 0) goto L_0x0498
        L_0x0462:
            boolean r0 = r0.k
            if (r0 == 0) goto L_0x0498
            int r0 = r10.getIntrinsicWidth()
            int r0 = r0 / 2
            int r0 = r3 - r0
            int r4 = r10.getIntrinsicHeight()
            int r4 = r4 / 2
            int r4 = r2 - r4
            int r5 = r10.getIntrinsicWidth()
            int r5 = r5 / 2
            int r5 = r5 + r3
            int r6 = r10.getIntrinsicHeight()
            int r6 = r6 / 2
            int r6 = r6 + r2
            r10.setBounds(r0, r4, r5, r6)
            int r13 = r13 / 2
            int r0 = r3 - r13
            int r4 = r2 - r13
            int r3 = r3 + r13
            int r13 = r13 + r2
            r7.setBounds(r0, r4, r3, r13)
            r7.draw(r1)
            r10.draw(r1)
        L_0x0498:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz.b(android.graphics.Canvas, android.graphics.Rect, boolean):void");
    }

    public final e2b c(mq4 mq4, boolean z2, boolean z3, boolean z4) {
        e2b a2 = s36.a.get();
        l20 l20 = this.i;
        g20 g20 = l20.a;
        g20 g202 = g20.c;
        x10 x10 = l20.b;
        boolean z5 = false;
        a2.j = g20 == g202 && x10.X;
        this.l = false;
        String str = l20.s;
        ed3 ed3 = this.d;
        wv6 wv6 = null;
        if (g20 != g202) {
            g20 g203 = g20.o;
            o20 o20 = this.e;
            if (g20 == g203) {
                Uri a3 = o20.a(l20);
                if (a3 != null) {
                    a2.e = wv6.a(a3);
                }
            } else if (g20 == g20.Y) {
                a2.e = wv6.a(kk5.r(l20.f.b));
                a2.j = true;
            } else if (g20 == g20.u0) {
                if (s5c.P(l20)) {
                    Uri a4 = o20.a(this.i);
                    if (a4 != null) {
                        a2.e = wv6.a(a4);
                    } else {
                        a2.e = null;
                    }
                } else if (s5c.N(this.i)) {
                    if (!z2 && this.k && !this.i.o.c()) {
                        z5 = true;
                    }
                    Uri a5 = o20.a(this.i);
                    if (a5 != null) {
                        xv6 d2 = xv6.d(a5);
                        d2.b = z5 ? vv6.DISK_CACHE : vv6.FULL_FETCH;
                        if (z5) {
                            d2.n = new pz(this);
                        }
                        wv6 = d2.a();
                    }
                    if (oag.t(str) || str.toLowerCase().endsWith(".heic")) {
                        a2.e = wv6;
                    } else {
                        xv6 d3 = xv6.d(j47.N(str));
                        if (z3) {
                            d3.d = tfg.v(this.g, this.i, true);
                        }
                        if (z4) {
                            d3.l = ed3.a(9, 10);
                        }
                        a2.e = d3.a();
                        a2.f = wv6;
                    }
                }
            }
        } else if (x10.s0 <= 0 || (!l20.o.a() && ((z2 || !this.k || this.i.o.c()) && (!this.i.o.b() || h(this.i.b))))) {
            l20 l202 = this.i;
            if (l202.b.X) {
                kk5 h2 = ((y8a) vl.b()).h();
                x10 x102 = l202.b;
                File l2 = !oag.t(x102.u0) ? h2.l(x102.u0) : (oag.t(x102.t0) || !oag.t(l202.s)) ? h2.l(l202.r) : h2.l(String.valueOf(x102.s0));
                if (l2.exists()) {
                    a2.f = wv6.a(Uri.fromFile(l2));
                }
                if (!oag.t(str)) {
                    int i2 = pag.d;
                    if (!str.endsWith(".mp4")) {
                        a2.e = xv6.d(kk5.r(j47.O(str))).a();
                    }
                }
                if (z4) {
                    tp0 a6 = vl.b().a(9, 10);
                    wv6 wv62 = (wv6) a2.e;
                    if (wv62 != null) {
                        xv6 b2 = xv6.b(wv62);
                        b2.l = a6;
                        a2.e = b2.a();
                    }
                    wv6 wv63 = (wv6) a2.f;
                    if (wv63 != null) {
                        xv6 b3 = xv6.b(wv63);
                        b3.l = ed3.a(9, 10);
                        a2.f = b3.a();
                    }
                }
                return a2;
            }
            if (!oag.t(str)) {
                File file = new File(str);
                if (file.exists()) {
                    Uri uri = e9f.a;
                    a2.e = wv6.a(Uri.fromFile(file));
                }
            }
            if ((!this.i.f() || oag.t(this.i.b.a)) && oag.t(this.i.b.b)) {
                hm9.q("rz", "failed to build controller for photo attach, local id=", this.i.r);
                a2.e = null;
            } else {
                a2.e = xv6.d(kk5.r(j47.O(this.i.b.a()))).a();
            }
        } else {
            a2.e = null;
        }
        if (z4) {
            tp0 a7 = vl.b().a(9, 10);
            wv6 wv64 = (wv6) a2.e;
            if (wv64 != null) {
                xv6 b4 = xv6.b(wv64);
                b4.l = a7;
                a2.e = b4.a();
            }
        }
        a2.k = true;
        a2.l = mq4;
        return a2;
    }

    public final void d(int i2, int i3) {
        VideoInfoTextView videoInfoTextView = this.m;
        if (videoInfoTextView != null) {
            videoInfoTextView.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
            if (c54.K(this.m)) {
                VideoInfoTextView videoInfoTextView2 = this.m;
                videoInfoTextView2.layout(i2 - videoInfoTextView2.getMeasuredWidth(), 0, i2, this.m.getMeasuredHeight());
            } else {
                VideoInfoTextView videoInfoTextView3 = this.m;
                videoInfoTextView3.layout(0, 0, videoInfoTextView3.getMeasuredWidth(), this.m.getMeasuredHeight());
            }
        }
        VideoPlayerSeekBar videoPlayerSeekBar = this.n;
        if (videoPlayerSeekBar != null) {
            bk4 bk4 = this.f;
            videoPlayerSeekBar.measure(View.MeasureSpec.makeMeasureSpec(i2 - (bk4.e * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(bk4.d, 1073741824));
            VideoPlayerSeekBar videoPlayerSeekBar2 = this.n;
            videoPlayerSeekBar2.layout(0, 0, videoPlayerSeekBar2.getMeasuredWidth(), this.n.getMeasuredHeight());
        }
        LiveVideoPlaceHolderView liveVideoPlaceHolderView = this.s;
        if (liveVideoPlaceHolderView != null) {
            liveVideoPlaceHolderView.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            LiveVideoPlaceHolderView liveVideoPlaceHolderView2 = this.s;
            liveVideoPlaceHolderView2.layout(0, 0, liveVideoPlaceHolderView2.getMeasuredWidth(), this.s.getMeasuredHeight());
        }
    }

    public final boolean e(int i2, int i3, MotionEvent motionEvent) {
        qz qzVar = this.h;
        if (qzVar == null) {
            return false;
        }
        if (this.i.a == g20.a) {
            return true;
        }
        boolean z2 = Math.sqrt(Math.pow(((double) i3) - ((double) motionEvent.getY()), 2.0d) + Math.pow(((double) i2) - ((double) motionEvent.getX()), 2.0d)) <= ((double) (w / 2));
        l20 l20 = this.i;
        g20 g20 = l20.a;
        g20 g202 = g20.o;
        vx8 vx8 = vx8.EDITED;
        if (g20 == g202 || s5c.P(l20)) {
            boolean P = s5c.P(this.i);
            l20 l202 = this.i;
            if (P) {
                l202 = l202.j.d;
            }
            k20 k20 = l202.d;
            if (k20.a == 0 && this.i.o.b()) {
                return false;
            }
            if (!this.i.o.d() || k20.a != 0 || P) {
                if (!z2) {
                    return false;
                }
                qzVar.d(this.i);
            } else if (z2) {
                es8 es8 = this.j;
                if (es8.a.v0 != vx8) {
                    qzVar.e(this.i, es8);
                }
            }
            return true;
        }
        l20 l203 = this.i;
        if (l203.a != g20.c && !s5c.N(l203)) {
            return false;
        }
        x10 x10 = s5c.N(this.i) ? this.i.j.d.b : this.i.b;
        if (x10.s0 == 0 && this.i.o.b()) {
            return false;
        }
        boolean z3 = x10.X;
        if (z3 && this.i.o.c()) {
            qzVar.b(this.i);
        } else if (!z2) {
            return false;
        } else {
            if (x10.s0 == 0 && (this.i.o.d() || this.i.o.e())) {
                es8 es82 = this.j;
                if (es82.a.v0 != vx8) {
                    qzVar.e(this.i, es82);
                }
            } else if (!z3) {
                if (this.k) {
                    this.k = false;
                    qzVar.c(this.i);
                } else if (this.i.o.e() || (this.i.o.b() && h(x10))) {
                    qzVar.a(this.i);
                } else if (!this.i.o.a() && (!this.i.o.b() || h(x10))) {
                    return false;
                } else {
                    qzVar.c(this.i);
                }
            } else if (this.i.o.d()) {
                qzVar.a(this.i);
            } else {
                qzVar.b(this.i);
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r14v22, types: [androidx.constraintlayout.widget.ConstraintLayout, ru.ok.messages.video.widgets.LiveVideoPlaceHolderView] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (defpackage.oag.d(r0.r, r13.r) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.l20 r13, defpackage.es8 r14, defpackage.e52 r15) {
        /*
            r12 = this;
            l20 r0 = r12.i
            r1 = 1
            if (r0 == 0) goto L_0x000f
            java.lang.String r2 = r13.r
            java.lang.String r0 = r0.r
            boolean r0 = defpackage.oag.d(r0, r2)
            if (r0 != 0) goto L_0x0011
        L_0x000f:
            r12.r = r1
        L_0x0011:
            r12.v = r15
            r12.i = r13
            r12.j = r14
            ed3 r13 = r12.d
            y8a r13 = (defpackage.y8a) r13
            jke r13 = r13.p()
            r13.getClass()
            fke r13 = defpackage.jke.b()
            l20 r14 = r12.i
            boolean r14 = defpackage.s5c.P(r14)
            l20 r15 = r12.i
            boolean r15 = defpackage.s5c.N(r15)
            l20 r0 = r12.i
            boolean r0 = r0.f()
            r2 = 0
            if (r0 != 0) goto L_0x0041
            if (r15 == 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r12.k = r2
            goto L_0x0076
        L_0x0041:
            if (r15 == 0) goto L_0x004c
            l20 r15 = r12.i
            s10 r15 = r15.j
            l20 r15 = r15.d
            x10 r15 = r15.b
            goto L_0x0050
        L_0x004c:
            l20 r15 = r12.i
            x10 r15 = r15.b
        L_0x0050:
            boolean r15 = r15.X
            if (r15 != 0) goto L_0x0073
            l20 r15 = r12.i
            d20 r15 = r15.o
            boolean r15 = r15.e()
            if (r15 == 0) goto L_0x0073
            jyc r13 = (defpackage.jyc) r13
            v4 r13 = r13.getAccessor()
            java.lang.Class<ge2> r15 = defpackage.ge2.class
            java.lang.Object r13 = r13.c(r15)
            ge2 r13 = (defpackage.ge2) r13
            boolean r13 = r13.d()
            if (r13 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = r2
        L_0x0074:
            r12.k = r1
        L_0x0076:
            l20 r13 = r12.i
            g20 r13 = r13.a
            g20 r15 = defpackage.g20.o
            if (r13 == r15) goto L_0x0088
            if (r14 == 0) goto L_0x0081
            goto L_0x0088
        L_0x0081:
            sd7 r12 = r12.t
            defpackage.cqc.b(r12)
            goto L_0x01f6
        L_0x0088:
            ru.ok.messages.views.widgets.VideoInfoTextView r13 = r12.m
            r15 = 6
            android.content.Context r0 = r12.g
            r1 = 0
            if (r13 != 0) goto L_0x00a5
            ru.ok.messages.views.widgets.VideoInfoTextView r13 = new ru.ok.messages.views.widgets.VideoInfoTextView
            r13.<init>(r0, r1, r15)
            r12.m = r13
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -2
            r3.<init>(r4, r4)
            r13.setLayoutParams(r3)
            ru.ok.messages.views.widgets.VideoInfoTextView r13 = r12.m
            defpackage.c54.c(r13)
        L_0x00a5:
            if (r14 == 0) goto L_0x00b0
            l20 r13 = r12.i
            s10 r13 = r13.j
            l20 r13 = r13.d
            k20 r13 = r13.d
            goto L_0x00b4
        L_0x00b0:
            l20 r13 = r12.i
            k20 r13 = r13.d
        L_0x00b4:
            ed3 r14 = defpackage.vl.b()
            y8a r14 = (defpackage.y8a) r14
            p7b r14 = r14.n()
            boolean r14 = defpackage.s5c.a0(r14, r13)
            r3 = 8
            if (r14 == 0) goto L_0x00e6
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r14 = r12.s
            if (r14 != 0) goto L_0x00d4
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r14 = new ru.ok.messages.video.widgets.LiveVideoPlaceHolderView
            r14.<init>(r0)
            r14.w()
            r12.s = r14
        L_0x00d4:
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r14 = r12.s
            r14.L0 = r13
            r14.x()
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r14 = r12.s
            float[] r4 = r12.u
            r14.setCorners(r4)
            r12.i()
            goto L_0x00f2
        L_0x00e6:
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r14 = r12.s
            if (r14 == 0) goto L_0x00ed
            r14.setVisibility(r3)
        L_0x00ed:
            sd7 r14 = r12.t
            defpackage.cqc.b(r14)
        L_0x00f2:
            ru.ok.messages.views.widgets.VideoInfoTextView r14 = r12.m
            r14.getClass()
            boolean r4 = r13.g
            long r5 = r13.c
            if (r4 == 0) goto L_0x0121
            android.content.Context r4 = r14.getContext()
            int r7 = defpackage.jpc.p3
            java.lang.String r4 = r4.getString(r7)
            r14.setText(r4)
            android.content.Context r4 = r14.getContext()
            int r7 = defpackage.gpc.y0
            r8 = -1
            if (r7 == r8) goto L_0x0118
            android.graphics.drawable.Drawable r4 = defpackage.kt3.b(r4, r7)     // Catch:{ NotFoundException -> 0x011d }
            goto L_0x0119
        L_0x0118:
            r4 = r1
        L_0x0119:
            defpackage.pag.I(r4, r1, r1, r1, r14)     // Catch:{ NotFoundException -> 0x011d }
            goto L_0x0175
        L_0x011d:
            r14.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) r1, (android.graphics.drawable.Drawable) r1, (android.graphics.drawable.Drawable) r1, (android.graphics.drawable.Drawable) r1)
            goto L_0x0175
        L_0x0121:
            java.lang.String r4 = r13.h
            int r7 = r4.length()
            r8 = 0
            if (r7 <= 0) goto L_0x0143
            long r10 = r13.a
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0143
            java.lang.String r7 = r13.i
            int r8 = r7.length()
            if (r8 <= 0) goto L_0x013a
            goto L_0x0150
        L_0x013a:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r7 = r4.getHost()
            goto L_0x0150
        L_0x0143:
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x014e
            java.lang.String[] r4 = defpackage.are.b
            java.lang.String r7 = defpackage.tfg.c(r5)
            goto L_0x0150
        L_0x014e:
            java.lang.String r7 = ""
        L_0x0150:
            r14.setText(r7)
            android.content.Context r4 = r14.getContext()
            int r7 = defpackage.gpc.u0
            boolean r8 = r14.isInEditMode()
            if (r8 == 0) goto L_0x0162
            ee4 r8 = defpackage.ee4.e0
            goto L_0x016c
        L_0x0162:
            android.content.Context r8 = r14.getContext()
            khe r9 = defpackage.sme.a0
            sme r8 = defpackage.fm9.R(r8)
        L_0x016c:
            int r8 = r8.t
            android.graphics.drawable.Drawable r4 = defpackage.ngg.u(r7, r8, r4)
            defpackage.pag.I(r4, r1, r1, r1, r14)
        L_0x0175:
            java.lang.CharSequence r4 = r14.getText()
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0181
            r4 = 4
            goto L_0x0182
        L_0x0181:
            r4 = r2
        L_0x0182:
            r14.setVisibility(r4)
            l20 r14 = r12.i
            boolean r14 = defpackage.s5c.w(r14)
            if (r14 == 0) goto L_0x01ef
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r14 = r12.n
            if (r14 != 0) goto L_0x01e0
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r14 = new ru.ok.messages.video.widgets.VideoPlayerSeekBar
            r14.<init>(r0, r1, r15)
            r12.n = r14
            defpackage.c54.c(r14)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r14 = r12.n
            r14.setPadding(r2, r2, r2, r2)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r14 = r12.n
            r14.setSeekBarEnable(r2)
            android.content.res.Resources r14 = r0.getResources()
            int r15 = defpackage.gpc.R0
            android.graphics.drawable.Drawable r14 = r14.getDrawable(r15)
            android.graphics.drawable.LayerDrawable r14 = (android.graphics.drawable.LayerDrawable) r14
            r15 = 16908288(0x1020000, float:2.387723E-38)
            android.graphics.drawable.Drawable r15 = r14.findDrawableByLayerId(r15)
            sme r0 = r12.q
            int r1 = r0.r
            defpackage.ngg.G(r15, r1)
            r15 = 16908301(0x102000d, float:2.3877265E-38)
            android.graphics.drawable.Drawable r15 = r14.findDrawableByLayerId(r15)
            int r0 = r0.t
            defpackage.ngg.G(r15, r0)
            r15 = 16908303(0x102000f, float:2.387727E-38)
            android.graphics.drawable.Drawable r15 = r14.findDrawableByLayerId(r15)
            r1 = 1050253722(0x3e99999a, float:0.3)
            int r0 = defpackage.ote.b0(r0, r1)
            defpackage.ngg.G(r15, r0)
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r15 = r12.n
            r15.setProgressDrawable(r14)
        L_0x01e0:
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r12 = r12.n
            long r13 = r13.k
            int r13 = (int) r13
            long r13 = (long) r13
            int r15 = (int) r5
            r12.setMax(r15)
            int r13 = (int) r13
            r12.setProgress(r13)
            goto L_0x01f6
        L_0x01ef:
            ru.ok.messages.video.widgets.VideoPlayerSeekBar r12 = r12.n
            if (r12 == 0) goto L_0x01f6
            r12.setVisibility(r3)
        L_0x01f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz.f(l20, es8, e52):void");
    }

    public final void g(int i2) {
        boolean z2 = this.r;
        r20 r20 = this.b;
        if (z2) {
            this.r = false;
            if (r20.getLevel() == i2) {
                r20.onLevelChange(i2);
                return;
            }
        }
        r20.setLevel(i2);
    }

    public final boolean h(x10 x10) {
        return !x10.X && this.i.o.b() && !this.k && ((y8a) this.d).n().a.n() - this.i.p > 60000;
    }

    public final void i() {
        boolean z2;
        cqc.b(this.t);
        if (this.h != null) {
            p7b n2 = ((y8a) vl.b()).n();
            l20 l20 = this.i;
            if (l20 == null) {
                z2 = false;
            } else {
                z2 = s5c.Q(n2, s5c.P(l20) ? l20.j.d.d : l20.d);
            }
            if (z2) {
                r0a n3 = qy9.l(1, TimeUnit.SECONDS).n(ce.a());
                sd7 sd7 = new sd7(new ync(3, this), new xw0(21), ft.d);
                n3.a(sd7);
                this.t = sd7;
            }
        }
    }
}
