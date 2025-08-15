package defpackage;

import java.util.TimeZone;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;

/* renamed from: t9f  reason: default package */
public final class t9f {
    public final String a = AbstractUploader.SDK_TYPE_STRING;
    public final String b = "25.8.1";
    public final int c = 6392;
    public final String d = null;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final TimeZone k;

    public t9f(String str, String str2, String str3, String str4, String str5) {
        TimeZone timeZone = TimeZone.getDefault();
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = 2;
        this.k = timeZone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9f)) {
            return false;
        }
        t9f t9f = (t9f) obj;
        return tpa.f(this.a, t9f.a) && tpa.f(this.b, t9f.b) && this.c == t9f.c && tpa.f(this.d, t9f.d) && tpa.f(this.e, t9f.e) && tpa.f(this.f, t9f.f) && tpa.f(this.g, t9f.g) && tpa.f(this.h, t9f.h) && tpa.f(this.i, t9f.i) && this.j == t9f.j && tpa.f(this.k, t9f.k);
    }

    public final int hashCode() {
        int e2 = k7d.e(this.c, rh4.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return this.k.hashCode() + ey8.g(this.j, rh4.d(rh4.d(rh4.d(rh4.d(rh4.d((e2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAgent(deviceType=");
        sb.append(this.a);
        sb.append(", appVersion=");
        sb.append(this.b);
        sb.append(", buildNumber=");
        sb.append(this.c);
        sb.append(", appKey=");
        sb.append(this.d);
        sb.append(", osVersion=");
        sb.append(this.e);
        sb.append(", locale=");
        sb.append(this.f);
        sb.append(", deviceLocale=");
        sb.append(this.g);
        sb.append(", deviceName=");
        sb.append(this.h);
        sb.append(", screen=");
        sb.append(this.i);
        sb.append(", pushDeviceType=");
        int i2 = this.j;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "RUSTORE" : "GCM" : "HUAWEI");
        sb.append(", timeZone=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
