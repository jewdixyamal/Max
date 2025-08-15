package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: ht8  reason: default package */
public abstract class ht8 extends qy8 implements bv8, kk6 {
    public static final int[] R0 = {16842910, 16842919};
    public static final int[] S0 = {16842910};
    public final View I0;
    public long J0 = -1;
    public zof K0 = zof.None;
    public o00 L0;
    public final je7 M0 = tu0.r(3, new j78(7));
    public final je7 N0 = tu0.r(3, new zj7(6, this));
    public final boolean O0;
    public long P0;
    public ValueAnimator Q0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ht8(android.content.Context r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            zs8 r0 = new zs8
            r0.<init>(r4)
            r3.<init>(r0)
            r3.I0 = r5
            r1 = -1
            r3.J0 = r1
            zof r4 = defpackage.zof.None
            r3.K0 = r4
            j78 r4 = new j78
            r1 = 7
            r4.<init>(r1)
            r1 = 3
            je7 r4 = defpackage.tu0.r(r1, r4)
            r3.M0 = r4
            zj7 r4 = new zj7
            r2 = 6
            r4.<init>(r2, r3)
            je7 r4 = defpackage.tu0.r(r1, r4)
            r3.N0 = r4
            r4 = 6
            float r4 = (float) r4
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r4 = r4 * r1
            int r4 = defpackage.tu0.G(r4)
            r1 = 0
            r0.setPaddingRelative(r4, r1, r4, r1)
            ys8 r4 = new ys8
            r4.<init>()
            android.view.View r2 = r0.u0
            if (r2 == 0) goto L_0x004c
            r0.removeView(r2)
        L_0x004c:
            r0.u0 = r5
            r0.addView(r5, r4)
            r5.setClipChildren(r1)
            r4 = 1
            r3.O0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht8.<init>(android.content.Context, android.view.ViewGroup):void");
    }

    public static boolean Q(ry8 ry8, o00 o00) {
        if (ry8 == null) {
            return false;
        }
        x38 x38 = o00 instanceof x38 ? (x38) o00 : null;
        int i = ry8.a;
        boolean z = x38 != null && x38.c() && ry8.c(i);
        return ((i & 4096) == 0 && (i & 128) == 0 && (i & 16384) == 0 && (32768 & i) == 0 && ((i & 2) == 0 || z) && ((!ry8.b(i) || z) && (((i & 4) == 0 || z) && (i & 65536) == 0))) ? false : true;
    }

