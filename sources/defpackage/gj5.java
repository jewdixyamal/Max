package defpackage;

import java.io.File;

/* renamed from: gj5  reason: default package */
public final class gj5 extends fj5 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ jj5 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gj5(jj5 jj5, File file) {
        super(file);
        this.f = jj5;
    }

    public final File a() {
        int i;
        boolean z = this.e;
        jj5 jj5 = this.f;
        File file = this.a;
        if (!z && this.c == null) {
            ((lj5) jj5.X).getClass();
            File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null) {
                ((lj5) jj5.X).getClass();
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr != null && (i = this.d) < fileArr.length) {
            this.d = i + 1;
            return fileArr[i];
        } else if (!this.b) {
            this.b = true;
            return file;
        } else {
            ((lj5) jj5.X).getClass();
            return null;
        }
    }
}
