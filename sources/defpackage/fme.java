package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: fme  reason: default package */
public final class fme {
    public static final /* synthetic */ int b = 0;
    public final je7 a;

    public fme(je7 je7) {
        this.a = je7;
    }

    public static boolean a(int i) {
        return i == 2 || i == 3;
    }

    public static boolean c(Throwable th) {
        return (th instanceof TamErrorException) && f46.U(((TamErrorException) th).a.b);
    }

    public static boolean d(Throwable th) {
        return (th instanceof TamErrorException) && "io.exception".equals(((TamErrorException) th).a.b);
    }

    public final u1a b() {
        ml0 ml0 = ((jbd) ((hbd) this.a.getValue())).e;
        m2e m2e = new m2e(28);
        ml0.getClass();
        return new ty9(ml0, m2e, 1).s(1);
    }
}
