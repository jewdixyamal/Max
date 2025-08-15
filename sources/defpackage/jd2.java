package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;

/* renamed from: jd2  reason: default package */
public final class jd2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ld2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jd2(ld2 ld2, Continuation continuation) {
        super(2, continuation);
        this.Y = ld2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jd2) n((fka) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jd2 jd2 = new jd2(this.Y, continuation);
        jd2.X = obj;
        return jd2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        fka fka = (fka) this.X;
        ld2 ld2 = this.Y;
        if (ld2.i.a()) {
            khe khe = ld2.i;
            ngg.G((Drawable) khe.getValue(), fka.getIcon().j);
            ((Drawable) khe.getValue()).invalidateSelf();
        }
        khe khe2 = ld2.j;
        if (khe2.a()) {
            ngg.G((Drawable) khe2.getValue(), fka.getIcon().j);
            ((Drawable) khe2.getValue()).invalidateSelf();
        }
        khe khe3 = ld2.k;
        if (khe3.a()) {
            ngg.G((Drawable) khe3.getValue(), fka.getIcon().j);
            ((Drawable) khe3.getValue()).invalidateSelf();
        }
        khe khe4 = ld2.l;
        if (khe4.a()) {
            ngg.G((Drawable) khe4.getValue(), fka.getIcon().j);
            ((Drawable) khe4.getValue()).invalidateSelf();
        }
        khe khe5 = ld2.m;
        if (khe5.a()) {
            ngg.G((Drawable) khe5.getValue(), fka.getIcon().j);
            ((Drawable) khe5.getValue()).invalidateSelf();
        }
        khe khe6 = ld2.n;
        if (khe6.a()) {
            ngg.G((Drawable) khe6.getValue(), fka.getIcon().j);
            ((Drawable) khe6.getValue()).invalidateSelf();
        }
        khe khe7 = ld2.o;
        if (khe7.a()) {
            ngg.G((Drawable) khe7.getValue(), fka.getIcon().j);
            ((Drawable) khe7.getValue()).invalidateSelf();
        }
        khe khe8 = ld2.p;
        if (khe8.a()) {
            ngg.G((Drawable) khe8.getValue(), fka.getIcon().c);
            ((Drawable) khe8.getValue()).invalidateSelf();
        }
        khe khe9 = ld2.q;
        if (khe9.a()) {
            ngg.G((Drawable) khe9.getValue(), fka.getIcon().c);
            ((Drawable) khe9.getValue()).invalidateSelf();
        }
        khe khe10 = ld2.r;
        if (khe10.a()) {
            ngg.G((Drawable) khe10.getValue(), fka.getIcon().b);
            ((Drawable) khe10.getValue()).invalidateSelf();
        }
        khe khe11 = ld2.s;
        if (khe11.a()) {
            ((yl5) khe11.getValue()).onThemeChanged(fka);
        }
        return e5f.a;
    }
}
