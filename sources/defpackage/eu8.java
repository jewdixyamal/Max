package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* renamed from: eu8  reason: default package */
public final class eu8 implements Closeable {
    public final Closeable X;
    public final /* synthetic */ int a;
    public final bt0 b;
    public final boolean c;
    public final Object o;

    /* JADX WARNING: type inference failed for: r3v1, types: [yud, java.lang.Object, bt0] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, bt0] */
    public eu8(boolean z, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = z;
                ? obj = new Object();
                this.b = obj;
                Inflater inflater = new Inflater(true);
                this.o = inflater;
                this.X = new c07(new y7c(obj), inflater);
                return;
            default:
                this.c = z;
                ? obj2 = new Object();
                this.b = obj2;
                Deflater deflater = new Deflater(-1, true);
                this.o = deflater;
                this.X = new gg4(obj2, deflater);
                return;
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                ((gg4) this.X).close();
                return;
            default:
                ((c07) this.X).close();
                return;
        }
    }
}
