package defpackage;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import java.util.Collections;

/* renamed from: i70  reason: default package */
public final class i70 extends u2 {
    public static final int[] Y = {5512, 11025, 22050, 44100};
    public int X;
    public boolean c;
    public boolean o;

    public final boolean Z1(yaf yaf) {
        if (!this.c) {
            int v = yaf.v();
            int i = (v >> 4) & 15;
            this.X = i;
            xze xze = (xze) this.b;
            if (i == 2) {
                int i2 = Y[(v >> 2) & 3];
                my5 my5 = new my5();
                my5.k = "audio/mpeg";
                my5.x = 1;
                my5.y = i2;
                xze.d(my5.a());
                this.o = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                my5 my52 = new my5();
                my52.k = str;
                my52.x = 1;
                my52.y = 8000;
                xze.d(my52.a());
                this.o = true;
            } else if (i != 10) {
                throw new TagPayloadReader$UnsupportedFormatException(z7b.h(39, this.X, "Audio format not supported: "));
            }
            this.c = true;
        } else {
            yaf.I(1);
        }
        return true;
    }

    public final boolean a2(long j, yaf yaf) {
        yaf yaf2 = yaf;
        int i = this.X;
        xze xze = (xze) this.b;
        if (i == 2) {
            int c2 = yaf.c();
            xze.c(c2, yaf2);
            ((xze) this.b).b(j, 1, c2, 0, (vze) null);
            return true;
        }
        int v = yaf.v();
        if (v == 0 && !this.o) {
            int c3 = yaf.c();
            byte[] bArr = new byte[c3];
            yaf2.g(0, bArr, c3);
            e J = z7.J(new s02(bArr, c3, 1, (byte) 0), false);
            my5 my5 = new my5();
            my5.k = "audio/mp4a-latm";
            my5.h = J.c;
            my5.x = J.b;
            my5.y = J.a;
            my5.m = Collections.singletonList(bArr);
            xze.d(new oy5(my5));
            this.o = true;
            return false;
        } else if (this.X == 10 && v != 1) {
            return false;
        } else {
            int c4 = yaf.c();
            xze.c(c4, yaf2);
            ((xze) this.b).b(j, 1, c4, 0, (vze) null);
            return true;
        }
    }
}
