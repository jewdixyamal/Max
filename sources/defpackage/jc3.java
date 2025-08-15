package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: jc3  reason: default package */
public final class jc3 extends kp {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ jc3(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    public final kp d(Object obj) {
        switch (this.e) {
            case 0:
                ((PrintStream) this.f).print(obj);
                return this;
            default:
                ((PrintWriter) this.f).print(obj);
                return this;
        }
    }
}
