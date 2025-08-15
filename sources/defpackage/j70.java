package defpackage;

import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import java.util.Collections;

/* renamed from: j70  reason: default package */
public final class j70 extends u2 {
    public static final int[] Y = {5512, 11025, 22050, 44100};
    public int X;
    public boolean c;
    public boolean o;

    public final boolean Z1(wpa wpa) {
        if (!this.c) {
            int u = wpa.u();
            int i = (u >> 4) & 15;
            this.X = i;
            yze yze = (yze) this.b;
            if (i == 2) {
                int i2 = Y[(u >> 2) & 3];
                ny5 ny5 = new ny5();
                ny5.m = ia9.l("audio/mpeg");
                ny5.A = 1;
                ny5.B = i2;
                yze.e(ny5.a());
                this.o = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                ny5 ny52 = new ny5();
                ny52.m = ia9.l(str);
                ny52.A = 1;
                ny52.B = 8000;
                yze.e(ny52.a());
                this.o = true;
            } else if (i != 10) {
                throw new TagPayloadReader$UnsupportedFormatException("Audio format not supported: " + this.X);
            }
            this.c = true;
        } else {
            wpa.H(1);
        }
        return true;
    }

    public final boolean a2(long j, wpa wpa) {
        wpa wpa2 = wpa;
        int i = this.X;
        yze yze = (yze) this.b;
        if (i == 2) {
            int a = wpa.a();
            yze.b(wpa2, a, 0);
            ((yze) this.b).a(j, 1, a, 0, (wze) null);
            return true;
        }
        int u = wpa.u();
        if (u == 0 && !this.o) {
            int a2 = wpa.a();
            byte[] bArr = new byte[a2];
            wpa2.e(0, bArr, a2);
            e s = kp.s(new s02(bArr, a2, 2, (byte) 0), false);
            ny5 ny5 = new ny5();
            ny5.m = ia9.l("audio/mp4a-latm");
            ny5.i = s.c;
            ny5.A = s.b;
            ny5.B = s.a;
            ny5.p = Collections.singletonList(bArr);
            yze.e(new qy5(ny5));
            this.o = true;
            return false;
        } else if (this.X == 10 && u != 1) {
            return false;
        } else {
            int a3 = wpa.a();
            yze.b(wpa2, a3, 0);
            ((yze) this.b).a(j, 1, a3, 0, (wze) null);
            return true;
        }
    }
}
