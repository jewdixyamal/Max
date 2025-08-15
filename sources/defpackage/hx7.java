package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import android.util.Printer;
import java.util.LinkedList;

/* renamed from: hx7  reason: default package */
public final class hx7 implements Printer {
    public long a;
    public long b;
    public long c;
    public final LinkedList d = new LinkedList();

    public static String a(String str) {
        int i;
        String K0 = w9e.K0(w9e.K0(str, ">>>>> Dispatching to "), "<<<<< Finished to ");
        int F0 = w9e.F0(": ", K0, 6);
        int A0 = w9e.A0(K0, "} ", 0, false, 6);
        String substring = K0.substring(0, A0 + 1);
        if (F0 <= 0 && A0 <= 0) {
            return K0;
        }
        int A02 = w9e.A0(K0, "DispatchedContinuation[Dispatchers.Main", 0, false, 6);
        if (A02 >= 0) {
            int i2 = A02 + 39;
            int A03 = w9e.A0(K0, ".immediate", i2, false, 4);
            i = A03 >= 0 ? w9e.A0(K0, ", Continuation at ", A03 + 10, false, 4) : w9e.A0(K0, ", Continuation at ", i2, false, 4);
            if (i >= 0) {
                i += 18;
            }
        } else {
            i = A0 + 2;
        }
        int E0 = w9e.E0(K0, ']', 0, 6);
        Integer valueOf = Integer.valueOf(E0);
        Integer num = null;
        if (E0 <= i) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : K0.length();
        int E02 = w9e.E0(K0, '@', 0, 6);
        Integer valueOf2 = Integer.valueOf(E02);
        if (E02 > i) {
            num = valueOf2;
        }
        String substring2 = K0.substring(i, Math.min(num != null ? num.intValue() : K0.length(), intValue));
        return !substring2.equals("null") ? substring2 : rh4.j(substring, " ", K0.substring(F0 + 2));
    }

    public final void println(String str) {
        if (str == null) {
            return;
        }
        if (eae.o0(str, ">>>>> Dispatching to ", false)) {
            String a2 = a(str);
            if (Trace.isEnabled()) {
                Trace.beginSection(a2);
            }
            this.a = SystemClock.uptimeMillis();
            this.c++;
        } else if (eae.o0(str, "<<<<< Finished to ", false)) {
            if (Trace.isEnabled()) {
                Trace.endSection();
            }
            this.c--;
            this.b = System.currentTimeMillis();
            this.d.add(new gx7(a(str), this.a, this.b, this.c));
            this.a = 0;
            this.b = 0;
        }
    }
}
