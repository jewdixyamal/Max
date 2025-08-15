package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: pg5  reason: default package */
public final class pg5 {
    public final zi5 a;
    public File b;
    public File c;
    public File d;
    public File e;
    public File f;
    public File g;
    public File h;
    public File i;
    public List j;

    public pg5(zi5 zi5) {
        this.a = zi5;
    }

    public final File a(gx0 gx0) {
        int ordinal = gx0.ordinal();
        zi5 zi5 = this.a;
        switch (ordinal) {
            case 0:
                if (this.b == null) {
                    this.b = new File(((kk5) zi5).b());
                }
                return this.b;
            case 1:
                if (this.d == null) {
                    this.d = ((kk5) zi5).m();
                }
                return this.d;
            case 2:
                if (this.e == null) {
                    kk5 kk5 = (kk5) zi5;
                    kk5.getClass();
                    this.e = kk5.g(kk5.b(), "audioCache");
                }
                return this.e;
            case 3:
                if (this.g == null) {
                    kk5 kk52 = (kk5) zi5;
                    kk52.getClass();
                    this.g = kk5.g(kk52.b(), "gifCache");
                }
                return this.g;
            case 4:
                if (this.f == null) {
                    kk5 kk53 = (kk5) zi5;
                    kk53.getClass();
                    this.f = kk5.g(kk53.b(), "stickerCache");
                }
                return this.f;
            case 5:
                if (this.c == null) {
                    kk5 kk54 = (kk5) zi5;
                    kk54.getClass();
                    this.c = kk5.g(kk54.b(), "upload");
                }
                return this.c;
            case 6:
                if (this.h == null) {
                    kk5 kk55 = (kk5) zi5;
                    kk55.getClass();
                    this.h = kk5.g(kk55.b(), "exo_files_cache");
                }
                return this.h;
            case 7:
                if (this.i == null) {
                    kk5 kk56 = (kk5) zi5;
                    kk56.getClass();
                    this.i = kk5.g(kk56.b(), "videoCache");
                }
                return this.i;
            default:
                return null;
        }
    }
}