    public void D() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(one.me.messages.list.loader.MessageModel r20, java.util.List r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r1.I0
            ry8 r3 = new ry8
            r3.<init>(r2)
            r0.H0 = r3
            long r2 = r1.a
            r0.J0 = r2
            long r2 = r1.b
            r0.P0 = r2
            tz r2 = r1.u0
            o00 r3 = r2.d
            r0.L0 = r3
            zof r3 = r1.Z
            r0.K0 = r3
            android.view.View r4 = r0.a
            r5 = r4
            zs8 r5 = (defpackage.zs8) r5
            ow8 r6 = r1.H0
            if (r6 == 0) goto L_0x002b
            long r6 = r6.a
            goto L_0x002d
        L_0x002b:
            r6 = 0
        L_0x002d:
            r5.setAvatarId(r6)
            ow8 r6 = r1.H0
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0038
            r6 = r8
            goto L_0x0039
        L_0x0038:
            r6 = r7
        L_0x0039:
            r5.setOffsetBubbleByAvatar(r6)
            int r5 = r20.hashCode()
            android.view.View r6 = r0.I0
            r6.setId(r5)
            boolean r5 = r6 instanceof defpackage.aoa
            if (r5 == 0) goto L_0x004d
            r5 = r6
            aoa r5 = (defpackage.aoa) r5
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r2 = r2.b
            if (r5 == 0) goto L_0x0055
            r5.setDependOnOutsideView(r2)
        L_0x0055:
            boolean r5 = r21.isEmpty()
            r5 = r5 ^ r8
            pq9 r10 = defpackage.qp4.u0
            by8 r12 = r1.w0
            boolean r13 = r1.v0
            java.lang.CharSequence r14 = r1.X
            if (r5 == 0) goto L_0x01e6
            java.util.Iterator r5 = r21.iterator()
        L_0x0068:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x01e2
            java.lang.Object r15 = r5.next()
            boolean r9 = r15 instanceof defpackage.zw8
            if (r9 == 0) goto L_0x0068
            zw8 r15 = (defpackage.zw8) r15
            boolean r9 = r15.a
            if (r9 == 0) goto L_0x008c
            boolean r9 = r6 instanceof defpackage.x5d
            if (r9 == 0) goto L_0x0084
            r9 = r6
            x5d r9 = (defpackage.x5d) r9
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            if (r9 == 0) goto L_0x008c
            android.text.Layout r11 = r1.F0
            r9.setSenderName(r11)
        L_0x008c:
            boolean r9 = r15.b
            if (r9 == 0) goto L_0x00a0
            boolean r9 = r6 instanceof defpackage.u5d
            if (r9 == 0) goto L_0x0098
            r9 = r6
            u5d r9 = (defpackage.u5d) r9
            goto L_0x0099
        L_0x0098:
            r9 = 0
        L_0x0099:
            if (r9 == 0) goto L_0x00a0
            android.text.Layout r11 = r1.G0
            r9.setAlias(r11)
        L_0x00a0:
            boolean r9 = r15.d
            if (r9 == 0) goto L_0x00b2
            boolean r9 = r6 instanceof defpackage.k34
            if (r9 == 0) goto L_0x00ac
            r9 = r6
            k34 r9 = (defpackage.k34) r9
            goto L_0x00ad
        L_0x00ac:
            r9 = 0
        L_0x00ad:
            if (r9 == 0) goto L_0x00b2
            r9.setDateViewStatus(r3)
        L_0x00b2:
            boolean r9 = r15.c
            if (r9 == 0) goto L_0x00c4
            boolean r9 = r6 instanceof defpackage.k34
            if (r9 == 0) goto L_0x00be
            r9 = r6
            k34 r9 = (defpackage.k34) r9
            goto L_0x00bf
        L_0x00be:
            r9 = 0
        L_0x00bf:
            if (r9 == 0) goto L_0x00c4
            r9.g(r14, r7)
        L_0x00c4:
            boolean r9 = r15.g
            if (r9 == 0) goto L_0x00d6
            boolean r9 = r6 instanceof defpackage.k34
            if (r9 == 0) goto L_0x00d0
            r9 = r6
            k34 r9 = (defpackage.k34) r9
            goto L_0x00d1
        L_0x00d0:
            r9 = 0
        L_0x00d1:
            if (r9 == 0) goto L_0x00d6
            r9.g(r14, r13)
        L_0x00d6:
            boolean r9 = r15.e
            if (r9 == 0) goto L_0x00f7
            boolean r9 = r6 instanceof defpackage.qpe
            if (r9 == 0) goto L_0x00e2
            r9 = r6
            qpe r9 = (defpackage.qpe) r9
            goto L_0x00e3
        L_0x00e2:
            r9 = 0
        L_0x00e3:
            if (r9 == 0) goto L_0x00f7
            if (r12 == 0) goto L_0x00eb
            r9.setTextMessageLayout(r12)
            goto L_0x00f7
        L_0x00eb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "messageTextLayout is null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f7:
            boolean r9 = r15.f
            if (r9 == 0) goto L_0x0117
            r0.H(r1, r8)
            fka r9 = r10.j(r4)
            nr2 r9 = r9.a()
            int r11 = r1.I0
            r16 = 2080374784(0x7c000000, float:2.658456E36)
            r11 = r11 & r16
            boolean r11 = defpackage.ns0.b(r11)
            is0 r9 = r9.d(r11)
            r0.a(r9)
        L_0x0117:
            boolean r9 = r15.h
            if (r9 == 0) goto L_0x01ca
            o00 r9 = r0.L0
            boolean r11 = r9 instanceof defpackage.zf5
            if (r11 == 0) goto L_0x0133
            boolean r11 = r6 instanceof defpackage.gi5
            if (r11 == 0) goto L_0x0129
            r11 = r6
            gi5 r11 = (defpackage.gi5) r11
            goto L_0x012a
        L_0x0129:
            r11 = 0
        L_0x012a:
            if (r11 == 0) goto L_0x01ca
            zf5 r9 = (defpackage.zf5) r9
            r11.D(r9)
            goto L_0x01ca
        L_0x0133:
            boolean r11 = r9 instanceof defpackage.k50
            if (r11 == 0) goto L_0x0172
            boolean r11 = r6 instanceof defpackage.p50
            if (r11 == 0) goto L_0x013f
            r11 = r6
            p50 r11 = (defpackage.p50) r11
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x01ca
            k50 r9 = (defpackage.k50) r9
            java.lang.String r8 = r11.R0
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x014d
            goto L_0x0155
        L_0x014d:
            java.lang.String r8 = r9.d
            int r17 = r8.length()
            if (r17 != 0) goto L_0x0157
        L_0x0155:
            goto L_0x01ca
        L_0x0157:
            r11.R0 = r8
            u70 r8 = r11.D0
            byte[] r7 = r9.h
            r18 = r4
            r21 = r5
            long r4 = r9.j
            r8.b(r4, r7)
            androidx.appcompat.widget.AppCompatImageView r4 = r11.v0
            l50 r5 = new l50
            r7 = 0
            r5.<init>(r11, r9, r7)
            defpackage.tu0.K(r4, 300, r5)
            goto L_0x01ce
        L_0x0172:
            r18 = r4
            r21 = r5
            boolean r4 = r9 instanceof defpackage.f53
            if (r4 == 0) goto L_0x018b
            boolean r4 = r6 instanceof defpackage.z43
            if (r4 == 0) goto L_0x0182
            r4 = r6
            z43 r4 = (defpackage.z43) r4
            goto L_0x0183
        L_0x0182:
            r4 = 0
        L_0x0183:
            if (r4 == 0) goto L_0x01ce
            f53 r9 = (defpackage.f53) r9
            r4.a(r9)
            goto L_0x01ce
        L_0x018b:
            boolean r4 = r9 instanceof defpackage.vqd
            if (r4 == 0) goto L_0x01a0
            boolean r4 = r6 instanceof defpackage.wqd
            if (r4 == 0) goto L_0x0197
            r4 = r6
            wqd r4 = (defpackage.wqd) r4
            goto L_0x0198
        L_0x0197:
            r4 = 0
        L_0x0198:
            if (r4 == 0) goto L_0x01ce
            vqd r9 = (defpackage.vqd) r9
            r4.p(r9)
            goto L_0x01ce
        L_0x01a0:
            boolean r4 = r9 instanceof defpackage.bsd
            if (r4 == 0) goto L_0x01b5
            boolean r4 = r6 instanceof defpackage.csd
            if (r4 == 0) goto L_0x01ac
            r4 = r6
            csd r4 = (defpackage.csd) r4
            goto L_0x01ad
        L_0x01ac:
            r4 = 0
        L_0x01ad:
            if (r4 == 0) goto L_0x01ce
            bsd r9 = (defpackage.bsd) r9
            r4.i(r9)
            goto L_0x01ce
        L_0x01b5:
            boolean r4 = r9 instanceof defpackage.wgf
            if (r4 == 0) goto L_0x01ce
            boolean r4 = r6 instanceof defpackage.dif
            if (r4 == 0) goto L_0x01c1
            r4 = r6
            dif r4 = (defpackage.dif) r4
            goto L_0x01c2
        L_0x01c1:
            r4 = 0
        L_0x01c2:
            if (r4 == 0) goto L_0x01ce
            wgf r9 = (defpackage.wgf) r9
            r4.z(r9)
            goto L_0x01ce
        L_0x01ca:
            r18 = r4
            r21 = r5
        L_0x01ce:
            boolean r4 = r15.i
            if (r4 == 0) goto L_0x01da
            if (r2 != 0) goto L_0x01d7
            r19.R(r20)
        L_0x01d7:
            r19.G(r20)
        L_0x01da:
            r5 = r21
            r4 = r18
            r7 = 0
            r8 = 1
            goto L_0x0068
        L_0x01e2:
            r6.requestLayout()
            return
        L_0x01e6:
            r18 = r4
            boolean r2 = r6 instanceof defpackage.x5d
            if (r2 == 0) goto L_0x01f0
            r2 = r6
            x5d r2 = (defpackage.x5d) r2
            goto L_0x01f1
        L_0x01f0:
            r2 = 0
        L_0x01f1:
            if (r2 == 0) goto L_0x01f8
            android.text.Layout r4 = r1.F0
            r2.setSenderName(r4)
        L_0x01f8:
            boolean r2 = r6 instanceof defpackage.u5d
            if (r2 == 0) goto L_0x0200
            r2 = r6
            u5d r2 = (defpackage.u5d) r2
            goto L_0x0201
        L_0x0200:
            r2 = 0
        L_0x0201:
            if (r2 == 0) goto L_0x0208
            android.text.Layout r4 = r1.G0
            r2.setAlias(r4)
        L_0x0208:
            boolean r2 = r6 instanceof defpackage.k34
            if (r2 == 0) goto L_0x0210
            r2 = r6
            k34 r2 = (defpackage.k34) r2
            goto L_0x0211
        L_0x0210:
            r2 = 0
        L_0x0211:
            if (r2 == 0) goto L_0x0219
            r2.setDateViewStatus(r3)
            r2.g(r14, r13)
        L_0x0219:
            boolean r2 = r6 instanceof defpackage.jw8
            if (r2 == 0) goto L_0x022e
            cw8 r2 = r1.x0
            if (r2 == 0) goto L_0x0228
            r3 = r6
            jw8 r3 = (defpackage.jw8) r3
            r3.setLink(r2)
            goto L_0x022e
        L_0x0228:
            r2 = r6
            jw8 r2 = (defpackage.jw8) r2
            r2.l()
        L_0x022e:
            if (r12 == 0) goto L_0x023e
            boolean r2 = r6 instanceof defpackage.qpe
            if (r2 == 0) goto L_0x0238
            r9 = r6
            qpe r9 = (defpackage.qpe) r9
            goto L_0x0239
        L_0x0238:
            r9 = 0
        L_0x0239:
            if (r9 == 0) goto L_0x023e
            r9.setTextMessageLayout(r12)
        L_0x023e:
            r19.R(r20)
            r0.F(r1, r6)
            r2 = 0
            r0.H(r1, r2)
            r19.G(r20)
            r2 = r18
            fka r3 = r10.j(r2)
            nr2 r3 = r3.a()
            int r4 = r1.I0
            r5 = 2080374784(0x7c000000, float:2.658456E36)
            r4 = r4 & r5
            boolean r4 = defpackage.ns0.b(r4)
            is0 r3 = r3.d(r4)
            r0.a(r3)
            fka r2 = r10.j(r2)
            nr2 r2 = r2.a()
            v83 r2 = r2.s()
            r0.e(r2)
            r19.L(r20)
            r6.requestLayout()
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht8.E(one.me.messages.list.loader.MessageModel, java.util.List):void");
    }

