package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* renamed from: od4  reason: default package */
public final class od4 extends qi0 implements ba5, sgc {
    public static final ffc v;
    public static final float[] w = {1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
    public static final float[] x = {1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};
    public final cd6 h;
    public final zw6 i;
    public final zw6 j;
    public final boolean k;
    public final float[][] l;
    public final float[][] m;
    public final float[] n = mr0.l();
    public final float[] o = mr0.l();
    public final float[] p = new float[16];
    public ffc q = v;
    public Gainmap r;
    public int s = -1;
    public boolean t;
    public boolean u;

    static {
        ls5 ls5 = zw6.b;
        Object[] objArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}};
        c54.n(4, objArr);
        v = zw6.h(4, objArr);
    }

    public od4(cd6 cd6, zw6 zw6, zw6 zw62, int i2, boolean z) {
        super(z);
        this.h = cd6;
        this.i = zw6;
        this.j = zw62;
        this.k = z;
        int size = zw6.size();
        int[] iArr = new int[2];
        iArr[1] = 16;
        iArr[0] = size;
        Class cls = Float.TYPE;
        this.l = (float[][]) Array.newInstance(cls, iArr);
        int size2 = zw62.size();
        int[] iArr2 = new int[2];
        iArr2[1] = 16;
        iArr2[0] = size2;
        this.m = (float[][]) Array.newInstance(cls, iArr2);
    }

    public static od4 h(Context context, ffc ffc, ffc ffc2, boolean z) {
        return new od4(j(context, "shaders/vertex_shader_transformation_es2.glsl", ffc2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl"), zw6.j(ffc), zw6.j(ffc2), 1, z);
    }

    public static od4 i(Context context, ffc ffc, List list, i63 i63, int i2) {
        boolean g = i63.g(i63);
        boolean z = false;
        boolean z2 = i2 == 2;
        cd6 j2 = j(context, g ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", g ? "shaders/fragment_shader_oetf_es3.glsl" : z2 ? "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl" : list.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl");
        int i3 = i63.c;
        if (g) {
            if (i3 == 7 || i3 == 6) {
                z = true;
            }
            fm9.f(z);
            j2.t(i3, "uOutputColorTransfer");
        } else if (z2) {
            if (i3 == 3 || i3 == 10) {
                z = true;
            }
            fm9.f(z);
            j2.t(i3, "uOutputColorTransfer");
        }
        return new od4(j2, zw6.j(ffc), zw6.j(list), i63.c, g);
    }

    public static cd6 j(Context context, String str, String str2) {
        try {
            cd6 cd6 = new cd6(context, str, str2);
            cd6.q("uTexTransformationMatrix", mr0.l());
            return cd6;
        } catch (GlUtil$GlException | IOException e) {
            throw new Exception(e);
        }
    }

    public static od4 k(cd6 cd6, i63 i63, i63 i632, int i2, ffc ffc) {
        cd6 cd62 = cd6;
        i63 i633 = i632;
        boolean g = i63.g(i63);
        int i3 = i63.a;
        boolean z = false;
        boolean z2 = (i3 == 1 || i3 == 2) && i633.a == 6;
        int i4 = i633.c;
        if (g) {
            if (i4 == 3) {
                i4 = 10;
            }
            fm9.f(i4 == 1 || i4 == 10 || i4 == 6 || i4 == 7);
            cd6.t(i4, "uOutputColorTransfer");
        } else if (z2) {
            fm9.f(i4 == 1 || i4 == 6 || i4 == 7);
            cd6.t(i4, "uOutputColorTransfer");
        } else {
            int i5 = i2;
            cd6.t(i2, "uSdrWorkingColorSpace");
            fm9.f(i4 == 3 || i4 == 1);
            cd6.t(i4, "uOutputColorTransfer");
        }
        ffc ffc2 = ffc.X;
        if (g || z2) {
            z = true;
        }
        return new od4(cd6, ffc, ffc2, i633.c, z);
    }

    public static boolean n(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            float[] fArr3 = fArr[i2];
            float[] fArr4 = fArr2[i2];
            if (!Arrays.equals(fArr3, fArr4)) {
                fm9.j("A 4x4 transformation matrix must have 16 elements", fArr4.length == 16);
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z = true;
            }
        }
        return z;
    }

    public final void c(int i2, long j2) {
        boolean z;
        cd6 cd6 = this.h;
        zw6 zw6 = this.j;
        int size = zw6.size();
        int[] iArr = new int[2];
        iArr[1] = 16;
        int i3 = 0;
        iArr[0] = size;
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance(cls, iArr);
        if (zw6.size() <= 0) {
            boolean n2 = n(this.m, fArr);
            float[] fArr2 = this.o;
            if (!n2) {
                z = false;
            } else {
                mr0.U(fArr2);
                if (zw6.size() <= 0) {
                    z = true;
                } else {
                    au1.r(zw6.get(0));
                    throw null;
                }
            }
            zw6 zw62 = this.i;
            int size2 = zw62.size();
            int[] iArr2 = new int[2];
            iArr2[1] = 16;
            iArr2[0] = size2;
            float[][] fArr3 = (float[][]) Array.newInstance(cls, iArr2);
            for (int i4 = 0; i4 < zw62.size(); i4++) {
                fArr3[i4] = ((z18) zw62.get(i4)).b(j2);
            }
            float[][] fArr4 = this.l;
            boolean n3 = n(fArr4, fArr3);
            float[] fArr5 = this.n;
            if (n3) {
                mr0.U(fArr5);
                this.q = v;
                int length = fArr4.length;
                int i5 = 0;
                while (true) {
                    float[] fArr6 = this.p;
                    if (i5 >= length) {
                        int i6 = i3;
                        float[] fArr7 = fArr6;
                        Matrix.invertM(fArr7, i6, fArr5, i6);
                        this.q = c37.E(fArr7, this.q);
                        break;
                    }
                    float[] fArr8 = fArr4[i5];
                    float[] fArr9 = fArr6;
                    Matrix.multiplyMM(fArr6, 0, fArr8, 0, this.n, 0);
                    System.arraycopy(fArr9, i3, fArr5, i3, fArr9.length);
                    ffc E = c37.E(fArr8, this.q);
                    fm9.e("A polygon must have at least 3 vertices.", E.size() >= 3);
                    ww6 ww6 = new ww6();
                    ww6.f(E);
                    float[][] fArr10 = c37.d;
                    int i7 = 0;
                    while (i7 < 6) {
                        float[] fArr11 = fArr10[i7];
                        ffc j3 = ww6.j();
                        ww6 ww62 = new ww6();
                        for (int i8 = 0; i8 < j3.size(); i8++) {
                            float[] fArr12 = (float[]) j3.get(i8);
                            float[] fArr13 = (float[]) j3.get(((j3.size() + i8) - 1) % j3.size());
                            if (c37.s(fArr12, fArr11)) {
                                if (!c37.s(fArr13, fArr11)) {
                                    float[] f = c37.f(fArr11, fArr11, fArr13, fArr12);
                                    if (!Arrays.equals(fArr12, f)) {
                                        ww62.d(f);
                                    }
                                }
                                ww62.d(fArr12);
                            } else if (c37.s(fArr13, fArr11)) {
                                float[] f2 = c37.f(fArr11, fArr11, fArr13, fArr12);
                                if (!Arrays.equals(fArr13, f2)) {
                                    ww62.d(f2);
                                }
                            }
                        }
                        i7++;
                        ww6 = ww62;
                    }
                    ffc j4 = ww6.j();
                    this.q = j4;
                    if (j4.size() < 3) {
                        break;
                    }
                    i5++;
                    i3 = 0;
                }
                i3 = 1;
            }
            boolean z2 = z || i3 != 0;
            if (this.q.size() >= 3) {
                if (!this.t || z2 || !this.u) {
                    try {
                        cd6.w();
                        m();
                        cd6.u(i2, 0, "uTexSampler");
                        cd6.q("uTransformationMatrix", fArr5);
                        cd6.r(fArr2);
                        cd6.o(mr0.q(this.q));
                        cd6.h();
                        GLES20.glDrawArrays(6, 0, this.q.size());
                        mr0.f();
                        this.u = true;
                    } catch (GlUtil$GlException e) {
                        throw new Exception(e);
                    }
                }
            }
        } else {
            au1.r(zw6.get(0));
            throw null;
        }
    }

    public final void l(Gainmap gainmap) {
        if (this.k) {
            Gainmap gainmap2 = this.r;
            if (gainmap2 == null || gainmap2.getGamma() != gainmap.getGamma() || gainmap2.getRatioMax() != gainmap.getRatioMax() || gainmap2.getRatioMin() != gainmap.getRatioMin() || gainmap2.getEpsilonHdr() != gainmap.getEpsilonHdr() || gainmap2.getEpsilonSdr() != gainmap.getEpsilonSdr() || gainmap2.getDisplayRatioForFullHdr() != gainmap.getDisplayRatioForFullHdr() || gainmap2.getMinDisplayRatioForHdrTransition() != gainmap.getMinDisplayRatioForHdrTransition() || gainmap2.getGainmapContents() != gainmap.getGainmapContents() || gainmap2.getGainmapContents().getGenerationId() != gainmap.getGainmapContents().getGenerationId()) {
                this.u = false;
                this.r = gainmap;
                int i2 = this.s;
                if (i2 == -1) {
                    Bitmap b = gainmap.getGainmapContents();
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    mr0.f();
                    int i3 = iArr[0];
                    mr0.b(b.getWidth(), b.getHeight());
                    mr0.d(3553, i3, 9729);
                    GLUtils.texImage2D(3553, 0, b, 0);
                    mr0.f();
                    this.s = i3;
                    return;
                }
                Bitmap b2 = gainmap.getGainmapContents();
                mr0.b(b2.getWidth(), b2.getHeight());
                mr0.d(3553, i2, 9729);
                GLUtils.texImage2D(3553, 0, b2, 0);
                mr0.f();
            }
        }
    }

    public final void m() {
        if (this.r != null) {
            if (oaf.a >= 34) {
                int i2 = this.s;
                cd6 cd6 = this.h;
                cd6.u(i2, 1, "uGainmapTexSampler");
                Gainmap gainmap = this.r;
                int i3 = gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8 ? 1 : 0;
                float[] k2 = gainmap.getGamma();
                int i4 = (k2[0] == 1.0f && k2[1] == 1.0f && k2[2] == 1.0f) ? 1 : 0;
                int i5 = (!ema.c(k2) || !ema.c(gainmap.getRatioMax()) || !ema.c(gainmap.getRatioMin())) ? 0 : 1;
                cd6.t(i3, "uGainmapIsAlpha");
                cd6.t(i4, "uNoGamma");
                cd6.t(i5, "uSingleChannel");
                float[] o2 = gainmap.getRatioMin();
                cd6.q("uLogRatioMin", new float[]{(float) Math.log((double) o2[0]), (float) Math.log((double) o2[1]), (float) Math.log((double) o2[2])});
                float[] n2 = gainmap.getRatioMax();
                cd6.q("uLogRatioMax", new float[]{(float) Math.log((double) n2[0]), (float) Math.log((double) n2[1]), (float) Math.log((double) n2[2])});
                cd6.q("uEpsilonSdr", gainmap.getEpsilonSdr());
                cd6.q("uEpsilonHdr", gainmap.getEpsilonHdr());
                cd6.q("uGainmapGamma", k2);
                cd6.p("uDisplayRatioHdr", gainmap.getDisplayRatioForFullHdr());
                cd6.p("uDisplayRatioSdr", gainmap.getMinDisplayRatioForHdrTransition());
                mr0.f();
                return;
            }
            throw new IllegalStateException("Gainmaps not supported under API 34.");
        }
    }

    public final void release() {
        try {
            this.a.d();
            try {
                GLES20.glDeleteProgram(this.h.a);
                mr0.f();
                int i2 = this.s;
                if (i2 != -1) {
                    GLES20.glDeleteTextures(1, new int[]{i2}, 0);
                    mr0.f();
                }
            } catch (GlUtil$GlException e) {
                throw new Exception(e);
            }
        } catch (GlUtil$GlException e2) {
            throw new Exception(e2);
        }
    }
}
