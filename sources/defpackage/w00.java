package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.Locale;

/* renamed from: w00  reason: default package */
public final /* synthetic */ class w00 implements qj3, d38 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;
    public final /* synthetic */ l20 c;

    public /* synthetic */ w00(y00 y00, l20 l20, int i) {
        this.a = i;
        this.b = y00;
        this.c = l20;
    }

    public void accept(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.a) {
            case 0:
                this.b.d.put(this.c.r, uri);
                return;
            default:
                this.b.d.put(this.c.r, uri);
                return;
        }
    }

    public void d(j28 j28) {
        File[] listFiles;
        y00 y00 = this.b;
        y00.getClass();
        Locale locale = Locale.ENGLISH;
        String i = zr6.i("preview_", this.c.r, "_.png");
        kk5 kk5 = (kk5) y00.c;
        kk5.getClass();
        File g = kk5.g(kk5.b(), "previewVideoCache");
        File file = null;
        if (pag.k(g) && (listFiles = g.listFiles()) != null && listFiles.length != 0) {
            int length = listFiles.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                File file2 = listFiles[i2];
                if (oag.d(file2.getName(), i)) {
                    file = file2;
                    break;
                }
                i2++;
            }
        }
        if (j28.h()) {
            return;
        }
        if (file == null) {
            j28.b();
        } else {
            j28.a(file);
        }
    }
}
