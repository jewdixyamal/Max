package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.widget.ImageView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: jn  reason: default package */
public class jn implements edc, mm0, z66 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object o;

    public /* synthetic */ jn(char c2, int i) {
        this.a = i;
    }

    public static jn H(char c2) {
        return new jn(new wmc(new t42(c2), false));
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r16v3, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r11v11, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0208, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020b, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020e, code lost:
        r11 = new android.graphics.LinearGradient(r12, r26, r25, r24, (int[]) r0.b, (float[]) r0.c, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0225, code lost:
        r3 = new android.graphics.SweepGradient(r20, r21, (int[]) r0.b, (float[]) r0.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0237, code lost:
        r5 = r20;
        r9 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x023e, code lost:
        if (r22 <= 0.0f) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0243, code lost:
        if (r6 == 1) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0246, code lost:
        if (r6 == 2) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0248, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x024b, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024e, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0250, code lost:
        r16 = new android.graphics.RadialGradient(r5, r9, r22, (int[]) r0.b, (float[]) r0.c, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0270, code lost:
        return new defpackage.jn((android.graphics.Shader) r3, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0278, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01dd, code lost:
        if (r15.size() <= 0) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01df, code lost:
        r0 = new defpackage.va8(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e5, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e6, code lost:
        if (r0 == null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ea, code lost:
        if (r18 == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ec, code lost:
        r0 = new defpackage.va8(r7, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f2, code lost:
        r0 = new defpackage.va8(r7, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f8, code lost:
        if (r8 == 1) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01fb, code lost:
        if (r8 == 2) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ff, code lost:
        if (r6 == 1) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0201, code lost:
        if (r6 == 2) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0203, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.jn l(android.content.res.Resources r27, int r28, android.content.res.Resources.Theme r29) {
        /*
            r0 = r27
            r1 = r29
            java.lang.String r2 = "gradient"
            android.content.res.XmlResourceParser r3 = r27.getXml(r28)
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r3)
        L_0x000e:
            int r5 = r3.next()
            r6 = 2
            r7 = 1
            if (r5 == r6) goto L_0x0019
            if (r5 == r7) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r5 != r6) goto L_0x0297
            java.lang.String r5 = r3.getName()
            r5.getClass()
            r8 = 0
            boolean r9 = r5.equals(r2)
            if (r9 != 0) goto L_0x005d
            java.lang.String r2 = "selector"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = defpackage.r63.b(r0, r3, r4, r1)
            jn r1 = new jn
            int r2 = r0.getDefaultColor()
            r1.<init>((android.graphics.Shader) r8, (android.content.res.ColorStateList) r0, (int) r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r5 = r3.getName()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0279
            int[] r2 = defpackage.k3c.GradientColor
            android.content.res.TypedArray r2 = defpackage.ote.G(r0, r1, r4, r2)
            int r5 = defpackage.k3c.GradientColor_android_startX
            java.lang.String r9 = "startX"
            boolean r9 = defpackage.ote.z(r3, r9)
            r10 = 0
            if (r9 != 0) goto L_0x007a
            r12 = r10
            goto L_0x007f
        L_0x007a:
            float r5 = r2.getFloat(r5, r10)
            r12 = r5
        L_0x007f:
            int r5 = defpackage.k3c.GradientColor_android_startY
            java.lang.String r9 = "startY"
            boolean r9 = defpackage.ote.z(r3, r9)
            if (r9 != 0) goto L_0x008b
            r13 = r10
            goto L_0x0090
        L_0x008b:
            float r5 = r2.getFloat(r5, r10)
            r13 = r5
        L_0x0090:
            int r5 = defpackage.k3c.GradientColor_android_endX
            java.lang.String r9 = "endX"
            boolean r9 = defpackage.ote.z(r3, r9)
            if (r9 != 0) goto L_0x009c
            r14 = r10
            goto L_0x00a1
        L_0x009c:
            float r5 = r2.getFloat(r5, r10)
            r14 = r5
        L_0x00a1:
            int r5 = defpackage.k3c.GradientColor_android_endY
            java.lang.String r9 = "endY"
            boolean r9 = defpackage.ote.z(r3, r9)
            if (r9 != 0) goto L_0x00ad
            r15 = r10
            goto L_0x00b2
        L_0x00ad:
            float r5 = r2.getFloat(r5, r10)
            r15 = r5
        L_0x00b2:
            int r5 = defpackage.k3c.GradientColor_android_centerX
            java.lang.String r9 = "centerX"
            boolean r9 = defpackage.ote.z(r3, r9)
            if (r9 != 0) goto L_0x00be
            r5 = r10
            goto L_0x00c2
        L_0x00be:
            float r5 = r2.getFloat(r5, r10)
        L_0x00c2:
            int r9 = defpackage.k3c.GradientColor_android_centerY
            java.lang.String r11 = "centerY"
            boolean r11 = defpackage.ote.z(r3, r11)
            if (r11 != 0) goto L_0x00ce
            r9 = r10
            goto L_0x00d2
        L_0x00ce:
            float r9 = r2.getFloat(r9, r10)
        L_0x00d2:
            int r11 = defpackage.k3c.GradientColor_android_type
            java.lang.String r8 = "type"
            boolean r8 = defpackage.ote.z(r3, r8)
            r6 = 0
            if (r8 != 0) goto L_0x00df
            r8 = r6
            goto L_0x00e3
        L_0x00df:
            int r8 = r2.getInt(r11, r6)
        L_0x00e3:
            int r11 = defpackage.k3c.GradientColor_android_startColor
            java.lang.String r7 = "startColor"
            boolean r7 = defpackage.ote.z(r3, r7)
            if (r7 != 0) goto L_0x00ef
            r7 = r6
            goto L_0x00f3
        L_0x00ef:
            int r7 = r2.getColor(r11, r6)
        L_0x00f3:
            java.lang.String r11 = "centerColor"
            boolean r18 = defpackage.ote.z(r3, r11)
            int r10 = defpackage.k3c.GradientColor_android_centerColor
            boolean r11 = defpackage.ote.z(r3, r11)
            if (r11 != 0) goto L_0x0103
            r10 = r6
            goto L_0x0107
        L_0x0103:
            int r10 = r2.getColor(r10, r6)
        L_0x0107:
            int r11 = defpackage.k3c.GradientColor_android_endColor
            java.lang.String r6 = "endColor"
            boolean r6 = defpackage.ote.z(r3, r6)
            if (r6 != 0) goto L_0x0113
            r11 = 0
            goto L_0x011a
        L_0x0113:
            r6 = 0
            int r23 = r2.getColor(r11, r6)
            r11 = r23
        L_0x011a:
            int r6 = defpackage.k3c.GradientColor_android_tileMode
            r20 = r5
            java.lang.String r5 = "tileMode"
            boolean r5 = defpackage.ote.z(r3, r5)
            if (r5 != 0) goto L_0x0128
            r6 = 0
            goto L_0x012d
        L_0x0128:
            r5 = 0
            int r6 = r2.getInt(r6, r5)
        L_0x012d:
            int r5 = defpackage.k3c.GradientColor_android_gradientRadius
            r21 = r9
            java.lang.String r9 = "gradientRadius"
            boolean r9 = defpackage.ote.z(r3, r9)
            if (r9 != 0) goto L_0x013b
            r5 = 0
            goto L_0x0140
        L_0x013b:
            r9 = 0
            float r5 = r2.getFloat(r5, r9)
        L_0x0140:
            r2.recycle()
            int r2 = r3.getDepth()
            r9 = 1
            int r2 = r2 + r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r22 = r5
            r5 = 20
            r9.<init>(r5)
            r24 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r5)
        L_0x0159:
            int r5 = r3.next()
            r25 = r14
            r14 = 1
            if (r5 == r14) goto L_0x01d7
            int r14 = r3.getDepth()
            r26 = r13
            if (r14 >= r2) goto L_0x016d
            r13 = 3
            if (r5 == r13) goto L_0x01d9
        L_0x016d:
            r13 = 2
            if (r5 == r13) goto L_0x0175
        L_0x0170:
            r14 = r25
            r13 = r26
            goto L_0x0159
        L_0x0175:
            if (r14 > r2) goto L_0x01b9
            java.lang.String r5 = r3.getName()
            java.lang.String r13 = "item"
            boolean r5 = r5.equals(r13)
            if (r5 != 0) goto L_0x0184
            goto L_0x0170
        L_0x0184:
            int[] r5 = defpackage.k3c.GradientColorItem
            android.content.res.TypedArray r5 = defpackage.ote.G(r0, r1, r4, r5)
            int r13 = defpackage.k3c.GradientColorItem_android_color
            boolean r13 = r5.hasValue(r13)
            int r14 = defpackage.k3c.GradientColorItem_android_offset
            boolean r14 = r5.hasValue(r14)
            if (r13 == 0) goto L_0x01bc
            if (r14 == 0) goto L_0x01bc
            int r13 = defpackage.k3c.GradientColorItem_android_color
            r14 = 0
            int r13 = r5.getColor(r13, r14)
            int r14 = defpackage.k3c.GradientColorItem_android_offset
            r0 = 0
            float r14 = r5.getFloat(r14, r0)
            r5.recycle()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r15.add(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r14)
            r9.add(r0)
        L_0x01b9:
            r0 = r27
            goto L_0x0170
        L_0x01bc:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01d7:
            r26 = r13
        L_0x01d9:
            int r0 = r15.size()
            if (r0 <= 0) goto L_0x01e5
            va8 r0 = new va8
            r0.<init>((java.util.ArrayList) r15, (java.util.ArrayList) r9)
            goto L_0x01e6
        L_0x01e5:
            r0 = 0
        L_0x01e6:
            if (r0 == 0) goto L_0x01ea
        L_0x01e8:
            r1 = 1
            goto L_0x01f8
        L_0x01ea:
            if (r18 == 0) goto L_0x01f2
            va8 r0 = new va8
            r0.<init>((int) r7, (int) r10, (int) r11)
            goto L_0x01e8
        L_0x01f2:
            va8 r0 = new va8
            r0.<init>((int) r7, (int) r11)
            goto L_0x01e8
        L_0x01f8:
            if (r8 == r1) goto L_0x0237
            r2 = 2
            if (r8 == r2) goto L_0x0225
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            if (r6 == r1) goto L_0x020b
            if (r6 == r2) goto L_0x0208
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
        L_0x0205:
            r18 = r1
            goto L_0x020e
        L_0x0208:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x0205
        L_0x020b:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x0205
        L_0x020e:
            java.lang.Object r1 = r0.b
            r16 = r1
            int[] r16 = (int[]) r16
            java.lang.Object r0 = r0.c
            r17 = r0
            float[] r17 = (float[]) r17
            r11 = r3
            r13 = r26
            r14 = r25
            r15 = r24
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0269
        L_0x0225:
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            java.lang.Object r1 = r0.b
            int[] r1 = (int[]) r1
            java.lang.Object r0 = r0.c
            float[] r0 = (float[]) r0
            r5 = r20
            r9 = r21
            r3.<init>(r5, r9, r1, r0)
            goto L_0x0269
        L_0x0237:
            r5 = r20
            r9 = r21
            r1 = 0
            int r1 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0271
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            r1 = 1
            if (r6 == r1) goto L_0x024e
            r1 = 2
            if (r6 == r1) goto L_0x024b
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x0250
        L_0x024b:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x0250
        L_0x024e:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
        L_0x0250:
            java.lang.Object r2 = r0.b
            r20 = r2
            int[] r20 = (int[]) r20
            java.lang.Object r0 = r0.c
            r21 = r0
            float[] r21 = (float[]) r21
            r16 = r3
            r17 = r5
            r18 = r9
            r19 = r22
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x0269:
            jn r0 = new jn
            r1 = 0
            r2 = 0
            r0.<init>((android.graphics.Shader) r3, (android.content.res.ColorStateList) r1, (int) r2)
            return r0
        L_0x0271:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x0279:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0297:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn.l(android.content.res.Resources, int, android.content.res.Resources$Theme):jn");
    }

    public void A(yn7 yn7, pc8 pc8) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8 = (fk8) it.next();
            oaf.W(fk8.a, new ck8(this, fk8.b, yn7, pc8, 1));
        }
    }

    public void B(yn7 yn7, int i, int i2, qy5 qy5, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        pc8 pc8 = new pc8(i, i2, qy5, i3, obj, oaf.h0(j), oaf.h0(j2));
        yn7 yn72 = yn7;
        D(yn7, pc8, iOException, z);
    }

    public void C(yn7 yn7, int i, IOException iOException, boolean z) {
        B(yn7, i, -1, (qy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void D(yn7 yn7, pc8 pc8, IOException iOException, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8 = (fk8) it.next();
            oaf.W(fk8.a, new dk8((Object) this, (Object) fk8.b, (Object) yn7, (Object) pc8, iOException, z, 1));
        }
    }

    public void E(AttributeSet attributeSet, int i) {
        ImageView imageView = (ImageView) this.c;
        k8g x = k8g.x(imageView.getContext(), attributeSet, p3c.AppCompatImageView, i, 0);
        ImageView imageView2 = (ImageView) this.c;
        Context context = imageView2.getContext();
        int[] iArr = p3c.AppCompatImageView;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(imageView2, context, iArr, attributeSet, (TypedArray) x.b, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) x.b;
            if (drawable == null) {
                int resourceId = typedArray.getResourceId(p3c.AppCompatImageView_srcCompat, -1);
                if (!(resourceId == -1 || (drawable = s36.n(imageView.getContext(), resourceId)) == null)) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (drawable != null) {
                hq4.a(drawable);
            }
            if (typedArray.hasValue(p3c.AppCompatImageView_tint)) {
                aw6.c(imageView, x.l(p3c.AppCompatImageView_tint));
            }
            if (typedArray.hasValue(p3c.AppCompatImageView_tintMode)) {
                aw6.d(imageView, hq4.c(typedArray.getInt(p3c.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
            x.z();
        } catch (Throwable th) {
            x.z();
            throw th;
        }
    }

    public void F(yn7 yn7, int i, int i2, qy5 qy5, int i3, Object obj, long j, long j2) {
        pc8 pc8 = new pc8(i, i2, qy5, i3, obj, oaf.h0(j), oaf.h0(j2));
        yn7 yn72 = yn7;
        G(yn7, pc8);
    }

    public void G(yn7 yn7, pc8 pc8) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8 = (fk8) it.next();
            oaf.W(fk8.a, new ck8(this, fk8.b, yn7, pc8, 0));
        }
    }

    public jn I(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, pw6.h(objArr.length, i));
        }
        wmd.g(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public synchronized void J(Object obj, Object obj2) {
        Object remove = ((LinkedHashMap) this.o).remove(obj);
        this.b -= remove == null ? 0 : ((vaf) this.c).j(remove);
        ((LinkedHashMap) this.o).put(obj, obj2);
        this.b += ((vaf) this.c).j(obj2);
    }

    public void K(Map.Entry entry) {
        I(entry.getKey(), entry.getValue());
    }

    public jn L(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.b) * 2;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, pw6.h(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            K((Map.Entry) it.next());
        }
        return this;
    }

    public synchronized Object M(Object obj) {
        Object remove;
        remove = ((LinkedHashMap) this.o).remove(obj);
        this.b -= remove == null ? 0 : ((vaf) this.c).j(remove);
        return remove;
    }

    public synchronized ArrayList N(d7b d7b) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.o).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (d7b.apply(entry.getKey())) {
                arrayList.add(entry.getValue());
                int i = this.b;
                Object value = entry.getValue();
                this.b = i - (value == null ? 0 : ((vaf) this.c).j(value));
                it.remove();
            }
        }
        return arrayList;
    }

    public List O(CharSequence charSequence) {
        charSequence.getClass();
        wmc wmc = (wmc) this.o;
        wmc.getClass();
        jwd jwd = new jwd(wmc, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (jwd.hasNext()) {
            arrayList.add((String) jwd.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void P(pc8 pc8) {
        yj8 yj8 = (yj8) this.c;
        yj8.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8 = (fk8) it.next();
            oaf.W(fk8.a, new yg3((Object) this, (Object) fk8.b, (Object) yj8, (Object) pc8, 13));
        }
    }

    public void a(Object obj) {
        ii8 ii8 = ((si8) this.o).f;
        Handler handler = ii8.l;
        int i = this.b;
        oh8 oh8 = (oh8) this.c;
        oaf.W(handler, new vs5(ii8, oh8, new t05((Object) this, i, (Object) (List) obj, (Object) oh8, 3), 19));
    }

    public boolean b(vae vae) {
        Object obj;
        Object obj2 = this.c;
        while (true) {
            Object[] objArr = obj2;
            int i = 0;
            if (objArr == null) {
                return false;
            }
            while (i < 4 && (obj = objArr[i]) != null) {
                if (obj == hv9.a) {
                    vae.b();
                    return true;
                } else if (obj instanceof fv9) {
                    vae.onError(((fv9) obj).a);
                    return true;
                } else {
                    if (obj instanceof gv9) {
                        vae.f(((gv9) obj).a);
                    } else {
                        vae.e(obj);
                    }
                    i++;
                }
            }
            obj2 = objArr[4];
        }
    }

    public void c(Object obj) {
        int i = this.b;
        if (i == 4) {
            Object obj2 = new Object[5];
            ((Object[]) this.o)[4] = obj2;
            this.o = obj2;
            i = 0;
        }
        ((Object[]) this.o)[i] = obj;
        this.b = i + 1;
    }

    public void d(Throwable th) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: ow6[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.OutputStream, ow6] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(int r8, int r9) {
        /*
            r7 = this;
            int r0 = r9 << 16
            int r0 = r0 + r8
            int r1 = r7.b
            r2 = 0
            if (r1 == r0) goto L_0x000a
            r1 = 1
            goto L_0x000b
        L_0x000a:
            r1 = r2
        L_0x000b:
            r7.b = r0
        L_0x000d:
            int r0 = defpackage.vo0.z
            if (r2 >= r0) goto L_0x0059
            java.lang.Object r0 = r7.o
            android.graphics.Bitmap[] r0 = (android.graphics.Bitmap[]) r0
            if (r1 != 0) goto L_0x001b
            r3 = r0[r2]
            if (r3 != 0) goto L_0x003f
        L_0x001b:
            r3 = r0[r2]
            if (r3 == 0) goto L_0x0037
            jm9 r4 = defpackage.tu0.l
            w4d r4 = r4.f
            b r5 = new b
            r6 = 17
            r5.<init>((int) r6, (java.lang.Object) r3)
            java.lang.Object r3 = r4.b
            khe r3 = (defpackage.khe) r3
            java.lang.Object r3 = r3.getValue()
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3
            r3.execute(r5)
        L_0x0037:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r9, r8, r3)
            r0[r2] = r3
        L_0x003f:
            java.lang.Object r0 = r7.c
            ow6[] r0 = (defpackage.ow6[]) r0
            r3 = r0[r2]
            if (r3 != 0) goto L_0x0056
            ow6 r3 = new ow6
            int r4 = r9 * r8
            int r4 = r4 * 2
            r3.<init>()
            byte[] r4 = new byte[r4]
            r3.a = r4
            r0[r2] = r3
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn.e(int, int):void");
    }

    public void g() {
        qh3 qh3;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            hq4.a(drawable);
        }
        if (drawable != null && (qh3 = (qh3) this.o) != null) {
            gn.e(drawable, qh3, imageView.getDrawableState());
        }
    }

    public lm0 h(ra4 ra4, long j) {
        ra4 ra42 = ra4;
        long j2 = ra42.o;
        long o2 = o(ra4);
        long r = ra4.r();
        ra42.b(Math.max(6, ((qm5) this.c).d), false);
        long o3 = o(ra4);
        return (o2 > j || o3 <= j) ? o3 <= j ? new lm0(-2, o3, ra4.r()) : new lm0(-1, o2, j2) : new lm0(0, -9223372036854775807L, r);
    }

    public gc0 i() {
        String str = ((Long) this.o) == null ? " tokenExpirationTimestamp" : "";
        if (str.isEmpty()) {
            return new gc0(((Long) this.o).longValue(), (String) this.c, this.b);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public cx6 j() {
        kfc kfc;
        bx6 bx6 = (bx6) this.o;
        if (bx6 == null) {
            int i = this.b;
            Object[] objArr = (Object[]) this.c;
            if (i == 0) {
                kfc = kfc.s0;
            } else if (i == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                kfc = new kfc((Object) null, objArr, 1);
            } else {
                z04.m(i, objArr.length >> 1);
                Object j = kfc.j(objArr, i, jx6.h(i), 0);
                if (j instanceof Object[]) {
                    Object[] objArr2 = (Object[]) j;
                    this.o = (bx6) objArr2[2];
                    Object obj = objArr2[0];
                    int intValue = ((Integer) objArr2[1]).intValue();
                    objArr = Arrays.copyOf(objArr, intValue * 2);
                    j = obj;
                    i = intValue;
                }
                kfc = new kfc(j, objArr, i);
            }
            bx6 bx62 = (bx6) this.o;
            if (bx62 == null) {
                return kfc;
            }
            throw bx62.a();
        }
        throw bx6.a();
    }

    public g94 k(lo7 lo7, i14 i14, die die, int i, int[] iArr, n85 n85, int i2, long j, boolean z, ArrayList arrayList, d4b d4b, z0f z0f) {
        z0f z0f2 = z0f;
        t24 a2 = ((q24) this.c).a();
        if (z0f2 != null) {
            a2.H(z0f2);
        }
        return new g94((cb4) this.o, lo7, i14, die, i, iArr, n85, i2, a2, j, this.b, z, arrayList, d4b);
    }

    public void m(int i, qy5 qy5, int i2, Object obj, long j) {
        n(new pc8(1, i, qy5, i2, obj, oaf.h0(j), -9223372036854775807L));
    }

    public void n(pc8 pc8) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8 = (fk8) it.next();
            oaf.W(fk8.a, new v05((Object) this, (Object) fk8.b, (Object) pc8, 18));
        }
    }

    public long o(ra4 ra4) {
        long j;
        lh4 lh4;
        qm5 qm5;
        boolean z;
        int d;
        ra4 ra42 = ra4;
        while (true) {
            long r = ra4.r();
            j = ra42.c;
            int i = (r > (j - 6) ? 1 : (r == (j - 6) ? 0 : -1));
            lh4 = (lh4) this.o;
            qm5 = (qm5) this.c;
            if (i >= 0) {
                break;
            }
            long r2 = ra4.r();
            int i2 = 2;
            byte[] bArr = new byte[2];
            ra42.q(bArr, 0, 2, false);
            byte b2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i3 = this.b;
            if (b2 != i3) {
                ra42.Y = 0;
                ra42.b((int) (r2 - ra42.o), false);
                z = false;
            } else {
                yaf yaf = new yaf(16);
                System.arraycopy(bArr, 0, yaf.a, 0, 2);
                byte[] bArr2 = yaf.a;
                int i4 = 0;
                while (i4 < 14 && (d = ra42.d(i2 + i4, bArr2, 14 - i4)) != -1) {
                    i4 += d;
                    i2 = 2;
                }
                yaf.G(i4);
                ra42.Y = 0;
                ra42.b((int) (r2 - ra42.o), false);
                z = ngg.k(yaf, qm5, i3, lh4);
            }
            if (z) {
                break;
            }
            ra42.b(1, false);
        }
        if (ra4.r() < j - 6) {
            return lh4.a;
        }
        ra42.b((int) (j - ra4.r()), false);
        return qm5.k;
    }

    public void p(as asVar) {
        Object[] objArr;
        Object[] objArr2 = (Object[]) this.c;
        while (objArr2 != null) {
            int i = 0;
            while (i < 4 && (objArr = objArr2[i]) != null) {
                if (!asVar.test(objArr)) {
                    i++;
                } else {
                    return;
                }
            }
            objArr2 = objArr2[4];
        }
    }

    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudArr) {
        int i;
        Context context = (Context) this.c;
        String str = context.getApplicationInfo().sourceDir;
        boolean exists = new File(str).exists();
        sh0 sh0 = (sh0) this.o;
        if (!exists || !sh0.z(str)) {
            int i2 = this.b;
            synchronized (sh0) {
                i = sh0.b;
            }
            return i2 != i;
        }
        for (int i3 = 0; i3 < nudArr.length; i3++) {
            nud nud = nudArr[i3];
            if (nud instanceof ddc) {
                nudArr[i3] = ((ddc) nud).a(context);
            }
        }
        return true;
    }

    public void r(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        ((String) this.o).concat(str);
    }

    public Object s(int i) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        switch (this.a) {
            case 18:
                if (this.b == -1) {
                    this.b = 0;
                }
                while (true) {
                    int i2 = this.b;
                    sparseArray = (SparseArray) this.c;
                    if (i2 > 0 && i < sparseArray.keyAt(i2)) {
                        this.b--;
                    }
                }
                while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
                    this.b++;
                }
                return sparseArray.valueAt(this.b);
            default:
                if (this.b == -1) {
                    this.b = 0;
                }
                while (true) {
                    int i3 = this.b;
                    sparseArray2 = (SparseArray) this.c;
                    if (i3 > 0 && i < sparseArray2.keyAt(i3)) {
                        this.b--;
                    }
                }
                while (this.b < sparseArray2.size() - 1 && i >= sparseArray2.keyAt(this.b + 1)) {
                    this.b++;
                }
                return sparseArray2.valueAt(this.b);
        }
    }

    public synchronized int t() {
        return ((LinkedHashMap) this.o).size();
    }

    public String toString() {
        switch (this.a) {
            case 13:
                return u();
            case 21:
                StringBuilder sb = new StringBuilder();
                if (((sob) this.c) == sob.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.o);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public String u() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof r6d) {
                r6d r6d = (r6d) obj;
                if (!tpa.f(r6d.e(), nae.f)) {
                    int i3 = ((int[]) this.o)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(r6d.g(i3));
                    }
                } else if (((int[]) this.o)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.o)[i2]);
                    sb.append("]");
                }
            } else if (obj != nd2.X) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public synchronized int v() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = (android.content.res.ColorStateList) r1.o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean w() {
        /*
            r1 = this;
            java.lang.Object r0 = r1.c
            android.graphics.Shader r0 = (android.graphics.Shader) r0
            if (r0 != 0) goto L_0x0014
            java.lang.Object r1 = r1.o
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            if (r1 == 0) goto L_0x0014
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn.w():boolean");
    }

    public void x(yn7 yn7, int i, int i2, qy5 qy5, int i3, Object obj, long j, long j2) {
        pc8 pc8 = new pc8(i, i2, qy5, i3, obj, oaf.h0(j), oaf.h0(j2));
        yn7 yn72 = yn7;
        y(yn7, pc8);
    }

    public void y(yn7 yn7, pc8 pc8) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8 = (fk8) it.next();
            oaf.W(fk8.a, new ck8(this, fk8.b, yn7, pc8, 2));
        }
    }

    public void z(yn7 yn7, int i, int i2, qy5 qy5, int i3, Object obj, long j, long j2) {
        pc8 pc8 = new pc8(i, i2, qy5, i3, obj, oaf.h0(j), oaf.h0(j2));
        yn7 yn72 = yn7;
        A(yn7, pc8);
    }

    public /* synthetic */ jn(int i, int i2, Object obj, String str) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = str;
    }

    public jn(String str, String[] strArr) {
        String str2;
        this.a = 14;
        boolean z = false;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.o = str2;
        this.c = str;
        fp3.h(str.length() <= 23 ? true : z, "tag \"%s\" is longer than the %d character maximum", str, 23);
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.c, i)) {
            i++;
        }
        this.b = i;
    }

    public jn(Context context) {
        this.a = 9;
        this.o = new GestureDetector(context, new q00(6, this));
    }

    public jn(Context context, sh0 sh0) {
        int i;
        this.a = 8;
        this.c = context;
        this.o = sh0;
        synchronized (sh0) {
            i = sh0.b;
        }
        this.b = i;
    }

    public jn(imc imc) {
        this.a = 5;
        this.o = new LinkedHashMap();
        this.b = 0;
        this.c = imc;
    }

    public jn(int i, byte b2) {
        this.a = i;
        switch (i) {
            case 3:
                int i2 = vo0.z;
                this.c = new ow6[i2];
                this.o = new Bitmap[i2];
                return;
            default:
                Object[] objArr = new Object[5];
                this.c = objArr;
                this.o = objArr;
                return;
        }
    }

    public jn(ImageView imageView) {
        this.a = 0;
        this.b = 0;
        this.c = imageView;
    }

    public jn(p4c p4c) {
        this.a = 18;
        this.c = new SparseArray();
        this.o = p4c;
        this.b = -1;
    }

    public jn(p4c p4c, byte b2) {
        this.a = 19;
        this.c = new SparseArray();
        this.o = p4c;
        this.b = -1;
    }

    public jn(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 4;
        this.c = shader;
        this.o = colorStateList;
        this.b = i;
    }

    public jn(qm5 qm5, int i) {
        this.a = 10;
        this.c = qm5;
        this.b = i;
        this.o = new Object();
    }

    public jn(q24 q24) {
        this.a = 6;
        this.o = xu0.u0;
        this.c = q24;
        this.b = 1;
    }

    public jn(wmc wmc) {
        this.a = 20;
        this.o = wmc;
        this.c = u42.b;
        this.b = Integer.MAX_VALUE;
    }

    public jn(CopyOnWriteArrayList copyOnWriteArrayList, int i, yj8 yj8) {
        this.a = 17;
        this.o = copyOnWriteArrayList;
        this.b = i;
        this.c = yj8;
    }

    public jn(int i) {
        this.a = 12;
        this.c = new Object[(i * 2)];
        this.b = 0;
    }

    public jn(si8 si8, oh8 oh8, int i) {
        this.a = 16;
        this.o = si8;
        this.c = oh8;
        this.b = i;
    }

    public jn(int i, List list, t26 t26) {
        this.a = 7;
        this.b = i;
        this.c = list;
        this.o = t26;
    }
}
