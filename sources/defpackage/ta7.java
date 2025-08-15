package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.Closeable;
import java.io.Flushable;
import java.math.BigDecimal;
import java.math.BigInteger;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ta7  reason: default package */
public abstract class ta7 implements Closeable, Flushable {
    static {
        c32.d(g9e.values());
        g9e.CAN_WRITE_FORMATTED_NUMBERS.b();
        g9e.CAN_WRITE_BINARY_NATIVELY.b();
    }

    public static void d(String str) {
        throw new JsonProcessingException(str, (wa7) null, (NumberFormatException) null);
    }

    public abstract void S(double d);

    public abstract void U(float f);

    public final void a(ab7 ab7) {
        int i = 1;
        while (true) {
            hb7 u0 = ab7.u0();
            if (u0 != null) {
                boolean z = false;
                switch (u0.o) {
                    case 1:
                        q0();
                        break;
                    case 2:
                        n();
                        i--;
                        if (i != 0) {
                            continue;
                        } else {
                            return;
                        }
                    case 3:
                        p0();
                        break;
                    case 4:
                        m();
                        i--;
                        if (i != 0) {
                            continue;
                        } else {
                            return;
                        }
                    case 5:
                        o(ab7.S());
                        continue;
                    case 6:
                        xpa xpa = (xpa) ab7;
                        hb7 hb7 = xpa.b;
                        if (hb7 == hb7.VALUE_STRING) {
                            z = true;
                        } else if (hb7 == hb7.FIELD_NAME) {
                            z = xpa.A0;
                        }
                        if (!z) {
                            r0(ab7.q0());
                            break;
                        } else {
                            s0(ab7.r0(), ab7.t0(), ab7.s0());
                            continue;
                        }
                    case 7:
                        int o0 = ab7.o0();
                        if (o0 != 1) {
                            if (o0 != 3) {
                                m0(ab7.n0());
                                break;
                            } else {
                                o0(ab7.n());
                                break;
                            }
                        } else {
                            e0(ab7.m0());
                            continue;
                        }
                    case 8:
                        int o02 = ab7.o0();
                        if (o02 != 6) {
                            if (o02 != 4) {
                                S(ab7.e0());
                                break;
                            } else {
                                U((float) ((xpa) ab7).e0());
                                break;
                            }
                        } else {
                            n0(ab7.U());
                            continue;
                        }
                    case 9:
                        g(true);
                        continue;
                    case 10:
                        g(false);
                        continue;
                    case 11:
                        m9g m9g = (m9g) this;
                        m9g.A0("write a null");
                        m9g.B0();
                        continue;
                    case Protos.Attaches.Attach.PRESENT /*12*/:
                        m9g m9g2 = (m9g) ((ha6) this);
                        m9g2.A0("write a null");
                        m9g2.B0();
                        continue;
                    default:
                        throw new IllegalStateException("Internal error: unknown current token, " + u0);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public abstract void close();

    public abstract void e0(int i);

    public abstract void g(boolean z);

    public abstract void m();

    public abstract void m0(long j);

    public abstract void n();

    public abstract void n0(BigDecimal bigDecimal);

    public abstract void o(String str);

    public abstract void o0(BigInteger bigInteger);

    public abstract void p0();

    public abstract void q0();

    public abstract void r0(String str);

    public abstract void s0(char[] cArr, int i, int i2);
}
