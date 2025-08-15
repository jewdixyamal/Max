package defpackage;

import android.graphics.Bitmap;
import com.facebook.animated.gif.GifImage;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

/* renamed from: we  reason: default package */
public final /* synthetic */ class we implements lu6 {
    public final /* synthetic */ AnimatedFactoryV2Impl a;

    public /* synthetic */ we(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        this.a = animatedFactoryV2Impl;
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [df, java.lang.Object] */
    public final l43 a(g05 g05, int i, pqb pqb, ju6 ju6) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = this.a;
        if (animatedFactoryV2Impl.e == null) {
            animatedFactoryV2Impl.e = new Object();
        }
        df dfVar = animatedFactoryV2Impl.e;
        Bitmap.Config config = ju6.b;
        dfVar.getClass();
        if (df.b != null) {
            o43 o = o43.o(g05.a);
            o.getClass();
            try {
                qq8 qq8 = (qq8) o.e0();
                j43 a2 = df.a(g05.v0, ju6, qq8.r() != null ? GifImage.a(qq8.r(), ju6) : GifImage.b(qq8.n(), qq8.U(), ju6));
                o43.S(o);
                return a2;
            } catch (Throwable th) {
                o43.S(o);
                throw th;
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }
}
