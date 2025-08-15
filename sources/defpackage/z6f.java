package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: z6f  reason: default package */
public final /* synthetic */ class z6f implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7f b;
    public final /* synthetic */ v6f c;

    public /* synthetic */ z6f(c7f c7f, v6f v6f, int i) {
        this.a = i;
        this.b = c7f;
        this.c = v6f;
    }

    public final Object call() {
        v6f v6f = this.c;
        c7f c7f = this.b;
        int i = this.a;
        c7f.getClass();
        switch (i) {
            case 0:
                u6f b2 = v6f.b();
                String str = v6f.b;
                w0f w0f = c7f.g;
                try {
                    hm9.m("c7f", "resizeSticker: path = %s", str);
                    File a2 = ((zi5) w0f.f.getValue()).a("png");
                    if (w0f.f(str, a2.getAbsolutePath())) {
                        hm9.m("c7f", "resizeSticker: resized for path = %s", str);
                        str = a2.getAbsolutePath();
                    } else {
                        hm9.m("c7f", "resizeSticker: no resize needed for path = %s", str);
                    }
                } catch (IOException e) {
                    hm9.p("c7f", "resizeSticker: failed", e);
                }
                b2.b = str;
                return new v6f(b2);
            default:
                u6f b3 = v6f.b();
                String str2 = v6f.b;
                w0f w0f2 = c7f.g;
                try {
                    hm9.m("c7f", "resizePhoto: path = %s", str2);
                    File a3 = ((zi5) w0f2.f.getValue()).a("jpg");
                    if (j47.c0(((cj0) ((af8) w0f2.g.getValue())).c, str2, a3.getAbsolutePath())) {
                        hm9.m("c7f", "resizePhoto: resized for path = %s", str2);
                        str2 = a3.getAbsolutePath();
                    } else {
                        hm9.m("c7f", "resizePhoto: no resize needed for path = %s", str2);
                    }
                } catch (IOException e2) {
                    hm9.p("c7f", "resizePhoto: failed", e2);
                }
                b3.b = str2;
                return new v6f(b3);
        }
    }
}
