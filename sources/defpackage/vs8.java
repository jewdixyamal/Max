package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: vs8  reason: default package */
public final class vs8 extends Drawable {
    public static final Paint A = new Paint(1);
    public static final qx7 y = new qx7(13);
    public static final /* synthetic */ bc7[] z;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public Drawable e;
    public boolean f;
    public int g;
    public final RectF h;
    public final RectF i;
    public final Path j;
    public Path k;
    public final float l;
    public final float m;
    public final float n;
    public final int o;
    public final float[] p;
    public int q;
    public LinearGradient r;
    public LinearGradient s;
    public final Matrix t;
    public final us8 u;
    public final us8 v;
    public float w;
    public int x;

    static {
        Class<vs8> cls = vs8.class;
        z = new bc7[]{new oi9(cls, "incomingBackgroundColor", "getIncomingBackgroundColor()[I"), rh4.g(nec.a, cls, "outgoingBackgroundColor", "getOutgoingBackgroundColor()[I")};
    }

    public vs8(int[] iArr, int[] iArr2, boolean z2, int i2, boolean z3, boolean z4, int i3) {
        float[] fArr;
        z3 = (i3 & 32) != 0 ? true : z3;
        z4 = (i3 & 64) != 0 ? true : z4;
        this.a = z2;
        this.x = i2;
        this.b = false;
        this.c = z3;
        this.d = z4;
        this.e = null;
        this.f = false;
        this.g = 0;
        this.h = new RectF();
        this.i = new RectF();
        this.j = new Path();
        this.l = fk4.d().getDisplayMetrics().density * 6.0f;
        this.m = fk4.d().getDisplayMetrics().density * 16.0f;
        this.n = fk4.d().getDisplayMetrics().density * 2.0f;
        this.o = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
        if (this.d) {
            fArr = new float[8];
            for (int i4 = 0; i4 < 8; i4++) {
                fArr[i4] = this.m;
            }
        } else {
            fArr = new float[8];
        }
        this.p = fArr;
        this.q = 255;
        this.t = new Matrix();
        this.u = new us8(iArr, this, 0);
        this.v = new us8(iArr2, this, 1);
    }

    public static boolean b(vs8 vs8, boolean z2, int i2, boolean z3, boolean z4, int i3, boolean z5) {
        boolean z6 = (vs8.c == z4 && vs8.a == z2 && vs8.x == i2 && vs8.d == z3 && tpa.f(vs8.e, (Object) null) && vs8.f == z5) ? false : true;
        vs8.b = false;
        vs8.c = z4;
        vs8.g = i3;
        vs8.a = z2;
        vs8.x = i2;
        vs8.d = z3;
        vs8.e = null;
        vs8.f = z5;
        if (z6) {
            vs8.c(vs8.getBounds());
        }
        return z6;
    }

    public final Path a() {
        Path path = this.k;
        return path == null ? this.j : path;
    }

    public final void c(Rect rect) {
        float f2;
        float[] fArr;
        Path path;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        int i2 = this.x;
        boolean z2 = this.a;
        boolean z3 = this.d;
        boolean z4 = this.f;
        float[] fArr2 = this.p;
        if (z3) {
            ys.a0(fArr2, this.m);
            int i3 = i2 == 0 ? -1 : ws8.$EnumSwitchMapping$0[au1.s(i2)];
            if (i3 != -1) {
                float f3 = this.l;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            } else if (z2) {
                                fArr2[0] = f3;
                                fArr2[1] = f3;
                            } else {
                                fArr2[3] = f3;
                                fArr2[2] = f3;
                            }
                        } else if (z2) {
                            fArr2[0] = f3;
                            fArr2[1] = f3;
                            fArr2[6] = f3;
                            fArr2[7] = f3;
                        } else {
                            fArr2[2] = f3;
                            fArr2[3] = f3;
                            fArr2[4] = f3;
                            fArr2[5] = f3;
                        }
                    } else if (z2) {
                        fArr2[7] = f3;
                        fArr2[6] = f3;
                    } else {
                        fArr2[5] = f3;
                        fArr2[4] = f3;
                    }
                } else if (z4) {
                    fArr2[4] = f3;
                    fArr2[5] = f3;
                    fArr2[6] = f3;
                    fArr2[7] = f3;
                }
            }
        }
        Path path2 = this.j;
        path2.reset();
        boolean z5 = this.b;
        int i4 = this.o;
        if (z5) {
            fArr = new float[9];
            int length = fArr2.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                fArr[i6] = fArr2[i5] - (fk4.d().getDisplayMetrics().density * 0.5f);
                i5++;
                i6++;
            }
            f2 = (float) i4;
        } else {
            f2 = 0.0f;
            fArr = fArr2;
        }
        RectF rectF = this.h;
        rectF.set(((float) rect.left) + f2, ((float) rect.top) + f2, ((float) rect.right) - f2, (((float) rect.bottom) - f2) - this.w);
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF, fArr, direction);
        if (this.b) {
            path = new Path();
            RectF rectF2 = this.i;
            float f4 = ((float) i4) / 2.0f;
            rectF2.set(((float) getBounds().left) + f4, ((float) getBounds().top) + f4, ((float) getBounds().right) - f4, ((float) getBounds().bottom) - f4);
            path.addRoundRect(rectF2, fArr2, direction);
        } else {
            path = null;
        }
        this.k = path;
        bc7[] bc7Arr = z;
        bc7 bc7 = bc7Arr[0];
        d((int[]) this.u.b, rect);
        bc7 bc72 = bc7Arr[1];
        e((int[]) this.v.b, rect);
    }

    public final void d(int[] iArr, Rect rect) {
        LinearGradient linearGradient = new LinearGradient(1.0f, 0.1f, 0.0f, 0.9f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.t;
        matrix.reset();
        matrix.setScale((float) rect.width(), (float) rect.height());
        matrix.postTranslate((float) rect.left, (float) rect.top);
        linearGradient.setLocalMatrix(matrix);
        this.r = linearGradient;
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        if (bq4.a(this) == 1) {
            float f2 = (float) 2;
            canvas.scale(-1.0f, 1.0f, ((float) getBounds().width()) / f2, ((float) getBounds().height()) / f2);
        }
        boolean z2 = this.c;
        Path path = this.j;
        Paint paint = A;
        if (z2 && this.e == null) {
            paint.setShader(this.a ? this.r : this.s);
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha(this.q);
            canvas.drawPath(path, paint);
        }
        if (this.e != null) {
            int save = canvas.save();
            canvas.clipPath(path);
            try {
                Drawable drawable = this.e;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
        if (this.b) {
            paint.setShader((Shader) null);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.g);
            paint.setStrokeWidth(this.n);
            paint.setAlpha(this.q);
            Path path2 = this.k;
            if (path2 != null) {
                canvas.drawPath(path2, paint);
            }
        }
        canvas.restore();
    }

    public final void e(int[] iArr, Rect rect) {
        LinearGradient linearGradient = new LinearGradient(1.0f, 0.1f, 0.0f, 0.9f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.t;
        matrix.reset();
        matrix.setScale((float) rect.width(), (float) rect.height());
        matrix.postTranslate((float) rect.left, (float) rect.top);
        linearGradient.setLocalMatrix(matrix);
        this.s = linearGradient;
    }

    public final int getOpacity() {
        return -1;
    }

    public final void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(a());
            outline.setAlpha(0.0f);
            return;
        }
        super.getOutline(outline);
    }

    public final void onBoundsChange(Rect rect) {
        c(rect);
    }

    public final void setAlpha(int i2) {
        this.q = i2;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
