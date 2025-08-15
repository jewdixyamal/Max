package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* renamed from: o5f  reason: default package */
public final class o5f implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ File b;
    public final /* synthetic */ rh5 c;
    public final /* synthetic */ p5f o;

    public o5f(p5f p5f, boolean z, File file, rh5 rh5) {
        this.o = p5f;
        this.a = z;
        this.b = file;
        this.c = rh5;
    }

    public final void run() {
        rh5 rh5 = this.c;
        p5f p5f = this.o;
        boolean z = this.a;
        if (z) {
            try {
                mhe.c(p5f.a);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                Objects.toString(p5f.a);
                rh5.close();
                throw th;
            }
        }
        p5f.i(this.b, (byte) 1, z);
        Objects.toString(p5f.a);
        rh5.close();
    }
}
