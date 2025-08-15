package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: qbf  reason: default package */
public final class qbf extends hbf {
    public static final PorterDuff.Mode u0 = PorterDuff.Mode.SRC_IN;
    public boolean X;
    public boolean Y = true;
    public final float[] Z = new float[9];
    public obf b;
    public PorterDuffColorFilter c;
    public ColorFilter o;
    public final Matrix s0 = new Matrix();
    public final Rect t0 = new Rect();

    /* JADX WARNING: type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, obf] */
    public qbf() {
        ? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = u0;
        constantState.b = new nbf();
        this.b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        aq4.b(drawable);
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas2);
            return;
        }
        Rect rect = this.t0;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.o;
            if (colorFilter == null) {
                colorFilter = this.c;
            }
            Matrix matrix = this.s0;
            canvas2.getMatrix(matrix);
            float[] fArr = this.Z;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas2.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && bq4.a(this) == 1) {
                    canvas2.translate((float) rect.width(), 0.0f);
                    canvas2.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                obf obf = this.b;
                Bitmap bitmap = obf.f;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == obf.f.getHeight())) {
                    obf.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    obf.k = true;
                }
                if (!this.Y) {
                    obf obf2 = this.b;
                    obf2.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(obf2.f);
                    nbf nbf = obf2.b;
                    nbf.a(nbf.g, nbf.p, canvas3, min, min2);
                } else {
                    obf obf3 = this.b;
                    if (!(!obf3.k && obf3.g == obf3.c && obf3.h == obf3.d && obf3.j == obf3.e && obf3.i == obf3.b.getRootAlpha())) {
                        obf obf4 = this.b;
                        obf4.f.eraseColor(0);
                        Canvas canvas4 = new Canvas(obf4.f);
                        nbf nbf2 = obf4.b;
                        nbf2.a(nbf2.g, nbf.p, canvas4, min, min2);
                        obf obf5 = this.b;
                        obf5.g = obf5.c;
                        obf5.h = obf5.d;
                        obf5.i = obf5.b.getRootAlpha();
                        obf5.j = obf5.e;
                        obf5.k = false;
                    }
                }
                obf obf6 = this.b;
                if (obf6.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (obf6.l == null) {
                        Paint paint2 = new Paint();
                        obf6.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    obf6.l.setAlpha(obf6.b.getRootAlpha());
                    obf6.l.setColorFilter(colorFilter);
                    paint = obf6.l;
                }
                canvas2.drawBitmap(obf6.f, (Rect) null, rect, paint);
                canvas2.restoreToCount(save);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? aq4.c(drawable) : this.o;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new pbf(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            obf obf = this.b;
            if (obf != null) {
                nbf nbf = obf.b;
                if (nbf.n == null) {
                    nbf.n = Boolean.valueOf(nbf.g.a());
                }
                if (nbf.n.booleanValue() || ((colorStateList = this.b.c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, obf] */
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.X && super.mutate() == this) {
            obf obf = this.b;
            ? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = u0;
            if (obf != null) {
                constantState.a = obf.a;
                nbf nbf = new nbf(obf.b);
                constantState.b = nbf;
                if (obf.b.e != null) {
                    nbf.e = new Paint(obf.b.e);
                }
                if (obf.b.d != null) {
                    constantState.b.d = new Paint(obf.b.d);
                }
                constantState.c = obf.c;
                constantState.d = obf.d;
                constantState.e = obf.e;
            }
            this.b = constantState;
            this.X = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        obf obf = this.b;
        ColorStateList colorStateList = obf.c;
        if (colorStateList == null || (mode = obf.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        nbf nbf = obf.b;
        if (nbf.n == null) {
            nbf.n = Boolean.valueOf(nbf.g.a());
        }
        if (nbf.n.booleanValue()) {
            boolean b2 = obf.b.g.b(iArr);
            obf.k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.o = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ote.R(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            aq4.h(drawable, colorStateList);
            return;
        }
        obf obf = this.b;
        if (obf.c != colorStateList) {
            obf.c = colorStateList;
            this.c = a(colorStateList, obf.d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            aq4.i(drawable, mode);
            return;
        }
        obf obf = this.b;
        if (obf.d != mode) {
            obf.d = mode;
            this.c = a(obf.c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARNING: type inference failed for: r9v39, types: [mbf, java.lang.Object, jbf] */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        nbf nbf;
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Paint.Join join;
        Paint.Cap cap;
        int i7;
        Paint.Join join2;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.a;
        if (drawable != null) {
            aq4.d(drawable, resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        obf obf = this.b;
        obf.b = new nbf();
        TypedArray G = ote.G(resources2, theme2, attributeSet2, tu0.a);
        obf obf2 = this.b;
        nbf nbf2 = obf2.b;
        if (!ote.z(xmlPullParser2, "tintMode")) {
            i = -1;
        } else {
            i = G.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i8 = 3;
        if (i == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i != 5) {
            if (i != 9) {
                switch (i) {
                    case Protos.Attaches.Attach.LOCATION /*14*/:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        obf2.d = mode;
        int i9 = 1;
        ColorStateList colorStateList = null;
        boolean z3 = false;
        if (ote.z(xmlPullParser2, "tint")) {
            TypedValue typedValue = new TypedValue();
            G.getValue(1, typedValue);
            int i10 = typedValue.type;
            if (i10 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i10 < 28 || i10 > 31) {
                Resources resources3 = G.getResources();
                int resourceId = G.getResourceId(1, 0);
                ThreadLocal threadLocal = r63.a;
                try {
                    colorStateList = r63.a(resources3, resources3.getXml(resourceId), theme2);
                } catch (Exception unused) {
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            obf2.c = colorStateList2;
        }
        boolean z4 = obf2.e;
        if (ote.z(xmlPullParser2, "autoMirrored")) {
            z4 = G.getBoolean(5, z4);
        }
        obf2.e = z4;
        float f = nbf2.j;
        if (ote.z(xmlPullParser2, "viewportWidth")) {
            f = G.getFloat(7, f);
        }
        nbf2.j = f;
        float f2 = nbf2.k;
        if (ote.z(xmlPullParser2, "viewportHeight")) {
            f2 = G.getFloat(8, f2);
        }
        nbf2.k = f2;
        if (nbf2.j <= 0.0f) {
            throw new XmlPullParserException(G.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 > 0.0f) {
            nbf2.h = G.getDimension(3, nbf2.h);
            float dimension = G.getDimension(2, nbf2.i);
            nbf2.i = dimension;
            if (nbf2.h <= 0.0f) {
                throw new XmlPullParserException(G.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = nbf2.getAlpha();
                if (ote.z(xmlPullParser2, "alpha")) {
                    alpha = G.getFloat(4, alpha);
                }
                nbf2.setAlpha(alpha);
                String string = G.getString(0);
                if (string != null) {
                    nbf2.m = string;
                    nbf2.o.put(string, nbf2);
                }
                G.recycle();
                obf.a = getChangingConfigurations();
                obf.k = true;
                obf obf3 = this.b;
                nbf nbf3 = obf3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nbf3.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z5 = true;
                while (eventType != i9 && (xmlPullParser.getDepth() >= depth || eventType != i8)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        kbf kbf = (kbf) arrayDeque.peek();
                        boolean equals = ClientCookie.PATH_ATTR.equals(name);
                        i2 = depth;
                        us usVar = nbf3.o;
                        if (equals) {
                            ? mbf = new mbf();
                            mbf.f = 0.0f;
                            mbf.h = 1.0f;
                            mbf.i = 1.0f;
                            mbf.j = 0.0f;
                            mbf.k = 1.0f;
                            mbf.l = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            mbf.m = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            mbf.n = join3;
                            nbf = nbf3;
                            mbf.o = 4.0f;
                            TypedArray G2 = ote.G(resources2, theme2, attributeSet2, tu0.c);
                            if (ote.z(xmlPullParser2, "pathData")) {
                                Paint.Cap cap3 = cap2;
                                String string2 = G2.getString(0);
                                if (string2 != null) {
                                    mbf.b = string2;
                                }
                                String string3 = G2.getString(2);
                                if (string3 != null) {
                                    mbf.a = m6d.h(string3);
                                }
                                mbf.g = ote.t(G2, xmlPullParser2, theme2, "fillColor", 1);
                                float f3 = mbf.i;
                                if (ote.z(xmlPullParser2, "fillAlpha")) {
                                    f3 = G2.getFloat(12, f3);
                                }
                                mbf.i = f3;
                                if (!ote.z(xmlPullParser2, "strokeLineCap")) {
                                    i6 = -1;
                                } else {
                                    i6 = G2.getInt(8, -1);
                                }
                                Paint.Cap cap4 = mbf.m;
                                if (i6 != 0) {
                                    join = join3;
                                    cap = i6 != 1 ? i6 != 2 ? cap4 : Paint.Cap.SQUARE : Paint.Cap.ROUND;
                                } else {
                                    join = join3;
                                    cap = cap3;
                                }
                                mbf.m = cap;
                                if (!ote.z(xmlPullParser2, "strokeLineJoin")) {
                                    i7 = -1;
                                } else {
                                    i7 = G2.getInt(9, -1);
                                }
                                Paint.Join join4 = mbf.n;
                                if (i7 != 0) {
                                    join2 = i7 != 1 ? i7 != 2 ? join4 : Paint.Join.BEVEL : Paint.Join.ROUND;
                                } else {
                                    join2 = join;
                                }
                                mbf.n = join2;
                                float f4 = mbf.o;
                                if (ote.z(xmlPullParser2, "strokeMiterLimit")) {
                                    f4 = G2.getFloat(10, f4);
                                }
                                mbf.o = f4;
                                mbf.e = ote.t(G2, xmlPullParser2, theme2, "strokeColor", 3);
                                float f5 = mbf.h;
                                if (ote.z(xmlPullParser2, "strokeAlpha")) {
                                    f5 = G2.getFloat(11, f5);
                                }
                                mbf.h = f5;
                                float f6 = mbf.f;
                                if (ote.z(xmlPullParser2, "strokeWidth")) {
                                    f6 = G2.getFloat(4, f6);
                                }
                                mbf.f = f6;
                                float f7 = mbf.k;
                                if (ote.z(xmlPullParser2, "trimPathEnd")) {
                                    f7 = G2.getFloat(6, f7);
                                }
                                mbf.k = f7;
                                float f8 = mbf.l;
                                if (ote.z(xmlPullParser2, "trimPathOffset")) {
                                    f8 = G2.getFloat(7, f8);
                                }
                                mbf.l = f8;
                                float f9 = mbf.j;
                                if (ote.z(xmlPullParser2, "trimPathStart")) {
                                    f9 = G2.getFloat(5, f9);
                                }
                                mbf.j = f9;
                                int i11 = mbf.c;
                                if (ote.z(xmlPullParser2, "fillType")) {
                                    i11 = G2.getInt(13, i11);
                                }
                                mbf.c = i11;
                            }
                            G2.recycle();
                            kbf.b.add(mbf);
                            if (mbf.getPathName() != null) {
                                usVar.put(mbf.getPathName(), mbf);
                            }
                            obf3.a |= mbf.d;
                            z2 = false;
                            i3 = 1;
                            z5 = false;
                        } else {
                            nbf = nbf3;
                            if ("clip-path".equals(name)) {
                                mbf mbf2 = new mbf();
                                if (ote.z(xmlPullParser2, "pathData")) {
                                    TypedArray G3 = ote.G(resources2, theme2, attributeSet2, tu0.d);
                                    String string4 = G3.getString(0);
                                    if (string4 != null) {
                                        mbf2.b = string4;
                                    }
                                    String string5 = G3.getString(1);
                                    if (string5 != null) {
                                        mbf2.a = m6d.h(string5);
                                    }
                                    if (!ote.z(xmlPullParser2, "fillType")) {
                                        i5 = 0;
                                    } else {
                                        i5 = G3.getInt(2, 0);
                                    }
                                    mbf2.c = i5;
                                    G3.recycle();
                                }
                                kbf.b.add(mbf2);
                                if (mbf2.getPathName() != null) {
                                    usVar.put(mbf2.getPathName(), mbf2);
                                }
                                obf3.a = mbf2.d | obf3.a;
                            } else if ("group".equals(name)) {
                                kbf kbf2 = new kbf();
                                TypedArray G4 = ote.G(resources2, theme2, attributeSet2, tu0.b);
                                float f10 = kbf2.c;
                                if (ote.z(xmlPullParser2, "rotation")) {
                                    f10 = G4.getFloat(5, f10);
                                }
                                kbf2.c = f10;
                                i3 = 1;
                                kbf2.d = G4.getFloat(1, kbf2.d);
                                kbf2.e = G4.getFloat(2, kbf2.e);
                                float f11 = kbf2.f;
                                if (ote.z(xmlPullParser2, "scaleX")) {
                                    f11 = G4.getFloat(3, f11);
                                }
                                kbf2.f = f11;
                                float f12 = kbf2.g;
                                if (ote.z(xmlPullParser2, "scaleY")) {
                                    f12 = G4.getFloat(4, f12);
                                }
                                kbf2.g = f12;
                                float f13 = kbf2.h;
                                if (ote.z(xmlPullParser2, "translateX")) {
                                    f13 = G4.getFloat(6, f13);
                                }
                                kbf2.h = f13;
                                float f14 = kbf2.i;
                                if (ote.z(xmlPullParser2, "translateY")) {
                                    f14 = G4.getFloat(7, f14);
                                }
                                kbf2.i = f14;
                                z2 = false;
                                String string6 = G4.getString(0);
                                if (string6 != null) {
                                    kbf2.l = string6;
                                }
                                kbf2.c();
                                G4.recycle();
                                kbf.b.add(kbf2);
                                arrayDeque.push(kbf2);
                                if (kbf2.getGroupName() != null) {
                                    usVar.put(kbf2.getGroupName(), kbf2);
                                }
                                obf3.a = kbf2.k | obf3.a;
                            }
                            z2 = false;
                            i3 = 1;
                        }
                        z = z2;
                        i4 = 3;
                    } else {
                        nbf = nbf3;
                        i2 = depth;
                        i3 = i9;
                        z = z3;
                        i4 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i8 = i4;
                    z3 = z;
                    i9 = i3;
                    depth = i2;
                    nbf3 = nbf;
                }
                if (!z5) {
                    this.c = a(obf.c, obf.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(G.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(G.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public qbf(obf obf) {
        this.b = obf;
        this.c = a(obf.c, obf.d);
    }
}