    public final void G(MessageModel messageModel) {
        z07 z07 = messageModel.u0.e;
        je7 je7 = this.N0;
        if (z07 != null) {
            z07 z072 = messageModel.u0.e;
            int i = c17.v0;
            ((c17) je7.getValue()).a(messageModel.a, z072, false);
            zs8 zs8 = (zs8) this.a;
            View view = (View) je7.getValue();
            ys8 ys8 = new ys8();
            if (zs8.v0 == null) {
                zs8.v0 = view;
                zs8.addView(view, ys8);
            }
            ((View) je7.getValue()).setVisibility(0);
        } else if (je7.a()) {
            ((c17) je7.getValue()).setVisibility(8);
        }
    }

    public final void H(MessageModel messageModel, boolean z) {
        View view = this.I0;
        if (view instanceof l7c) {
            l7c l7c = (l7c) view;
            l7c.setIsIncoming(messageModel.D0);
            if (!z) {
                l7c.setStackFromEnd(!messageModel.D0 && Q(new ry8(messageModel.I0), messageModel.u0.d));
            }
            ix8 ix8 = messageModel.B0;
            if (ix8 != null) {
                l7c.f(ix8, z);
            } else {
                l7c.q(z);
            }
        }
    }

    public final void I() {
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.I0;
        nk6 nk6 = view instanceof nk6 ? (nk6) view : null;
        if (nk6 != null) {
            nk6.e((List) null, (a66) null);
        }
    }

