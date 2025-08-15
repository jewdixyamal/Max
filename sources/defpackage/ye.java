package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.animated.gif.GifImage;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: ye  reason: default package */
public final class ye implements lu6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ye(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [df, java.lang.Object] */
    public final l43 a(g05 g05, int i, pqb pqb, ju6 ju6) {
        l43 a2;
        switch (this.a) {
            case 0:
                AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.b;
                if (animatedFactoryV2Impl.e == null) {
                    animatedFactoryV2Impl.e = new Object();
                }
                df dfVar = animatedFactoryV2Impl.e;
                Bitmap.Config config = ju6.b;
                dfVar.getClass();
                if (df.a != null) {
                    o43 o = o43.o(g05.a);
                    o.getClass();
                    try {
                        qq8 qq8 = (qq8) o.e0();
                        j43 a3 = df.a(g05.v0, ju6, qq8.r() != null ? GifImage.a(qq8.r(), ju6) : GifImage.b(qq8.n(), qq8.U(), ju6));
                        o43.S(o);
                        return a3;
                    } catch (Throwable th) {
                        o43.S(o);
                        throw th;
                    }
                } else {
                    throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
                }
            default:
                g05.o0();
                ou6 ou6 = g05.c;
                ob4 ob4 = (ob4) this.b;
                ob4.getClass();
                Boolean bool = Boolean.FALSE;
                ju6.getClass();
                if (ou6 == qb4.a) {
                    o43 d = ob4.c.d(g05, ju6.a, i, (ColorSpace) null);
                    try {
                        d.getClass();
                        g05.o0();
                        int i2 = g05.o;
                        g05.o0();
                        CloseableStaticBitmap of = CloseableStaticBitmap.of(d, pqb, i2, g05.X);
                        of.putExtra(HasExtraData.KEY_IS_ROUNDED, bool);
                        return of;
                    } finally {
                        o43.S(d);
                    }
                } else {
                    if (ou6 == qb4.c) {
                        g05.o0();
                        if (g05.Y != -1) {
                            g05.o0();
                            if (g05.Z != -1) {
                                ju6.getClass();
                                lu6 lu6 = ob4.a;
                                a2 = lu6 != null ? lu6.a(g05, i, pqb, ju6) : ob4.b(g05, ju6);
                            }
                        }
                        throw new DecodeException("image width or height is incorrect", g05);
                    } else if (ou6 == qb4.j) {
                        ju6.getClass();
                        lu6 lu62 = ob4.b;
                        a2 = lu62 != null ? lu62.a(g05, i, pqb, ju6) : ob4.b(g05, ju6);
                    } else if (ou6 == qb4.m) {
                        return null;
                    } else {
                        if (ou6 != ou6.c) {
                            return ob4.b(g05, ju6);
                        }
                        throw new DecodeException("unknown image format", g05);
                    }
                    return a2;
                }
        }
    }
}
