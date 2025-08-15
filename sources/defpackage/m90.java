package defpackage;

import android.media.MediaFormat;

/* renamed from: m90  reason: default package */
public final class m90 implements q05 {
    public final String a;
    public final int b;
    public final bue c;
    public final int d;
    public final int e;
    public final int f;

    public m90(String str, int i, bue bue, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = bue;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String a() {
        return this.a;
    }

    public final MediaFormat b() {
        String str = this.a;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, this.e, this.f);
        createAudioFormat.setInteger("bitrate", this.d);
        int i = this.b;
        if (i != -1) {
            if (str.equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", i);
            } else {
                createAudioFormat.setInteger("profile", i);
            }
        }
        return createAudioFormat;
    }

    public final bue c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m90)) {
            return false;
        }
        m90 m90 = (m90) obj;
        return this.a.equals(m90.a) && this.b == m90.b && this.c.equals(m90.c) && this.d == m90.d && this.e == m90.e && this.f == m90.f;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", bitrate=");
        sb.append(this.d);
        sb.append(", sampleRate=");
        sb.append(this.e);
        sb.append(", channelCount=");
        return zr6.j(sb, this.f, "}");
    }
}
