package defpackage;

import android.text.Layout;

/* renamed from: tv8  reason: default package */
public final class tv8 implements vv8 {
    public final long a;
    public final String b;
    public final long c;
    public final Layout d;
    public final Layout e;

    public tv8(long j, String str, long j2, Layout layout, Layout layout2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = layout;
        this.e = layout2;
    }

    public final Layout a() {
        return this.d;
    }

    public final Layout b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv8)) {
            return false;
        }
        tv8 tv8 = (tv8) obj;
        return this.a == tv8.a && tpa.f(this.b, tv8.b) && this.c == tv8.c && tpa.f(this.d, tv8.d) && tpa.f(this.e, tv8.e);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + h4f.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "Channel(chatId=" + this.a + ", channelLink=" + this.b + ", forwardedMessageId=" + this.c + ", bodyLayout=" + this.d + ", forwardedTitleLayout=" + this.e + ")";
    }
}