    public final ShapeDrawable J() {
        float[] fArr;
        Drawable background = this.I0.getBackground();
        vs8 vs8 = background instanceof vs8 ? (vs8) background : null;
        if (vs8 != null) {
            float[] fArr2 = vs8.p;
            fArr = Arrays.copyOf(fArr2, fArr2.length);
        } else {
            fArr = (float[]) this.M0.getValue();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(qp4.u0.j(this.a).d().a.b.l);
        shapeDrawable.setAlpha(150);
        return shapeDrawable;
    }

    public final void K(xs8 xs8, String str) {
        o00 o00 = this.L0;
        View view = this.I0;
        if (o00 != null) {
            long j = this.J0;
            b69 b69 = (b69) xs8;
            b69.getClass();
            bc7[] bc7Arr = MessagesListWidget.X0;
            MessagesListWidget messagesListWidget = b69.a;
            if (!messagesListWidget.x0().H(o00, j, str)) {
                messagesListWidget.z0(j, view);
                return;
            }
            return;
        }
        long j2 = this.J0;
        b69 b692 = (b69) xs8;
        b692.getClass();
        bc7[] bc7Arr2 = MessagesListWidget.X0;
        b692.a.z0(j2, view);
    }

    public void L(MessageModel messageModel) {
    }

    public void M(is0 is0) {
    }

    public void O(v83 v83) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: nk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: nk6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean P(defpackage.jk6 r8, defpackage.a66 r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0007
            r7.I()
            goto L_0x0072
        L_0x0007:
            long r1 = r7.J0
            long r3 = r8.a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            android.view.View r4 = r7.I0
            java.util.List r8 = r8.b
            if (r1 != 0) goto L_0x0027
            android.animation.ValueAnimator r5 = r7.Q0
            if (r5 == 0) goto L_0x0027
            boolean r7 = r4 instanceof defpackage.nk6
            if (r7 == 0) goto L_0x0020
            r3 = r4
            nk6 r3 = (defpackage.nk6) r3
        L_0x0020:
            if (r3 == 0) goto L_0x0025
            r3.e(r8, r9)
        L_0x0025:
            r0 = r2
            goto L_0x0072
        L_0x0027:
            if (r1 != 0) goto L_0x006f
            android.graphics.drawable.ShapeDrawable r1 = r7.J()
            r4.setForeground(r1)
            android.graphics.drawable.ShapeDrawable r1 = r7.J()
            int r1 = r1.getAlpha()
            int[] r0 = new int[]{r1, r0}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r5 = 300(0x12c, double:1.48E-321)
            r0.setStartDelay(r5)
            r5 = 800(0x320, double:3.953E-321)
            r0.setDuration(r5)
            z00 r1 = new z00
            r5 = 12
            r1.<init>((int) r5, (java.lang.Object) r7)
            r0.addUpdateListener(r1)
            mf r1 = new mf
            r5 = 5
            r1.<init>((int) r5, (java.lang.Object) r7)
            r0.addListener(r1)
            r0.start()
            r7.Q0 = r0
            boolean r7 = r4 instanceof defpackage.nk6
            if (r7 == 0) goto L_0x0069
            r3 = r4
            nk6 r3 = (defpackage.nk6) r3
        L_0x0069:
            if (r3 == 0) goto L_0x0025
            r3.e(r8, r9)
            goto L_0x0025
        L_0x006f:
            r7.I()
        L_0x0072:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht8.P(jk6, a66):boolean");
    }

    public final void R(MessageModel messageModel) {
        int i;
        Drawable background = this.I0.getBackground();
        vs8 vs8 = background instanceof vs8 ? (vs8) background : null;
        if (vs8 != null) {
            boolean b = ns0.b(messageModel.I0 & 2080374784);
            is0 d = qp4.u0.j(this.a).a().d(b);
            boolean z = messageModel.u0.b;
            int i2 = d.c.a;
            int i3 = messageModel.I0;
            int i4 = i3 & 2080374784;
            if (ns0.c(i4)) {
                i = 1;
            } else if (ns0.a(i4)) {
                i = 2;
            } else if ((1073741824 & i3) != 0) {
                i = 4;
            } else if ((i3 & 536870912) != 0) {
                i = 3;
            } else {
                String d2 = ns0.d(i4);
                throw new IllegalStateException(("unknown bubble type " + d2).toString());
            }
            if (vs8.b(vs8, b, i, messageModel.t0, messageModel.s0, i2, z)) {
                vs8.invalidateSelf();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.is0 r9) {
        /*
            r8 = this;
            android.view.View r0 = r8.I0
            boolean r1 = r0 instanceof defpackage.x5d
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r0
            x5d r1 = (defpackage.x5d) r1
            goto L_0x000c
        L_0x000b:
            r1 = r2
        L_0x000c:
            ls0 r3 = r9.d
            if (r1 == 0) goto L_0x0015
            int r4 = r3.d
            r1.setSenderNameColor(r4)
        L_0x0015:
            boolean r1 = r0 instanceof defpackage.u5d
            if (r1 == 0) goto L_0x001d
            r1 = r0
            u5d r1 = (defpackage.u5d) r1
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            if (r1 == 0) goto L_0x0025
            int r3 = r3.f
            r1.setAliasColor(r3)
        L_0x0025:
            boolean r1 = r0 instanceof defpackage.qpe
            if (r1 == 0) goto L_0x002d
            r1 = r0
            qpe r1 = (defpackage.qpe) r1
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.setTextMessageColors(r9)
        L_0x0033:
            boolean r1 = r0 instanceof defpackage.jw8
            if (r1 == 0) goto L_0x003b
            r1 = r0
            jw8 r1 = (defpackage.jw8) r1
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.c(r9)
        L_0x0041:
            boolean r1 = r0 instanceof defpackage.l7c
            if (r1 == 0) goto L_0x0049
            r1 = r0
            l7c r1 = (defpackage.l7c) r1
            goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            r3 = 1
            if (r1 == 0) goto L_0x0059
            ry8 r4 = r8.H0
            o00 r5 = r8.L0
            boolean r4 = Q(r4, r5)
            r4 = r4 ^ r3
            r1.k(r9, r4)
        L_0x0059:
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r1 = r0 instanceof defpackage.vs8
            if (r1 == 0) goto L_0x0064
            r2 = r0
            vs8 r2 = (defpackage.vs8) r2
        L_0x0064:
            if (r2 == 0) goto L_0x009e
            pq9 r0 = defpackage.qp4.u0
            android.view.View r1 = r8.a
            fka r4 = r0.j(r1)
            nr2 r4 = r4.a()
            is0 r4 = r4.g()
            bs0 r4 = r4.a
            int[] r4 = r4.o
            bc7[] r5 = defpackage.vs8.z
            r6 = 0
            r6 = r5[r6]
            us8 r7 = r2.u
            r7.o1(r2, r6, r4)
            fka r0 = r0.j(r1)
            nr2 r0 = r0.a()
            is0 r0 = r0.k()
            bs0 r0 = r0.a
            int[] r0 = r0.o
            r1 = r5[r3]
            us8 r3 = r2.v
            r3.o1(r2, r1, r0)
            r2.invalidateSelf()
        L_0x009e:
            r8.M(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht8.a(is0):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.v83 r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.I0
            boolean r1 = r0 instanceof defpackage.k34
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r0
            k34 r1 = (defpackage.k34) r1
            goto L_0x000c
        L_0x000b:
            r1 = r2
        L_0x000c:
            if (r1 == 0) goto L_0x0015
            m73 r3 = r5.b
            int r3 = r3.g
            r1.setDateBackgroundColor(r3)
        L_0x0015:
            android.graphics.drawable.Drawable r0 = r0.getForeground()
            boolean r1 = r0 instanceof android.graphics.drawable.ShapeDrawable
            if (r1 == 0) goto L_0x0020
            r2 = r0
            android.graphics.drawable.ShapeDrawable r2 = (android.graphics.drawable.ShapeDrawable) r2
        L_0x0020:
            if (r2 == 0) goto L_0x003d
            android.graphics.Paint r0 = r2.getPaint()
            if (r0 == 0) goto L_0x003d
            pq9 r1 = defpackage.qp4.u0
            android.view.View r2 = r4.a
            fka r1 = r1.j(r2)
            a1e r1 = r1.d()
            y0e r1 = r1.a
            z0e r1 = r1.b
            int r1 = r1.l
            r0.setColor(r1)
        L_0x003d:
            r4.O(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht8.e(v83):void");
    }
}
