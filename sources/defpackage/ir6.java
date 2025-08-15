package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: ir6  reason: default package */
public interface ir6 {
    static /* synthetic */ void b(ir6 ir6, us7 us7, String str, String str2, Object[] objArr, Throwable th, int i) {
        ir6.a(us7, str, str2, (i & 8) != 0 ? null : objArr, (i & 16) != 0 ? null : th);
    }

    void a(us7 us7, String str, String str2, Object[] objArr, Throwable th) {
        String concat;
        String str3 = str2 == null ? "" : str2;
        if (!(str2 == null || objArr == null)) {
            try {
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                concat = String.format(locale, str2, Arrays.copyOf(copyOf, copyOf.length));
            } catch (Throwable unused) {
                concat = str2.concat(ys.j0(objArr, (String) null, 63));
            }
            str3 = concat;
        }
        if (th != null) {
            str3 = au1.g(str3, xxc.m(th));
        }
        if (str3.length() > 0) {
            d(us7, str, str3, th);
        }
    }

    boolean c();

    void d(us7 us7, String str, String str2, Throwable th);
}
