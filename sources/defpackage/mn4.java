package defpackage;

import java.io.File;

/* renamed from: mn4  reason: default package */
public final /* synthetic */ class mn4 implements qj3 {
    public final /* synthetic */ File X;
    public final /* synthetic */ d20 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public /* synthetic */ mn4(d20 d20, int i, long j, long j2, File file) {
        this.a = d20;
        this.b = i;
        this.c = j;
        this.o = j2;
        this.X = file;
    }

    public final void accept(Object obj) {
        j10 j10 = (j10) obj;
        j10.i = this.a;
        int i = this.b;
        j10.k = (float) i;
        j10.p = this.c;
        j10.o = this.o;
        File file = this.X;
        if (file != null && i == 100) {
            if ((j10.r != null || j10.d != null) && file.exists()) {
                j10.u = file.lastModified();
                j10.m = file.getAbsolutePath();
            }
        }
    }
}
