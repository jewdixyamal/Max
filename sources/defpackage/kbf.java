package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: kbf  reason: default package */
public final class kbf extends lbf {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public final int k;
    public String l;

    public kbf() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.l = null;
    }

    public final boolean a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((lbf) arrayList.get(i2)).a()) {
                return true;
            }
            i2++;
        }
    }

    public final boolean b(int[] iArr) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return z;
            }
            z |= ((lbf) arrayList.get(i2)).b(iArr);
            i2++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.l;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.c) {
            this.c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f) {
            this.f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.g) {
            this.g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [mbf, jbf] */
    public kbf(kbf kbf, us usVar) {
        mbf mbf;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.l = null;
        this.c = kbf.c;
        this.d = kbf.d;
        this.e = kbf.e;
        this.f = kbf.f;
        this.g = kbf.g;
        this.h = kbf.h;
        this.i = kbf.i;
        String str = kbf.l;
        this.l = str;
        this.k = kbf.k;
        if (str != null) {
            usVar.put(str, this);
        }
        matrix.set(kbf.j);
        ArrayList arrayList = kbf.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof kbf) {
                this.b.add(new kbf((kbf) obj, usVar));
            } else {
                if (obj instanceof jbf) {
                    jbf jbf = (jbf) obj;
                    ? mbf2 = new mbf(jbf);
                    mbf2.f = 0.0f;
                    mbf2.h = 1.0f;
                    mbf2.i = 1.0f;
                    mbf2.j = 0.0f;
                    mbf2.k = 1.0f;
                    mbf2.l = 0.0f;
                    mbf2.m = Paint.Cap.BUTT;
                    mbf2.n = Paint.Join.MITER;
                    mbf2.o = 4.0f;
                    mbf2.e = jbf.e;
                    mbf2.f = jbf.f;
                    mbf2.h = jbf.h;
                    mbf2.g = jbf.g;
                    mbf2.c = jbf.c;
                    mbf2.i = jbf.i;
                    mbf2.j = jbf.j;
                    mbf2.k = jbf.k;
                    mbf2.l = jbf.l;
                    mbf2.m = jbf.m;
                    mbf2.n = jbf.n;
                    mbf2.o = jbf.o;
                    mbf = mbf2;
                } else if (obj instanceof ibf) {
                    mbf = new mbf((ibf) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(mbf);
                String str2 = mbf.b;
                if (str2 != null) {
                    usVar.put(str2, mbf);
                }
            }
        }
    }
}
