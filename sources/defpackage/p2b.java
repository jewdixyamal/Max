package defpackage;

import java.io.InputStreamReader;
import java.io.Writer;
import java.util.NoSuchElementException;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: p2b  reason: default package */
public final class p2b extends t1 {
    public final Writer a;
    public final sh0 b;

    public p2b(Writer writer) {
        sh0 sh0 = new sh0(18, (byte) 0);
        this.b = sh0;
        this.a = writer;
        sh0.w(0);
    }

    public static String o(sh0 sh0) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i = sh0.b;
        if (i >= 0) {
            int[] iArr2 = new int[Math.max(i, 8)];
            int i2 = 0;
            while (sh0.b != 0) {
                int u = sh0.u();
                int length = iArr2.length;
                if (i2 < length) {
                    iArr = iArr2;
                } else {
                    iArr = new int[(length * 2)];
                    System.arraycopy(iArr2, 0, iArr, 0, length);
                    iArr2 = iArr;
                }
                iArr2[i2] = u;
                i2++;
                iArr2 = iArr;
            }
            while (i2 != 0) {
                if (i2 != 0) {
                    i2--;
                    int i3 = iArr2[i2];
                    String str = "";
                    switch (i3) {
                        case 0:
                        case 1:
                            break;
                        case 2:
                        case 3:
                            str = "[";
                            break;
                        case 4:
                        case 6:
                            str = "{";
                            break;
                        case 5:
                            str = "{:";
                            break;
                        default:
                            throw new IllegalArgumentException(zr6.h(i3, str));
                    }
                    sb.append(str);
                    sh0.w(i3);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException(zr6.h(i, "Illegal Capacity: "));
    }

    public final void a(String str) {
        m();
        this.a.write(str);
    }

    public final void close() {
        this.a.close();
        if (this.b.t() != 1) {
            throw new IllegalStateException("Unfinished document");
        }
    }

    public final void flush() {
        this.a.flush();
    }

    public final kb7 g0(String str) {
        sh0 sh0 = this.b;
        int t = sh0.t();
        Writer writer = this.a;
        if (t == 6) {
            writer.write(44);
        } else if (t != 4) {
            throw new IllegalStateException("Nesting problem: " + o(sh0));
        }
        sh0.v(5);
        ngg.L(str, writer);
        return this;
    }

    public final void i(String str) {
        m();
        ngg.L(str, this.a);
    }

    public final void l(InputStreamReader inputStreamReader) {
        m();
        sh0 sh0 = this.b;
        int t = sh0.t();
        Writer writer = this.a;
        if (t == 2 || t == 3) {
            va7 va7 = new va7(inputStreamReader);
            kp.B(va7, writer);
            while (va7.S() != 0) {
                va7.d(44);
                va7.a(writer);
                kp.B(va7, writer);
            }
        } else if (t == 6) {
            va7 va72 = new va7(inputStreamReader);
            kp.B(va72, writer);
            if (va72.S() != 0) {
                throw JsonSyntaxException.b((long) va72.o, va72.m(), va72.S());
            }
        } else {
            throw new IllegalStateException("Nesting problem: " + o(sh0));
        }
    }

    public final void m() {
        sh0 sh0 = this.b;
        int t = sh0.t();
        if (t != 0) {
            Writer writer = this.a;
            if (t == 5) {
                writer.write(":");
                sh0.v(6);
            } else if (t == 2) {
                sh0.v(3);
            } else if (t == 3) {
                writer.write(44);
            } else {
                throw new IllegalStateException("Nesting problem: " + o(sh0));
            }
        } else {
            sh0.v(1);
        }
    }

    public final void n(int i, int i2) {
        sh0 sh0 = this.b;
        int t = sh0.t();
        if (t == i2 || t == i) {
            sh0.u();
            return;
        }
        throw new IllegalStateException("Nesting problem: " + o(sh0));
    }

    public final void q() {
        n(4, 6);
        this.a.write(125);
    }

    public final void s() {
        m();
        this.b.w(4);
        this.a.write(123);
    }

    public final void t() {
        n(2, 3);
        this.a.write(93);
    }

    public final void u() {
        m();
        this.b.w(2);
        this.a.write(91);
    }
}
