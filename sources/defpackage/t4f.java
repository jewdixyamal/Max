package defpackage;

import java.util.Objects;

/* renamed from: t4f  reason: default package */
public final class t4f {
    public final q0e a;

    public t4f() {
        jp jpVar = ((y8a) vl.b()).n().c;
        this.a = r0e.a(Float.valueOf(jpVar.g.getFloat("app.extra.text.size.sp", 0.0f)));
        ml0 ml0 = jpVar.h;
        ml0.getClass();
        sd7 sd7 = new sd7(new bkg(29, this), ft.f, ft.d);
        Objects.requireNonNull(sd7, "observer is null");
        try {
            ml0.a(new lz9(sd7));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            j47.Z(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
